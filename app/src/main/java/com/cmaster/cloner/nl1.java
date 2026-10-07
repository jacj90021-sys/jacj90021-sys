package com.cmaster.cloner;

import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nl1 {
    public final String OooO00o;
    public final String OooO0O0;
    public final boolean OooO0OO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final String OooO0o0;
    public final int OooO0oO;

    public nl1(int i, String str, String str2, String str3, boolean z, int i2) {
        str.getClass();
        str2.getClass();
        this.OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = z;
        this.OooO0Oo = i;
        this.OooO0o0 = str3;
        this.OooO0o = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.OooO0oO = uj1.OooO0Oo(upperCase, "INT") ? 3 : (uj1.OooO0Oo(upperCase, "CHAR") || uj1.OooO0Oo(upperCase, "CLOB") || uj1.OooO0Oo(upperCase, "TEXT")) ? 2 : uj1.OooO0Oo(upperCase, "BLOB") ? 5 : (uj1.OooO0Oo(upperCase, "REAL") || uj1.OooO0Oo(upperCase, "FLOA") || uj1.OooO0Oo(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nl1) {
                boolean z = this.OooO0Oo > 0;
                nl1 nl1Var = (nl1) obj;
                int i = nl1Var.OooO0o;
                if (z == (nl1Var.OooO0Oo > 0) && ij0.OooO00o(this.OooO00o, nl1Var.OooO00o) && this.OooO0OO == nl1Var.OooO0OO) {
                    String str = nl1Var.OooO0o0;
                    int i2 = this.OooO0o;
                    String str2 = this.OooO0o0;
                    if ((i2 != 1 || i != 2 || str2 == null || i43.OooO00o(str2, str)) && ((i2 != 2 || i != 1 || str == null || i43.OooO00o(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : i43.OooO00o(str2, str))) && this.OooO0oO == nl1Var.OooO0oO))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.OooO00o.hashCode() * 31) + this.OooO0oO) * 31) + (this.OooO0OO ? 1231 : 1237)) * 31) + this.OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.OooO00o);
        sb.append("',\n            |   type = '");
        sb.append(this.OooO0O0);
        sb.append("',\n            |   affinity = '");
        sb.append(this.OooO0oO);
        sb.append("',\n            |   notNull = '");
        sb.append(this.OooO0OO);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.OooO0Oo);
        sb.append("',\n            |   defaultValue = '");
        String str = this.OooO0o0;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return pj1.OooO0O0(pj1.OooO0OO(sb.toString()));
    }
}
