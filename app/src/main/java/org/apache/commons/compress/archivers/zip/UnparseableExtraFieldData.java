package org.apache.commons.compress.archivers.zip;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class UnparseableExtraFieldData implements ZipExtraField {
    private static final ZipShort HEADER_ID = new ZipShort(44225);
    private byte[] centralDirectoryData;
    private byte[] localFileData;

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
        byte[] bArr = this.centralDirectoryData;
        return bArr == null ? getLocalFileDataData() : ZipUtil.copy(bArr);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getCentralDirectoryLength() {
        byte[] bArr = this.centralDirectoryData;
        return bArr == null ? getLocalFileDataLength() : new ZipShort(bArr.length);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return HEADER_ID;
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
        return ZipUtil.copy(this.localFileData);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getLocalFileDataLength() {
        byte[] bArr = this.localFileData;
        return new ZipShort(bArr == null ? 0 : bArr.length);
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.centralDirectoryData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (this.localFileData == null) {
            parseFromLocalFileData(bArr, i, i2);
        }
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.localFileData = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
