package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d5 {
    public final long OooO00o;
    public final g5 OooO0O0;
    public final x4 OooO0OO;

    public d5(long j, g5 g5Var, x4 x4Var) {
        this.OooO00o = j;
        this.OooO0O0 = g5Var;
        this.OooO0OO = x4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj;
        return this.OooO00o == d5Var.OooO00o && this.OooO0O0.equals(d5Var.OooO0O0) && this.OooO0OO.equals(d5Var.OooO0OO);
    }

    public final int hashCode() {
        long j = this.OooO00o;
        return this.OooO0OO.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.OooO0O0.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.OooO00o + ", transportContext=" + this.OooO0O0 + ", event=" + this.OooO0OO + "}";
    }
}
