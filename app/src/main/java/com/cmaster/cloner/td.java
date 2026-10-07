package com.cmaster.cloner;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class td {
    public final int OooO00o;
    public final Method OooO0O0;

    public td(int i, Method method) throws SecurityException {
        this.OooO00o = i;
        this.OooO0O0 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return this.OooO00o == tdVar.OooO00o && this.OooO0O0.getName().equals(tdVar.OooO0O0.getName());
    }

    public final int hashCode() {
        return this.OooO0O0.getName().hashCode() + (this.OooO00o * 31);
    }
}
