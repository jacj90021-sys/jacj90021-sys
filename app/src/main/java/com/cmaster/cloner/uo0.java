package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class uo0 extends ia implements p30, yk0 {
    public final boolean OooOO0;

    public uo0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.OooOO0 = false;
    }

    @Override // com.cmaster.cloner.p30
    public final Object OooO00o() {
        return this.OooO0o0.getClass().getSimpleName();
    }

    @Override // com.cmaster.cloner.ia
    public final xk0 OooO0OO() {
        r81.OooO00o.getClass();
        return this;
    }

    public final xk0 OooO0o0() {
        if (this.OooOO0) {
            return this;
        }
        xk0 xk0Var = this.OooO0Oo;
        if (xk0Var != null) {
            return xk0Var;
        }
        OooO0OO();
        this.OooO0Oo = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uo0) {
            uo0 uo0Var = (uo0) obj;
            return OooO0Oo().equals(uo0Var.OooO0Oo()) && this.OooO0oO.equals(uo0Var.OooO0oO) && this.OooO0oo.equals(uo0Var.OooO0oo) && ij0.OooO00o(this.OooO0o0, uo0Var.OooO0o0);
        }
        if (obj instanceof yk0) {
            return obj.equals(OooO0o0());
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0oo.hashCode() + ((this.OooO0oO.hashCode() + (OooO0Oo().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xk0 xk0VarOooO0o0 = OooO0o0();
        return xk0VarOooO0o0 != this ? xk0VarOooO0o0.toString() : rj.OooO0oO(new StringBuilder("property "), this.OooO0oO, " (Kotlin reflection is not available)");
    }
}
