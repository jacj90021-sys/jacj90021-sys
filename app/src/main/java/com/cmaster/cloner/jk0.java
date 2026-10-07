package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jk0 extends gb {
    public final nk0 OooOO0o;

    public jk0(gj gjVar, nk0 nk0Var) {
        super(gjVar, 1);
        this.OooOO0o = nk0Var;
    }

    @Override // com.cmaster.cloner.gb
    public final Throwable OooOOoo(nk0 nk0Var) {
        Throwable thOooO0OO;
        Object objOooOoo0 = this.OooOO0o.OooOoo0();
        return (!(objOooOoo0 instanceof lk0) || (thOooO0OO = ((lk0) objOooOoo0).OooO0OO()) == null) ? objOooOoo0 instanceof rf ? ((rf) objOooOoo0).OooO00o : nk0Var.OooOo0O() : thOooO0OO;
    }

    @Override // com.cmaster.cloner.gb
    public final String OooOoO() {
        return "AwaitContinuation";
    }
}
