package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sc3 {
    public static final sc3 OooOO0o;
    public final boolean OooO;
    public final int OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final boolean OooO0Oo;
    public final float OooO0o;
    public final float OooO0o0;
    public final long OooO0oO;
    public final long OooO0oo;
    public final float OooOO0;
    public final float OooOO0O;

    static {
        OooO00o().OooO00o();
        rc3 rc3VarOooO00o = OooO00o();
        rc3VarOooO00o.OooO0Oo = false;
        rc3VarOooO00o.OooOO0o = (short) (rc3VarOooO00o.OooOO0o | 16);
        OooOO0o = rc3VarOooO00o.OooO00o();
    }

    public sc3(int i, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6) {
        this.OooO00o = i;
        this.OooO0O0 = f;
        this.OooO0OO = f2;
        this.OooO0Oo = z;
        this.OooO0o0 = f3;
        this.OooO0o = f4;
        this.OooO0oO = j;
        this.OooO0oo = j2;
        this.OooO = z2;
        this.OooOO0 = f5;
        this.OooOO0O = f6;
    }

    public static rc3 OooO00o() {
        rc3 rc3Var = new rc3();
        short s = (short) (rc3Var.OooOO0o | 1);
        rc3Var.OooO00o = 5;
        rc3Var.OooO0O0 = 0.25f;
        rc3Var.OooO0OO = 0.8f;
        rc3Var.OooO0Oo = true;
        rc3Var.OooO0o0 = 0.5f;
        rc3Var.OooO0o = 0.8f;
        rc3Var.OooO0oO = 1500L;
        rc3Var.OooO0oo = 3000L;
        rc3Var.OooO = true;
        rc3Var.OooOO0 = 0.1f;
        rc3Var.OooOO0O = 0.05f;
        rc3Var.OooOO0o = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s | 2)) | 4)) | 8)) | 16)) | 32)) | 64)) | 128)) | 256)) | 512)) | 1024)) | 2048);
        return rc3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sc3)) {
            return false;
        }
        sc3 sc3Var = (sc3) obj;
        return this.OooO00o == sc3Var.OooO00o && Float.floatToIntBits(this.OooO0O0) == Float.floatToIntBits(sc3Var.OooO0O0) && Float.floatToIntBits(this.OooO0OO) == Float.floatToIntBits(sc3Var.OooO0OO) && this.OooO0Oo == sc3Var.OooO0Oo && Float.floatToIntBits(this.OooO0o0) == Float.floatToIntBits(sc3Var.OooO0o0) && Float.floatToIntBits(this.OooO0o) == Float.floatToIntBits(sc3Var.OooO0o) && this.OooO0oO == sc3Var.OooO0oO && this.OooO0oo == sc3Var.OooO0oo && this.OooO == sc3Var.OooO && Float.floatToIntBits(this.OooOO0) == Float.floatToIntBits(sc3Var.OooOO0) && Float.floatToIntBits(this.OooOO0O) == Float.floatToIntBits(sc3Var.OooOO0O);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.OooOO0O) ^ (((((((((((((((((((((-715379941) ^ this.OooO00o) * 1000003) ^ Float.floatToIntBits(this.OooO0O0)) * 1000003) ^ Float.floatToIntBits(this.OooO0OO)) * 1000003) ^ (true != this.OooO0Oo ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.OooO0o0)) * 1000003) ^ Float.floatToIntBits(this.OooO0o)) * 1000003) ^ ((int) this.OooO0oO)) * 1000003) ^ ((int) this.OooO0oo)) * 1000003) ^ (true != this.OooO ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.OooOO0)) * 1000003);
    }

    public final String toString() {
        return "AutoZoomOptions{recentFramesToCheck=10, recentFramesContainingPredictedArea=" + this.OooO00o + ", recentFramesIou=" + this.OooO0O0 + ", maxCoverage=" + this.OooO0OO + ", useConfidenceScore=" + this.OooO0Oo + ", lowerConfidenceScore=" + this.OooO0o0 + ", higherConfidenceScore=" + this.OooO0o + ", zoomIntervalInMillis=" + this.OooO0oO + ", resetIntervalInMillis=" + this.OooO0oo + ", enableZoomThreshold=" + this.OooO + ", zoomInThreshold=" + this.OooOO0 + ", zoomOutThreshold=" + this.OooOO0O + "}";
    }
}
