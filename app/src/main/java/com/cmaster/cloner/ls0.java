package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ls0 extends uf0 {
    public final il OooO0o;

    public ls0(il ilVar) {
        super(ilVar.OooO0Oo);
        this.OooO0o = ilVar;
    }

    public abstract String OooO();

    @Override // com.cmaster.cloner.pj0
    public final int OooO0OO() {
        return 8;
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO0Oo(nq nqVar, q9 q9Var) {
        o51 o51Var = nqVar.OooO0o;
        o51 o51Var2 = nqVar.OooO0o0;
        il ilVar = this.OooO0o;
        kl klVar = ilVar.OooO0o0;
        int iOooOOOO = o51Var.OooOOOO(this.OooO0o0);
        int iOooOOO = o51Var2.OooOOO(klVar.OooO0Oo);
        int iOooO0oo = OooO0oo(nqVar);
        if (q9Var.OooO0Oo()) {
            q9Var.OooO0O0(0, OooO0o() + ' ' + ilVar.OooO00o());
            q9Var.OooO0O0(2, u7.OooO00o(new byte[]{1, 52, 116, -51, 111, -84, 98, -14, 72, 112, 111, -101, 46}, new byte[]{33, 20, 23, -95, 14, -33, 17, -83}).concat(js2.OooO0O0(iOooOOOO)));
            q9Var.OooO0O0(2, String.format(u7.OooO00o(new byte[]{-125, 68, 65, 7, 33, -124, 43, -114, -122, 23}, new byte[]{-93, 100, 100, 42, 16, -76, 88, -82}), OooO().concat(":"), js2.OooO0O0(iOooO0oo)));
            rj.OooOO0O(iOooOOO, u7.OooO00o(new byte[]{81, 47, -29, 125, 104, 85, 65, 97, 21, 119, -73, 60, 37}, new byte[]{113, 15, -115, 28, 5, 48, 30, 8}), q9Var, 4);
        }
        q9Var.OooOO0o(iOooOOOO);
        q9Var.OooOO0o(iOooO0oo);
        q9Var.OooOO0O(iOooOOO);
    }

    public abstract int OooO0oo(nq nqVar);
}
