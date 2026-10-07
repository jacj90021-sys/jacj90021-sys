package com.cmaster.cloner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class g9 {
    public static final uk1 OooO00o = new uk1("NO_DECISION", 0);

    public static Object OooO00o(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(g9.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
