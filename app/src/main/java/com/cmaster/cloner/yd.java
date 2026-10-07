package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yd extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ zd OooO0O0;

    public /* synthetic */ yd(zd zdVar, int i) {
        this.OooO00o = i;
        this.OooO0O0 = zdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                this.OooO0O0.OooO0O0.OooO0oO(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0.OooO0O0.OooO0oO(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
