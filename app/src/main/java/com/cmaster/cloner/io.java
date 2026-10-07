package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class io extends ix implements Executor {
    public static final io OooO0o = new io();
    public static final zj OooO0oO;

    static {
        zj nm0Var = yq1.OooO0o;
        int i = kl1.OooO00o;
        if (64 >= i) {
            i = 64;
        }
        int iOooO0O0 = g43.OooO0O0(i, 12, "kotlinx.coroutines.io.parallelism");
        nm0Var.getClass();
        jv2.OooO00o(iOooO0O0);
        if (iOooO0O0 < fm1.OooO0Oo) {
            jv2.OooO00o(iOooO0O0);
            nm0Var = new nm0(nm0Var, iOooO0O0);
        }
        OooO0oO = nm0Var;
    }

    @Override // com.cmaster.cloner.zj
    public final void OooOOOO(vj vjVar, Runnable runnable) {
        OooO0oO.OooOOOO(vjVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooOOOO(lv.OooO0Oo, runnable);
    }

    @Override // com.cmaster.cloner.zj
    public final String toString() {
        return "Dispatchers.IO";
    }
}
