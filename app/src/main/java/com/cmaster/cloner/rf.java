package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class rf {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(rf.class, "_handled$volatile");
    public final Throwable OooO00o;
    private volatile /* synthetic */ int _handled$volatile;

    public rf(boolean z, Throwable th) {
        this.OooO00o = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.OooO00o + ']';
    }
}
