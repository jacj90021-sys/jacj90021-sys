package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g42 {
    public final Object OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public g42(Object obj, Object obj2, Object obj3) {
        this.OooO00o = obj;
        this.OooO0O0 = obj2;
        this.OooO0OO = obj3;
    }

    public final IllegalArgumentException OooO00o() {
        Object obj = this.OooO00o;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.OooO0O0) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.OooO0OO));
    }
}
