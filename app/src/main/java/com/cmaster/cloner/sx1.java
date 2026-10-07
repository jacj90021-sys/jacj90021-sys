package com.cmaster.cloner;

import android.content.ContentResolver;
import android.os.HandlerThread;
import android.os.Parcel;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sx1 {
    public static final sx1 OooO = new sx1();
    public final SparseArray OooO00o;
    public final SparseArray OooO0O0;
    public final SparseArray OooO0OO;
    public final SparseArray OooO0Oo;
    public final ContentResolver OooO0o;
    public final SparseArray[] OooO0o0;
    public HandlerThread OooO0oO;
    public oOo00o0o OooO0oo;

    public sx1() {
        SparseArray sparseArray = new SparseArray();
        this.OooO00o = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        this.OooO0O0 = sparseArray2;
        SparseArray sparseArray3 = new SparseArray();
        this.OooO0OO = sparseArray3;
        SparseArray sparseArray4 = new SparseArray();
        this.OooO0Oo = sparseArray4;
        this.OooO0o0 = new SparseArray[]{sparseArray, sparseArray2, sparseArray3, sparseArray4};
        this.OooO0o = e92.OooO00o.getContentResolver();
    }

    public static void OooO00o(sx1 sx1Var, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        sx1Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInt(1);
        OooO0Oo((HashMap) sx1Var.OooO00o.get(i), parcelObtain);
        OooO0Oo((HashMap) sx1Var.OooO0O0.get(i), parcelObtain);
        OooO0Oo((HashMap) sx1Var.OooO0OO.get(i), parcelObtain);
        OooO0Oo((HashMap) sx1Var.OooO0Oo.get(i), parcelObtain);
        File fileOooO0O0 = OooO0O0(i);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    if (!fileOooO0O0.exists()) {
                        fileOooO0O0.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(fileOooO0O0);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception unused) {
        }
        try {
            fileOutputStream.write(parcelObtain.marshall());
            fileOutputStream.close();
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            parcelObtain.recycle();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        parcelObtain.recycle();
    }

    public static File OooO0O0(int i) {
        File file = new File(dx1.OooO0O0(), u7.OooO00o(new byte[]{12, 100, 83, 100, 66}, new byte[]{121, 23, 54, 22, 49, 40, -53, -23}));
        zz.OooOO0(file, false);
        File file2 = new File(file, String.valueOf(i));
        zz.OooOO0(file2, false);
        return new File(file2, u7.OooO00o(new byte[]{-85, -3, -55, 53, 52}, new byte[]{-40, -114, -25, 81, 86, 109, 38, -41}));
    }

    public static void OooO0Oo(HashMap map, Parcel parcel) {
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(int r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            android.util.SparseArray r4 = r9.OooO00o
            r4.put(r10, r0)
            android.util.SparseArray r4 = r9.OooO0O0
            r4.put(r10, r1)
            android.util.SparseArray r4 = r9.OooO0OO
            r4.put(r10, r2)
            android.util.SparseArray r9 = r9.OooO0Oo
            r9.put(r10, r3)
            java.io.File r9 = OooO0O0(r10)
            boolean r10 = r9.exists()
            if (r10 != 0) goto L34
            goto Ld0
        L34:
            long r4 = r9.length()
            int r10 = (int) r4
            byte[] r4 = new byte[r10]
            r5 = 0
            r6 = 0
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            int r6 = r7.read(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            r7.close()     // Catch: java.lang.Exception -> L60
            goto L60
        L4a:
            r9 = move-exception
            r6 = r7
            goto Ld1
        L4e:
            r6 = move-exception
            goto L57
        L50:
            r9 = move-exception
            goto Ld1
        L53:
            r7 = move-exception
            r8 = r7
            r7 = r6
            r6 = r8
        L57:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L5f
            r7.close()     // Catch: java.lang.Exception -> L5f
        L5f:
            r6 = r5
        L60:
            if (r10 == r6) goto L66
            r9.delete()
            return
        L66:
            android.os.Parcel r9 = android.os.Parcel.obtain()
            r9.unmarshall(r4, r5, r10)
            r9.setDataPosition(r5)
            int r10 = r9.readInt()
            if (r10 <= 0) goto Ld0
            r4 = 1
            if (r10 <= r4) goto L7a
            goto Ld0
        L7a:
            int r10 = r9.readInt()
            r4 = r5
        L7f:
            if (r4 >= r10) goto L8f
            java.lang.String r6 = r9.readString()
            java.lang.String r7 = r9.readString()
            r0.put(r6, r7)
            int r4 = r4 + 1
            goto L7f
        L8f:
            int r10 = r9.readInt()
            r0 = r5
        L94:
            if (r0 >= r10) goto La4
            java.lang.String r4 = r9.readString()
            java.lang.String r6 = r9.readString()
            r1.put(r4, r6)
            int r0 = r0 + 1
            goto L94
        La4:
            int r10 = r9.readInt()
            r0 = r5
        La9:
            if (r0 >= r10) goto Lb9
            java.lang.String r1 = r9.readString()
            java.lang.String r4 = r9.readString()
            r2.put(r1, r4)
            int r0 = r0 + 1
            goto La9
        Lb9:
            int r10 = r9.readInt()
        Lbd:
            if (r5 >= r10) goto Lcd
            java.lang.String r0 = r9.readString()
            java.lang.String r1 = r9.readString()
            r3.put(r0, r1)
            int r5 = r5 + 1
            goto Lbd
        Lcd:
            r9.recycle()
        Ld0:
            return
        Ld1:
            if (r6 == 0) goto Ld6
            r6.close()     // Catch: java.lang.Exception -> Ld6
        Ld6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.sx1.OooO0OO(int):void");
    }
}
