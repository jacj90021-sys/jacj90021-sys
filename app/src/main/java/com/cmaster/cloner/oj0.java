package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oj0 extends dk0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO = AtomicIntegerFieldUpdater.newUpdater(oj0.class, "_invoked$volatile");
    public final fj0 OooO0oo;
    private volatile /* synthetic */ int _invoked$volatile;

    public oj0(fj0 fj0Var) {
        this.OooO0oo = fj0Var;
    }

    @Override // com.cmaster.cloner.fj0
    public final void OooO0o0(Throwable th) {
        if (OooO.compareAndSet(this, 0, 1)) {
            this.OooO0oo.OooO0o0(th);
        }
    }
}
