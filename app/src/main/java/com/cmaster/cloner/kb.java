package com.cmaster.cloner;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kb extends rf {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0OO = AtomicIntegerFieldUpdater.newUpdater(kb.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public kb(gb gbVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + gbVar + " was cancelled normally");
        }
        super(z, th);
        this._resumed$volatile = 0;
    }
}
