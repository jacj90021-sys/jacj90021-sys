package com.cmaster.cloner;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class xy1 {
    public final int OooO00o;
    public float OooO0O0;
    public final Interpolator OooO0OO;
    public final long OooO0Oo;

    public xy1(int i, Interpolator interpolator, long j) {
        this.OooO00o = i;
        this.OooO0OO = interpolator;
        this.OooO0Oo = j;
    }

    public long OooO00o() {
        return this.OooO0Oo;
    }

    public float OooO0O0() {
        float f = this.OooO0O0;
        Interpolator interpolator = this.OooO0OO;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int OooO0OO() {
        return this.OooO00o;
    }

    public void OooO0Oo(float f) {
        this.OooO0O0 = f;
    }
}
