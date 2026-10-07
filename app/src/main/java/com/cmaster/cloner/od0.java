package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class od0 extends nd0 {
    public final /* synthetic */ pd0 OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(pd0 pd0Var) {
        super(pd0Var, pd0.OooOO0o());
        this.OooO0OO = pd0Var;
    }

    @Override // com.cmaster.cloner.nd0, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) throws Exception {
        Object[] objArr = yqVar.OooO0o;
        int iOooO00o = fn2.OooO00o(objArr, Integer.class, 0);
        if (iOooO00o < 0 || ((Integer) objArr[iOooO00o]).intValue() != 4) {
            super.OooO00o(yqVar);
            return;
        }
        t43.OooO0Oo(yqVar.OooO0o, true);
        yqVar.OooO00o();
        pd0.OooOO0O(this.OooO0OO, yqVar);
    }
}
