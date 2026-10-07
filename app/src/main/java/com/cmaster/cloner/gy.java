package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gy extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean OooO00o;
    public final /* synthetic */ View OooO0O0;
    public final /* synthetic */ View OooO0OO;

    public gy(boolean z, View view, View view2) {
        this.OooO00o = z;
        this.OooO0O0 = view;
        this.OooO0OO = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.OooO00o) {
            return;
        }
        this.OooO0O0.setVisibility(4);
        View view = this.OooO0OO;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.OooO00o) {
            this.OooO0O0.setVisibility(0);
            View view = this.OooO0OO;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
