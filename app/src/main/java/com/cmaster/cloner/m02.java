package com.cmaster.cloner;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m02 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ n02 OooO0o;
    public final /* synthetic */ uf1 OooO0o0;

    public /* synthetic */ m02(n02 n02Var, uf1 uf1Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o = n02Var;
        this.OooO0o0 = uf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        uf1 uf1Var = this.OooO0o0;
        n02 n02Var = this.OooO0o;
        switch (i) {
            case 0:
                uf1Var.OooOO0(n02Var.OooO0oO.getForegroundInfoAsync());
                return;
            default:
                uf1 uf1Var2 = n02Var.OooO0Oo;
                ListenableWorker listenableWorker = n02Var.OooO0oO;
                w02 w02Var = n02Var.OooO0o;
                try {
                    e10 e10Var = (e10) uf1Var.get();
                    if (e10Var == null) {
                        throw new IllegalStateException("Worker was marked important (" + w02Var.OooO0OO + ") but did not provide ForegroundInfo");
                    }
                    ep0.OooO0oO().OooO0Oo(n02.OooOO0, "Updating notification for " + w02Var.OooO0OO, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    p02 p02Var = n02Var.OooO0oo;
                    Context context = n02Var.OooO0o0;
                    UUID id = listenableWorker.getId();
                    p02Var.getClass();
                    uf1 uf1Var3 = new uf1();
                    ((hx2) p02Var.OooO00o).OooOOOo(new o02(p02Var, uf1Var3, id, e10Var, context));
                    uf1Var2.OooOO0(uf1Var3);
                    return;
                } catch (Throwable th) {
                    uf1Var2.OooO(th);
                    return;
                }
        }
    }
}
