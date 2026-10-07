package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vm extends sk1 implements e40 {
    public /* synthetic */ Object OooO;
    public final /* synthetic */ int OooO0oo = 1;
    public final /* synthetic */ k40 OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(gj gjVar, a40 a40Var) {
        super(gjVar);
        this.OooOO0 = a40Var;
    }

    @Override // com.cmaster.cloner.h6
    public final Object OooO(Object obj) throws Throwable {
        vj vjVarOooO;
        int i = this.OooO0oo;
        k40 k40Var = this.OooOO0;
        switch (i) {
            case 0:
                ty2.OooO0O0(obj);
                j31 j31Var = (j31) this.OooO;
                j31Var.getClass();
                return ((a40) k40Var).OooO0o(j31Var.OooO0OO());
            default:
                ty2.OooO0O0(obj);
                vj vjVarOooO00o = ((fk) this.OooO).OooO00o();
                oOO0OO ooo0oo = oOO0OO.OooO0o0;
                tj tjVarOooO0oo = vjVarOooO00o.OooO0oo(ooo0oo);
                tjVarOooO0oo.getClass();
                zj zjVar = (zj) tjVarOooO0oo;
                of ofVar = new of(true);
                gj gjVar = null;
                ofVar.OooOooo(null);
                int i2 = 2;
                nr0 nr0Var = new nr0(ofVar, (e40) k40Var, gjVar, i2);
                boolean zBooleanValue = ((Boolean) zjVar.OooO0o(Boolean.FALSE, wj.OooO0oO)).booleanValue();
                if (zBooleanValue) {
                    lv lvVar = lv.OooO0Oo;
                    vjVarOooO = (vj) (zBooleanValue ? zjVar.OooO0o(lvVar, wj.OooO0o) : zjVar);
                    lvVar.OooO(vjVarOooO);
                } else {
                    vjVarOooO = zjVar;
                }
                wo woVar = gs.OooO00o;
                if (vjVarOooO != woVar && vjVarOooO.OooO0oo(ooo0oo) == null) {
                    vjVarOooO = vjVarOooO.OooO(woVar);
                }
                OooOOO hpVar = new hp(vjVarOooO, true, 1);
                hpVar.OoooO0O(ik.OooO0o0, hpVar, nr0Var);
                while (ofVar.OooOoo0() instanceof bg0) {
                    try {
                        return ao2.OooO0O0(zjVar, new lj0(ofVar, gjVar, i2));
                    } catch (InterruptedException unused) {
                    }
                }
                return ofVar.OooOo0o();
        }
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        int i = this.OooO0oo;
        vq1 vq1Var = vq1.OooO00o;
        switch (i) {
            case 0:
                return ((vm) OooO0oo((gj) obj2, (j31) obj)).OooO(vq1Var);
            default:
                return ((vm) OooO0oo((gj) obj2, (fk) obj)).OooO(vq1Var);
        }
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        int i = this.OooO0oo;
        k40 k40Var = this.OooOO0;
        switch (i) {
            case 0:
                vm vmVar = new vm(gjVar, (a40) k40Var);
                vmVar.OooO = obj;
                return vmVar;
            default:
                vm vmVar2 = new vm((e40) k40Var, gjVar);
                vmVar2.OooO = obj;
                return vmVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(e40 e40Var, gj gjVar) {
        super(gjVar);
        this.OooOO0 = e40Var;
    }
}
