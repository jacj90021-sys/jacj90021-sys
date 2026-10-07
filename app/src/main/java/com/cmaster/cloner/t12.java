package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t12 {
    public final oOO0O0 OooO00o;
    public final iz OooO0O0;

    public /* synthetic */ t12(oOO0O0 ooo0o0, iz izVar) {
        this.OooO00o = ooo0o0;
        this.OooO0O0 = izVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t12)) {
            return false;
        }
        t12 t12Var = (t12) obj;
        return uw2.OooO00o(this.OooO00o, t12Var.OooO00o) && uw2.OooO00o(this.OooO0O0, t12Var.OooO0O0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o, this.OooO0O0});
    }

    public final String toString() {
        o0O000O o0o000o = new o0O000O(this);
        o0o000o.OooO00o(this.OooO00o, "key");
        o0o000o.OooO00o(this.OooO0O0, "feature");
        return o0o000o.toString();
    }
}
