package org.apache.commons.compress.archivers.zip;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
class Simple8BitZipEncoding implements ZipEncoding {
    private final char[] highChars;
    private final List<Simple8BitChar> reverseMapping;

    public Simple8BitZipEncoding(char[] cArr) {
        char[] cArr2 = (char[]) cArr.clone();
        this.highChars = cArr2;
        ArrayList arrayList = new ArrayList(cArr2.length);
        byte b = 127;
        for (char c : cArr2) {
            b = (byte) (b + 1);
            arrayList.add(new Simple8BitChar(b, c));
        }
        Collections.sort(arrayList);
        this.reverseMapping = Collections.unmodifiableList(arrayList);
    }

    private Simple8BitChar encodeHighChar(char c) {
        int size = this.reverseMapping.size();
        int i = 0;
        while (true) {
            List<Simple8BitChar> list = this.reverseMapping;
            if (size <= i) {
                if (i >= list.size()) {
                    return null;
                }
                Simple8BitChar simple8BitChar = this.reverseMapping.get(i);
                if (simple8BitChar.unicode != c) {
                    return null;
                }
                return simple8BitChar;
            }
            int i2 = ((size - i) / 2) + i;
            Simple8BitChar simple8BitChar2 = list.get(i2);
            char c2 = simple8BitChar2.unicode;
            if (c2 == c) {
                return simple8BitChar2;
            }
            if (c2 < c) {
                i = i2 + 1;
            } else {
                size = i2;
            }
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public boolean canEncode(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!canEncodeChar(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean canEncodeChar(char c) {
        return (c >= 0 && c < 128) || encodeHighChar(c) != null;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public String decode(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = decodeByte(bArr[i]);
        }
        return new String(cArr);
    }

    public char decodeByte(byte b) {
        return b >= 0 ? (char) b : this.highChars[b + 128];
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public ByteBuffer encode(String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((str.length() + 1) / 2) + str.length() + 6);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (byteBufferAllocate.remaining() < 6) {
                byteBufferAllocate = ZipEncodingHelper.growBuffer(byteBufferAllocate, byteBufferAllocate.position() + 6);
            }
            if (!pushEncodedChar(byteBufferAllocate, cCharAt)) {
                ZipEncodingHelper.appendSurrogate(byteBufferAllocate, cCharAt);
            }
        }
        byteBufferAllocate.limit(byteBufferAllocate.position());
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    public boolean pushEncodedChar(ByteBuffer byteBuffer, char c) {
        if (c >= 0 && c < 128) {
            byteBuffer.put((byte) c);
            return true;
        }
        Simple8BitChar simple8BitCharEncodeHighChar = encodeHighChar(c);
        if (simple8BitCharEncodeHighChar == null) {
            return false;
        }
        byteBuffer.put(simple8BitCharEncodeHighChar.code);
        return true;
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class Simple8BitChar implements Comparable<Simple8BitChar> {
        public final byte code;
        public final char unicode;

        public Simple8BitChar(byte b, char c) {
            this.code = b;
            this.unicode = c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Simple8BitChar) {
                Simple8BitChar simple8BitChar = (Simple8BitChar) obj;
                if (this.unicode == simple8BitChar.unicode && this.code == simple8BitChar.code) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.unicode;
        }

        public String toString() {
            return "0x" + Integer.toHexString(65535 & this.unicode) + "->0x" + Integer.toHexString(this.code & 255);
        }

        @Override // java.lang.Comparable
        public int compareTo(Simple8BitChar simple8BitChar) {
            return this.unicode - simple8BitChar.unicode;
        }
    }
}
