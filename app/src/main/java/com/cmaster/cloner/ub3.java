package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ub3 {
    public final qf2 OooO00o;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ub3) {
            return uw2.OooO00o(this.OooO00o, ((ub3) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o});
    }
}
