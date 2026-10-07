package com.cmaster.cloner;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oo000000 implements Executor {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public final Object OooO0o0;
    public final Object OooO0oO;
    public final Object OooO0oo;

    public oo000000(Executor executor) {
        this.OooO0Oo = 1;
        executor.getClass();
        this.OooO0oo = executor;
        this.OooO0o0 = new ArrayDeque();
        this.OooO0oO = new Object();
    }

    public void OooO00o() {
        switch (this.OooO0Oo) {
            case 0:
                synchronized (this.OooO0oO) {
                    try {
                        Runnable runnable = (Runnable) ((ArrayDeque) this.OooO0o0).poll();
                        this.OooO0o = runnable;
                        if (runnable != null) {
                            ((oo00) this.OooO0oo).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.OooO0oO) {
                    Object objPoll = ((ArrayDeque) this.OooO0o0).poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.OooO0o = runnable2;
                    if (objPoll != null) {
                        ((Executor) this.OooO0oo).execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.OooO0Oo) {
            case 0:
                synchronized (this.OooO0oO) {
                    try {
                        ((ArrayDeque) this.OooO0o0).add(new oO000o00(this, runnable, 1));
                        if (((Runnable) this.OooO0o) == null) {
                            OooO00o();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.OooO0oO) {
                    ((ArrayDeque) this.OooO0o0).offer(new oO000o00(runnable, this, 8));
                    if (((Runnable) this.OooO0o) == null) {
                        OooO00o();
                    }
                }
                return;
            default:
                try {
                    ((Executor) this.OooO0oO).execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((ac3) ((na1) this.OooO0o0).OooO0o0).OooO0o0()) {
                        ((jb) this.OooO0oo).OooO00o();
                    } else {
                        ((yl1) this.OooO0o).OooO00o(e);
                    }
                    throw e;
                }
        }
    }

    public /* synthetic */ oo000000(Executor executor, na1 na1Var, jb jbVar, yl1 yl1Var) {
        this.OooO0Oo = 2;
        this.OooO0oO = executor;
        this.OooO0o0 = na1Var;
        this.OooO0oo = jbVar;
        this.OooO0o = yl1Var;
    }

    public oo000000(oo00 oo00Var) {
        this.OooO0Oo = 0;
        this.OooO0oO = new Object();
        this.OooO0o0 = new ArrayDeque();
        this.OooO0oo = oo00Var;
    }
}
