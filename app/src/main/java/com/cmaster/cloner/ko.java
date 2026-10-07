package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ko extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o = 1;
    public final /* synthetic */ y71 OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ ViewPropertyAnimator OooO0Oo;
    public final /* synthetic */ qo OooO0o0;

    public ko(qo qoVar, y71 y71Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.OooO0o0 = qoVar;
        this.OooO0O0 = y71Var;
        this.OooO0Oo = viewPropertyAnimator;
        this.OooO0OO = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                this.OooO0OO.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.OooO00o;
        y71 y71Var = this.OooO0O0;
        qo qoVar = this.OooO0o0;
        ViewPropertyAnimator viewPropertyAnimator = this.OooO0Oo;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.OooO0OO.setAlpha(1.0f);
                qoVar.OooO0OO(y71Var);
                qoVar.OooOOo0.remove(y71Var);
                qoVar.OooO();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                qoVar.OooO0OO(y71Var);
                qoVar.OooOOOO.remove(y71Var);
                qoVar.OooO();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0o0.getClass();
                break;
            default:
                this.OooO0o0.getClass();
                break;
        }
    }

    public ko(qo qoVar, y71 y71Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.OooO0o0 = qoVar;
        this.OooO0O0 = y71Var;
        this.OooO0OO = view;
        this.OooO0Oo = viewPropertyAnimator;
    }
}
