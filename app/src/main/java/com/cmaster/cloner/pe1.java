package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class pe1 {
    public final int OooO0Oo;
    public final lv0 OooO0o0;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0o = AtomicReferenceFieldUpdater.newUpdater(pe1.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater OooO0oO = AtomicLongFieldUpdater.newUpdater(pe1.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0oo = AtomicReferenceFieldUpdater.newUpdater(pe1.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater OooO = AtomicLongFieldUpdater.newUpdater(pe1.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooOO0 = AtomicIntegerFieldUpdater.newUpdater(pe1.class, "_availablePermits$volatile");

    public pe1(int i) {
        this.OooO0Oo = i;
        if (i <= 0) {
            sa.OooO0OO(px0.OooOOO(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i < 0) {
            sa.OooO0OO(px0.OooOOO(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        re1 re1Var = new re1(0L, null, 2);
        this.head$volatile = re1Var;
        this.tail$volatile = re1Var;
        this._availablePermits$volatile = i;
        this.OooO0o0 = new lv0(this);
    }

    public final boolean OooO00o(wx1 wx1Var) {
        Object objOooO00o;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0oo;
        re1 re1Var = (re1) atomicReferenceFieldUpdater.get(this);
        long andIncrement = OooO.getAndIncrement(this);
        ne1 ne1Var = ne1.OooOO0o;
        long j = andIncrement / qe1.OooO0o;
        loop0: while (true) {
            objOooO00o = r80.OooO00o(re1Var, j, ne1Var);
            if (objOooO00o != r80.OooO00o) {
                me1 me1VarOooO00o = a43.OooO00o(objOooO00o);
                while (true) {
                    me1 me1Var = (me1) atomicReferenceFieldUpdater.get(this);
                    if (me1Var.OooO0OO >= me1VarOooO00o.OooO0OO) {
                        break loop0;
                    }
                    if (!me1VarOooO00o.OooO0o()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, me1Var, me1VarOooO00o)) {
                        if (atomicReferenceFieldUpdater.get(this) != me1Var) {
                            if (me1VarOooO00o.OooO0OO()) {
                                me1VarOooO00o.OooO0O0();
                            }
                        }
                    }
                    if (me1Var.OooO0OO()) {
                        me1Var.OooO0O0();
                    }
                }
            } else {
                break;
            }
        }
        re1 re1Var2 = (re1) a43.OooO00o(objOooO00o);
        AtomicReferenceArray atomicReferenceArray = re1Var2.OooO0o0;
        int i = (int) (andIncrement % qe1.OooO0o);
        while (!atomicReferenceArray.compareAndSet(i, null, wx1Var)) {
            if (atomicReferenceArray.get(i) != null) {
                uk1 uk1Var = qe1.OooO0O0;
                uk1 uk1Var2 = qe1.OooO0OO;
                while (!atomicReferenceArray.compareAndSet(i, uk1Var, uk1Var2)) {
                    if (atomicReferenceArray.get(i) != uk1Var) {
                        return false;
                    }
                }
                ((fb) wx1Var).OooO0o0(this.OooO0o0);
                return true;
            }
        }
        wx1Var.OooO00o(re1Var2, i);
        return true;
    }

    public final void OooO0O0() {
        int i;
        Object objOooO00o;
        boolean z;
        re1 re1Var;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = OooOO0;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.OooO0Oo;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0o;
            re1 re1Var2 = (re1) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = OooO0oO.getAndIncrement(this);
            long j = andIncrement2 / qe1.OooO0o;
            oe1 oe1Var = oe1.OooOO0o;
            while (true) {
                objOooO00o = r80.OooO00o(re1Var2, j, oe1Var);
                if (objOooO00o == r80.OooO00o) {
                    break;
                }
                me1 me1VarOooO00o = a43.OooO00o(objOooO00o);
                while (true) {
                    me1 me1Var = (me1) atomicReferenceFieldUpdater.get(this);
                    re1Var = re1Var2;
                    if (me1Var.OooO0OO >= me1VarOooO00o.OooO0OO) {
                        break;
                    }
                    if (!me1VarOooO00o.OooO0o()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, me1Var, me1VarOooO00o)) {
                        if (atomicReferenceFieldUpdater.get(this) != me1Var) {
                            if (me1VarOooO00o.OooO0OO()) {
                                me1VarOooO00o.OooO0O0();
                            }
                            re1Var2 = re1Var;
                        }
                    }
                    if (me1Var.OooO0OO()) {
                        me1Var.OooO0O0();
                    }
                }
                re1Var2 = re1Var;
            }
            re1 re1Var3 = (re1) a43.OooO00o(objOooO00o);
            AtomicReferenceArray atomicReferenceArray = re1Var3.OooO0o0;
            vg.OooO0O0.set(re1Var3, null);
            z = false;
            if (re1Var3.OooO0OO <= j) {
                int i3 = (int) (andIncrement2 % qe1.OooO0o);
                Object andSet = atomicReferenceArray.getAndSet(i3, qe1.OooO0O0);
                if (andSet == null) {
                    int i4 = qe1.OooO00o;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == qe1.OooO0OO) {
                            z = true;
                            break;
                        }
                    }
                    uk1 uk1Var = qe1.OooO0O0;
                    uk1 uk1Var2 = qe1.OooO0Oo;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, uk1Var, uk1Var2)) {
                            if (atomicReferenceArray.get(i3) != uk1Var) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != qe1.OooO0o0) {
                    if (!(andSet instanceof fb)) {
                        qa.OooO0Oo(andSet, "unexpected: ");
                        return;
                    }
                    fb fbVar = (fb) andSet;
                    uk1 uk1VarOooOO0 = fbVar.OooOO0(this.OooO0o0);
                    if (uk1VarOooOO0 != null) {
                        fbVar.OooOO0O(uk1VarOooOO0);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
