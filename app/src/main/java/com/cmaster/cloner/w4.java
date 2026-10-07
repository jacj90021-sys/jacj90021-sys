package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w4 {
    public final Object OooO00o;
    public final s41 OooO0O0;

    public w4(Object obj, s41 s41Var) {
        if (obj == null) {
            qa.OooOOO0("Null payload");
            throw null;
        }
        this.OooO00o = obj;
        this.OooO0O0 = s41Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return this.OooO00o.equals(w4Var.OooO00o) && this.OooO0O0.equals(w4Var.OooO0O0);
    }

    public final int hashCode() {
        return this.OooO0O0.hashCode() ^ (((1000003 * 1000003) ^ this.OooO00o.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.OooO00o + ", priority=" + this.OooO0O0 + "}";
    }
}
