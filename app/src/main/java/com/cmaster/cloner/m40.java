package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m40 extends ia implements l40, xk0, k40 {
    public final int OooOO0;
    public final int OooOO0O;

    public m40(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.OooOO0 = i;
        this.OooOO0O = 0;
    }

    @Override // com.cmaster.cloner.l40
    public final int OooO0O0() {
        return this.OooOO0;
    }

    @Override // com.cmaster.cloner.ia
    public final xk0 OooO0OO() {
        r81.OooO00o.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.cmaster.cloner.xk0] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m40) {
            m40 m40Var = (m40) obj;
            return this.OooO0oO.equals(m40Var.OooO0oO) && this.OooO0oo.equals(m40Var.OooO0oo) && this.OooOO0O == m40Var.OooOO0O && this.OooOO0 == m40Var.OooOO0 && ij0.OooO00o(this.OooO0o0, m40Var.OooO0o0) && OooO0Oo().equals(m40Var.OooO0Oo());
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        xk0 r0 = this.OooO0Oo;
        if (r0 == null) {
            OooO0OO();
            this.OooO0Oo = this;
            r0 = this;
        }
        return obj.equals(r0);
    }

    public final int hashCode() {
        OooO0Oo();
        return this.OooO0oo.hashCode() + ((this.OooO0oO.hashCode() + (OooO0Oo().hashCode() * 31)) * 31);
    }

    public final String toString() {
        xk0 xk0Var = this.OooO0Oo;
        if (xk0Var == null) {
            OooO0OO();
            this.OooO0Oo = this;
            xk0Var = this;
        }
        if (xk0Var != this) {
            return xk0Var.toString();
        }
        String str = this.OooO0oO;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : px0.OooOOOO("function ", str, " (Kotlin reflection is not available)");
    }

    public m40(int i, Class cls, String str, String str2, int i2) {
        this(i, ha.OooO0Oo, cls, str, str2, i2, 0);
    }
}
