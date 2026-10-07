package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class mp2 {
    public static final vj OooO00o(vj vjVar, vj vjVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        wj wjVar = wj.OooO0oO;
        boolean zBooleanValue = ((Boolean) vjVar.OooO0o(bool, wjVar)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) vjVar2.OooO0o(bool, wjVar)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return vjVar.OooO(vjVar2);
        }
        wj wjVar2 = new wj(2, 5);
        lv lvVar = lv.OooO0Oo;
        vj vjVar3 = (vj) vjVar.OooO0o(lvVar, wjVar2);
        Object objOooO0o = vjVar2;
        if (zBooleanValue2) {
            objOooO0o = vjVar2.OooO0o(lvVar, wj.OooO0o);
        }
        return vjVar3.OooO((vj) objOooO0o);
    }

    public static final qq1 OooO0O0(gj gjVar, vj vjVar, Object obj) {
        qq1 qq1Var = null;
        if ((gjVar instanceof hk) && vjVar.OooO0oo(rq1.OooO0Oo) != null) {
            hk hkVarOooO0OO = (hk) gjVar;
            while (true) {
                if ((hkVarOooO0OO instanceof ds) || (hkVarOooO0OO = hkVarOooO0OO.OooO0OO()) == null) {
                    break;
                }
                if (hkVarOooO0OO instanceof qq1) {
                    qq1Var = (qq1) hkVarOooO0OO;
                    break;
                }
            }
            if (qq1Var != null) {
                qq1Var.OoooOO0(vjVar, obj);
            }
        }
        return qq1Var;
    }
}
