package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hm1 implements oOO0000 {
    public static final hm1 OooO0OO = new hm1(null);
    public final String OooO0O0;

    public /* synthetic */ hm1(String str) {
        this.OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hm1) {
            return uw2.OooO00o(this.OooO0O0, ((hm1) obj).OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO0O0});
    }
}
