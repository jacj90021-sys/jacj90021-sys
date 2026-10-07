package com.cmaster.cloner;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fu0 {
    public static final ArrayDeque OooO0O0;
    public Object OooO00o;

    static {
        char[] cArr = pr1.OooO00o;
        OooO0O0 = new ArrayDeque(0);
    }

    public static fu0 OooO00o(Object obj) {
        fu0 fu0Var;
        ArrayDeque arrayDeque = OooO0O0;
        synchronized (arrayDeque) {
            fu0Var = (fu0) arrayDeque.poll();
        }
        if (fu0Var == null) {
            fu0Var = new fu0();
        }
        fu0Var.OooO00o = obj;
        return fu0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fu0) && this.OooO00o.equals(((fu0) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }
}
