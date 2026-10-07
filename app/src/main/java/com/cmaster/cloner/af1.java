package com.cmaster.cloner;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class af1 implements Executor {
    public final ArrayDeque OooO0Oo = new ArrayDeque();
    public final Object OooO0o = new Object();
    public final Executor OooO0o0;
    public volatile Runnable OooO0oO;

    public af1(Executor executor) {
        this.OooO0o0 = executor;
    }

    public final void OooO00o() {
        synchronized (this.OooO0o) {
            try {
                Runnable runnable = (Runnable) this.OooO0Oo.poll();
                this.OooO0oO = runnable;
                if (runnable != null) {
                    this.OooO0o0.execute(this.OooO0oO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.OooO0o) {
            try {
                this.OooO0Oo.add(new pi2(this, runnable, 29));
                if (this.OooO0oO == null) {
                    OooO00o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
