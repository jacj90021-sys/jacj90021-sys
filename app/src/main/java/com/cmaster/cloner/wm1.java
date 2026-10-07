package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wm1 implements uj {
    public final ThreadLocal OooO0Oo;

    public wm1(ThreadLocal threadLocal) {
        this.OooO0Oo = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm1) && ij0.OooO00o(this.OooO0Oo, ((wm1) obj).OooO0Oo);
    }

    public final int hashCode() {
        return this.OooO0Oo.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.OooO0Oo + ')';
    }
}
