package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class jr1 {
    public static final a02 OooO00o;
    public static final a02 OooO0O0;
    public static int OooO0OO;

    static {
        Class<?> cls;
        u7.OooO00o(new byte[]{-85, -116, -103, -101, 11, 103, 43, 86, -91, -111, -45, -68, 23, 107, 61, 48, -85, -116, -103, -123, 1}, new byte[]{-54, -30, -3, -23, 100, 14, 79, 120});
        try {
            cls = Class.forName(u7.OooO00o(new byte[]{50, 94, -16, -8, -23, 34, 8, -115, 60, 67, -70, -33, -11, 46, 30, -21, 50, 94, -16, -26, -29}, new byte[]{83, 48, -108, -118, -122, 75, 108, -93}));
        } catch (Exception unused) {
            cls = null;
        }
        OooO00o = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{57, 55, -96, -87, 47, 10, -18, -53, 48, 53, -127, -103, 43, 20, -53, -58}, new byte[]{94, 82, -44, -22, 78, 102, -126, -94}), new Class[0]);
        OooO0O0 = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{121, 18, 98, -20, -48, 87, -108, 96}, new byte[]{20, 107, 55, -97, -75, 37, -35, 4}), new Class[0]);
        m81.OooO0O0(cls, u7.OooO00o(new byte[]{-47, -32, 7, 94, -21, -42, -24, 126, -63, -31}, new byte[]{-124, -77, 66, 12, -76, -103, -65, 48}));
        OooO0OO = -1;
    }

    public static int OooO00o() {
        if (OooO0OO == -1) {
            OooO0OO = 0;
            a02 a02Var = OooO0O0;
            if (a02Var != null) {
                OooO0OO = ((Integer) a02Var.OooO0o0(new Object[0])).intValue();
            }
        }
        return OooO0OO;
    }
}
