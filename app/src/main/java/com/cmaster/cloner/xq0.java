package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ yq0 OooO0OO;

    public xq0(yq0 yq0Var, boolean z, int i) {
        this.OooO0OO = yq0Var;
        this.OooO00o = z;
        this.OooO0O0 = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yq0 yq0Var = this.OooO0OO;
        yq0Var.OooO0O0.setTranslationX(0.0f);
        yq0Var.OooO00o(0.0f, this.OooO00o, this.OooO0O0);
    }
}
