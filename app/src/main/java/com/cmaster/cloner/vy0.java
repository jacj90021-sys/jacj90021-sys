package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vy0 implements eb {
    public final d20 OooO0Oo;
    public final /* synthetic */ xy0 OooO0o0;

    public vy0(xy0 xy0Var, d20 d20Var) {
        d20Var.getClass();
        this.OooO0o0 = xy0Var;
        this.OooO0Oo = d20Var;
    }

    @Override // com.cmaster.cloner.eb
    public final void cancel() {
        xy0 xy0Var = this.OooO0o0;
        e3 e3Var = xy0Var.OooO0O0;
        d20 d20Var = this.OooO0Oo;
        e3Var.remove(d20Var);
        if (ij0.OooO00o(xy0Var.OooO0OO, d20Var)) {
            d20Var.getClass();
            xy0Var.OooO0OO = null;
        }
        d20Var.getClass();
        d20Var.OooO0O0.remove(this);
        p30 p30Var = d20Var.OooO0OO;
        if (p30Var != null) {
            p30Var.OooO00o();
        }
        d20Var.OooO0OO = null;
    }
}
