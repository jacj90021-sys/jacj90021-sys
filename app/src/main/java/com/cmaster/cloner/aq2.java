package com.cmaster.cloner;

import android.database.Cursor;
import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class aq2 {
    public static final void OooO00o(mc1 mc1Var) throws Exception {
        mc1Var.getClass();
        zm0 zm0Var = new zm0(10);
        rc1 rc1VarOooOOo0 = mc1Var.OooOOo0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (rc1VarOooOOo0.OooOOOo()) {
            try {
                zm0Var.add(rc1VarOooOOo0.OooOO0o(0));
            } finally {
            }
        }
        in2.OooO00o(rc1VarOooOOo0, null);
        ListIterator listIterator = te.OooO00o(zm0Var).listIterator(0);
        while (true) {
            xm0 xm0Var = (xm0) listIterator;
            if (!xm0Var.hasNext()) {
                return;
            }
            String str = (String) xm0Var.next();
            if (uj1.OooO0oo(str, "room_fts_content_sync_")) {
                zy2.OooO00o(mc1Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final Object OooO0O0(tb1 tb1Var, boolean z, boolean z2, a40 a40Var) {
        tb1Var.getClass();
        tb1Var.OooO00o();
        tb1Var.OooO0O0();
        return xy2.OooO00o(new xm(null, a40Var, tb1Var, z2, z));
    }

    public static final Cursor OooO0OO(tb1 tb1Var, wb1 wb1Var) {
        tb1Var.getClass();
        tb1Var.OooO00o();
        tb1Var.OooO0O0();
        return tb1Var.OooO().OooOO0O().OooOOoo(wb1Var);
    }
}
