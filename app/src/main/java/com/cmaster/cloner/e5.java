package com.cmaster.cloner;

import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e5 {
    public final ie OooO00o;
    public final HashMap OooO0O0;

    public e5(ie ieVar, HashMap map) {
        this.OooO00o = ieVar;
        this.OooO0O0 = map;
    }

    public final long OooO00o(s41 s41Var, long j, int i) {
        long jOooO0oo = j - this.OooO00o.OooO0oo();
        f5 f5Var = (f5) this.OooO0O0.get(s41Var);
        long j2 = f5Var.OooO00o;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jOooO0oo), f5Var.OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return this.OooO00o.equals(e5Var.OooO00o) && this.OooO0O0.equals(e5Var.OooO0O0);
    }

    public final int hashCode() {
        return this.OooO0O0.hashCode() ^ ((this.OooO00o.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.OooO00o + ", values=" + this.OooO0O0 + "}";
    }
}
