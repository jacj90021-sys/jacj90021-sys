package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g81 extends nx {
    public final /* synthetic */ i81 OooOo;
    public final /* synthetic */ int OooOo0O;
    public final /* synthetic */ String OooOo0o;

    public g81(i81 i81Var, int i, String str) {
        this.OooOo = i81Var;
        this.OooOo0O = i;
        this.OooOo0o = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c81 c81Var = new c81();
        i81 i81Var = this.OooOo;
        int i = i81Var.OooO0o;
        i81Var.OooO0o = i + 1;
        c81Var.OooO00o = i;
        int i2 = this.OooOo0O;
        c81Var.OooO0O0 = i2;
        c81Var.OooO0OO = i2;
        c81Var.OooO = this.OooOo0o;
        c81Var.OooO0o = System.currentTimeMillis();
        i81Var.OooO00o.OooOOo0(c81Var);
        c81 c81VarOooO00o = i81Var.OooO0OO.OooO00o();
        c81VarOooO00o.OooO0OO += c81Var.OooO0OO;
        ye1 ye1Var = i81Var.OooO0o0;
        ye1Var.getClass();
        if (((Executor) ye1.OooO0oo.get()) != ye1Var) {
            qa.OooO0o(sn2.OooO00o("Z+hTclJS+3dj8wBjClX9In7yUg==\n", "Cp0gBnIwnlc=\n"));
            return null;
        }
        i81Var.OooO0OO = c81VarOooO00o;
        i81Var.OooO0O0.OooOO0(c81VarOooO00o);
        return wa1.OooO0o0(c81Var);
    }
}
