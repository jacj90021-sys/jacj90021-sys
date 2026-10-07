package com.cmaster.cloner;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class wp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ wp(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                yp ypVar = (yp) obj;
                ypVar.OooOo00.OooO0Oo = ypVar.OooOoO0.getInterpolation(ypVar.OooOo.getAnimatedFraction());
                break;
            default:
                ((tt) obj).OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
