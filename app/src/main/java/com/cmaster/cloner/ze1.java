package com.cmaster.cloner;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ze1 implements Executor {
    public static final ThreadLocal OooO0oo = new ThreadLocal();
    public Runnable OooO0o;
    public final int OooO0o0;
    public final ArrayDeque OooO0Oo = new ArrayDeque();
    public final AtomicInteger OooO0oO = new AtomicInteger();

    public ze1(int i) {
        this.OooO0o0 = i;
    }

    public Executor OooO00o() {
        return cx1.OooO00o;
    }

    public final synchronized void OooO0O0() {
        while (this.OooO0oO.get() < this.OooO0o0) {
            Runnable runnable = (Runnable) this.OooO0Oo.poll();
            this.OooO0o = runnable;
            if (runnable == null) {
                break;
            }
            this.OooO0oO.addAndGet(1);
            OooO00o().execute(this.OooO0o);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.OooO0Oo.offer(new pi2((Object) this, (Object) runnable, 27, false));
        if (this.OooO0o == null) {
            OooO0O0();
        }
    }
}
