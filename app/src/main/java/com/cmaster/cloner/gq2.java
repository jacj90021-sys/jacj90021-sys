package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gq2 {
    public static final void OooO00o(gb gbVar, gj gjVar, boolean z) {
        Object obj = gb.OooOO0.get(gbVar);
        Throwable thOooO0oO = gbVar.OooO0oO(obj);
        Object bb1Var = thOooO0oO != null ? new bb1(thOooO0oO) : gbVar.OooO0oo(obj);
        if (!z) {
            gjVar.OooO0Oo(bb1Var);
            return;
        }
        gjVar.getClass();
        cs csVar = (cs) gjVar;
        ij ijVar = csVar.OooO0oo;
        Object obj2 = csVar.OooOO0;
        vj vjVar = ijVar.OooO0o0;
        vjVar.getClass();
        Object objOooO0O0 = w82.OooO0O0(vjVar, obj2);
        qq1 qq1VarOooO0O0 = objOooO0O0 != w82.OooO00o ? mp2.OooO0O0(ijVar, vjVar, objOooO0O0) : null;
        try {
            ijVar.OooO0Oo(bb1Var);
            if (qq1VarOooO0O0 == null || qq1VarOooO0O0.OoooO()) {
                w82.OooO00o(vjVar, objOooO0O0);
            }
        } catch (Throwable th) {
            if (qq1VarOooO0O0 == null || qq1VarOooO0O0.OoooO()) {
                w82.OooO00o(vjVar, objOooO0O0);
            }
            throw th;
        }
    }
}
