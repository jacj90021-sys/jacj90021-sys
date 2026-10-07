package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sp1 {
    public static sp1 OooO0Oo;
    public long OooO00o;
    public long OooO0O0;
    public int OooO0OO;

    public final void OooO00o(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d2) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.OooO0OO = 1;
            this.OooO00o = -1L;
            this.OooO0O0 = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.OooO0OO = 0;
                this.OooO00o = -1L;
                this.OooO0O0 = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.OooO00o = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.OooO0O0 = jRound;
            if (jRound >= j || this.OooO00o <= j) {
                this.OooO0OO = 1;
            } else {
                this.OooO0OO = 0;
            }
        }
    }
}
