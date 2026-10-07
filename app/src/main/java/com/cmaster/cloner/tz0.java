package com.cmaster.cloner;

import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tz0 {
    public static final v03 OooO0o0 = new v03();
    public final Object OooO00o;
    public final sz0 OooO0O0;
    public final String OooO0OO;
    public volatile byte[] OooO0Oo;

    public tz0(String str, Object obj, sz0 sz0Var) {
        if (TextUtils.isEmpty(str)) {
            ra.OooOOO("Must not be null or empty");
            throw null;
        }
        this.OooO0OO = str;
        this.OooO00o = obj;
        this.OooO0O0 = sz0Var;
    }

    public static tz0 OooO00o(Object obj, String str) {
        return new tz0(str, obj, OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tz0) {
            return this.OooO0OO.equals(((tz0) obj).OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode();
    }

    public final String toString() {
        return rj.OooO0oO(new StringBuilder("Option{key='"), this.OooO0OO, "'}");
    }
}
