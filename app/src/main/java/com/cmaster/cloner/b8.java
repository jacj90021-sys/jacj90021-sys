package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class b8 {
    public static final ThreadLocal OooO00o = new ThreadLocal();
    public static final ThreadLocal OooO0O0 = new ThreadLocal();
    public static final Object OooO0OO = new Object();
    public static final y7 OooO0Oo = y7.OooO0o0;

    public static Object OooO00o() {
        ThreadLocal threadLocal = OooO00o;
        Object obj = threadLocal.get();
        threadLocal.set(OooO0OO);
        return obj;
    }

    public static void OooO0O0(Object obj) {
        OooO00o.set(obj);
    }
}
