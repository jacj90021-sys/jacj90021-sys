package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v72 {
    public final String OooO00o;
    public final double OooO0O0;
    public final double OooO0OO;
    public final double OooO0Oo;
    public final int OooO0o0;

    public v72(String str, double d, double d2, double d3, int i) {
        this.OooO00o = str;
        this.OooO0OO = d;
        this.OooO0O0 = d2;
        this.OooO0Oo = d3;
        this.OooO0o0 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v72)) {
            return false;
        }
        v72 v72Var = (v72) obj;
        return uw2.OooO00o(this.OooO00o, v72Var.OooO00o) && this.OooO0O0 == v72Var.OooO0O0 && this.OooO0OO == v72Var.OooO0OO && this.OooO0o0 == v72Var.OooO0o0 && Double.compare(this.OooO0Oo, v72Var.OooO0Oo) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o, Double.valueOf(this.OooO0O0), Double.valueOf(this.OooO0OO), Double.valueOf(this.OooO0Oo), Integer.valueOf(this.OooO0o0)});
    }

    public final String toString() {
        o0O000O o0o000o = new o0O000O(this);
        o0o000o.OooO00o(this.OooO00o, "name");
        o0o000o.OooO00o(Double.valueOf(this.OooO0OO), "minBound");
        o0o000o.OooO00o(Double.valueOf(this.OooO0O0), "maxBound");
        o0o000o.OooO00o(Double.valueOf(this.OooO0Oo), "percent");
        o0o000o.OooO00o(Integer.valueOf(this.OooO0o0), "count");
        return o0o000o.toString();
    }
}
