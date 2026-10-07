package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class af implements e40 {
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ af(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        bf bfVar;
        switch (this.OooO0Oo) {
            case 0:
                String str = (String) obj;
                tj tjVar = (tj) obj2;
                str.getClass();
                tjVar.getClass();
                if (str.length() == 0) {
                    return tjVar.toString();
                }
                return str + ", " + tjVar;
            default:
                vj vjVar = (vj) obj;
                tj tjVar2 = (tj) obj2;
                vjVar.getClass();
                tjVar2.getClass();
                vj vjVarOooOOO = vjVar.OooOOO(tjVar2.getKey());
                lv lvVar = lv.OooO0Oo;
                if (vjVarOooOOO == lvVar) {
                    return tjVar2;
                }
                oOO0OO ooo0oo = oOO0OO.OooO0o0;
                zj zjVar = (zj) vjVarOooOOO.OooO0oo(ooo0oo);
                if (zjVar == null) {
                    bfVar = new bf(tjVar2, vjVarOooOOO);
                } else {
                    vj vjVarOooOOO2 = vjVarOooOOO.OooOOO(ooo0oo);
                    if (vjVarOooOOO2 == lvVar) {
                        return new bf(zjVar, tjVar2);
                    }
                    bfVar = new bf(zjVar, new bf(tjVar2, vjVarOooOOO2));
                }
                return bfVar;
        }
    }
}
