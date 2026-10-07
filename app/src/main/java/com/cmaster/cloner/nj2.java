package com.cmaster.cloner;

import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nj2 extends lh2 implements RunnableFuture, jj2 {
    public volatile mj2 OooOO0O;

    @Override // com.cmaster.cloner.lh2
    public final String OooO00o() {
        mj2 mj2Var = this.OooOO0O;
        return mj2Var != null ? px0.OooOOOO("task=[", mj2Var.toString(), "]") : super.OooO00o();
    }

    @Override // com.cmaster.cloner.lh2
    public final void OooO0O0() {
        mj2 mj2Var;
        Object obj = this.OooO0Oo;
        if ((obj instanceof ch2) && ((ch2) obj).OooO00o && (mj2Var = this.OooOO0O) != null) {
            oOOoOOO0 ooooooo0 = mj2.OooO0oO;
            oOOoOOO0 ooooooo02 = mj2.OooO0o;
            Runnable runnable = (Runnable) mj2Var.get();
            if (runnable instanceof Thread) {
                bj2 bj2Var = new bj2(mj2Var);
                bj2Var.setExclusiveOwnerThread(Thread.currentThread());
                if (mj2Var.compareAndSet(runnable, bj2Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) mj2Var.getAndSet(ooooooo02)) == ooooooo0) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) mj2Var.getAndSet(ooooooo02)) == ooooooo0) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.OooOO0O = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        mj2 mj2Var = this.OooOO0O;
        if (mj2Var != null) {
            mj2Var.run();
        }
        this.OooOO0O = null;
    }
}
