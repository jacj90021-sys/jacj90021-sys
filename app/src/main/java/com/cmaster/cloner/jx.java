package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jx extends ix implements ip {
    public final Executor OooO0o;

    public jx(Executor executor) {
        Method method;
        this.OooO0o = executor;
        Method method2 = ug.OooO00o;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = ug.OooO00o) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.cmaster.cloner.ip
    public final ks OooO0OO(long j, gn1 gn1Var, vj vjVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Executor executor = this.OooO0o;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(gn1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ou2.OooO00o(vjVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new js(scheduledFutureSchedule) : bo.OooOOO0.OooO0OO(j, gn1Var, vjVar);
    }

    @Override // com.cmaster.cloner.zj
    public final void OooOOOO(vj vjVar, Runnable runnable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.OooO0o.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ou2.OooO00o(vjVar, cancellationException);
            gs.OooO0O0.OooOOOO(vjVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.OooO0o;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jx) && ((jx) obj).OooO0o == this.OooO0o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.OooO0o);
    }

    @Override // com.cmaster.cloner.zj
    public final String toString() {
        return this.OooO0o.toString();
    }
}
