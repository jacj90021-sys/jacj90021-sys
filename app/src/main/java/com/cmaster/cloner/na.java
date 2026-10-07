package com.cmaster.cloner;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class na implements nn0 {
    public final WeakReference OooO0Oo;
    public final ma OooO0o0 = new ma(this);

    public na(la laVar) {
        this.OooO0Oo = new WeakReference(laVar);
    }

    @Override // com.cmaster.cloner.nn0
    public final void addListener(Runnable runnable, Executor executor) {
        this.OooO0o0.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        la laVar = (la) this.OooO0Oo.get();
        boolean zCancel = this.OooO0o0.cancel(z);
        if (zCancel && laVar != null) {
            laVar.OooO00o = null;
            laVar.OooO0O0 = null;
            laVar.OooO0OO.OooO(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.OooO0o0.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.OooO0o0.OooO0Oo instanceof o0O0O00;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.OooO0o0.isDone();
    }

    public final String toString() {
        return this.OooO0o0.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.OooO0o0.get(j, timeUnit);
    }
}
