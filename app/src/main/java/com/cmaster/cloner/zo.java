package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zo extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup OooO00o;
    public final /* synthetic */ View OooO0O0;
    public final /* synthetic */ boolean OooO0OO;
    public final /* synthetic */ ei1 OooO0Oo;
    public final /* synthetic */ bp OooO0o0;

    public zo(ViewGroup viewGroup, View view, boolean z, ei1 ei1Var, bp bpVar) {
        this.OooO00o = viewGroup;
        this.OooO0O0 = view;
        this.OooO0OO = z;
        this.OooO0Oo = ei1Var;
        this.OooO0o0 = bpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.OooO00o;
        View view = this.OooO0O0;
        viewGroup.endViewTransition(view);
        boolean z = this.OooO0OO;
        ei1 ei1Var = this.OooO0Oo;
        if (z) {
            px0.OooO00o(view, ei1Var.OooO00o);
        }
        this.OooO0o0.OooO0o0();
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Animator from operation " + ei1Var + " has ended.");
        }
    }
}
