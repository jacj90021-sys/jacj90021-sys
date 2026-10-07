package com.cmaster.cloner;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mw {
    public final kh1 OooO00o;
    public final Executor OooO0O0;

    public mw(kh1 kh1Var, Executor executor) {
        this.OooO00o = kh1Var;
        this.OooO0O0 = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mw) && this.OooO00o == ((mw) obj).OooO00o;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }
}
