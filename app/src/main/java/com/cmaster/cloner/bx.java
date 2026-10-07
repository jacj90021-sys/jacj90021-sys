package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class bx extends xw implements ip {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooOO0 = AtomicReferenceFieldUpdater.newUpdater(bx.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooOO0O = AtomicReferenceFieldUpdater.newUpdater(bx.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooOO0o = AtomicIntegerFieldUpdater.newUpdater(bx.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public ks OooO0OO(long j, gn1 gn1Var, vj vjVar) {
        return co.OooO00o.OooO0OO(j, gn1Var, vjVar);
    }

    @Override // com.cmaster.cloner.zj
    public final void OooOOOO(vj vjVar, Runnable runnable) {
        OooOo0o(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOo(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.cmaster.cloner.bx.OooOO0
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = com.cmaster.cloner.bx.OooOO0o
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof com.cmaster.cloner.yo0
            if (r4 == 0) goto L47
            r4 = r1
            com.cmaster.cloner.yo0 r4 = (com.cmaster.cloner.yo0) r4
            int r5 = r4.OooO00o(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            com.cmaster.cloner.yo0 r3 = r4.OooO0OO()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            com.cmaster.cloner.uk1 r4 = com.cmaster.cloner.q52.OooO0O0
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            com.cmaster.cloner.yo0 r3 = new com.cmaster.cloner.yo0
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.OooO00o(r4)
            r3.OooO00o(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.bx.OooOo(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r7 = null;
     */
    @Override // com.cmaster.cloner.xw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long OooOo0() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.bx.OooOo0():long");
    }

    public void OooOo0o(Runnable runnable) {
        if (!OooOo(runnable)) {
            bo.OooOOO0.OooOo0o(runnable);
            return;
        }
        Thread threadOooOoO0 = OooOoO0();
        if (Thread.currentThread() != threadOooOoO0) {
            LockSupport.unpark(threadOooOoO0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOoO() {
        /*
            r7 = this;
            com.cmaster.cloner.e3 r0 = r7.OooO0oo
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.cmaster.cloner.bx.OooOO0O
            java.lang.Object r0 = r0.get(r7)
            com.cmaster.cloner.ax r0 = (com.cmaster.cloner.ax) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = com.cmaster.cloner.xm1.OooO0O0
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.cmaster.cloner.bx.OooOO0
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L30
            goto L53
        L30:
            boolean r0 = r7 instanceof com.cmaster.cloner.yo0
            if (r0 == 0) goto L4f
            com.cmaster.cloner.yo0 r7 = (com.cmaster.cloner.yo0) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.cmaster.cloner.yo0.OooO0o
            long r3 = r0.get(r7)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            com.cmaster.cloner.uk1 r0 = com.cmaster.cloner.q52.OooO0O0
            if (r7 != r0) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.bx.OooOoO():boolean");
    }

    public abstract Thread OooOoO0();

    public void OooOoOO(long j, zw zwVar) {
        bo.OooOOO0.OooOoo0(j, zwVar);
    }

    public final void OooOoo0(long j, zw zwVar) {
        int iOooO0O0;
        Thread threadOooOoO0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0O;
        if (OooOO0o.get(this) != 0) {
            iOooO0O0 = 1;
        } else {
            ax axVar = (ax) atomicReferenceFieldUpdater.get(this);
            if (axVar == null) {
                ax axVar2 = new ax();
                axVar2.OooO0OO = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, axVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                axVar = (ax) obj;
            }
            iOooO0O0 = zwVar.OooO0O0(j, axVar, this);
        }
        if (iOooO0O0 != 0) {
            if (iOooO0O0 == 1) {
                OooOoOO(j, zwVar);
                return;
            } else {
                if (iOooO0O0 == 2) {
                    return;
                }
                qa.OooO0o("unexpected result");
                return;
            }
        }
        ax axVar3 = (ax) atomicReferenceFieldUpdater.get(this);
        if (axVar3 != null) {
            synchronized (axVar3) {
                zw[] zwVarArr = axVar3.OooO00o;
                zwVar = zwVarArr != null ? zwVarArr[0] : null;
            }
        }
        if (zwVar != zwVar || Thread.currentThread() == (threadOooOoO0 = OooOoO0())) {
            return;
        }
        LockSupport.unpark(threadOooOoO0);
    }

    @Override // com.cmaster.cloner.xw
    public void shutdown() {
        zw zwVarOooO0O0;
        vm1.OooO00o.set(null);
        OooOO0o.set(this, 1);
        uk1 uk1Var = q52.OooO0O0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof yo0)) {
                    if (obj != uk1Var) {
                        yo0 yo0Var = new yo0(8, true);
                        yo0Var.OooO00o((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, yo0Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((yo0) obj).OooO0O0();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, uk1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (OooOo0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            ax axVar = (ax) OooOO0O.get(this);
            if (axVar == null) {
                return;
            }
            synchronized (axVar) {
                zwVarOooO0O0 = xm1.OooO0O0.get(axVar) > 0 ? axVar.OooO0O0(0) : null;
            }
            if (zwVarOooO0O0 == null) {
                return;
            } else {
                OooOoOO(jNanoTime, zwVarOooO0O0);
            }
        }
    }
}
