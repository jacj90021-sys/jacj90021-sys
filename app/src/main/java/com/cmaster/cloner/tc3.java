package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tc3 {
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;

    public tc3(float f, float f2, float f3, float f4) {
        this.OooO00o = f;
        this.OooO0O0 = f2;
        this.OooO0OO = f3;
        this.OooO0Oo = f4;
    }

    public final float OooO00o() {
        if (!OooO0O0()) {
            return 0.0f;
        }
        return (this.OooO0Oo - this.OooO0O0) * (this.OooO0OO - this.OooO00o);
    }

    public final boolean OooO0O0() {
        float f = this.OooO00o;
        if (f < 0.0f) {
            return false;
        }
        float f2 = this.OooO0OO;
        if (f >= f2 || f2 > 1.0f) {
            return false;
        }
        float f3 = this.OooO0O0;
        if (f3 < 0.0f) {
            return false;
        }
        float f4 = this.OooO0Oo;
        return f3 < f4 && f4 <= 1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tc3) {
            tc3 tc3Var = (tc3) obj;
            if (Float.floatToIntBits(this.OooO00o) == Float.floatToIntBits(tc3Var.OooO00o) && Float.floatToIntBits(this.OooO0O0) == Float.floatToIntBits(tc3Var.OooO0O0) && Float.floatToIntBits(this.OooO0OO) == Float.floatToIntBits(tc3Var.OooO0OO) && Float.floatToIntBits(this.OooO0Oo) == Float.floatToIntBits(tc3Var.OooO0Oo) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.OooO0Oo) ^ ((((((Float.floatToIntBits(this.OooO00o) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.OooO0O0)) * 1000003) ^ Float.floatToIntBits(this.OooO0OO)) * 1000003)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.OooO00o + ", yMin=" + this.OooO0O0 + ", xMax=" + this.OooO0OO + ", yMax=" + this.OooO0Oo + ", confidenceScore=0.0}";
    }
}
