package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pp {
    public final Class OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;

    public pp(int i, int i2, Class cls) {
        this.OooO00o = cls;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pp)) {
            return false;
        }
        pp ppVar = (pp) obj;
        return this.OooO00o == ppVar.OooO00o && this.OooO0O0 == ppVar.OooO0O0 && this.OooO0OO == ppVar.OooO0OO;
    }

    public final int hashCode() {
        return this.OooO0OO ^ ((((this.OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.OooO0O0) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.OooO00o);
        sb.append(", type=");
        int i = this.OooO0O0;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.OooO0OO;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(px0.OooOOO(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return rj.OooO0oO(sb, str, "}");
    }
}
