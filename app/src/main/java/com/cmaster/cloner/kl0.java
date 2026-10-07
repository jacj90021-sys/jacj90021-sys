package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kl0 {
    public final String OooO00o;

    public kl0(String str) {
        this.OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kl0) {
            return this.OooO00o.equals(((kl0) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    public final String toString() {
        return rj.OooO0oO(new StringBuilder("StringHeaderFactory{value='"), this.OooO00o, "'}");
    }
}
