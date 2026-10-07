package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z10 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ r20 OooO0Oo;
    public final /* synthetic */ a20 OooO0o0;

    public z10(a20 a20Var, r20 r20Var) {
        this.OooO0o0 = a20Var;
        this.OooO0Oo = r20Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        r20 r20Var = this.OooO0Oo;
        o10 o10Var = r20Var.OooO0OO;
        r20Var.OooOO0O();
        dp.OooO0o((ViewGroup) o10Var.Oooo0.getParent(), this.OooO0o0.OooO0Oo.OooOooO()).OooO0o0();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
