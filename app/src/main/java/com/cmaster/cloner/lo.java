package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lo extends AnimatorListenerAdapter {
    public final /* synthetic */ y71 OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ qo OooO0o;
    public final /* synthetic */ ViewPropertyAnimator OooO0o0;

    public lo(qo qoVar, y71 y71Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.OooO0o = qoVar;
        this.OooO00o = y71Var;
        this.OooO0O0 = i;
        this.OooO0OO = view;
        this.OooO0Oo = i2;
        this.OooO0o0 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.OooO0O0;
        View view = this.OooO0OO;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.OooO0Oo != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.OooO0o0.setListener(null);
        qo qoVar = this.OooO0o;
        y71 y71Var = this.OooO00o;
        qoVar.OooO0OO(y71Var);
        qoVar.OooOOOo.remove(y71Var);
        qoVar.OooO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.OooO0o.getClass();
    }
}
