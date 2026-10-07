package com.cmaster.cloner;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o8 extends OooOOO {
    public final Thread OooO0oO;
    public final xw OooO0oo;

    public o8(vj vjVar, Thread thread, xw xwVar) {
        super(vjVar, true);
        this.OooO0oO = thread;
        this.OooO0oo = xwVar;
    }

    @Override // com.cmaster.cloner.nk0
    public final void OooO0oO(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.OooO0oO;
        if (ij0.OooO00o(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
