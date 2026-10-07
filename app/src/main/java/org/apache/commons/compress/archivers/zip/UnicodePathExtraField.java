package org.apache.commons.compress.archivers.zip;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class UnicodePathExtraField extends AbstractUnicodeExtraField {
    public static final ZipShort UPATH_ID = new ZipShort(28789);

    public UnicodePathExtraField() {
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public ZipShort getHeaderId() {
        return UPATH_ID;
    }

    public UnicodePathExtraField(String str, byte[] bArr, int i, int i2) {
        super(str, bArr, i, i2);
    }

    public UnicodePathExtraField(String str, byte[] bArr) {
        super(str, bArr);
    }
}
