package com.cmaster.cloner;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ia2 {
    public transient ba2 OooO0Oo;
    public transient k82 OooO0o;
    public transient v82 OooO0o0;

    public final Map OooO00o() {
        k82 k82Var = this.OooO0o;
        if (k82Var != null) {
            return k82Var;
        }
        ma2 ma2Var = (ma2) this;
        k82 k82Var2 = new k82(ma2Var, ma2Var.OooO0oO);
        this.OooO0o = k82Var2;
        return k82Var2;
    }

    public final Set OooO0O0() {
        v82 v82Var = this.OooO0o0;
        if (v82Var != null) {
            return v82Var;
        }
        ma2 ma2Var = (ma2) this;
        v82 v82Var2 = new v82(ma2Var, ma2Var.OooO0oO);
        this.OooO0o0 = v82Var2;
        return v82Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ia2) {
            return OooO00o().equals(((ia2) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return ((k82) OooO00o()).OooO0o.hashCode();
    }

    public final String toString() {
        return ((k82) OooO00o()).OooO0o.toString();
    }
}
