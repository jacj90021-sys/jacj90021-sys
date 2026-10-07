package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hp0 implements g31 {
    public final ip0 OooO00o;
    public int OooO0O0;
    public Class OooO0OO;

    public hp0(ip0 ip0Var) {
        this.OooO00o = ip0Var;
    }

    @Override // com.cmaster.cloner.g31
    public final void OooO00o() {
        this.OooO00o.OooO0oO(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hp0) {
            hp0 hp0Var = (hp0) obj;
            if (this.OooO0O0 == hp0Var.OooO0O0 && this.OooO0OO == hp0Var.OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.OooO0O0 * 31;
        Class cls = this.OooO0OO;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.OooO0O0 + "array=" + this.OooO0OO + '}';
    }
}
