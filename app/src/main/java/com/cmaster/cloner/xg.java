package com.cmaster.cloner;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xg implements ThreadFactory {
    public final AtomicInteger OooO00o = new AtomicInteger(0);
    public final /* synthetic */ boolean OooO0O0;

    public xg(boolean z) {
        this.OooO0O0 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbOooOO0 = rj.OooOO0(this.OooO0O0 ? "WM.task-" : "androidx.work-");
        sbOooOO0.append(this.OooO00o.incrementAndGet());
        return new Thread(runnable, sbOooOO0.toString());
    }
}
