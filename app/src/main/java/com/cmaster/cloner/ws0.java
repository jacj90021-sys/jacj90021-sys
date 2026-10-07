package com.cmaster.cloner;

import android.view.ActionProvider;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ws0 implements ActionProvider.VisibilityListener {
    public xb1 OooO00o;
    public final ActionProvider OooO0O0;

    public ws0(zs0 zs0Var, ActionProvider actionProvider) {
        this.OooO0O0 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        xb1 xb1Var = this.OooO00o;
        if (xb1Var != null) {
            ss0 ss0Var = ((vs0) xb1Var.OooO0o0).OooOOo0;
            ss0Var.OooOO0O = true;
            ss0Var.OooOOOo(true);
        }
    }
}
