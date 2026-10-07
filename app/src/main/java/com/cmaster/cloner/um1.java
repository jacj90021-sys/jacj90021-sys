package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class um1 implements tj {
    public final Object OooO0Oo;
    public final wm1 OooO0o;
    public final ThreadLocal OooO0o0;

    public um1(p31 p31Var, ThreadLocal threadLocal) {
        this.OooO0Oo = p31Var;
        this.OooO0o0 = threadLocal;
        this.OooO0o = new wm1(threadLocal);
    }

    @Override // com.cmaster.cloner.vj
    public final vj OooO(vj vjVar) {
        return kp2.OooO0OO(this, vjVar);
    }

    @Override // com.cmaster.cloner.vj
    public final Object OooO0o(Object obj, e40 e40Var) {
        return e40Var.OooO0oO(obj, this);
    }

    @Override // com.cmaster.cloner.vj
    public final tj OooO0oo(uj ujVar) {
        if (this.OooO0o.equals(ujVar)) {
            return this;
        }
        return null;
    }

    @Override // com.cmaster.cloner.vj
    public final vj OooOOO(uj ujVar) {
        return this.OooO0o.equals(ujVar) ? lv.OooO0Oo : this;
    }

    @Override // com.cmaster.cloner.tj
    public final uj getKey() {
        return this.OooO0o;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.OooO0Oo + ", threadLocal = " + this.OooO0o0 + ')';
    }
}
