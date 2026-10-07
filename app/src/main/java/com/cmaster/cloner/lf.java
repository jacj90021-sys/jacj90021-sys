package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lf {
    public static final gf OooO0Oo;
    public static final lf[] OooO0o0;
    private final String name;
    private final int ordinal;

    protected lf(String str, int i) {
        this.name = str;
        this.ordinal = i;
    }

    static {
        ef efVar = new ef(u7.OooO00o(new byte[]{48, 14}, new byte[]{124, 90, -23, 81, -101, -110, -109, 96}));
        ff ffVar = new ff(u7.OooO00o(new byte[]{99, 16}, new byte[]{47, 85, 33, 12, 126, 105, -78, -92}));
        gf gfVar = new gf(u7.OooO00o(new byte[]{-9, 97}, new byte[]{-78, 48, 45, 98, 13, -6, -2, -43}));
        OooO0Oo = gfVar;
        hf hfVar = new hf(u7.OooO00o(new byte[]{104, -97}, new byte[]{47, -38, -111, -100, -50, -82, 54, 22}));
        jf jfVar = new jf(u7.OooO00o(new byte[]{-3, 56}, new byte[]{-70, 108, -41, -110, 12, 59, -58, 70}));
        OooO0o0 = new lf[]{efVar, ffVar, gfVar, hfVar, jfVar, new kf(u7.OooO00o(new byte[]{-46, -40}, new byte[]{-100, -99, 63, 70, 62, 120, 105, -41}))};
    }

    public static lf valueOf(String str) {
        for (lf lfVar : OooO0o0) {
            if (lfVar.name.equals(str)) {
                return lfVar;
            }
        }
        throw new IllegalArgumentException("No enum constant " + lf.class.getCanonicalName() + "." + str);
    }

    public static lf[] values() {
        return (lf[]) OooO0o0.clone();
    }
}