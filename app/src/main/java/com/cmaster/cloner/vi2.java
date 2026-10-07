package com.cmaster.cloner;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vi2 implements jj2 {
    public final Float OooO0Oo;

    static {
        new gj2(vi2.class);
    }

    public vi2(Float f) {
        this.OooO0Oo = f;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.OooO0Oo;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.OooO0Oo.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.OooO0Oo;
    }
}
