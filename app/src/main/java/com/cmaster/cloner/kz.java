package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kz {
    public final xp1 OooO00o;
    public final String OooO0O0;
    public final yk OooO0OO;

    public kz(xp1 xp1Var, xp1 xp1Var2, String str) {
        if (xp1Var2 == null || str == null) {
            throw null;
        }
        this.OooO00o = xp1Var;
        this.OooO0O0 = str;
        this.OooO0OO = new yk(xp1Var.OooO0OO, new kl(new ml(str), new ml(xp1Var2.OooO00o)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return kzVar.OooO00o.equals(this.OooO00o) && kzVar.OooO0O0.equals(this.OooO0O0);
    }

    public final int hashCode() {
        return (this.OooO0O0.hashCode() * 37) + this.OooO00o.OooO00o.hashCode();
    }

    public final String toString() {
        return this.OooO00o + u7.OooO00o(new byte[]{78}, new byte[]{96, 59, 80, -82, -84, 109, 37, 120}) + this.OooO0O0;
    }
}
