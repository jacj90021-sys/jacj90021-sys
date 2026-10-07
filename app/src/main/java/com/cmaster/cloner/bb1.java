package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bb1 implements Serializable {
    public final Throwable OooO0Oo;

    public bb1(Throwable th) {
        th.getClass();
        this.OooO0Oo = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bb1) {
            return ij0.OooO00o(this.OooO0Oo, ((bb1) obj).OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0Oo.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.OooO0Oo + ')';
    }
}
