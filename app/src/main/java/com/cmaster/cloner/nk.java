package com.cmaster.cloner;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class nk {
    public final LinkedHashMap OooO00o = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof nk) {
            return ij0.OooO00o(this.OooO00o, ((nk) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.OooO00o + ')';
    }
}
