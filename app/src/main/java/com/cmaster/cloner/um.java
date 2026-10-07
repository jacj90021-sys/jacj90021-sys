package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class um {
    public final Class OooO00o;
    public final boolean OooO0O0;

    public um(Class cls, boolean z) {
        this.OooO00o = cls;
        this.OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof um) {
            um umVar = (um) obj;
            if (umVar.OooO00o.equals(this.OooO00o) && umVar.OooO0O0 == this.OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.OooO0O0).hashCode() ^ ((this.OooO00o.hashCode() ^ 1000003) * 1000003);
    }
}
