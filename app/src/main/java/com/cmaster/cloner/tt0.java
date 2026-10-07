package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tt0 {
    public final xp1 OooO00o;
    public final xp1 OooO0O0;
    public final String OooO0OO;
    public final bq1 OooO0Oo;
    public final jl OooO0o0;

    public tt0(xp1 xp1Var, xp1 xp1Var2, String str, bq1 bq1Var) {
        if (xp1Var2 == null || str == null) {
            throw null;
        }
        this.OooO00o = xp1Var;
        this.OooO0O0 = xp1Var2;
        this.OooO0OO = str;
        this.OooO0Oo = bq1Var;
        this.OooO0o0 = new jl(xp1Var.OooO0OO, new kl(new ml(str), new ml(OooO00o(false))));
    }

    public final String OooO00o(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{109}, new byte[]{69, 107, 57, -41, -98, -95, 54, -105}));
        if (z) {
            sb.append(this.OooO00o.OooO00o);
        }
        for (xp1 xp1Var : this.OooO0Oo.OooO00o) {
            sb.append(xp1Var.OooO00o);
        }
        sb.append(u7.OooO00o(new byte[]{45}, new byte[]{4, -65, 57, -40, -121, -28, 92, 54}));
        sb.append(this.OooO0O0.OooO00o);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tt0)) {
            return false;
        }
        tt0 tt0Var = (tt0) obj;
        return tt0Var.OooO00o.equals(this.OooO00o) && tt0Var.OooO0OO.equals(this.OooO0OO) && tt0Var.OooO0Oo.equals(this.OooO0Oo) && tt0Var.OooO0O0.equals(this.OooO0O0);
    }

    public final int hashCode() {
        return this.OooO0O0.OooO00o.hashCode() + ((Arrays.hashCode(this.OooO0Oo.OooO00o) + ((this.OooO0OO.hashCode() + ((this.OooO00o.OooO00o.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.OooO00o);
        sb.append(u7.OooO00o(new byte[]{-13}, new byte[]{-35, -70, -34, -85, 0, -53, -96, 112}));
        sb.append(this.OooO0OO);
        sb.append(u7.OooO00o(new byte[]{93}, new byte[]{117, -109, -111, -11, 79, 100, -83, 6}));
        sb.append(this.OooO0Oo);
        return rj.OooO0oo(new byte[]{-126}, new byte[]{-85, -35, 71, -88, -122, -87, -85, 33}, sb);
    }
}
