package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pl1 {
    public final String OooO00o;
    public final boolean OooO0O0;
    public final List OooO0OO;
    public final List OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public pl1(String str, boolean z, List list, List list2) {
        str.getClass();
        list.getClass();
        this.OooO00o = str;
        this.OooO0O0 = z;
        this.OooO0OO = list;
        this.OooO0Oo = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.OooO0Oo = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl1)) {
            return false;
        }
        pl1 pl1Var = (pl1) obj;
        String str = pl1Var.OooO00o;
        if (this.OooO0O0 != pl1Var.OooO0O0 || !ij0.OooO00o(this.OooO0OO, pl1Var.OooO0OO) || !ij0.OooO00o(this.OooO0Oo, pl1Var.OooO0Oo)) {
            return false;
        }
        String str2 = this.OooO00o;
        return uj1.OooO0oo(str2, "index_") ? uj1.OooO0oo(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.OooO00o;
        return this.OooO0Oo.hashCode() + ((this.OooO0OO.hashCode() + ((((uj1.OooO0oo(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.OooO0O0 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.OooO00o);
        sb.append("',\n            |   unique = '");
        sb.append(this.OooO0O0);
        sb.append("',\n            |   columns = {");
        pj1.OooO0O0(se.OooO0o0(this.OooO0OO, ",", null, null, null, 62));
        pj1.OooO0O0("},");
        vq1 vq1Var = vq1.OooO00o;
        sb.append(vq1Var);
        sb.append("\n            |   orders = {");
        pj1.OooO0O0(se.OooO0o0(this.OooO0Oo, ",", null, null, null, 62));
        pj1.OooO0O0(" }");
        sb.append(vq1Var);
        sb.append("\n            |}\n        ");
        return pj1.OooO0O0(pj1.OooO0OO(sb.toString()));
    }

    public pl1(String str, List list) {
        list.getClass();
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add("ASC");
        }
        this(str, false, list, arrayList);
    }
}
