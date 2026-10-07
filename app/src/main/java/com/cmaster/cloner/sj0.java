package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sj0 implements Animator.AnimatorListener {
    public float OooO;
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public final int OooO0o;
    public final y71 OooO0o0;
    public final ValueAnimator OooO0oO;
    public boolean OooO0oo;
    public float OooOO0;
    public boolean OooOO0O = false;
    public boolean OooOO0o = false;
    public final /* synthetic */ int OooOOO;
    public float OooOOO0;
    public final /* synthetic */ y71 OooOOOO;
    public final /* synthetic */ vj0 OooOOOo;

    public sj0(vj0 vj0Var, y71 y71Var, int i, float f, float f2, float f3, float f4, int i2, y71 y71Var2) {
        this.OooOOOo = vj0Var;
        this.OooOOO = i2;
        this.OooOOOO = y71Var2;
        this.OooO0o = i;
        this.OooO0o0 = y71Var;
        this.OooO00o = f;
        this.OooO0O0 = f2;
        this.OooO0OO = f3;
        this.OooO0Oo = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.OooO0oO = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new u8(this, 5));
        valueAnimatorOfFloat.setTarget(y71Var.OooO00o);
        valueAnimatorOfFloat.addListener(this);
        this.OooOOO0 = 0.0f;
    }

    public final void OooO00o(Animator animator) {
        if (!this.OooOO0o) {
            this.OooO0o0.OooOOOo(true);
        }
        this.OooOO0o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.OooOOO0 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooO00o(animator);
        if (this.OooOO0O) {
            return;
        }
        int i = this.OooOOO;
        y71 y71Var = this.OooOOOO;
        vj0 vj0Var = this.OooOOOo;
        if (i <= 0) {
            vj0Var.OooOOOo.getClass();
            o00Oo00.OooO0O0(y71Var);
        } else {
            vj0Var.OooO0Oo.add(y71Var.OooO00o);
            this.OooO0oo = true;
            if (i > 0) {
                vj0Var.OooOo0.post(new pi2(vj0Var, this, i));
            }
        }
        View view = vj0Var.OooOoO;
        View view2 = y71Var.OooO00o;
        if (view == view2 && view2 == view) {
            vj0Var.OooOoO = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
