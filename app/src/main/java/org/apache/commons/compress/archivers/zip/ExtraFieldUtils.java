package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.rj;
import com.cmaster.cloner.sa;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ExtraFieldUtils {
    private static final int WORD = 4;
    private static final Map<ZipShort, Class<?>> implementations = new ConcurrentHashMap();

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class UnparseableExtraField {
        public static final int READ_KEY = 2;
        public static final int SKIP_KEY = 1;
        public static final int THROW_KEY = 0;
        private final int key;
        public static final UnparseableExtraField THROW = new UnparseableExtraField(0);
        public static final UnparseableExtraField SKIP = new UnparseableExtraField(1);
        public static final UnparseableExtraField READ = new UnparseableExtraField(2);

        private UnparseableExtraField(int i) {
            this.key = i;
        }

        public int getKey() {
            return this.key;
        }
    }

    static {
        register(AsiExtraField.class);
        register(X5455_ExtendedTimestamp.class);
        register(X7875_NewUnix.class);
        register(JarMarker.class);
        register(UnicodePathExtraField.class);
        register(UnicodeCommentExtraField.class);
        register(Zip64ExtendedInformationExtraField.class);
        register(X000A_NTFS.class);
        register(X0014_X509Certificates.class);
        register(X0015_CertificateIdForFile.class);
        register(X0016_CertificateIdForCentralDirectory.class);
        register(X0017_StrongEncryptionHeader.class);
        register(X0019_EncryptionRecipientCertificateList.class);
    }

    public static ZipExtraField createExtraField(ZipShort zipShort) {
        Class<?> cls = implementations.get(zipShort);
        if (cls != null) {
            return (ZipExtraField) cls.newInstance();
        }
        UnrecognizedExtraField unrecognizedExtraField = new UnrecognizedExtraField();
        unrecognizedExtraField.setHeaderId(zipShort);
        return unrecognizedExtraField;
    }

    public static byte[] mergeCentralDirectoryData(ZipExtraField[] zipExtraFieldArr) {
        byte[] centralDirectoryData;
        boolean z = zipExtraFieldArr.length > 0 && (zipExtraFieldArr[zipExtraFieldArr.length - 1] instanceof UnparseableExtraFieldData);
        int length = zipExtraFieldArr.length;
        if (z) {
            length--;
        }
        int value = length * 4;
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            value += zipExtraField.getCentralDirectoryLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i = 0; i < length; i++) {
            System.arraycopy(zipExtraFieldArr[i].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(zipExtraFieldArr[i].getCentralDirectoryLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] centralDirectoryData2 = zipExtraFieldArr[i].getCentralDirectoryData();
            if (centralDirectoryData2 != null) {
                System.arraycopy(centralDirectoryData2, 0, bArr, length2, centralDirectoryData2.length);
                length2 += centralDirectoryData2.length;
            }
        }
        if (z && (centralDirectoryData = zipExtraFieldArr[zipExtraFieldArr.length - 1].getCentralDirectoryData()) != null) {
            System.arraycopy(centralDirectoryData, 0, bArr, length2, centralDirectoryData.length);
        }
        return bArr;
    }

    public static byte[] mergeLocalFileDataData(ZipExtraField[] zipExtraFieldArr) {
        byte[] localFileDataData;
        boolean z = zipExtraFieldArr.length > 0 && (zipExtraFieldArr[zipExtraFieldArr.length - 1] instanceof UnparseableExtraFieldData);
        int length = zipExtraFieldArr.length;
        if (z) {
            length--;
        }
        int value = length * 4;
        for (ZipExtraField zipExtraField : zipExtraFieldArr) {
            value += zipExtraField.getLocalFileDataLength().getValue();
        }
        byte[] bArr = new byte[value];
        int length2 = 0;
        for (int i = 0; i < length; i++) {
            System.arraycopy(zipExtraFieldArr[i].getHeaderId().getBytes(), 0, bArr, length2, 2);
            System.arraycopy(zipExtraFieldArr[i].getLocalFileDataLength().getBytes(), 0, bArr, length2 + 2, 2);
            length2 += 4;
            byte[] localFileDataData2 = zipExtraFieldArr[i].getLocalFileDataData();
            if (localFileDataData2 != null) {
                System.arraycopy(localFileDataData2, 0, bArr, length2, localFileDataData2.length);
                length2 += localFileDataData2.length;
            }
        }
        if (z && (localFileDataData = zipExtraFieldArr[zipExtraFieldArr.length - 1].getLocalFileDataData()) != null) {
            System.arraycopy(localFileDataData, 0, bArr, length2, localFileDataData.length);
        }
        return bArr;
    }

    public static ZipExtraField[] parse(byte[] bArr, boolean z, UnparseableExtraField unparseableExtraField) throws ZipException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i > bArr.length - 4) {
                break;
            }
            ZipShort zipShort = new ZipShort(bArr, i);
            int value = new ZipShort(bArr, i + 2).getValue();
            int i2 = i + 4;
            if (i2 + value > bArr.length) {
                int key = unparseableExtraField.getKey();
                if (key == 0) {
                    StringBuilder sbOooO = rj.OooO(i, value, "bad extra field starting at ", ".  Block length of ", " bytes exceeds remaining data of ");
                    sbOooO.append((bArr.length - i) - 4);
                    sbOooO.append(" bytes.");
                    throw new ZipException(sbOooO.toString());
                }
                if (key != 1) {
                    if (key != 2) {
                        throw new ZipException("unknown UnparseableExtraField key: " + unparseableExtraField.getKey());
                    }
                    UnparseableExtraFieldData unparseableExtraFieldData = new UnparseableExtraFieldData();
                    if (z) {
                        unparseableExtraFieldData.parseFromLocalFileData(bArr, i, bArr.length - i);
                    } else {
                        unparseableExtraFieldData.parseFromCentralDirectoryData(bArr, i, bArr.length - i);
                    }
                    arrayList.add(unparseableExtraFieldData);
                }
            } else {
                try {
                    ZipExtraField zipExtraFieldCreateExtraField = createExtraField(zipShort);
                    if (z) {
                        zipExtraFieldCreateExtraField.parseFromLocalFileData(bArr, i2, value);
                    } else {
                        zipExtraFieldCreateExtraField.parseFromCentralDirectoryData(bArr, i2, value);
                    }
                    arrayList.add(zipExtraFieldCreateExtraField);
                    i += value + 4;
                } catch (IllegalAccessException e) {
                    throw ((ZipException) new ZipException(e.getMessage()).initCause(e));
                } catch (InstantiationException e2) {
                    throw ((ZipException) new ZipException(e2.getMessage()).initCause(e2));
                }
            }
        }
        return (ZipExtraField[]) arrayList.toArray(new ZipExtraField[arrayList.size()]);
    }

    public static void register(Class<?> cls) {
        try {
            implementations.put(((ZipExtraField) cls.newInstance()).getHeaderId(), cls);
        } catch (ClassCastException unused) {
            sa.OooO0Oo(cls, " doesn't implement ZipExtraField");
        } catch (IllegalAccessException unused2) {
            sa.OooO0Oo(cls, "'s no-arg constructor is not public");
        } catch (InstantiationException unused3) {
            sa.OooO0Oo(cls, " is not a concrete class");
        }
    }

    public static ZipExtraField[] parse(byte[] bArr, boolean z) {
        return parse(bArr, z, UnparseableExtraField.THROW);
    }

    public static ZipExtraField[] parse(byte[] bArr) {
        return parse(bArr, true, UnparseableExtraField.THROW);
    }
}
