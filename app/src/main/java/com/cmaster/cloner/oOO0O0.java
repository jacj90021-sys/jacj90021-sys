package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOO0O0 {
    public final int OooO00o;
    public final o0O000O OooO0O0;
    public final oOO0000 OooO0OO;
    public final String OooO0Oo;

    public oOO0O0(o0O000O o0o000o, oOO0000 ooo0000, String str) {
        this.OooO0O0 = o0o000o;
        this.OooO0OO = ooo0000;
        this.OooO0Oo = str;
        this.OooO00o = Arrays.hashCode(new Object[]{o0o000o, ooo0000, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oOO0O0)) {
            return false;
        }
        oOO0O0 ooo0o0 = (oOO0O0) obj;
        return uw2.OooO00o(this.OooO0O0, ooo0o0.OooO0O0) && uw2.OooO00o(this.OooO0OO, ooo0o0.OooO0OO) && uw2.OooO00o(this.OooO0Oo, ooo0o0.OooO0Oo);
    }

    public final int hashCode() {
        return this.OooO00o;
    }
}
