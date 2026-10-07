package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class X0016_CertificateIdForCentralDirectory extends PKWareExtraHeader {
    private PKWareExtraHeader.HashAlgorithm hashAlg;
    private int rcount;

    public X0016_CertificateIdForCentralDirectory() {
        super(new ZipShort(22));
    }

    public PKWareExtraHeader.HashAlgorithm getHashAlgorithm() {
        return this.hashAlg;
    }

    public int getRecordCount() {
        return this.rcount;
    }

    @Override // org.apache.commons.compress.archivers.zip.PKWareExtraHeader, org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] bArr, int i, int i2) {
        this.rcount = ZipShort.getValue(bArr, i);
        this.hashAlg = PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(ZipShort.getValue(bArr, i + 2));
    }
}
