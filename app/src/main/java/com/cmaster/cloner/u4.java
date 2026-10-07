package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u4 {
    public final String OooO00o;
    public final Class OooO0O0;

    public u4(Class cls, String str) {
        this.OooO00o = str;
        this.OooO0O0 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return this.OooO00o.equals(u4Var.OooO00o) && this.OooO0O0.equals(u4Var.OooO0O0);
    }

    public final int hashCode() {
        return (this.OooO0O0.hashCode() ^ ((this.OooO00o.hashCode() ^ 1000003) * 1000003)) * 1000003;
    }

    public final String toString() {
        return "Option{id=" + this.OooO00o + ", valueClass=" + this.OooO0O0 + ", token=null}";
    }
}
