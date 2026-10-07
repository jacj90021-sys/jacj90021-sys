package org.apache.commons.compress.archivers.zip;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
class FallbackZipEncoding implements ZipEncoding {
    private final String charsetName;

    public FallbackZipEncoding() {
        this.charsetName = null;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public boolean canEncode(String str) {
        return true;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public String decode(byte[] bArr) {
        String str = this.charsetName;
        return str == null ? new String(bArr) : new String(bArr, str);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public ByteBuffer encode(String str) {
        String str2 = this.charsetName;
        return str2 == null ? ByteBuffer.wrap(str.getBytes()) : ByteBuffer.wrap(str.getBytes(str2));
    }

    public FallbackZipEncoding(String str) {
        this.charsetName = str;
    }
}
