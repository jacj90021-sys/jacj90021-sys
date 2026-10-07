package com.cmaster.cloner;

import android.net.Uri;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zi {
    public final Uri OooO00o;
    public final boolean OooO0O0;

    public zi(Uri uri, boolean z) {
        this.OooO00o = uri;
        this.OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zi.class == obj.getClass()) {
            zi ziVar = (zi) obj;
            if (this.OooO0O0 == ziVar.OooO0O0 && this.OooO00o.equals(ziVar.OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.OooO00o.hashCode() * 31) + (this.OooO0O0 ? 1 : 0);
    }
}
