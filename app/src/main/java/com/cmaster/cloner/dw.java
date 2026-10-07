package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dw {
    public final String OooO00o;

    public dw(String str) {
        if (str != null) {
            this.OooO00o = str;
        } else {
            qa.OooOOO0("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        return this.OooO00o.equals(((dw) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return rj.OooO0oO(new StringBuilder("Encoding{name=\""), this.OooO00o, "\"}");
    }
}
