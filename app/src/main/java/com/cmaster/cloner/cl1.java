package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cl1 implements hl0, Serializable {
    public p30 OooO0Oo;
    public volatile Object OooO0o0 = oOO0OO.OooO0o;
    public final Object OooO0o = this;

    public cl1(p30 p30Var) {
        this.OooO0Oo = p30Var;
    }

    @Override // com.cmaster.cloner.hl0
    public final Object getValue() {
        Object objOooO00o;
        Object obj = this.OooO0o0;
        oOO0OO ooo0oo = oOO0OO.OooO0o;
        if (obj != ooo0oo) {
            return obj;
        }
        synchronized (this.OooO0o) {
            objOooO00o = this.OooO0o0;
            if (objOooO00o == ooo0oo) {
                p30 p30Var = this.OooO0Oo;
                p30Var.getClass();
                objOooO00o = p30Var.OooO00o();
                this.OooO0o0 = objOooO00o;
                this.OooO0Oo = null;
            }
        }
        return objOooO00o;
    }

    public final String toString() {
        return this.OooO0o0 != oOO0OO.OooO0o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
