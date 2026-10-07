package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qq1 extends td1 {
    public final ThreadLocal OooO0oo;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public qq1(vj vjVar, ch chVar) {
        rq1 rq1Var = rq1.OooO0Oo;
        super(vjVar.OooO0oo(rq1Var) == null ? vjVar.OooO(rq1Var) : vjVar, chVar);
        this.OooO0oo = new ThreadLocal();
        vj vjVar2 = chVar.OooO0o0;
        vjVar2.getClass();
        if (vjVar2.OooO0oo(oOO0OO.OooO0o0) instanceof zj) {
            return;
        }
        Object objOooO0O0 = w82.OooO0O0(vjVar, null);
        w82.OooO00o(vjVar, objOooO0O0);
        OoooOO0(vjVar, objOooO0O0);
    }

    @Override // com.cmaster.cloner.td1, com.cmaster.cloner.nk0
    public final void OooOO0o(Object obj) {
        if (this.threadLocalIsSet) {
            k21 k21Var = (k21) this.OooO0oo.get();
            if (k21Var != null) {
                w82.OooO00o((vj) k21Var.OooO0Oo, k21Var.OooO0o0);
            }
            this.OooO0oo.remove();
        }
        Object objOooO00o = cp2.OooO00o(obj);
        ij ijVar = this.OooO0oO;
        vj vjVar = ijVar.OooO0o0;
        vjVar.getClass();
        Object objOooO0O0 = w82.OooO0O0(vjVar, null);
        qq1 qq1VarOooO0O0 = objOooO0O0 != w82.OooO00o ? mp2.OooO0O0(ijVar, vjVar, objOooO0O0) : null;
        try {
            this.OooO0oO.OooO0Oo(objOooO00o);
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

    public final boolean OoooO() {
        boolean z = this.threadLocalIsSet && this.OooO0oo.get() == null;
        this.OooO0oo.remove();
        return !z;
    }

    public final void OoooOO0(vj vjVar, Object obj) {
        this.threadLocalIsSet = true;
        this.OooO0oo.set(new k21(vjVar, obj));
    }
}
