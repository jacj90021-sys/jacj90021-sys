package com.cmaster.cloner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f9 implements InvocationHandler {
    public final ay1 OooO0Oo;

    public f9(ay1 ay1Var) {
        this.OooO0Oo = ay1Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, ay1.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.OooO0Oo, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            ra.OooOO0O("Reflection failed for method ", method, e2);
            return null;
        }
    }
}
