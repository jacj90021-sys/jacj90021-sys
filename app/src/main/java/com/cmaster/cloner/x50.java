package com.cmaster.cloner;

import android.util.Log;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x50 extends o0OOo000 {
    public final /* synthetic */ y50 OooO0Oo;

    public x50(y50 y50Var) {
        this.OooO0Oo = y50Var;
    }

    @Override // com.cmaster.cloner.o0OOo000
    public final void onAdFailedToLoad(xn0 xn0Var) {
        y50 y50Var = this.OooO0Oo;
        Log.e(y50Var.OooO0o, "onAdFailedToLoad: " + xn0Var);
        Objects.toString(xn0Var);
        y50Var.OooO0oO = 0;
        y50Var.OooO0o0.OooOOOO();
    }

    @Override // com.cmaster.cloner.o0OOo000
    public final void onAdLoaded() {
        super.onAdLoaded();
        y50 y50Var = this.OooO0Oo;
        Log.e(y50Var.OooO0o, "onAdLoaded: ");
        wa1 wa1VarOooO0o0 = wa1.OooO0o0(y50Var.OooOO0o);
        h1.OooO00o();
        wa1VarOooO0o0.toString();
        new Date().getTime();
        if (wa1VarOooO0o0.OooO0Oo() && y50Var.OooO0oO == 1) {
            y50Var.OooO0oO = 2;
            y50Var.OooO0o0.OooOO0o(wa1VarOooO0o0);
        }
    }
}
