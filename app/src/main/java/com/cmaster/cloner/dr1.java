package com.cmaster.cloner;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr1 implements Runnable {
    public final yn1 OooO0Oo;
    public final int OooO0o;
    public final g5 OooO0o0;
    public final Runnable OooO0oO;

    public dr1(yn1 yn1Var, g5 g5Var, int i, Runnable runnable) {
        this.OooO0Oo = yn1Var;
        this.OooO0o0 = g5Var;
        this.OooO0o = i;
        this.OooO0oO = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yn1 yn1Var = this.OooO0Oo;
        qc1 qc1Var = (qc1) yn1Var.OooO;
        g5 g5Var = this.OooO0o0;
        int i = this.OooO0o;
        Runnable runnable = this.OooO0oO;
        try {
            try {
                qc1 qc1Var2 = (qc1) yn1Var.OooO0Oo;
                qc1Var2.getClass();
                qc1Var.OooO(new na1(qc1Var2, 5));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) yn1Var.OooO0o0).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    qc1Var.OooO(new o00Oo00(yn1Var, g5Var, i, 6));
                } else {
                    yn1Var.OooO0O0(g5Var, i);
                }
                runnable.run();
            } catch (al1 unused) {
                ((a02) yn1Var.OooO0oO).OoooO00(g5Var, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
