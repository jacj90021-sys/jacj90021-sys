package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c5 extends tw0 {
    public final sw0 OooO00o;
    public final rw0 OooO0O0;

    public c5(sw0 sw0Var, rw0 rw0Var) {
        this.OooO00o = sw0Var;
        this.OooO0O0 = rw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tw0) {
            tw0 tw0Var = (tw0) obj;
            sw0 sw0Var = this.OooO00o;
            if (sw0Var != null ? sw0Var.equals(((c5) tw0Var).OooO00o) : ((c5) tw0Var).OooO00o == null) {
                rw0 rw0Var = this.OooO0O0;
                if (rw0Var != null ? rw0Var.equals(((c5) tw0Var).OooO0O0) : ((c5) tw0Var).OooO0O0 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        sw0 sw0Var = this.OooO00o;
        int iHashCode = ((sw0Var == null ? 0 : sw0Var.hashCode()) ^ 1000003) * 1000003;
        rw0 rw0Var = this.OooO0O0;
        return iHashCode ^ (rw0Var != null ? rw0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.OooO00o + ", mobileSubtype=" + this.OooO0O0 + "}";
    }
}
