package com.cmaster.cloner;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ap implements Animation.AnimationListener {
    public final /* synthetic */ ei1 OooO00o;
    public final /* synthetic */ ViewGroup OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ bp OooO0Oo;

    public ap(ei1 ei1Var, ViewGroup viewGroup, View view, bp bpVar) {
        this.OooO00o = ei1Var;
        this.OooO0O0 = viewGroup;
        this.OooO0OO = view;
        this.OooO0Oo = bpVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.OooO0O0.post(new o00OOO00(this, 12));
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.OooO00o + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.OooO00o + " has reached onAnimationStart.");
        }
    }
}
