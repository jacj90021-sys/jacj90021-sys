package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f41 {
    public final String OooO00o;
    public final Long OooO0O0;

    public f41(String str, long j) {
        this.OooO00o = str;
        this.OooO0O0 = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f41)) {
            return false;
        }
        f41 f41Var = (f41) obj;
        if (!this.OooO00o.equals(f41Var.OooO00o)) {
            return false;
        }
        Long l = f41Var.OooO0O0;
        Long l2 = this.OooO0O0;
        return l2 != null ? l2.equals(l) : l == null;
    }

    public final int hashCode() {
        int iHashCode = this.OooO00o.hashCode() * 31;
        Long l = this.OooO0O0;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
