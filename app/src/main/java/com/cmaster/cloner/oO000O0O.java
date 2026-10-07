package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO000O0O {
    public static final oO000O0O OooO = new oO000O0O(320, 50, "320x50_mb");
    public static final oO000O0O OooOO0;
    public static final oO000O0O OooOO0O;
    public final int OooO00o;
    public final int OooO0O0;
    public final String OooO0OO;
    public boolean OooO0Oo;
    public int OooO0o;
    public boolean OooO0o0;
    public boolean OooO0oO;
    public int OooO0oo;

    static {
        new oO000O0O(468, 60, "468x60_as");
        new oO000O0O(320, 100, "320x100_as");
        new oO000O0O(728, 90, "728x90_as");
        new oO000O0O(300, 250, "300x250_as");
        new oO000O0O(160, 600, "160x600_as");
        new oO000O0O(-1, -2, "smart_banner");
        OooOO0 = new oO000O0O(-3, -4, "fluid");
        OooOO0O = new oO000O0O(0, 0, "invalid");
        new oO000O0O(50, 50, "50x50_mb");
        new oO000O0O(-3, 0, "search_v2");
    }

    public oO000O0O(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            ra.OooOOO(px0.OooOOO(i, "Invalid width for AdSize: "));
            throw null;
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            ra.OooOOO(px0.OooOOO(i2, "Invalid height for AdSize: "));
            throw null;
        }
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oO000O0O)) {
            return false;
        }
        oO000O0O oo000o0o = (oO000O0O) obj;
        return this.OooO00o == oo000o0o.OooO00o && this.OooO0O0 == oo000o0o.OooO0O0 && this.OooO0OO.equals(oo000o0o.OooO0OO);
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode();
    }

    public final String toString() {
        return this.OooO0OO;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oO000O0O(int i, int i2) {
        String strValueOf;
        if (i == -1) {
            strValueOf = "FULL";
        } else {
            strValueOf = String.valueOf(i);
        }
        this(i, i2, strValueOf + "x" + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }
}
