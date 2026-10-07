package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c13 extends lc3 {
    public final int OooO00o;
    public final int OooO0O0;
    public final double OooO0OO;
    public final boolean OooO0Oo;

    public c13(int i, int i2, double d, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = d;
        this.OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lc3) {
            c13 c13Var = (c13) ((lc3) obj);
            if (this.OooO00o == c13Var.OooO00o && this.OooO0O0 == c13Var.OooO0O0 && Double.doubleToLongBits(this.OooO0OO) == Double.doubleToLongBits(c13Var.OooO0OO) && this.OooO0Oo == c13Var.OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.OooO0OO;
        return ((((this.OooO0O0 ^ ((this.OooO00o ^ 1000003) * 1000003)) * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003) ^ (true != this.OooO0Oo ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.OooO00o + ", initialBackoffMs=" + this.OooO0O0 + ", backoffMultiplier=" + this.OooO0OO + ", bufferAfterMaxAttempts=" + this.OooO0Oo + "}";
    }
}
