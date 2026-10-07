package com.cmaster.cloner;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o81 implements ln0 {
    public final WeakReference OooO00o;
    public final m3 OooO0O0 = new m3(0);

    public o81(qe qeVar) {
        this.OooO00o = new WeakReference(qeVar);
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO00o(int i, int i2) {
        a71 a71VarOooO0o0 = OooO0o0();
        if (a71VarOooO0o0 == null) {
            return;
        }
        a71VarOooO0o0.OooO00o.OooO0OO(i, i2);
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0O0(int i, int i2) {
        a71 a71VarOooO0o0 = OooO0o0();
        if (a71VarOooO0o0 == null) {
            return;
        }
        a71VarOooO0o0.OooO00o.OooO0o0(i, i2);
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0OO(int i, int i2) {
        a71 a71VarOooO0o0 = OooO0o0();
        if (a71VarOooO0o0 == null) {
            return;
        }
        a71VarOooO0o0.OooO00o.OooO0o(i, i2);
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0Oo(int i, int i2, Object obj) {
        a71 a71VarOooO0o0 = OooO0o0();
        if (a71VarOooO0o0 == null) {
            return;
        }
        a71VarOooO0o0.OooO00o.OooO0Oo(i, i2, obj);
    }

    public final a71 OooO0o0() {
        a71 a71Var = (a71) this.OooO00o.get();
        if (a71Var == null) {
            m3 m3Var = this.OooO0O0;
            m3Var.getClass();
            h3 h3Var = new h3(m3Var);
            while (h3Var.hasNext()) {
                re reVar = (re) h3Var.next();
                reVar.getClass();
                if (!h1.OooO0O0()) {
                    qa.OooO0o("must be main thread");
                    return null;
                }
                reVar.OooO0Oo.OooO00o.remove(this);
            }
            m3Var.clear();
        }
        return a71Var;
    }
}
