package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uy0 implements cm0, eb {
    public final jm0 OooO0Oo;
    public vy0 OooO0o;
    public final d20 OooO0o0;
    public final /* synthetic */ xy0 OooO0oO;

    public uy0(xy0 xy0Var, jm0 jm0Var, d20 d20Var) {
        d20Var.getClass();
        this.OooO0oO = xy0Var;
        this.OooO0Oo = jm0Var;
        this.OooO0o0 = d20Var;
        jm0Var.OooO0OO(this);
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        if (wl0Var != wl0.ON_START) {
            if (wl0Var != wl0.ON_STOP) {
                if (wl0Var == wl0.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                vy0 vy0Var = this.OooO0o;
                if (vy0Var != null) {
                    vy0Var.cancel();
                    return;
                }
                return;
            }
        }
        d20 d20Var = this.OooO0o0;
        d20Var.getClass();
        xy0 xy0Var = this.OooO0oO;
        xy0Var.OooO0O0.addLast(d20Var);
        vy0 vy0Var2 = new vy0(xy0Var, d20Var);
        d20Var.OooO0O0.add(vy0Var2);
        xy0Var.OooO0OO();
        d20Var.OooO0OO = new wy0(0, xy0Var, xy0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.OooO0o = vy0Var2;
    }

    @Override // com.cmaster.cloner.eb
    public final void cancel() {
        this.OooO0Oo.OooOOOO(this);
        d20 d20Var = this.OooO0o0;
        d20Var.getClass();
        d20Var.OooO0O0.remove(this);
        vy0 vy0Var = this.OooO0o;
        if (vy0Var != null) {
            vy0Var.cancel();
        }
        this.OooO0o = null;
    }
}
