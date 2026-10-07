package com.cmaster.cloner;

import android.database.SQLException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class zy2 {
    public static final void OooO00o(mc1 mc1Var, String str) throws Exception {
        mc1Var.getClass();
        rc1 rc1VarOooOOo0 = mc1Var.OooOOo0(str);
        try {
            rc1VarOooOOo0.OooOOOo();
            in2.OooO00o(rc1VarOooOOo0, null);
        } finally {
        }
    }

    public static final void OooO0O0(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }
}
