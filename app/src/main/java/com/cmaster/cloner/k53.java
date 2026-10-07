package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class k53 {
    public static final Object OooO00o(td1 td1Var, td1 td1Var2, e40 e40Var) throws Throwable {
        Object rfVar;
        Object objOooo0;
        try {
            zp1.OooO00o(e40Var);
            rfVar = e40Var.OooO0oO(td1Var2, td1Var);
        } catch (Throwable th) {
            rfVar = new rf(false, th);
        }
        gk gkVar = gk.OooO0Oo;
        if (rfVar == gkVar || (objOooo0 = td1Var.Oooo0(rfVar)) == j62.OooO0O0) {
            return gkVar;
        }
        if (objOooo0 instanceof rf) {
            throw ((rf) objOooo0).OooO00o;
        }
        return j62.OooO00o(objOooo0);
    }
}
