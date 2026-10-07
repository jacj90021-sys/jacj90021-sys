package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q60 extends ib1 {
    public final /* synthetic */ r60 OooO00o;

    public q60(r60 r60Var) {
        this.OooO00o = r60Var;
    }

    @Override // com.cmaster.cloner.o0o0000
    public final void onAdFailedToLoad(xn0 xn0Var) {
        int i = xn0Var.OooO00o;
        this.OooO00o.OooO0O0(wa1.OooO00o((i == 3 || i == 9) ? -8001 : -1, new o0O0O0Oo(xn0Var, 1), null));
    }

    @Override // com.cmaster.cloner.o0o0000
    public final void onAdLoaded(Object obj) {
        kr0 kr0Var = new kr0();
        kr0Var.OooO00o = (hb1) obj;
        this.OooO00o.OooO0O0(wa1.OooO0o0(kr0Var));
    }
}
