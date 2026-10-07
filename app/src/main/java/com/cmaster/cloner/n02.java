package com.cmaster.cloner;

import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n02 implements Runnable {
    public static final String OooOO0 = ep0.OooO("WorkForegroundRunnable");
    public final zl1 OooO;
    public final uf1 OooO0Oo = new uf1();
    public final w02 OooO0o;
    public final Context OooO0o0;
    public final ListenableWorker OooO0oO;
    public final p02 OooO0oo;

    public n02(Context context, w02 w02Var, ListenableWorker listenableWorker, p02 p02Var, hx2 hx2Var) {
        this.OooO0o0 = context;
        this.OooO0o = w02Var;
        this.OooO0oO = listenableWorker;
        this.OooO0oo = p02Var;
        this.OooO = hx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.OooO0o.OooOOo0 || l9.OooO00o()) {
            this.OooO0Oo.OooO0oo(null);
            return;
        }
        uf1 uf1Var = new uf1();
        hx2 hx2Var = (hx2) this.OooO;
        ((yc1) hx2Var.OooO0oO).execute(new m02(this, uf1Var, 0));
        uf1Var.addListener(new m02(this, uf1Var, 1), (yc1) hx2Var.OooO0oO);
    }
}
