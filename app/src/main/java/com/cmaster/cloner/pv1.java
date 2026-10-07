package com.cmaster.cloner;

import java.util.TimerTask;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pv1 extends TimerTask {
    public final /* synthetic */ qv1 OooO0Oo;

    public pv1(qv1 qv1Var) {
        this.OooO0Oo = qv1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        qv1 qv1Var = this.OooO0Oo;
        qv1Var.OooOOO = qv1Var.OooOOO0;
        qv1Var.OooOOO0 = 0;
    }
}
