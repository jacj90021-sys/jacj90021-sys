package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class OooOOO extends nk0 implements gj, fk {
    public final vj OooO0o;

    public OooOOO(vj vjVar, boolean z) {
        super(z);
        OooOooo((nk0) vjVar.OooO0oo(gu0.OooO0o0));
        this.OooO0o = vjVar.OooO(this);
    }

    @Override // com.cmaster.cloner.fk
    public final vj OooO00o() {
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.gj
    public final void OooO0Oo(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thOooO00o = cb1.OooO00o(obj);
        if (thOooO00o != null) {
            obj = new rf(false, thOooO00o);
        }
        Object objOooo0 = Oooo0(obj);
        if (objOooo0 == j62.OooO0O0) {
            return;
        }
        OooOO0o(objOooo0);
    }

    @Override // com.cmaster.cloner.nk0
    public final String OooOOo0() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // com.cmaster.cloner.nk0
    public final void OooOooO(tf tfVar) {
        qp2.OooO00o(this.OooO0o, tfVar);
    }

    @Override // com.cmaster.cloner.nk0
    public final void Oooo0o(Object obj) {
        if (obj instanceof rf) {
            rf.OooO0O0.get((rf) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooO0O(ik ikVar, OooOOO oooOOO, e40 e40Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iOrdinal = ikVar.ordinal();
        if (iOrdinal == 0) {
            go2.OooO00o(e40Var, oooOOO, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                gu2.OooO00o(((h6) e40Var).OooO0oo(this, oooOOO)).OooO0Oo(vq1.OooO00o);
                return;
            }
            if (iOrdinal != 3) {
                throw new tf();
            }
            try {
                vj vjVar = this.OooO0o;
                Object objOooO0O0 = w82.OooO0O0(vjVar, null);
                try {
                    zp1.OooO00o(e40Var);
                    Object objOooO0oO = e40Var.OooO0oO(oooOOO, this);
                    if (objOooO0oO != gk.OooO0Oo) {
                        OooO0Oo(objOooO0oO);
                    }
                } finally {
                    w82.OooO00o(vjVar, objOooO0O0);
                }
            } catch (Throwable th) {
                OooO0Oo(new bb1(th));
            }
        }
    }

    @Override // com.cmaster.cloner.gj
    public final vj getContext() {
        return this.OooO0o;
    }
}
