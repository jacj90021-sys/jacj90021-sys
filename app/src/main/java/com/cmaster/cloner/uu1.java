package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uu1 {
    public static final uu1 OooOO0O;
    public final float OooO;
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public final float OooO0o;
    public final float OooO0o0;
    public final float[] OooO0oO;
    public final float OooO0oo;
    public final float OooOO0;

    static {
        float fOooO0o0 = (float) ((rn.OooO0o0() * 63.66197723675813d) / 100.0d);
        float[] fArr = rn.OooO0OO;
        float f = fArr[0];
        float[][] fArr2 = rn.OooO00o;
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float fExp = (1.0f - (((float) Math.exp(((-fOooO0o0) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f9 = 1.0f / ((5.0f * fOooO0o0) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(fOooO0o0 * 5.0d))) + (f10 * fOooO0o0);
        float fOooO0o02 = rn.OooO0o0() / fArr[1];
        double d2 = fOooO0o02;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f8) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        OooOO0O = new uu1(fOooO0o02, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, 0.69f, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public uu1(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.OooO0o = f;
        this.OooO00o = f2;
        this.OooO0O0 = f3;
        this.OooO0OO = f4;
        this.OooO0Oo = f5;
        this.OooO0o0 = f6;
        this.OooO0oO = fArr;
        this.OooO0oo = f7;
        this.OooO = f8;
        this.OooOO0 = f9;
    }
}
