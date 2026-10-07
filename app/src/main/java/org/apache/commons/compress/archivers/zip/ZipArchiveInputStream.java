package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.a3;
import com.cmaster.cloner.i5;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.z2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.Character;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ZipArchiveInputStream extends a3 {
    private static final int CFH_LEN = 46;
    private static final int LFH_LEN = 30;
    private static final long TWO_EXP_32 = 4294967296L;
    private final byte[] LFH_BUF;
    private final byte[] SHORT_BUF;
    private final byte[] SKIP_BUF;
    private final byte[] TWO_DWORD_BUF;
    private final byte[] WORD_BUF;
    private boolean allowStoredEntriesWithDataDescriptor;
    private final ByteBuffer buf;
    private boolean closed;
    private CurrentEntry current;
    final String encoding;
    private int entriesRead;
    private boolean hitCentralDirectory;
    private final InputStream in;
    private final Inflater inf;
    private ByteArrayInputStream lastStoredEntry;
    private final boolean useUnicodeExtraFields;
    private final ZipEncoding zipEncoding;
    private static final byte[] LFH = ZipLong.LFH_SIG.getBytes();
    private static final byte[] CFH = ZipLong.CFH_SIG.getBytes();
    private static final byte[] DD = ZipLong.DD_SIG.getBytes();

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class CurrentEntry {
        private long bytesRead;
        private long bytesReadFromStream;
        private final CRC32 crc;
        private final ZipArchiveEntry entry;
        private boolean hasDataDescriptor;
        private InputStream in;
        private boolean usesZip64;

        private CurrentEntry() {
            this.entry = new ZipArchiveEntry();
            this.crc = new CRC32();
        }

        public static /* synthetic */ long access$614(CurrentEntry currentEntry, long j) {
            long j2 = currentEntry.bytesRead + j;
            currentEntry.bytesRead = j2;
            return j2;
        }

        public static /* synthetic */ long access$708(CurrentEntry currentEntry) {
            long j = currentEntry.bytesReadFromStream;
            currentEntry.bytesReadFromStream = 1 + j;
            return j;
        }

        public static /* synthetic */ long access$714(CurrentEntry currentEntry, long j) {
            long j2 = currentEntry.bytesReadFromStream + j;
            currentEntry.bytesReadFromStream = j2;
            return j2;
        }
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z, boolean z2) {
        this.inf = new Inflater(true);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(512);
        this.buf = byteBufferAllocate;
        this.current = null;
        this.closed = false;
        this.hitCentralDirectory = false;
        this.lastStoredEntry = null;
        this.allowStoredEntriesWithDataDescriptor = false;
        this.LFH_BUF = new byte[LFH_LEN];
        this.SKIP_BUF = new byte[1024];
        this.SHORT_BUF = new byte[2];
        this.WORD_BUF = new byte[4];
        this.TWO_DWORD_BUF = new byte[16];
        this.entriesRead = 0;
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.useUnicodeExtraFields = z;
        this.in = new PushbackInputStream(inputStream, byteBufferAllocate.capacity());
        this.allowStoredEntriesWithDataDescriptor = z2;
        byteBufferAllocate.limit(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean bufferContainsSignature(java.io.ByteArrayOutputStream r12, int r13, int r14, int r15) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            if (r1 != 0) goto La7
            int r4 = r14 + (-4)
            if (r2 >= r4) goto La7
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            r4 = r4[r2]
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.LFH
            r6 = r5[r0]
            if (r4 != r6) goto La3
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r6 = r2 + 1
            r4 = r4[r6]
            r6 = 1
            r7 = r5[r6]
            if (r4 != r7) goto La3
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r7 = r2 + 2
            r4 = r4[r7]
            r8 = 2
            r9 = r5[r8]
            r10 = 3
            if (r4 != r9) goto L45
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r9 = r2 + 3
            r4 = r4[r9]
            r5 = r5[r10]
            if (r4 == r5) goto L61
        L45:
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            r4 = r4[r2]
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.CFH
            r9 = r5[r8]
            if (r4 != r9) goto L68
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r9 = r2 + 3
            r4 = r4[r9]
            r5 = r5[r10]
            if (r4 != r5) goto L68
        L61:
            int r1 = r13 + r14
            int r1 = r1 - r2
            int r3 = r1 - r15
        L66:
            r1 = r6
            goto L89
        L68:
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            r4 = r4[r7]
            byte[] r5 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.DD
            r7 = r5[r8]
            if (r4 != r7) goto L89
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r7 = r2 + 3
            r4 = r4[r7]
            r5 = r5[r10]
            if (r4 != r5) goto L89
            int r1 = r13 + r14
            int r3 = r1 - r2
            goto L66
        L89:
            if (r1 == 0) goto La3
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r5 = r13 + r14
            int r5 = r5 - r3
            r11.pushback(r4, r5, r3)
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            r12.write(r4, r0, r2)
            r11.readDataDescriptor()
        La3:
            int r2 = r2 + 1
            goto L4
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int):boolean");
    }

    private int cacheBytesRead(ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = (i4 - i3) - 3;
        if (i5 <= 0) {
            return i4;
        }
        byteArrayOutputStream.write(this.buf.array(), 0, i5);
        int i6 = i3 + 3;
        System.arraycopy(this.buf.array(), i5, this.buf.array(), 0, i6);
        return i6;
    }

    private static boolean checksig(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private void closeEntry() throws DataFormatException, IOException {
        if (this.closed) {
            qa.OooOOOO("The stream is closed");
            return;
        }
        CurrentEntry currentEntry = this.current;
        if (currentEntry == null) {
            return;
        }
        if (currentEntry.bytesReadFromStream > this.current.entry.getCompressedSize() || this.current.hasDataDescriptor) {
            skip(Long.MAX_VALUE);
            int bytesInflated = (int) (this.current.bytesReadFromStream - (this.current.entry.getMethod() == 8 ? getBytesInflated() : this.current.bytesRead));
            if (bytesInflated > 0) {
                pushback(this.buf.array(), this.buf.limit() - bytesInflated, bytesInflated);
            }
        } else {
            drainCurrentEntryData();
        }
        if (this.lastStoredEntry == null && this.current.hasDataDescriptor) {
            readDataDescriptor();
        }
        this.inf.reset();
        this.buf.clear().flip();
        this.current = null;
        this.lastStoredEntry = null;
    }

    private void drainCurrentEntryData() throws EOFException {
        Character.UnicodeBlock unicodeBlockOf;
        long compressedSize = this.current.entry.getCompressedSize() - this.current.bytesReadFromStream;
        while (compressedSize > 0) {
            long j = this.in.read(this.buf.array(), 0, (int) Math.min(this.buf.capacity(), compressedSize));
            if (j < 0) {
                StringBuilder sb = new StringBuilder("Truncated ZIP entry: ");
                char[] charArray = this.current.entry.getName().toCharArray();
                char[] cArrCopyOf = charArray.length <= 255 ? charArray : Arrays.copyOf(charArray, 255);
                if (charArray.length > 255) {
                    for (int i = 252; i < 255; i++) {
                        cArrCopyOf[i] = '.';
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (char c : cArrCopyOf) {
                    if (Character.isISOControl(c) || (unicodeBlockOf = Character.UnicodeBlock.of(c)) == null || unicodeBlockOf == Character.UnicodeBlock.SPECIALS) {
                        sb2.append('?');
                    } else {
                        sb2.append(c);
                    }
                }
                sb.append(sb2.toString());
                throw new EOFException(sb.toString());
            }
            count(j);
            compressedSize -= j;
        }
    }

    private int fill() throws IOException {
        if (this.closed) {
            qa.OooOOOO("The stream is closed");
            return 0;
        }
        int i = this.in.read(this.buf.array());
        if (i > 0) {
            this.buf.limit(i);
            count(this.buf.limit());
            this.inf.setInput(this.buf.array(), 0, this.buf.limit());
        }
        return i;
    }

    private void findEocdRecord() throws IOException {
        int oneByte = -1;
        while (true) {
            boolean zIsFirstByteOfEocdSig = false;
            while (true) {
                if (!zIsFirstByteOfEocdSig) {
                    oneByte = readOneByte();
                    if (oneByte <= -1) {
                        return;
                    }
                }
                if (!isFirstByteOfEocdSig(oneByte)) {
                    break;
                }
                oneByte = readOneByte();
                byte[] bArr = ZipArchiveOutputStream.EOCD_SIG;
                if (oneByte == bArr[1]) {
                    oneByte = readOneByte();
                    if (oneByte == bArr[2]) {
                        oneByte = readOneByte();
                        if (oneByte == -1 || oneByte == bArr[3]) {
                            return;
                        } else {
                            zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                        }
                    } else if (oneByte == -1) {
                        return;
                    } else {
                        zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                    }
                } else if (oneByte == -1) {
                    return;
                } else {
                    zIsFirstByteOfEocdSig = isFirstByteOfEocdSig(oneByte);
                }
            }
        }
    }

    private long getBytesInflated() {
        long bytesRead = this.inf.getBytesRead();
        if (this.current.bytesReadFromStream >= TWO_EXP_32) {
            while (true) {
                long j = bytesRead + TWO_EXP_32;
                if (j > this.current.bytesReadFromStream) {
                    break;
                }
                bytesRead = j;
            }
        }
        return bytesRead;
    }

    private boolean isFirstByteOfEocdSig(int i) {
        return i == ZipArchiveOutputStream.EOCD_SIG[0];
    }

    public static boolean matches(byte[] bArr, int i) {
        byte[] bArr2 = ZipArchiveOutputStream.LFH_SIG;
        if (i < bArr2.length) {
            return false;
        }
        return checksig(bArr, bArr2) || checksig(bArr, ZipArchiveOutputStream.EOCD_SIG) || checksig(bArr, ZipArchiveOutputStream.DD_SIG) || checksig(bArr, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
    }

    private void processZip64Extra(ZipLong zipLong, ZipLong zipLong2) {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = (Zip64ExtendedInformationExtraField) this.current.entry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        this.current.usesZip64 = zip64ExtendedInformationExtraField != null;
        if (this.current.hasDataDescriptor) {
            return;
        }
        if (zip64ExtendedInformationExtraField != null) {
            ZipLong zipLong3 = ZipLong.ZIP64_MAGIC;
            if (zipLong2.equals(zipLong3) || zipLong.equals(zipLong3)) {
                this.current.entry.setCompressedSize(zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
                this.current.entry.setSize(zip64ExtendedInformationExtraField.getSize().getLongValue());
                return;
            }
        }
        this.current.entry.setCompressedSize(zipLong2.getValue());
        this.current.entry.setSize(zipLong.getValue());
    }

    private void pushback(byte[] bArr, int i, int i2) throws IOException {
        ((PushbackInputStream) this.in).unread(bArr, i, i2);
        pushedBackBytes(i2);
    }

    private void readDataDescriptor() throws IOException {
        readFully(this.WORD_BUF);
        ZipLong zipLong = new ZipLong(this.WORD_BUF);
        if (ZipLong.DD_SIG.equals(zipLong)) {
            readFully(this.WORD_BUF);
            zipLong = new ZipLong(this.WORD_BUF);
        }
        this.current.entry.setCrc(zipLong.getValue());
        readFully(this.TWO_DWORD_BUF);
        ZipLong zipLong2 = new ZipLong(this.TWO_DWORD_BUF, 8);
        if (!zipLong2.equals(ZipLong.CFH_SIG) && !zipLong2.equals(ZipLong.LFH_SIG)) {
            this.current.entry.setCompressedSize(ZipEightByteInteger.getLongValue(this.TWO_DWORD_BUF));
            this.current.entry.setSize(ZipEightByteInteger.getLongValue(this.TWO_DWORD_BUF, 8));
        } else {
            pushback(this.TWO_DWORD_BUF, 8, 8);
            this.current.entry.setCompressedSize(ZipLong.getValue(this.TWO_DWORD_BUF));
            this.current.entry.setSize(ZipLong.getValue(this.TWO_DWORD_BUF, 4));
        }
    }

    private int readDeflated(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        int fromInflater = readFromInflater(bArr, i, i2);
        if (fromInflater <= 0) {
            if (this.inf.finished()) {
                return -1;
            }
            if (this.inf.needsDictionary()) {
                throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
            }
            if (fromInflater == -1) {
                qa.OooOOOO("Truncated ZIP file");
                return 0;
            }
        }
        return fromInflater;
    }

    private void readFirstLocalFileHeader(byte[] bArr) throws IOException {
        readFully(bArr);
        ZipLong zipLong = new ZipLong(bArr);
        if (zipLong.equals(ZipLong.DD_SIG)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.SPLITTING);
        }
        if (zipLong.equals(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER)) {
            byte[] bArr2 = new byte[4];
            readFully(bArr2);
            System.arraycopy(bArr, 4, bArr, 0, 26);
            System.arraycopy(bArr2, 0, bArr, 26, 4);
        }
    }

    private int readFromInflater(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        int iInflate = 0;
        do {
            if (this.inf.needsInput()) {
                int iFill = fill();
                if (iFill <= 0) {
                    if (iFill == -1) {
                        return -1;
                    }
                    return iInflate;
                }
                CurrentEntry.access$714(this.current, this.buf.limit());
            }
            try {
                iInflate = this.inf.inflate(bArr, i, i2);
                if (iInflate != 0) {
                    break;
                }
            } catch (DataFormatException e) {
                throw ((IOException) new ZipException(e.getMessage()).initCause(e));
            }
        } while (this.inf.needsInput());
        return iInflate;
    }

    private void readFully(byte[] bArr) throws IOException {
        InputStream inputStream = this.in;
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        while (i != length) {
            int i2 = inputStream.read(bArr, i, length - i);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        count(i);
        if (i < bArr.length) {
            throw new EOFException();
        }
    }

    private int readOneByte() throws IOException {
        int i = this.in.read();
        if (i != -1) {
            count(1);
        }
        return i;
    }

    private int readStored(byte[] bArr, int i, int i2) throws IOException {
        if (this.current.hasDataDescriptor) {
            if (this.lastStoredEntry == null) {
                readStoredEntry();
            }
            return this.lastStoredEntry.read(bArr, i, i2);
        }
        long size = this.current.entry.getSize();
        if (this.current.bytesRead >= size) {
            return -1;
        }
        if (this.buf.position() >= this.buf.limit()) {
            this.buf.position(0);
            int i3 = this.in.read(this.buf.array());
            if (i3 == -1) {
                return -1;
            }
            this.buf.limit(i3);
            count(i3);
            CurrentEntry.access$714(this.current, i3);
        }
        int iMin = Math.min(this.buf.remaining(), i2);
        if (size - this.current.bytesRead < iMin) {
            iMin = (int) (size - this.current.bytesRead);
        }
        this.buf.get(bArr, i, iMin);
        CurrentEntry.access$614(this.current, iMin);
        return iMin;
    }

    private void readStoredEntry() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.current.usesZip64 ? 20 : 12;
        boolean zBufferContainsSignature = false;
        int iCacheBytesRead = 0;
        while (!zBufferContainsSignature) {
            int i2 = this.in.read(this.buf.array(), iCacheBytesRead, 512 - iCacheBytesRead);
            if (i2 <= 0) {
                qa.OooOOOO("Truncated ZIP file");
                return;
            }
            int i3 = i2 + iCacheBytesRead;
            if (i3 < 4) {
                iCacheBytesRead = i3;
            } else {
                zBufferContainsSignature = bufferContainsSignature(byteArrayOutputStream, iCacheBytesRead, i2, i);
                if (!zBufferContainsSignature) {
                    iCacheBytesRead = cacheBytesRead(byteArrayOutputStream, iCacheBytesRead, i2, i);
                }
            }
        }
        this.lastStoredEntry = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private void realSkip(long j) throws IOException {
        long j2 = 0;
        if (j < 0) {
            qa.OooOO0();
            return;
        }
        while (j2 < j) {
            long length = j - j2;
            InputStream inputStream = this.in;
            byte[] bArr = this.SKIP_BUF;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = inputStream.read(bArr, 0, (int) length);
            if (i == -1) {
                return;
            }
            count(i);
            j2 += i;
        }
    }

    private void skipRemainderOfArchive() throws IOException {
        realSkip((this.entriesRead * CFH_LEN) - 30);
        findEocdRecord();
        realSkip(16L);
        readFully(this.SHORT_BUF);
        realSkip(ZipShort.getValue(this.SHORT_BUF));
    }

    private boolean supportsDataDescriptorFor(ZipArchiveEntry zipArchiveEntry) {
        if (zipArchiveEntry.getGeneralPurposeBit().usesDataDescriptor()) {
            return (this.allowStoredEntriesWithDataDescriptor && zipArchiveEntry.getMethod() == 0) || zipArchiveEntry.getMethod() == 8;
        }
        return true;
    }

    public boolean canReadEntryData(z2 z2Var) {
        if (z2Var instanceof ZipArchiveEntry) {
            ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) z2Var;
            if (ZipUtil.canHandleEntryData(zipArchiveEntry) && supportsDataDescriptorFor(zipArchiveEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        try {
            this.in.close();
        } finally {
            this.inf.end();
        }
    }

    public z2 getNextEntry() {
        return getNextZipEntry();
    }

    public ZipArchiveEntry getNextZipEntry() throws DataFormatException, IOException {
        ZipLong zipLong;
        ZipLong zipLong2;
        if (!this.closed && !this.hitCentralDirectory) {
            try {
                if (this.current != null) {
                    closeEntry();
                    readFully(this.LFH_BUF);
                } else {
                    readFirstLocalFileHeader(this.LFH_BUF);
                }
                ZipLong zipLong3 = new ZipLong(this.LFH_BUF);
                if (zipLong3.equals(ZipLong.CFH_SIG) || zipLong3.equals(ZipLong.AED_SIG)) {
                    this.hitCentralDirectory = true;
                    skipRemainderOfArchive();
                }
                if (!zipLong3.equals(ZipLong.LFH_SIG)) {
                    return null;
                }
                this.current = new CurrentEntry();
                this.current.entry.setPlatform((ZipShort.getValue(this.LFH_BUF, 4) >> 8) & 15);
                GeneralPurposeBit generalPurposeBit = GeneralPurposeBit.parse(this.LFH_BUF, 6);
                boolean zUsesUTF8ForNames = generalPurposeBit.usesUTF8ForNames();
                ZipEncoding zipEncoding = zUsesUTF8ForNames ? ZipEncodingHelper.UTF8_ZIP_ENCODING : this.zipEncoding;
                this.current.hasDataDescriptor = generalPurposeBit.usesDataDescriptor();
                this.current.entry.setGeneralPurposeBit(generalPurposeBit);
                this.current.entry.setMethod(ZipShort.getValue(this.LFH_BUF, 8));
                this.current.entry.setTime(ZipUtil.dosToJavaTime(ZipLong.getValue(this.LFH_BUF, 10)));
                if (this.current.hasDataDescriptor) {
                    zipLong = null;
                    zipLong2 = null;
                } else {
                    this.current.entry.setCrc(ZipLong.getValue(this.LFH_BUF, 14));
                    zipLong = new ZipLong(this.LFH_BUF, 18);
                    zipLong2 = new ZipLong(this.LFH_BUF, 22);
                }
                int value = ZipShort.getValue(this.LFH_BUF, 26);
                int value2 = ZipShort.getValue(this.LFH_BUF, 28);
                byte[] bArr = new byte[value];
                readFully(bArr);
                this.current.entry.setName(zipEncoding.decode(bArr), bArr);
                byte[] bArr2 = new byte[value2];
                readFully(bArr2);
                this.current.entry.setExtra(bArr2);
                if (!zUsesUTF8ForNames && this.useUnicodeExtraFields) {
                    ZipUtil.setNameAndCommentFromExtraFields(this.current.entry, bArr, null);
                }
                processZip64Extra(zipLong2, zipLong);
                if (this.current.entry.getCompressedSize() != -1) {
                    int method = this.current.entry.getMethod();
                    int code = ZipMethod.UNSHRINKING.getCode();
                    CurrentEntry currentEntry = this.current;
                    if (method == code) {
                        currentEntry.in = new UnshrinkingInputStream(new BoundedInputStream(this.in, currentEntry.entry.getCompressedSize()));
                    } else {
                        int method2 = currentEntry.entry.getMethod();
                        int code2 = ZipMethod.IMPLODING.getCode();
                        CurrentEntry currentEntry2 = this.current;
                        if (method2 == code2) {
                            currentEntry2.in = new ExplodingInputStream(currentEntry2.entry.getGeneralPurposeBit().getSlidingDictionarySize(), this.current.entry.getGeneralPurposeBit().getNumberOfShannonFanoTrees(), new BoundedInputStream(this.in, this.current.entry.getCompressedSize()));
                        } else if (currentEntry2.entry.getMethod() == ZipMethod.BZIP2.getCode()) {
                            CurrentEntry currentEntry3 = this.current;
                            currentEntry3.in = new i5(new BoundedInputStream(this.in, currentEntry3.entry.getCompressedSize()));
                        }
                    }
                }
                this.entriesRead++;
                return this.current.entry;
            } catch (EOFException unused) {
            }
        }
        return null;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws DataFormatException, IOException {
        int deflated;
        if (this.closed) {
            qa.OooOOOO("The stream is closed");
            return 0;
        }
        CurrentEntry currentEntry = this.current;
        if (currentEntry == null) {
            return -1;
        }
        if (i > bArr.length || i2 < 0 || i < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        if (!supportsDataDescriptorFor(this.current.entry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, this.current.entry);
        }
        if (this.current.entry.getMethod() == 0) {
            deflated = readStored(bArr, i, i2);
        } else if (this.current.entry.getMethod() == 8) {
            deflated = readDeflated(bArr, i, i2);
        } else {
            if (this.current.entry.getMethod() != ZipMethod.UNSHRINKING.getCode() && this.current.entry.getMethod() != ZipMethod.IMPLODING.getCode() && this.current.entry.getMethod() != ZipMethod.BZIP2.getCode()) {
                throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(this.current.entry.getMethod()), this.current.entry);
            }
            deflated = this.current.in.read(bArr, i, i2);
        }
        if (deflated >= 0) {
            this.current.crc.update(bArr, i, deflated);
        }
        return deflated;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws DataFormatException, IOException {
        long j2 = 0;
        if (j < 0) {
            qa.OooOO0();
            return 0L;
        }
        while (j2 < j) {
            long length = j - j2;
            byte[] bArr = this.SKIP_BUF;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            int i = read(bArr, 0, (int) length);
            if (i == -1) {
                break;
            }
            j2 += i;
        }
        return j2;
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public class BoundedInputStream extends InputStream {
        private final InputStream in;
        private final long max;
        private long pos = 0;

        public BoundedInputStream(InputStream inputStream, long j) {
            this.max = j;
            this.in = inputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            long j = this.max;
            if (j < 0 || this.pos < j) {
                return this.in.available();
            }
            return 0;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int i3 = this.in.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.pos) : i2));
            if (i3 == -1) {
                return -1;
            }
            long j2 = i3;
            this.pos += j2;
            ZipArchiveInputStream.this.count(i3);
            CurrentEntry.access$714(ZipArchiveInputStream.this.current, j2);
            return i3;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            long j2 = this.max;
            if (j2 >= 0) {
                j = Math.min(j, j2 - this.pos);
            }
            long jSkip = this.in.skip(j);
            this.pos += jSkip;
            return jSkip;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int i = this.in.read();
            this.pos++;
            ZipArchiveInputStream.this.count(1);
            CurrentEntry.access$708(ZipArchiveInputStream.this.current);
            return i;
        }
    }

    public ZipArchiveInputStream(InputStream inputStream, String str) {
        this(inputStream, str, true);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z) {
        this(inputStream, str, z, false);
    }

    public ZipArchiveInputStream(InputStream inputStream) {
        this(inputStream, "UTF8");
    }
}
