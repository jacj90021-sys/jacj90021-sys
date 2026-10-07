package com.cmaster.cloner;

import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class z62 {
    public static final SparseArray OooO00o;
    public static final SparseArray OooO0O0;
    public static final AtomicReference OooO0OO;
    public static final HashMap OooO0Oo;

    static {
        SparseArray sparseArray = new SparseArray();
        OooO00o = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        OooO0O0 = sparseArray2;
        OooO0OO = new AtomicReference();
        sparseArray.put(-1, p63.FORMAT_UNKNOWN);
        sparseArray.put(1, p63.FORMAT_CODE_128);
        sparseArray.put(2, p63.FORMAT_CODE_39);
        sparseArray.put(4, p63.FORMAT_CODE_93);
        sparseArray.put(8, p63.FORMAT_CODABAR);
        sparseArray.put(16, p63.FORMAT_DATA_MATRIX);
        sparseArray.put(32, p63.FORMAT_EAN_13);
        sparseArray.put(64, p63.FORMAT_EAN_8);
        sparseArray.put(128, p63.FORMAT_ITF);
        sparseArray.put(256, p63.FORMAT_QR_CODE);
        sparseArray.put(512, p63.FORMAT_UPC_A);
        sparseArray.put(1024, p63.FORMAT_UPC_E);
        sparseArray.put(2048, p63.FORMAT_PDF417);
        sparseArray.put(4096, p63.FORMAT_AZTEC);
        sparseArray2.put(0, q63.TYPE_UNKNOWN);
        sparseArray2.put(1, q63.TYPE_CONTACT_INFO);
        sparseArray2.put(2, q63.TYPE_EMAIL);
        sparseArray2.put(3, q63.TYPE_ISBN);
        sparseArray2.put(4, q63.TYPE_PHONE);
        sparseArray2.put(5, q63.TYPE_PRODUCT);
        sparseArray2.put(6, q63.TYPE_SMS);
        sparseArray2.put(7, q63.TYPE_TEXT);
        sparseArray2.put(8, q63.TYPE_URL);
        sparseArray2.put(9, q63.TYPE_WIFI);
        sparseArray2.put(10, q63.TYPE_GEO);
        sparseArray2.put(11, q63.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, q63.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        OooO0Oo = map;
        map.put(1, tb3.CODE_128);
        map.put(2, tb3.CODE_39);
        map.put(4, tb3.CODE_93);
        map.put(8, tb3.CODABAR);
        map.put(16, tb3.DATA_MATRIX);
        map.put(32, tb3.EAN_13);
        map.put(64, tb3.EAN_8);
        map.put(128, tb3.ITF);
        map.put(256, tb3.QR_CODE);
        map.put(512, tb3.UPC_A);
        map.put(1024, tb3.UPC_E);
        map.put(2048, tb3.PDF417);
        map.put(4096, tb3.AZTEC);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.ub3 OooO00o(com.cmaster.cloner.a6 r3) {
        /*
            r3.getClass()
            com.cmaster.cloner.OooO0O0 r3 = new com.cmaster.cloner.OooO0O0
            r3.<init>()
            java.util.HashMap r0 = com.cmaster.cloner.z62.OooO0Oo
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L2e
            int r1 = r3.OooO0O0
            int r2 = r0.size()
            int r2 = r2 + r1
            r3.OooO0o0(r2)
            boolean r1 = r0 instanceof com.cmaster.cloner.uc2
            if (r1 != 0) goto L1f
            goto L2e
        L1f:
            com.cmaster.cloner.uc2 r0 = (com.cmaster.cloner.uc2) r0
            java.lang.Object r1 = r3.OooO0OO
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r3.OooO0O0
            int r0 = r0.OooO00o(r1, r2)
            r3.OooO0O0 = r0
            goto L40
        L2e:
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            r3.OooO0Oo(r1)
            goto L32
        L40:
            com.cmaster.cloner.nz0 r0 = new com.cmaster.cloner.nz0
            r1 = 25
            r2 = 0
            r0.<init>(r1, r2)
            com.cmaster.cloner.qf2 r3 = r3.OooO0o()
            r0.OooO0o0 = r3
            com.cmaster.cloner.ub3 r3 = new com.cmaster.cloner.ub3
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.z62.OooO00o(com.cmaster.cloner.a6):com.cmaster.cloner.ub3");
    }

    public static void OooO0O0(ic3 ic3Var, e63 e63Var) {
        ic3Var.OooO0O0(new nz0(e63Var, 15), f63.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean OooO0OO() {
        AtomicReference atomicReference = OooO0OO;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context contextOooO0O0 = au0.OooO0OO().OooO0O0();
        qf2 qf2Var = j23.OooO0oo;
        boolean z = fu.OooO00o(contextOooO0O0, "com.google.mlkit.dynamite.barcode") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
