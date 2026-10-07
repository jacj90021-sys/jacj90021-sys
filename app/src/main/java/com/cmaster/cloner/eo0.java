package com.cmaster.cloner;

import java.lang.Thread;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class eo0 extends ConcurrentHashMap implements InvocationHandler, Thread.UncaughtExceptionHandler {
    public static final eo0 OooO0o0 = new eo0();
    public final ConcurrentHashMap OooO0Oo = new ConcurrentHashMap();

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.OooO0Oo.get(obj) == null) {
            return null;
        }
        ra.OooOO0o();
        return null;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
    }
}
