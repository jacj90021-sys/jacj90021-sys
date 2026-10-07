package com.cmaster.cloner;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ud1 implements Executor {
    public final Executor OooO0Oo;
    public final AtomicBoolean OooO0o0 = new AtomicBoolean();

    public ud1(Executor executor) {
        this.OooO0Oo = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.OooO0o0.get()) {
            return;
        }
        this.OooO0Oo.execute(new oO000o00(this, runnable, 6));
    }
}
