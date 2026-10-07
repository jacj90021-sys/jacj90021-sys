package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ia implements xk0, Serializable {
    public final boolean OooO;
    public transient xk0 OooO0Oo;
    public final Class OooO0o;
    public final Object OooO0o0;
    public final String OooO0oO;
    public final String OooO0oo;

    public ia(Object obj, Class cls, String str, String str2, boolean z) {
        this.OooO0o0 = obj;
        this.OooO0o = cls;
        this.OooO0oO = str;
        this.OooO0oo = str2;
        this.OooO = z;
    }

    public abstract xk0 OooO0OO();

    public final nd OooO0Oo() {
        boolean z = this.OooO;
        Class cls = this.OooO0o;
        if (!z) {
            return r81.OooO00o(cls);
        }
        r81.OooO00o.getClass();
        return new x11(cls);
    }
}
