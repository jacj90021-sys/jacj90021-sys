package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class e83 {
    public static void OooO00o(int i, int i2) {
        String strOooO00o;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strOooO00o = f83.OooO00o("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ra.OooOOO(px0.OooOOO(i2, "negative size: "));
                    return;
                }
                strOooO00o = f83.OooO00o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strOooO00o);
        }
    }

    public static void OooO0O0(int i, int i2) {
        if (i < 0 || i > i2) {
            ra.OooO0oO(OooO0Oo(i, i2, "index"));
        }
    }

    public static void OooO0OO(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? OooO0Oo(i, i3, "start index") : (i2 < 0 || i2 > i3) ? OooO0Oo(i2, i3, "end index") : f83.OooO00o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String OooO0Oo(int i, int i2, String str) {
        if (i < 0) {
            return f83.OooO00o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return f83.OooO00o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ra.OooOOO(px0.OooOOO(i2, "negative size: "));
        return null;
    }
}
