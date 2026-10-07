package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m10 extends ds2 {
    public final /* synthetic */ o10 OooO0Oo;

    public m10(o10 o10Var) {
        this.OooO0Oo = o10Var;
    }

    @Override // com.cmaster.cloner.ds2
    public final View OooO0O0(int i) {
        o10 o10Var = this.OooO0Oo;
        View view = o10Var.Oooo0;
        if (view != null) {
            return view.findViewById(i);
        }
        qa.OooO0o(rj.OooO0O0("Fragment ", o10Var, " does not have a view"));
        return null;
    }

    @Override // com.cmaster.cloner.ds2
    public final boolean OooO0o0() {
        return this.OooO0Oo.Oooo0 != null;
    }
}
