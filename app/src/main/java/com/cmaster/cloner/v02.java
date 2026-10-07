package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v02 {
    public String OooO00o;
    public int OooO0O0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v02)) {
            return false;
        }
        v02 v02Var = (v02) obj;
        if (this.OooO0O0 != v02Var.OooO0O0) {
            return false;
        }
        return this.OooO00o.equals(v02Var.OooO00o);
    }

    public final int hashCode() {
        return rj.OooOOoo(this.OooO0O0) + (this.OooO00o.hashCode() * 31);
    }
}
