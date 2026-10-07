package com.cmaster.cloner;

import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f5 {
    public final long OooO00o;
    public final long OooO0O0;
    public final Set OooO0OO;

    public f5(long j, long j2, Set set) {
        this.OooO00o = j;
        this.OooO0O0 = j2;
        this.OooO0OO = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f5) {
            f5 f5Var = (f5) obj;
            if (this.OooO00o == f5Var.OooO00o && this.OooO0O0 == f5Var.OooO0O0 && this.OooO0OO.equals(f5Var.OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.OooO0O0;
        return this.OooO0OO.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.OooO00o + ", maxAllowedDelay=" + this.OooO0O0 + ", flags=" + this.OooO0OO + "}";
    }
}
