package com.cmaster.cloner;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ql1 {
    public final String OooO00o;
    public final Map OooO0O0;
    public final Set OooO0OO;
    public final Set OooO0Oo;

    public ql1(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.OooO00o = str;
        this.OooO0O0 = map;
        this.OooO0OO = abstractSet;
        this.OooO0Oo = abstractSet2;
    }

    public static final ql1 OooO00o(c30 c30Var, String str) {
        return h43.OooO00o(new hk1(c30Var), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql1)) {
            return false;
        }
        ql1 ql1Var = (ql1) obj;
        if (!this.OooO00o.equals(ql1Var.OooO00o) || !this.OooO0O0.equals(ql1Var.OooO0O0) || !ij0.OooO00o(this.OooO0OO, ql1Var.OooO0OO)) {
            return false;
        }
        Set set2 = this.OooO0Oo;
        if (set2 == null || (set = ql1Var.OooO0Oo) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode() + ((this.OooO0O0.hashCode() + (this.OooO00o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.OooO00o);
        sb.append("',\n            |    columns = {");
        sb.append(i43.OooO0O0(se.OooO0oO(new p12(9), this.OooO0O0.values())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(i43.OooO0O0(this.OooO0OO));
        sb.append("\n            |    indices = {");
        Set set = this.OooO0Oo;
        sb.append(i43.OooO0O0(set != null ? se.OooO0oO(new p12(10), set) : nv.OooO0Oo));
        sb.append("\n            |}\n        ");
        return pj1.OooO0OO(sb.toString());
    }
}
