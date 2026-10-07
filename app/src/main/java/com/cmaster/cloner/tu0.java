package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tu0 {
    public Class OooO00o;
    public Class OooO0O0;
    public Class OooO0OO;

    public tu0(Class cls, Class cls2, Class cls3) {
        this.OooO00o = cls;
        this.OooO0O0 = cls2;
        this.OooO0OO = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tu0.class != obj.getClass()) {
            return false;
        }
        tu0 tu0Var = (tu0) obj;
        return this.OooO00o.equals(tu0Var.OooO00o) && this.OooO0O0.equals(tu0Var.OooO0O0) && pr1.OooO0O0(this.OooO0OO, tu0Var.OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.OooO0O0.hashCode() + (this.OooO00o.hashCode() * 31)) * 31;
        Class cls = this.OooO0OO;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.OooO00o + ", second=" + this.OooO0O0 + '}';
    }
}
