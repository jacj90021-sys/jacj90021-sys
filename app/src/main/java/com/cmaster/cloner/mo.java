package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mo extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ no OooO0O0;
    public final /* synthetic */ ViewPropertyAnimator OooO0OO;
    public final /* synthetic */ View OooO0Oo;
    public final /* synthetic */ qo OooO0o0;

    public /* synthetic */ mo(qo qoVar, no noVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.OooO00o = i;
        this.OooO0o0 = qoVar;
        this.OooO0O0 = noVar;
        this.OooO0OO = viewPropertyAnimator;
        this.OooO0Oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.OooO00o;
        no noVar = this.OooO0O0;
        qo qoVar = this.OooO0o0;
        View view = this.OooO0Oo;
        ViewPropertyAnimator viewPropertyAnimator = this.OooO0OO;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                qoVar.OooO0OO(noVar.OooO00o);
                qoVar.OooOOo.remove(noVar.OooO00o);
                qoVar.OooO();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                qoVar.OooO0OO(noVar.OooO0O0);
                qoVar.OooOOo.remove(noVar.OooO0O0);
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
}
