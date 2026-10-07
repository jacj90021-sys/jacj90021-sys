package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lv1 extends AnimatorListenerAdapter implements to1 {
    public final ViewGroup OooO00o;
    public final View OooO0O0;
    public final View OooO0OO;
    public boolean OooO0Oo = true;
    public final /* synthetic */ ny OooO0o0;

    public lv1(ny nyVar, ViewGroup viewGroup, View view, View view2) {
        this.OooO0o0 = nyVar;
        this.OooO00o = viewGroup;
        this.OooO0O0 = view;
        this.OooO0OO = view2;
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO00o(vo1 vo1Var) {
        vo1Var.OooOo(this);
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0OO() {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0Oo(vo1 vo1Var) {
        if (this.OooO0Oo) {
            OooO0oO();
        }
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0o(vo1 vo1Var) {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0o0() {
    }

    public final void OooO0oO() {
        this.OooO0OO.setTag(R.id.save_overlay_view, null);
        this.OooO00o.getOverlay().remove(this.OooO0O0);
        this.OooO0Oo = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        OooO0oO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.OooO00o.getOverlay().remove(this.OooO0O0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.OooO0O0;
        if (view.getParent() == null) {
            this.OooO00o.getOverlay().add(view);
        } else {
            this.OooO0o0.OooO0OO();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.OooO0OO;
            View view2 = this.OooO0O0;
            view.setTag(R.id.save_overlay_view, view2);
            this.OooO00o.getOverlay().add(view2);
            this.OooO0Oo = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        OooO0oO();
    }
}
