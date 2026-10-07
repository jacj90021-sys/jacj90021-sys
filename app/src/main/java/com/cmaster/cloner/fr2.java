package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fr2 {
    public static void OooO00o(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = yj0.OooO00o;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = a31.OooO00o;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
