package com.cmaster.cloner;

import android.transition.Transition;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oq0 extends wo1 {
    public final /* synthetic */ View OooO00o;
    public final /* synthetic */ pq0 OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ View OooO0Oo;
    public final /* synthetic */ qq0 OooO0o0;

    public oq0(qq0 qq0Var, View view, pq0 pq0Var, View view2, View view3) {
        this.OooO0o0 = qq0Var;
        this.OooO00o = view;
        this.OooO0O0 = pq0Var;
        this.OooO0OO = view2;
        this.OooO0Oo = view3;
    }

    @Override // com.cmaster.cloner.wo1, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        qq0 qq0Var = this.OooO0o0;
        qq0Var.removeListener(this);
        if (qq0Var.OooO0Oo) {
            return;
        }
        this.OooO0OO.setAlpha(1.0f);
        this.OooO0Oo.setAlpha(1.0f);
        this.OooO00o.getOverlay().remove(this.OooO0O0);
    }

    @Override // com.cmaster.cloner.wo1, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.OooO00o.getOverlay().add(this.OooO0O0);
        this.OooO0OO.setAlpha(0.0f);
        this.OooO0Oo.setAlpha(0.0f);
    }
}
