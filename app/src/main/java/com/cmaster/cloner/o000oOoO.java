package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o000oOoO extends dl2 {
    public final AtomicReferenceFieldUpdater OooO00o;
    public final AtomicReferenceFieldUpdater OooO0O0;
    public final AtomicReferenceFieldUpdater OooO0OO;
    public final AtomicReferenceFieldUpdater OooO0Oo;
    public final AtomicReferenceFieldUpdater OooO0o0;

    public o000oOoO(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.OooO00o = atomicReferenceFieldUpdater;
        this.OooO0O0 = atomicReferenceFieldUpdater2;
        this.OooO0OO = atomicReferenceFieldUpdater3;
        this.OooO0Oo = atomicReferenceFieldUpdater4;
        this.OooO0o0 = atomicReferenceFieldUpdater5;
    }

    @Override // com.cmaster.cloner.dl2
    public final boolean OooO00o(o00Ooo o00ooo, Oooo0 oooo0, Oooo0 oooo02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.OooO0Oo;
            if (atomicReferenceFieldUpdater.compareAndSet(o00ooo, oooo0, oooo02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o00ooo) == oooo0);
        return false;
    }

    @Override // com.cmaster.cloner.dl2
    public final boolean OooO0O0(o00Ooo o00ooo, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.OooO0o0;
            if (atomicReferenceFieldUpdater.compareAndSet(o00ooo, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o00ooo) == obj);
        return false;
    }

    @Override // com.cmaster.cloner.dl2
    public final boolean OooO0OO(o00Ooo o00ooo, o00Oo0 o00oo0, o00Oo0 o00oo02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.OooO0OO;
            if (atomicReferenceFieldUpdater.compareAndSet(o00ooo, o00oo0, o00oo02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(o00ooo) == o00oo0);
        return false;
    }

    @Override // com.cmaster.cloner.dl2
    public final void OooO0Oo(o00Oo0 o00oo0, o00Oo0 o00oo02) {
        this.OooO0O0.lazySet(o00oo0, o00oo02);
    }

    @Override // com.cmaster.cloner.dl2
    public final void OooO0o0(o00Oo0 o00oo0, Thread thread) {
        this.OooO00o.lazySet(o00oo0, thread);
    }
}
