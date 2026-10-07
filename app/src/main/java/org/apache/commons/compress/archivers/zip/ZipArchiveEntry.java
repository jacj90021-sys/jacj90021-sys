package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.px0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.sa;
import com.cmaster.cloner.z2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ZipArchiveEntry extends ZipEntry implements z2 {
    public static final int CRC_UNKNOWN = -1;
    public static final int PLATFORM_FAT = 0;
    public static final int PLATFORM_UNIX = 3;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_SHIFT = 16;
    private long externalAttributes;
    private ZipExtraField[] extraFields;
    private GeneralPurposeBit gpb;
    private int internalAttributes;
    private int method;
    private String name;
    private int platform;
    private int rawFlag;
    private byte[] rawName;
    private long size;
    private UnparseableExtraFieldData unparseableExtra;
    private int versionMadeBy;
    private int versionRequired;
    private static final byte[] EMPTY = new byte[0];
    private static final ZipExtraField[] noExtraFields = new ZipExtraField[0];

    public ZipArchiveEntry(ZipEntry zipEntry) {
        super(zipEntry);
        this.method = -1;
        this.size = -1L;
        this.internalAttributes = 0;
        this.platform = 0;
        this.externalAttributes = 0L;
        this.unparseableExtra = null;
        this.name = null;
        this.rawName = null;
        this.gpb = new GeneralPurposeBit();
        setName(zipEntry.getName());
        byte[] extra = zipEntry.getExtra();
        if (extra != null) {
            setExtraFields(ExtraFieldUtils.parse(extra, true, ExtraFieldUtils.UnparseableExtraField.READ));
        } else {
            setExtra();
        }
        setMethod(zipEntry.getMethod());
        this.size = zipEntry.getSize();
    }

    private ZipExtraField[] copyOf(ZipExtraField[] zipExtraFieldArr, int i) {
        ZipExtraField[] zipExtraFieldArr2 = new ZipExtraField[i];
        System.arraycopy(zipExtraFieldArr, 0, zipExtraFieldArr2, 0, Math.min(zipExtraFieldArr.length, i));
        return zipExtraFieldArr2;
    }

    private ZipExtraField[] getAllExtraFields() {
        ZipExtraField[] allExtraFieldsNoCopy = getAllExtraFieldsNoCopy();
        return allExtraFieldsNoCopy == this.extraFields ? copyOf(allExtraFieldsNoCopy) : allExtraFieldsNoCopy;
    }

    private ZipExtraField[] getAllExtraFieldsNoCopy() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        return zipExtraFieldArr == null ? getUnparseableOnly() : this.unparseableExtra != null ? getMergedFields() : zipExtraFieldArr;
    }

    private ZipExtraField[] getMergedFields() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        ZipExtraField[] zipExtraFieldArrCopyOf = copyOf(zipExtraFieldArr, zipExtraFieldArr.length + 1);
        zipExtraFieldArrCopyOf[this.extraFields.length] = this.unparseableExtra;
        return zipExtraFieldArrCopyOf;
    }

    private ZipExtraField[] getParseableExtraFields() {
        ZipExtraField[] parseableExtraFieldsNoCopy = getParseableExtraFieldsNoCopy();
        return parseableExtraFieldsNoCopy == this.extraFields ? copyOf(parseableExtraFieldsNoCopy) : parseableExtraFieldsNoCopy;
    }

    private ZipExtraField[] getParseableExtraFieldsNoCopy() {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        return zipExtraFieldArr == null ? noExtraFields : zipExtraFieldArr;
    }

    private ZipExtraField[] getUnparseableOnly() {
        UnparseableExtraFieldData unparseableExtraFieldData = this.unparseableExtra;
        return unparseableExtraFieldData == null ? noExtraFields : new ZipExtraField[]{unparseableExtraFieldData};
    }

    private void mergeExtraFields(ZipExtraField[] zipExtraFieldArr, boolean z) {
        if (this.extraFields == null) {
            setExtraFields(zipExtraFieldArr);
            return;
        }
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            ZipExtraField extraField = zipExtraField instanceof UnparseableExtraFieldData ? this.unparseableExtra : getExtraField(zipExtraField.getHeaderId());
            if (extraField == null) {
                addExtraField(zipExtraField);
            } else if (z) {
                byte[] localFileDataData = zipExtraField.getLocalFileDataData();
                extraField.parseFromLocalFileData(localFileDataData, 0, localFileDataData.length);
            } else {
                byte[] centralDirectoryData = zipExtraField.getCentralDirectoryData();
                extraField.parseFromCentralDirectoryData(centralDirectoryData, 0, centralDirectoryData.length);
            }
        }
        setExtra();
    }

    public void addAsFirstExtraField(ZipExtraField zipExtraField) {
        if (zipExtraField instanceof UnparseableExtraFieldData) {
            this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
        } else {
            if (getExtraField(zipExtraField.getHeaderId()) != null) {
                removeExtraField(zipExtraField.getHeaderId());
            }
            ZipExtraField[] zipExtraFieldArr = this.extraFields;
            ZipExtraField[] zipExtraFieldArr2 = new ZipExtraField[zipExtraFieldArr != null ? zipExtraFieldArr.length + 1 : 1];
            this.extraFields = zipExtraFieldArr2;
            zipExtraFieldArr2[0] = zipExtraField;
            if (zipExtraFieldArr != null) {
                System.arraycopy(zipExtraFieldArr, 0, zipExtraFieldArr2, 1, zipExtraFieldArr2.length - 1);
            }
        }
        setExtra();
    }

    public void addExtraField(ZipExtraField zipExtraField) {
        if (zipExtraField instanceof UnparseableExtraFieldData) {
            this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
        } else if (this.extraFields == null) {
            this.extraFields = new ZipExtraField[]{zipExtraField};
        } else {
            if (getExtraField(zipExtraField.getHeaderId()) != null) {
                removeExtraField(zipExtraField.getHeaderId());
            }
            ZipExtraField[] zipExtraFieldArr = this.extraFields;
            ZipExtraField[] zipExtraFieldArrCopyOf = copyOf(zipExtraFieldArr, zipExtraFieldArr.length + 1);
            zipExtraFieldArrCopyOf[zipExtraFieldArrCopyOf.length - 1] = zipExtraField;
            this.extraFields = zipExtraFieldArrCopyOf;
        }
        setExtra();
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) super.clone();
        zipArchiveEntry.setInternalAttributes(getInternalAttributes());
        zipArchiveEntry.setExternalAttributes(getExternalAttributes());
        zipArchiveEntry.setExtraFields(getAllExtraFieldsNoCopy());
        return zipArchiveEntry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) obj;
            String name = getName();
            String name2 = zipArchiveEntry.getName();
            if (name == null) {
                if (name2 != null) {
                    return false;
                }
            } else if (!name.equals(name2)) {
                return false;
            }
            String comment = getComment();
            String comment2 = zipArchiveEntry.getComment();
            if (comment == null) {
                comment = "";
            }
            if (comment2 == null) {
                comment2 = "";
            }
            if (getTime() == zipArchiveEntry.getTime() && comment.equals(comment2) && getInternalAttributes() == zipArchiveEntry.getInternalAttributes() && getPlatform() == zipArchiveEntry.getPlatform() && getExternalAttributes() == zipArchiveEntry.getExternalAttributes() && getMethod() == zipArchiveEntry.getMethod() && getSize() == zipArchiveEntry.getSize() && getCrc() == zipArchiveEntry.getCrc() && getCompressedSize() == zipArchiveEntry.getCompressedSize() && Arrays.equals(getCentralDirectoryExtra(), zipArchiveEntry.getCentralDirectoryExtra()) && Arrays.equals(getLocalFileDataExtra(), zipArchiveEntry.getLocalFileDataExtra()) && this.gpb.equals(zipArchiveEntry.gpb)) {
                return true;
            }
        }
        return false;
    }

    public byte[] getCentralDirectoryExtra() {
        return ExtraFieldUtils.mergeCentralDirectoryData(getAllExtraFieldsNoCopy());
    }

    public long getExternalAttributes() {
        return this.externalAttributes;
    }

    public ZipExtraField getExtraField(ZipShort zipShort) {
        ZipExtraField[] zipExtraFieldArr = this.extraFields;
        if (zipExtraFieldArr == null) {
            return null;
        }
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            if (zipShort.equals(zipExtraField.getHeaderId())) {
                return zipExtraField;
            }
        }
        return null;
    }

    public ZipExtraField[] getExtraFields(boolean z) {
        return z ? getAllExtraFields() : getParseableExtraFields();
    }

    public GeneralPurposeBit getGeneralPurposeBit() {
        return this.gpb;
    }

    public int getInternalAttributes() {
        return this.internalAttributes;
    }

    public Date getLastModifiedDate() {
        return new Date(getTime());
    }

    public byte[] getLocalFileDataExtra() {
        byte[] extra = getExtra();
        return extra != null ? extra : EMPTY;
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
        return this.method;
    }

    @Override // java.util.zip.ZipEntry
    public String getName() {
        String str = this.name;
        return str == null ? super.getName() : str;
    }

    public int getPlatform() {
        return this.platform;
    }

    public int getRawFlag() {
        return this.rawFlag;
    }

    public byte[] getRawName() {
        byte[] bArr = this.rawName;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // java.util.zip.ZipEntry
    public long getSize() {
        return this.size;
    }

    public int getUnixMode() {
        if (this.platform != 3) {
            return 0;
        }
        return (int) ((getExternalAttributes() >> 16) & 65535);
    }

    public UnparseableExtraFieldData getUnparseableExtraFieldData() {
        return this.unparseableExtra;
    }

    public int getVersionMadeBy() {
        return this.versionMadeBy;
    }

    public int getVersionRequired() {
        return this.versionRequired;
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
        return getName().hashCode();
    }

    @Override // java.util.zip.ZipEntry
    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    public boolean isUnixSymlink() {
        return (getUnixMode() & UnixStat.LINK_FLAG) == 40960;
    }

    public void removeExtraField(ZipShort zipShort) {
        if (this.extraFields == null) {
            sa.OooOO0O();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ZipExtraField zipExtraField : this.extraFields) {
            if (!zipShort.equals(zipExtraField.getHeaderId())) {
                arrayList.add(zipExtraField);
            }
        }
        if (this.extraFields.length == arrayList.size()) {
            sa.OooOO0O();
        } else {
            this.extraFields = (ZipExtraField[]) arrayList.toArray(new ZipExtraField[arrayList.size()]);
            setExtra();
        }
    }

    public void removeUnparseableExtraFieldData() {
        if (this.unparseableExtra == null) {
            sa.OooOO0O();
        } else {
            this.unparseableExtra = null;
            setExtra();
        }
    }

    public void setCentralDirectoryExtra(byte[] bArr) {
        try {
            mergeExtraFields(ExtraFieldUtils.parse(bArr, false, ExtraFieldUtils.UnparseableExtraField.READ), false);
        } catch (ZipException e) {
            qa.OooO0oO(e.getMessage(), e);
        }
    }

    public void setExternalAttributes(long j) {
        this.externalAttributes = j;
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) {
        try {
            mergeExtraFields(ExtraFieldUtils.parse(bArr, true, ExtraFieldUtils.UnparseableExtraField.READ), true);
        } catch (ZipException e) {
            throw new RuntimeException("Error parsing extra fields for entry: " + getName() + " - " + e.getMessage(), e);
        }
    }

    public void setExtraFields(ZipExtraField[] zipExtraFieldArr) {
        ArrayList arrayList = new ArrayList();
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            if (zipExtraField instanceof UnparseableExtraFieldData) {
                this.unparseableExtra = (UnparseableExtraFieldData) zipExtraField;
            } else {
                arrayList.add(zipExtraField);
            }
        }
        this.extraFields = (ZipExtraField[]) arrayList.toArray(new ZipExtraField[arrayList.size()]);
        setExtra();
    }

    public void setGeneralPurposeBit(GeneralPurposeBit generalPurposeBit) {
        this.gpb = generalPurposeBit;
    }

    public void setInternalAttributes(int i) {
        this.internalAttributes = i;
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int i) {
        if (i >= 0) {
            this.method = i;
        } else {
            ra.OooOOO(px0.OooOOO(i, "ZIP compression method can not be negative: "));
        }
    }

    public void setName(String str) {
        if (str != null && getPlatform() == 0 && !str.contains("/")) {
            str = str.replace('\\', '/');
        }
        this.name = str;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setRawFlag(int i) {
        this.rawFlag = i;
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long j) {
        if (j >= 0) {
            this.size = j;
        } else {
            ra.OooOOO("invalid entry size");
        }
    }

    public void setUnixMode(int i) {
        setExternalAttributes(((i & 128) == 0 ? 1 : 0) | (i << 16) | (isDirectory() ? 16 : 0));
        this.platform = 3;
    }

    public void setVersionMadeBy(int i) {
        this.versionMadeBy = i;
    }

    public void setVersionRequired(int i) {
        this.versionRequired = i;
    }

    private ZipExtraField[] copyOf(ZipExtraField[] zipExtraFieldArr) {
        return copyOf(zipExtraFieldArr, zipExtraFieldArr.length);
    }

    public ZipExtraField[] getExtraFields() {
        return getParseableExtraFields();
    }

    public void setName(String str, byte[] bArr) {
        setName(str);
        this.rawName = bArr;
    }

    public void setExtra() {
        super.setExtra(ExtraFieldUtils.mergeLocalFileDataData(getAllExtraFieldsNoCopy()));
    }

    public ZipArchiveEntry(String str) {
        super(str);
        this.method = -1;
        this.size = -1L;
        this.internalAttributes = 0;
        this.platform = 0;
        this.externalAttributes = 0L;
        this.unparseableExtra = null;
        this.name = null;
        this.rawName = null;
        this.gpb = new GeneralPurposeBit();
        setName(str);
    }

    public ZipArchiveEntry(ZipArchiveEntry zipArchiveEntry) {
        this((ZipEntry) zipArchiveEntry);
        setInternalAttributes(zipArchiveEntry.getInternalAttributes());
        setExternalAttributes(zipArchiveEntry.getExternalAttributes());
        setExtraFields(getAllExtraFieldsNoCopy());
        setPlatform(zipArchiveEntry.getPlatform());
        GeneralPurposeBit generalPurposeBit = zipArchiveEntry.getGeneralPurposeBit();
        setGeneralPurposeBit(generalPurposeBit == null ? null : (GeneralPurposeBit) generalPurposeBit.clone());
    }

    public ZipArchiveEntry() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ZipArchiveEntry(File file, String str) {
        if (file.isDirectory() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        this(str);
        if (file.isFile()) {
            setSize(file.length());
        }
        setTime(file.lastModified());
    }
}
