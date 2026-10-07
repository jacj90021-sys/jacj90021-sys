package com.cmaster.cloner;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class du0 implements Closeable, gm0 {
    public static final o0O000O OooO0oo = new o0O000O("MobileVisionBase", "");
    public final AtomicBoolean OooO0Oo = new AtomicBoolean(false);
    public final jb OooO0o;
    public final ex2 OooO0o0;
    public final Executor OooO0oO;

    public du0(ex2 ex2Var, Executor executor) {
        this.OooO0o0 = ex2Var;
        jb jbVar = new jb();
        this.OooO0o = jbVar;
        this.OooO0oO = executor;
        ex2Var.OooO0O0.incrementAndGet();
        ac3 ac3VarOooO00o = ex2Var.OooO00o(executor, a72.OooO0o0, jbVar.OooO00o);
        s60 s60Var = s60.OooO0o;
        ac3VarOooO00o.getClass();
        ac3VarOooO00o.OooO00o(am1.OooO00o, s60Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @gz0(wl0.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.OooO0Oo.getAndSet(true)) {
            return;
        }
        this.OooO0o.OooO00o();
        ex2 ex2Var = this.OooO0o0;
        Executor executor = this.OooO0oO;
        boolean z2 = false;
        if (ex2Var.OooO0O0.get() <= 0) {
            z = false;
        }
        by2.OooOO0O(z);
        ex2Var.OooO00o.OooO0Oo(new bf1(ex2Var, new yl1(), 26, z2), executor);
    }
}
