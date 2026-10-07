package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s4 extends l7 {
    public final ArrayList OooO00o;

    public s4(ArrayList arrayList) {
        this.OooO00o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        return this.OooO00o.equals(((s4) ((l7) obj)).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.OooO00o + "}";
    }
}
