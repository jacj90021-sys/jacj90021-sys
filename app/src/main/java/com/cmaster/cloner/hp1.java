package com.cmaster.cloner;

import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hp1 {
    public final g5 OooO00o;
    public final dw OooO0O0;
    public final qo1 OooO0OO;
    public final ip1 OooO0Oo;

    public hp1(g5 g5Var, dw dwVar, qo1 qo1Var, ip1 ip1Var) {
        this.OooO00o = g5Var;
        this.OooO0O0 = dwVar;
        this.OooO0OO = qo1Var;
        this.OooO0Oo = ip1Var;
    }

    public final void OooO00o(w4 w4Var) {
        ip1 ip1Var = this.OooO0Oo;
        xo xoVar = ip1Var.OooO0OO;
        s41 s41Var = w4Var.OooO0O0;
        g5 g5Var = this.OooO00o;
        String str = g5Var.OooO00o;
        if (str == null) {
            qa.OooOOO0("Null backendName");
            return;
        }
        g5 g5Var2 = new g5(str, g5Var.OooO0O0, s41Var);
        oO0Ooooo oo0ooooo = new oO0Ooooo(3);
        oo0ooooo.OooOO0 = new HashMap();
        oo0ooooo.OooO0oo = Long.valueOf(ip1Var.OooO00o.OooO0oo());
        oo0ooooo.OooO = Long.valueOf(ip1Var.OooO0O0.OooO0oo());
        oo0ooooo.OooO0o0 = "FIREBASE_ML_SDK";
        oo0ooooo.OooO0oO = new xv(this.OooO0O0, (byte[]) this.OooO0OO.apply(w4Var.OooO00o));
        oo0ooooo.OooO0o = null;
        xoVar.OooO0O0.execute(new l1(xoVar, g5Var2, oo0ooooo.OooO0Oo(), 3, false));
    }
}
