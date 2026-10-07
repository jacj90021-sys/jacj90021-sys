package com.cmaster.cloner;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oO0oO000 {
    public static final LinearInterpolator OooO00o = new LinearInterpolator();
    public static final yy OooO0O0 = new yy(1);
    public static final yy OooO0OO = new yy(0);
    public static final yy OooO0Oo = new yy(2);
    public static final DecelerateInterpolator OooO0o0 = new DecelerateInterpolator();

    public static float OooO00o(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : OooO00o(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int OooO0OO(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
