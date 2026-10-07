package com.cmaster.cloner;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p50 implements ThreadFactory {
    public final o00OO OooO00o;
    public final String OooO0O0;
    public final iu OooO0OO;
    public final boolean OooO0Oo;
    public final AtomicInteger OooO0o0;

    public p50(o00OO o00oo, String str, boolean z) {
        iu iuVar = iu.OooO0o0;
        this.OooO0o0 = new AtomicInteger();
        this.OooO00o = o00oo;
        this.OooO0O0 = str;
        this.OooO0OO = iuVar;
        this.OooO0Oo = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        pi2 pi2Var = new pi2((Object) this, (Object) runnable, 21, false);
        this.OooO00o.getClass();
        o50 o50Var = new o50(pi2Var);
        o50Var.setName("glide-" + this.OooO0O0 + "-thread-" + this.OooO0o0.getAndIncrement());
        return o50Var;
    }
}
