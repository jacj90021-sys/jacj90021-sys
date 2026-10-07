package com.cmaster.cloner;

import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class aj {
    public final HashSet OooO00o = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aj.class != obj.getClass()) {
            return false;
        }
        return this.OooO00o.equals(((aj) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }
}
