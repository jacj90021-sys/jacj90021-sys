package com.cmaster.cloner;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gd2 implements Executor {
    public final AtomicInteger OooO0Oo = new AtomicInteger(1);
    public WeakReference OooO0o = new WeakReference(null);
    public final ThreadPoolExecutor OooO0o0;

    public gd2() {
        fd2 fd2Var = new fd2(this, 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), fd2Var);
        this.OooO0o0 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.OooO0o.get()) {
            runnable.run();
        } else {
            this.OooO0o0.execute(runnable);
        }
    }
}
