package com.cmaster.cloner;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tj0 implements Interpolator {

    public tj0(int i2) {
        this.OooO00o = i2;
    }
    public final /* synthetic */ int OooO00o;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.OooO00o) {
            case 0:
                return f * f * f * f * f;
            case 1:
            case 2:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
