package com.cmaster.cloner;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bo extends bx implements Runnable {
    public static final long OooOOO;
    public static final bo OooOOO0;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        bo boVar = new bo();
        OooOOO0 = boVar;
        boVar.OooOo00(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        OooOOO = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // com.cmaster.cloner.bx, com.cmaster.cloner.ip
    public final ks OooO0OO(long j, gn1 gn1Var, vj vjVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return cx0.OooO0Oo;
        }
        long jNanoTime = System.nanoTime();
        yw ywVar = new yw(j2 + jNanoTime, gn1Var);
        OooOoo0(jNanoTime, ywVar);
        return ywVar;
    }

    @Override // com.cmaster.cloner.bx
    public final void OooOo0o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.OooOo0o(runnable);
    }

    @Override // com.cmaster.cloner.bx
    public final Thread OooOoO0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(bo.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // com.cmaster.cloner.bx
    public final void OooOoOO(long j, zw zwVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void OooOoo() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            bx.OooOO0.set(this, null);
            bx.OooOO0O.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zOooOoO;
        vm1.OooO00o.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zOooOoO) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jOooOo0 = OooOo0();
                    if (jOooOo0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = OooOOO + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            OooOoo();
                            if (OooOoO()) {
                                return;
                            }
                            OooOoO0();
                            return;
                        }
                        if (jOooOo0 > j2) {
                            jOooOo0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jOooOo0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            OooOoo();
                            if (OooOoO()) {
                                return;
                            }
                            OooOoO0();
                            return;
                        }
                        LockSupport.parkNanos(this, jOooOo0);
                    }
                }
            }
        } finally {
            _thread = null;
            OooOoo();
            if (!OooOoO()) {
                OooOoO0();
            }
        }
    }

    @Override // com.cmaster.cloner.bx, com.cmaster.cloner.xw
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
