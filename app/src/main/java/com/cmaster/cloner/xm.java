package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xm extends sk1 implements e40 {
    public final /* synthetic */ tb1 OooO;
    public int OooO0oo;
    public final /* synthetic */ boolean OooOO0;
    public final /* synthetic */ boolean OooOO0O;
    public final /* synthetic */ a40 OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(gj gjVar, a40 a40Var, tb1 tb1Var, boolean z, boolean z2) {
        super(gjVar);
        this.OooO = tb1Var;
        this.OooOO0 = z;
        this.OooOO0O = z2;
        this.OooOO0o = a40Var;
    }

    @Override // com.cmaster.cloner.h6
    public final Object OooO(Object obj) throws Throwable {
        int i = this.OooO0oo;
        if (i != 0) {
            if (i == 1) {
                ty2.OooO0O0(obj);
                return obj;
            }
            qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ty2.OooO0O0(obj);
        tb1 tb1Var = this.OooO;
        boolean z = !(tb1Var.OooOO0o() && tb1Var.OooOOO0()) && this.OooOO0;
        a40 a40Var = this.OooOO0o;
        tb1 tb1Var2 = this.OooO;
        boolean z2 = this.OooOO0O;
        wm wmVar = new wm(null, a40Var, tb1Var2, z, z2);
        this.OooO0oo = 1;
        pb1 pb1Var = tb1Var2.OooO0Oo;
        if (pb1Var == null) {
            ij0.OooO("connectionManager");
            throw null;
        }
        Object objOooOOO0 = ((zg) pb1Var.OooO0o).OooOOO0(z2, wmVar, this);
        gk gkVar = gk.OooO0Oo;
        return objOooOOO0 == gkVar ? gkVar : objOooOOO0;
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        return ((xm) OooO0oo((gj) obj2, (fk) obj)).OooO(vq1.OooO00o);
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        return new xm(gjVar, this.OooOO0o, this.OooO, this.OooOO0, this.OooOO0O);
    }
}
