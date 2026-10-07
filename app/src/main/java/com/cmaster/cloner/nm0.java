package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nm0 extends zj implements ip {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooOO0O = AtomicIntegerFieldUpdater.newUpdater(nm0.class, "runningWorkers$volatile");
    public final wo0 OooO;
    public final zj OooO0o;
    public final int OooO0oO;
    public final /* synthetic */ ip OooO0oo;
    public final Object OooOO0;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public nm0(zj zjVar, int i) {
        this.OooO0o = zjVar;
        this.OooO0oO = i;
        ip ipVar = zjVar instanceof ip ? (ip) zjVar : null;
        this.OooO0oo = ipVar == null ? co.OooO00o : ipVar;
        this.OooO = new wo0();
        this.OooOO0 = new Object();
    }

    @Override // com.cmaster.cloner.ip
    public final ks OooO0OO(long j, gn1 gn1Var, vj vjVar) {
        return this.OooO0oo.OooO0OO(j, gn1Var, vjVar);
    }

    @Override // com.cmaster.cloner.zj
    public final void OooOOOO(vj vjVar, Runnable runnable) {
        this.OooO.OooO00o(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = OooOO0O;
        if (atomicIntegerFieldUpdater.get(this) < this.OooO0oO) {
            synchronized (this.OooOO0) {
                if (atomicIntegerFieldUpdater.get(this) >= this.OooO0oO) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableOooOOoo = OooOOoo();
                if (runnableOooOOoo == null) {
                    return;
                }
                this.OooO0o.OooOOOO(this, new pi2((Object) this, (Object) runnableOooOOoo, 24, false));
            }
        }
    }

    public final Runnable OooOOoo() {
        while (true) {
            Runnable runnable = (Runnable) this.OooO.OooO0Oo();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.OooOO0) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = OooOO0O;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.OooO.OooO0OO() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
