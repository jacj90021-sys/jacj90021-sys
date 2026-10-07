package com.cmaster.cloner;

import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h81 extends nx {
    public final /* synthetic */ i81 OooOo;
    public final /* synthetic */ int OooOo0O;
    public final /* synthetic */ long OooOo0o;

    public h81(i81 i81Var, int i, long j) {
        this.OooOo = i81Var;
        this.OooOo0O = i;
        this.OooOo0o = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        i81 i81Var = this.OooOo;
        i81Var.getClass();
        String string = UUID.randomUUID().toString();
        e81 e81Var = i81Var.OooO00o;
        e81Var.getClass();
        sn2.OooO00o("KJyTToZjTKVbn41EiBcP4BK3rCuyXwn9HvmrZK5SAq9G+eArqkUI6gn5vXLlVQnoEreAf6xaCa86\nipwriX4hxi/57jv1B1y/Ww==\n", "e9nfC8U3bI8=\n");
        if (!((List) aq2.OooO0O0((tb1) e81Var.OooO0o0, true, false, new OooOOO0(string, 4))).isEmpty()) {
            return wa1.OooO00o(-1, "unknown", null);
        }
        c81 c81VarOooO00o = i81Var.OooO0OO.OooO00o();
        c81VarOooO00o.OooO0Oo = string;
        c81VarOooO00o.OooO0O0 = this.OooOo0O;
        c81VarOooO00o.OooO0oO = this.OooOo0o;
        e81Var.OooOOo0(c81VarOooO00o);
        try {
            List listOooO0OO = i81Var.OooO0OO(c81VarOooO00o);
            i81Var.OooO0OO = c81VarOooO00o;
            i81Var.OooO0O0.OooOO0(c81VarOooO00o);
            return wa1.OooO0o0(listOooO0OO);
        } finally {
            if (c81VarOooO00o.OooO0Oo != null) {
                c81VarOooO00o.OooO0Oo = null;
                c81VarOooO00o.OooO0oO = 0L;
                c81VarOooO00o.OooO0O0 = 0;
                e81Var.OooOOo0(c81VarOooO00o);
            }
        }
    }
}
