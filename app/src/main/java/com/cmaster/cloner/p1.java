package com.cmaster.cloner;

import java.io.Closeable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p1 extends jm0 implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO(wl0.ON_PAUSE);
        OooO(wl0.ON_STOP);
        OooO(wl0.ON_DESTROY);
    }
}
