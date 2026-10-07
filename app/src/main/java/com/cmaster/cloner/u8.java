package com.cmaster.cloner;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ u8(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wq0 wq0Var = ((BottomSheetBehavior) obj).OooO;
                if (wq0Var != null) {
                    uq0 uq0Var = wq0Var.OooO0o0;
                    if (uq0Var.OooOO0 != fFloatValue) {
                        uq0Var.OooOO0 = fFloatValue;
                        wq0Var.OooO = true;
                        wq0Var.OooOO0 = true;
                        wq0Var.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                az azVar = (az) obj;
                azVar.OooOOOO = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                azVar.OooO00o.invalidate(azVar.OooOO0O);
                break;
            case 2:
                ((ez) ((o00OOO00) obj).OooO0o0).OooO0OO(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                ((ez) obj).OooO0OO(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                fz fzVar = (fz) obj;
                fzVar.OooO0o.setAlpha(iFloatValue);
                fzVar.OooO0oO.setAlpha(iFloatValue);
                fzVar.OooOo0O.invalidate();
                break;
            case 5:
                ((sj0) obj).OooOOO0 = valueAnimator.getAnimatedFraction();
                break;
            case 6:
                pq0 pq0Var = (pq0) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (pq0Var.Oooo0 != animatedFraction) {
                    pq0Var.OooO0Oo(animatedFraction);
                    break;
                }
                break;
            default:
                ((TextInputLayout) obj).o0ooOoO.OooOOO0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
