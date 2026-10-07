package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class br2 {
    public static void OooO00o(q9 q9Var, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        q9Var.OooOO0(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            q9Var.OooOO0((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    public static void OooO0O0(q9 q9Var, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        q9Var.OooOO0(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            q9Var.OooOO0((byte) j);
            j >>= 8;
            i2--;
        }
    }
}
