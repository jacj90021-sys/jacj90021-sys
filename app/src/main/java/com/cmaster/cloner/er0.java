package com.cmaster.cloner;

import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class er0 {
    public final String OooO00o;

    public er0(String str) {
        this.OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er0.class != obj.getClass()) {
            return false;
        }
        return this.OooO00o.equals(((er0) obj).OooO00o);
    }

    public final int hashCode() {
        return Objects.hash(this.OooO00o);
    }
}
