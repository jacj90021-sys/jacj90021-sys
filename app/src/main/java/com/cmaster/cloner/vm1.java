package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vm1 {
    public static final ThreadLocal OooO00o = new ThreadLocal();

    public static xw OooO00o() {
        ThreadLocal threadLocal = OooO00o;
        xw xwVar = (xw) threadLocal.get();
        if (xwVar != null) {
            return xwVar;
        }
        p8 p8Var = new p8(Thread.currentThread());
        threadLocal.set(p8Var);
        return p8Var;
    }
}
