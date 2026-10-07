package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fh2 extends w73 {
    public final AtomicReferenceFieldUpdater OooO00o;
    public final AtomicReferenceFieldUpdater OooO0O0;
    public final AtomicReferenceFieldUpdater OooO0OO;
    public final AtomicReferenceFieldUpdater OooO0Oo;
    public final AtomicReferenceFieldUpdater OooO0o0;

    public fh2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.OooO00o = atomicReferenceFieldUpdater;
        this.OooO0O0 = atomicReferenceFieldUpdater2;
        this.OooO0OO = atomicReferenceFieldUpdater3;
        this.OooO0Oo = atomicReferenceFieldUpdater4;
        this.OooO0o0 = atomicReferenceFieldUpdater5;
    }

    @Override // com.cmaster.cloner.w73
    public final eh2 OooO00o(lh2 lh2Var) {
        return (eh2) this.OooO0Oo.getAndSet(lh2Var, eh2.OooO0Oo);
    }

    @Override // com.cmaster.cloner.w73
    public final kh2 OooO0O0(lh2 lh2Var) {
        return (kh2) this.OooO0OO.getAndSet(lh2Var, kh2.OooO0OO);
    }

    @Override // com.cmaster.cloner.w73
    public final void OooO0OO(kh2 kh2Var, kh2 kh2Var2) {
        this.OooO0O0.lazySet(kh2Var, kh2Var2);
    }

    @Override // com.cmaster.cloner.w73
    public final void OooO0Oo(kh2 kh2Var, Thread thread) {
        this.OooO00o.lazySet(kh2Var, thread);
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0o(lh2 lh2Var, Object obj, Object obj2) {
        return x73.OooO00o(this.OooO0o0, lh2Var, obj, obj2);
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0o0(lh2 lh2Var, eh2 eh2Var, eh2 eh2Var2) {
        return x73.OooO00o(this.OooO0Oo, lh2Var, eh2Var, eh2Var2);
    }

    @Override // com.cmaster.cloner.w73
    public final boolean OooO0oO(lh2 lh2Var, kh2 kh2Var, kh2 kh2Var2) {
        return x73.OooO00o(this.OooO0OO, lh2Var, kh2Var, kh2Var2);
    }
}
