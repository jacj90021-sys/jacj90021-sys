package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class re1 extends me1 {
    public final /* synthetic */ AtomicReferenceArray OooO0o0;

    public re1(long j, re1 re1Var, int i) {
        super(j, re1Var, i);
        this.OooO0o0 = new AtomicReferenceArray(qe1.OooO0o);
    }

    @Override // com.cmaster.cloner.me1
    public final int OooO0Oo() {
        return qe1.OooO0o;
    }

    @Override // com.cmaster.cloner.me1
    public final void OooO0o0(int i) {
        this.OooO0o0.set(i, qe1.OooO0o0);
        if (me1.OooO0Oo.incrementAndGet(this) == qe1.OooO0o) {
            OooO0O0();
        }
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.OooO0OO + ", hashCode=" + hashCode() + ']';
    }
}
