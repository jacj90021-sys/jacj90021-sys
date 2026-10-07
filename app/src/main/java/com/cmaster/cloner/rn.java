package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class rn {
    public static final float[][] OooO00o = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] OooO0O0 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] OooO0OO = {95.047f, 100.0f, 108.883f};
    public static final float[][] OooO0Oo = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static final String OooO00o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int OooO0O0(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = OooO0OO;
        return ye.OooO00o(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float OooO0OO(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final String OooO0Oo(gj gjVar) {
        Object bb1Var;
        if (gjVar instanceof cs) {
            return gjVar.toString();
        }
        try {
            bb1Var = gjVar + '@' + OooO00o(gjVar);
        } catch (Throwable th) {
            bb1Var = new bb1(th);
        }
        if (cb1.OooO00o(bb1Var) != null) {
            bb1Var = gjVar.getClass().getName() + '@' + OooO00o(gjVar);
        }
        return (String) bb1Var;
    }

    public static float OooO0o0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }
}
