package com.cmaster.cloner;

import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jc extends xo1 {
    public boolean OooO00o = false;
    public final ViewGroup OooO0O0;

    public jc(ViewGroup viewGroup) {
        this.OooO0O0 = viewGroup;
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO00o(vo1 vo1Var) {
        if (!this.OooO00o) {
            p53.OooO00o(this.OooO0O0, false);
        }
        vo1Var.OooOo(this);
    }

    @Override // com.cmaster.cloner.xo1, com.cmaster.cloner.to1
    public final void OooO0OO() {
        p53.OooO00o(this.OooO0O0, false);
    }

    @Override // com.cmaster.cloner.xo1, com.cmaster.cloner.to1
    public final void OooO0Oo(vo1 vo1Var) {
        p53.OooO00o(this.OooO0O0, false);
        this.OooO00o = true;
    }

    @Override // com.cmaster.cloner.xo1, com.cmaster.cloner.to1
    public final void OooO0o0() {
        p53.OooO00o(this.OooO0O0, true);
    }
}
