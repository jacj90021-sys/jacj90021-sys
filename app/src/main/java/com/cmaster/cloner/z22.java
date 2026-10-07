package com.cmaster.cloner;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z22 implements ThreadFactory {
    public final AtomicInteger OooO00o = new AtomicInteger(1);
    public final /* synthetic */ String OooO0O0;

    public z22(String str) {
        this.OooO0O0 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.OooO0O0 + ") #" + this.OooO00o.getAndIncrement());
    }
}
