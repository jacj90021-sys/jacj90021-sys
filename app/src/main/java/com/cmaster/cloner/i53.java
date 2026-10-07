package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i53 {
    public final h53 OooO00o;
    public final Integer OooO0O0;

    public /* synthetic */ i53(vr1 vr1Var) {
        this.OooO00o = (h53) vr1Var.OooO0o0;
        this.OooO0O0 = (Integer) vr1Var.OooO0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i53)) {
            return false;
        }
        i53 i53Var = (i53) obj;
        return uw2.OooO00o(this.OooO00o, i53Var.OooO00o) && uw2.OooO00o(this.OooO0O0, i53Var.OooO0O0) && uw2.OooO00o(null, null) && uw2.OooO00o(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o, this.OooO0O0, null, null});
    }
}
