package com.cmaster.cloner;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q50 implements ExecutorService, AutoCloseable {
    public static volatile int OooO0o0;
    public final ThreadPoolExecutor OooO0Oo;

    public q50(ThreadPoolExecutor threadPoolExecutor) {
        this.OooO0Oo = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.OooO0Oo.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (threadPoolExecutor = this.OooO0Oo).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.OooO0Oo.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.OooO0Oo.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.OooO0Oo.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.OooO0Oo.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.OooO0Oo.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.OooO0Oo.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.OooO0Oo.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.OooO0Oo.submit(runnable);
    }

    public final String toString() {
        return this.OooO0Oo.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.OooO0Oo.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.OooO0Oo.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.OooO0Oo.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.OooO0Oo.submit(callable);
    }
}
