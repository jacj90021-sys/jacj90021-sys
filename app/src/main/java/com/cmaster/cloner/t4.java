package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t4 extends be {
    public final q4 OooO00o;

    public t4(q4 q4Var) {
        this.OooO00o = q4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        Object obj2 = ae.OooO0Oo;
        if (obj2.equals(obj2)) {
            return this.OooO00o.equals(((t4) beVar).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() ^ ((ae.OooO0Oo.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ae.OooO0Oo + ", androidClientInfo=" + this.OooO00o + "}";
    }
}
