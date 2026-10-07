package com.cmaster.cloner;

import java.util.Collection;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fn2 {
    public static int OooO00o(Object[] objArr, Class cls, int i) {
        if (i < 0) {
            i = 0;
        }
        if (objArr == null || objArr.length <= i) {
            return -1;
        }
        while (i < objArr.length) {
            if (cls.isInstance(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0O0(boolean r6, java.lang.String r7, java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            if (r8 == 0) goto L85
            if (r7 != 0) goto L6
            goto L85
        L6:
            com.cmaster.cloner.l81 r0 = com.cmaster.cloner.e4.OooO0Oo
            if (r0 == 0) goto Lf
            int r1 = r0.OooO00o(r8)
            goto L13
        Lf:
            int r1 = android.os.Process.myUid()
        L13:
            java.util.HashSet r2 = com.cmaster.cloner.x01.OooO00o
            r2 = 99991(0x18697, float:1.40117E-40)
            if (r1 == r2) goto L23
            r2 = 99992(0x18698, float:1.40119E-40)
            if (r1 != r2) goto L20
            goto L23
        L20:
            r2 = -1
            if (r1 != r2) goto L2c
        L23:
            int r1 = android.os.Process.myUid()
            if (r0 == 0) goto L2c
            r0.OooO0oO(r1, r8)
        L2c:
            com.cmaster.cloner.l81 r1 = com.cmaster.cloner.e4.OooO0OO
            r2 = 0
            if (r1 == 0) goto L38
            java.lang.Object r3 = r1.OooO0O0(r8)
            java.lang.String r3 = (java.lang.String) r3
            goto L39
        L38:
            r3 = r2
        L39:
            if (r3 == 0) goto L5c
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L5c
            java.lang.String r4 = com.cmaster.cloner.qx1.OooO00o()
            boolean r4 = android.text.TextUtils.equals(r3, r4)
            if (r4 != 0) goto L5c
            com.cmaster.cloner.mx1 r4 = com.cmaster.cloner.mx1.OooO0oO()
            r4.getClass()
            int r5 = com.cmaster.cloner.qx1.OooO0oO()
            boolean r3 = r4.OooOO0o(r5, r3)
            if (r3 == 0) goto L6c
        L5c:
            if (r1 == 0) goto L61
            r1.OooO0oo(r8, r7)
        L61:
            if (r6 == 0) goto L6c
            int r1 = android.os.Process.myUid()
            if (r0 == 0) goto L6c
            r0.OooO0oO(r1, r8)
        L6c:
            com.cmaster.cloner.l81 r0 = com.cmaster.cloner.e4.OooO0o0
            if (r0 == 0) goto L77
            java.lang.Object r8 = r0.OooO0O0(r8)
            r2 = r8
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
        L77:
            if (r2 == 0) goto L85
            int r8 = r2.length
            r0 = 0
        L7b:
            if (r0 >= r8) goto L85
            r1 = r2[r0]
            OooO0O0(r6, r7, r1)
            int r0 = r0 + 1
            goto L7b
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.fn2.OooO0O0(boolean, java.lang.String, java.lang.Object):void");
    }

    public static long OooO0OO(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    public static boolean OooO0Oo(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static int OooO0o(Object[] objArr, Class cls) {
        if (objArr == null || objArr.length <= 0) {
            return -1;
        }
        for (int length = objArr.length - 1; length >= 0; length--) {
            if (cls.isInstance(objArr[length])) {
                return length;
            }
        }
        return -1;
    }

    public static boolean OooO0o0(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static void OooO0oO(int i, int i2) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(px0.OooOOOo(new byte[]{-52, -53, -21, -68, -24, 67, 64, -54, -94, -62, -23, -77, -5, 94, 94, -107, -94}, new byte[]{-126, -82, -116, -35, -100, 42, 54, -81}, new StringBuilder(), i));
        }
        if (i2 < 0 || i - i2 < 0) {
            StringBuilder sb = new StringBuilder();
            rj.OooOOOo(new byte[]{-8, 39, 28, -55, 81, 125, 54}, new byte[]{-108, 66, 114, -82, 37, 21, 11, -81}, sb, i);
            rj.OooOOOo(new byte[]{97, 58, -110, -115, -122, 24, -23, 51, 9, 110, -127, -102, -107, 76}, new byte[]{90, 26, -32, -24, -31, 113, -122, 93}, sb, 0);
            throw new ArrayIndexOutOfBoundsException(px0.OooOOOo(new byte[]{-25, -93, 53, -18, -8, 3, 26, 7, -112, -26, 41, -20, -21, 2, 72}, new byte[]{-36, -125, 71, -117, -97, 106, 117, 105}, sb, i2));
        }
    }
}
