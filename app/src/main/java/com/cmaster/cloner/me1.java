package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class me1 extends vg implements ex0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0Oo = AtomicIntegerFieldUpdater.newUpdater(me1.class, "cleanedAndPointers$volatile");
    public final long OooO0OO;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public me1(long j, re1 re1Var, int i) {
        super(re1Var);
        this.OooO0OO = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // com.cmaster.cloner.vg
    public final boolean OooO00o() {
        if (OooO0Oo.get(this) != OooO0Oo()) {
            return false;
        }
        Object obj = vg.OooO00o.get(this);
        return (obj == r80.OooO00o ? null : (vg) obj) != null;
    }

    public final boolean OooO0OO() {
        if (OooO0Oo.addAndGet(this, -65536) != OooO0Oo()) {
            return false;
        }
        Object obj = vg.OooO00o.get(this);
        return (obj == r80.OooO00o ? null : (vg) obj) != null;
    }

    public abstract int OooO0Oo();

    public final boolean OooO0o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = OooO0Oo;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == OooO0Oo()) {
                Object obj = vg.OooO00o.get(this);
                if ((obj == r80.OooO00o ? null : (vg) obj) != null) {
                    return false;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public abstract void OooO0o0(int i);
}
