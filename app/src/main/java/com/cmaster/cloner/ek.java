package com.cmaster.cloner;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ek implements Executor, Closeable {
    public final t50 OooO;
    public final int OooO0Oo;
    public final long OooO0o;
    public final int OooO0o0;
    public final String OooO0oO;
    public final t50 OooO0oo;
    public final ba1 OooOO0;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater OooOO0O = AtomicLongFieldUpdater.newUpdater(ek.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater OooOO0o = AtomicLongFieldUpdater.newUpdater(ek.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooOOO0 = AtomicIntegerFieldUpdater.newUpdater(ek.class, "_isTerminated$volatile");
    public static final uk1 OooOOO = new uk1("NOT_IN_STACK", 0);

    public ek(int i, int i2, long j, String str) {
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = j;
        this.OooO0oO = str;
        if (i < 1) {
            sa.OooO0OO(rj.OooO00o(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            sa.OooO0OO(px0.OooOOO0(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            sa.OooO0OO(rj.OooO00o(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.OooO0oo = new t50();
        this.OooO = new t50();
        this.OooOO0 = new ba1((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public final boolean OooO(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.OooO0Oo;
        if (i < i2) {
            int iOooO0OO = OooO0OO();
            if (iOooO0OO == 1 && i2 > 1) {
                OooO0OO();
            }
            if (iOooO0OO > 0) {
                return true;
            }
        }
        return false;
    }

    public final int OooO0OO() {
        synchronized (this.OooOO0) {
            try {
                if (OooOOO0.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = OooOO0o;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.OooO0Oo) {
                    return 0;
                }
                if (i >= this.OooO0o0) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.OooOO0.OooO0O0(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ck ckVar = new ck(this, i3);
                this.OooOO0.OooO0OO(i3, ckVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                ckVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o(Runnable runnable, ep0 ep0Var) {
        wl1 bm1Var;
        dk dkVar;
        fm1.OooO0o.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof wl1) {
            bm1Var = (wl1) runnable;
            bm1Var.OooO0Oo = jNanoTime;
            bm1Var.OooO0o0 = ep0Var;
        } else {
            bm1Var = new bm1(runnable, jNanoTime, ep0Var);
        }
        boolean z = bm1Var.OooO0o0.OooO0Oo == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = OooOO0o;
        long jAddAndGet = z ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        ck ckVar = threadCurrentThread instanceof ck ? (ck) threadCurrentThread : null;
        if (ckVar == null || ckVar.OooOO0O != this) {
            ckVar = null;
        }
        if (ckVar != null && (dkVar = ckVar.OooO0o) != dk.OooO0oo && (bm1Var.OooO0o0.OooO0Oo != 0 || dkVar != dk.OooO0o0)) {
            ckVar.OooOO0 = true;
            u02 u02Var = ckVar.OooO0Oo;
            u02Var.getClass();
            bm1Var = (wl1) u02.OooO0O0.getAndSet(u02Var, bm1Var);
            if (bm1Var == null) {
                bm1Var = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = u02Var.OooO00o;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = u02.OooO0OO;
                if (atomicIntegerFieldUpdater.get(u02Var) - u02.OooO0Oo.get(u02Var) != 127) {
                    if (bm1Var.OooO0o0.OooO0Oo == 1) {
                        u02.OooO0o0.incrementAndGet(u02Var);
                    }
                    int i = atomicIntegerFieldUpdater.get(u02Var) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, bm1Var);
                    atomicIntegerFieldUpdater.incrementAndGet(u02Var);
                    bm1Var = null;
                }
            }
        }
        if (bm1Var != null) {
            if (!(bm1Var.OooO0o0.OooO0Oo == 1 ? this.OooO.OooO00o(bm1Var) : this.OooO0oo.OooO00o(bm1Var))) {
                throw new RejectedExecutionException(rj.OooO0oO(new StringBuilder(), this.OooO0oO, " was terminated"));
            }
        }
        if (z) {
            if (OooOOO() || OooO(jAddAndGet)) {
                return;
            }
            OooOOO();
            return;
        }
        if (OooOOO() || OooO(atomicLongFieldUpdater.get(this))) {
            return;
        }
        OooOOO();
    }

    public final void OooO0oo(ck ckVar, int i, int i2) {
        while (true) {
            long j = OooOO0O.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objOooO0OO = ckVar.OooO0OO();
                    while (true) {
                        if (objOooO0OO == OooOOO) {
                            i3 = -1;
                            break;
                        }
                        if (objOooO0OO == null) {
                            i3 = 0;
                            break;
                        }
                        ck ckVar2 = (ck) objOooO0OO;
                        int iOooO0O0 = ckVar2.OooO0O0();
                        if (iOooO0O0 != 0) {
                            i3 = iOooO0O0;
                            break;
                        }
                        objOooO0OO = ckVar2.OooO0OO();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ek ekVar = this;
                if (OooOO0O.compareAndSet(ekVar, j, i3 | j2)) {
                    return;
                } else {
                    this = ekVar;
                }
            }
        }
    }

    public final boolean OooOOO() {
        ek ekVar;
        uk1 uk1Var;
        int iOooO0O0;
        while (true) {
            long j = OooOO0O.get(this);
            ck ckVar = (ck) this.OooOO0.OooO0O0((int) (2097151 & j));
            if (ckVar == null) {
                ckVar = null;
                ekVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objOooO0OO = ckVar.OooO0OO();
                while (true) {
                    uk1Var = OooOOO;
                    if (objOooO0OO == uk1Var) {
                        iOooO0O0 = -1;
                        break;
                    }
                    if (objOooO0OO == null) {
                        iOooO0O0 = 0;
                        break;
                    }
                    ck ckVar2 = (ck) objOooO0OO;
                    iOooO0O0 = ckVar2.OooO0O0();
                    if (iOooO0O0 != 0) {
                        break;
                    }
                    objOooO0OO = ckVar2.OooO0OO();
                    j = j;
                }
                if (iOooO0O0 >= 0) {
                    ek ekVar2 = this;
                    boolean zCompareAndSet = OooOO0O.compareAndSet(ekVar2, j, iOooO0O0 | j2);
                    ekVar = ekVar2;
                    if (zCompareAndSet) {
                        ckVar.OooO0oO(uk1Var);
                    }
                    this = ekVar;
                } else {
                    continue;
                }
            }
            if (ckVar == null) {
                return false;
            }
            if (ck.OooOO0o.compareAndSet(ckVar, -1, 0)) {
                LockSupport.unpark(ckVar);
                return true;
            }
            this = ekVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = com.cmaster.cloner.ek.OooOOO0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof com.cmaster.cloner.ck
            r3 = 0
            if (r1 == 0) goto L17
            com.cmaster.cloner.ck r0 = (com.cmaster.cloner.ck) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1e
            com.cmaster.cloner.ek r1 = r0.OooOO0O
            if (r1 == r8) goto L1f
        L1e:
            r0 = r3
        L1f:
            com.cmaster.cloner.ba1 r1 = r8.OooOO0
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = com.cmaster.cloner.ek.OooOO0o     // Catch: java.lang.Throwable -> Lbe
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lbe
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L73
            r1 = r2
        L31:
            com.cmaster.cloner.ba1 r5 = r8.OooOO0
            java.lang.Object r5 = r5.OooO0O0(r1)
            r5.getClass()
            com.cmaster.cloner.ck r5 = (com.cmaster.cloner.ck) r5
            if (r5 == r0) goto L6e
        L3e:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L3e
        L4f:
            com.cmaster.cloner.u02 r5 = r5.OooO0Oo
            com.cmaster.cloner.t50 r6 = r8.OooO
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = com.cmaster.cloner.u02.OooO0O0
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            com.cmaster.cloner.wl1 r7 = (com.cmaster.cloner.wl1) r7
            if (r7 == 0) goto L63
            r6.OooO00o(r7)
        L63:
            com.cmaster.cloner.wl1 r7 = r5.OooO00o()
            if (r7 != 0) goto L6a
            goto L6e
        L6a:
            r6.OooO00o(r7)
            goto L63
        L6e:
            if (r1 == r4) goto L73
            int r1 = r1 + 1
            goto L31
        L73:
            com.cmaster.cloner.t50 r1 = r8.OooO
            r1.OooO0O0()
            com.cmaster.cloner.t50 r1 = r8.OooO0oo
            r1.OooO0O0()
        L7d:
            if (r0 == 0) goto L85
            com.cmaster.cloner.wl1 r1 = r0.OooO00o(r2)
            if (r1 != 0) goto Lad
        L85:
            com.cmaster.cloner.t50 r1 = r8.OooO0oo
            java.lang.Object r1 = r1.OooO0Oo()
            com.cmaster.cloner.wl1 r1 = (com.cmaster.cloner.wl1) r1
            if (r1 != 0) goto Lad
            com.cmaster.cloner.t50 r1 = r8.OooO
            java.lang.Object r1 = r1.OooO0Oo()
            com.cmaster.cloner.wl1 r1 = (com.cmaster.cloner.wl1) r1
            if (r1 != 0) goto Lad
            if (r0 == 0) goto La0
            com.cmaster.cloner.dk r1 = com.cmaster.cloner.dk.OooO0oo
            r0.OooO0oo(r1)
        La0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.cmaster.cloner.ek.OooOO0O
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.cmaster.cloner.ek.OooOO0o
            r0.set(r8, r1)
            return
        Lad:
            r1.run()     // Catch: java.lang.Throwable -> Lb1
            goto L7d
        Lb1:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7d
        Lbe:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ek.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooO0o(runnable, fm1.OooO0oO);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ba1 ba1Var = this.OooOO0;
        int iOooO00o = ba1Var.OooO00o();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iOooO00o; i6++) {
            ck ckVar = (ck) ba1Var.OooO0O0(i6);
            if (ckVar != null) {
                u02 u02Var = ckVar.OooO0Oo;
                u02Var.getClass();
                int i7 = u02.OooO0O0.get(u02Var) != null ? (u02.OooO0OO.get(u02Var) - u02.OooO0Oo.get(u02Var)) + 1 : u02.OooO0OO.get(u02Var) - u02.OooO0Oo.get(u02Var);
                int iOrdinal = ckVar.OooO0o.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iOrdinal == 4) {
                    i5++;
                }
            }
        }
        long j = OooOO0o.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.OooO0oO);
        sb4.append('@');
        sb4.append(rn.OooO00o(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.OooO0Oo;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.OooO0o0);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.OooO0oo.OooO0OO());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.OooO.OooO0OO());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
