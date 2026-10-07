package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k21 implements Serializable {
    public final Object OooO0Oo;
    public final Object OooO0o0;

    public k21(Object obj, Object obj2) {
        this.OooO0Oo = obj;
        this.OooO0o0 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k21)) {
            return false;
        }
        k21 k21Var = (k21) obj;
        return ij0.OooO00o(this.OooO0Oo, k21Var.OooO0Oo) && ij0.OooO00o(this.OooO0o0, k21Var.OooO0o0);
    }

    public final int hashCode() {
        Object obj = this.OooO0Oo;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.OooO0o0;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.OooO0Oo + ", " + this.OooO0o0 + ')';
    }
}
