package com.cmaster.cloner;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class a31 {
    public static final Method OooO00o;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (ij0.OooO00o(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (ij0.OooO00o(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        OooO00o = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !ij0.OooO00o(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
