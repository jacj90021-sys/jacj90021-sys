package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kk0 extends gk0 {
    public final lk0 OooO;
    public final nk0 OooO0oo;
    public final rc OooOO0;
    public final Object OooOO0O;

    public kk0(nk0 nk0Var, lk0 lk0Var, rc rcVar, Object obj) {
        this.OooO0oo = nk0Var;
        this.OooO = lk0Var;
        this.OooOO0 = rcVar;
        this.OooOO0O = obj;
    }

    @Override // com.cmaster.cloner.fj0
    public final void OooO0o0(Throwable th) {
        rc rcVarOooo0OO = nk0.Oooo0OO(this.OooOO0);
        nk0 nk0Var = this.OooO0oo;
        lk0 lk0Var = this.OooO;
        Object obj = this.OooOO0O;
        if (rcVarOooo0OO != null) {
            while (ou2.OooO0O0(rcVarOooo0OO.OooO0oo, false, new kk0(nk0Var, lk0Var, rcVarOooo0OO, obj), 1) == cx0.OooO0Oo) {
                rcVarOooo0OO = nk0.Oooo0OO(rcVarOooo0OO);
                if (rcVarOooo0OO == null) {
                }
            }
            return;
        }
        nk0Var.OooO0oO(nk0Var.OooOo0(lk0Var, obj));
    }
}
