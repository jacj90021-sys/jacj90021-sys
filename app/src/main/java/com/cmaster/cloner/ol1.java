package com.cmaster.cloner;

import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ol1 {
    public final String OooO00o;
    public final String OooO0O0;
    public final String OooO0OO;
    public final List OooO0Oo;
    public final List OooO0o0;

    public ol1(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
        this.OooO0Oo = list;
        this.OooO0o0 = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1Var = (ol1) obj;
        if (ij0.OooO00o(this.OooO00o, ol1Var.OooO00o) && ij0.OooO00o(this.OooO0O0, ol1Var.OooO0O0) && ij0.OooO00o(this.OooO0OO, ol1Var.OooO0OO) && ij0.OooO00o(this.OooO0Oo, ol1Var.OooO0Oo)) {
            return ij0.OooO00o(this.OooO0o0, ol1Var.OooO0o0);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0o0.hashCode() + ((this.OooO0Oo.hashCode() + ((this.OooO0OO.hashCode() + ((this.OooO0O0.hashCode() + (this.OooO00o.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.OooO00o);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.OooO0O0);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.OooO0OO);
        sb.append("',\n            |   columnNames = {");
        pj1.OooO0O0(se.OooO0o0(se.OooO0o(this.OooO0Oo), ",", null, null, null, 62));
        pj1.OooO0O0("},");
        vq1 vq1Var = vq1.OooO00o;
        sb.append(vq1Var);
        sb.append("\n            |   referenceColumnNames = {");
        pj1.OooO0O0(se.OooO0o0(se.OooO0o(this.OooO0o0), ",", null, null, null, 62));
        pj1.OooO0O0(" }");
        sb.append(vq1Var);
        sb.append("\n            |}\n        ");
        return pj1.OooO0O0(pj1.OooO0OO(sb.toString()));
    }
}
