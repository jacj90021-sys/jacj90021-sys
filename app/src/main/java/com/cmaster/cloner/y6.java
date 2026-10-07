package com.cmaster.cloner;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ f7 OooO0O0;

    public /* synthetic */ y6(f7 f7Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = f7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.OooO00o;
        f7 f7Var = this.OooO0O0;
        switch (i) {
            case 0:
                f7Var.OooO.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7 e7Var = f7Var.OooO;
                e7Var.setScaleX(fFloatValue);
                e7Var.setScaleY(fFloatValue);
                break;
            case 2:
                f7Var.OooO.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                f7Var.OooO.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
