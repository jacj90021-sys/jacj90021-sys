package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yw extends zw {
    public final gn1 OooO0o;

    public yw(long j, gn1 gn1Var) {
        this.OooO0Oo = j;
        this.OooO0o0 = -1;
        this.OooO0o = gn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.OooO0o.run();
    }

    @Override // com.cmaster.cloner.zw
    public final String toString() {
        return super.toString() + this.OooO0o;
    }
}
