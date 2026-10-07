package com.cmaster.cloner;

import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o60 extends kb1 {
    public final /* synthetic */ p60 OooO00o;

    public o60(p60 p60Var) {
        this.OooO00o = p60Var;
    }

    @Override // com.cmaster.cloner.o0o0000
    public final void onAdFailedToLoad(xn0 xn0Var) {
        int i = xn0Var.OooO00o;
        int i2 = (i == 3 || i == 9) ? -8001 : -1;
        Log.d(p60.OooOO0o, xn0Var.OooO0O0);
        this.OooO00o.OooO0O0(wa1.OooO00o(i2, new o0O0O0Oo(xn0Var, 1), null));
    }

    @Override // com.cmaster.cloner.o0o0000
    public final void onAdLoaded(Object obj) {
        jb1 jb1Var = (jb1) obj;
        Log.e(p60.OooOO0o, "onAdLoaded: " + jb1Var);
        lr0 lr0Var = new lr0();
        lr0Var.OooO00o = jb1Var;
        this.OooO00o.OooO0O0(wa1.OooO0o0(lr0Var));
    }
}
