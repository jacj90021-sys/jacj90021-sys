package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l60 extends y1 {
    public final /* synthetic */ r60 OooO00o;

    public l60(r60 r60Var) {
        this.OooO00o = r60Var;
    }

    @Override // com.cmaster.cloner.o0o0000
    public final void onAdFailedToLoad(xn0 xn0Var) {
        int i = xn0Var.OooO00o;
        this.OooO00o.OooO0O0(wa1.OooO00o((i == 3 || i == 9) ? -8001 : -1, xn0Var, null));
    }

    @Override // com.cmaster.cloner.o0o0000
    public final void onAdLoaded(Object obj) {
        hr0 hr0Var = new hr0();
        hr0Var.OooO00o = (z1) obj;
        this.OooO00o.OooO0O0(wa1.OooO0o0(hr0Var));
    }
}
