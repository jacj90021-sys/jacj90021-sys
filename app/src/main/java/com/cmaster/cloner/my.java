package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class my extends AnimatorListenerAdapter implements to1 {
    public final View OooO00o;
    public boolean OooO0O0 = false;

    public my(View view) {
        this.OooO00o = view;
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO00o(vo1 vo1Var) {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0O0(vo1 vo1Var) {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0OO() {
        View view = this.OooO00o;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? mu1.OooO00o.OooO00o(view) : 0.0f));
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0Oo(vo1 vo1Var) {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0o(vo1 vo1Var) {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0o0() {
        this.OooO00o.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        mu1.OooO00o.OooO0O0(this.OooO00o, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.OooO0O0;
        View view = this.OooO00o;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        su1 su1Var = mu1.OooO00o;
        su1Var.OooO0O0(view, 1.0f);
        su1Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.OooO00o;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.OooO0O0 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
