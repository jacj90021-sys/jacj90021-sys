package com.cmaster.cloner;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ud {
    public static final ud OooO0OO = new ud();
    public final HashMap OooO00o = new HashMap();
    public final HashMap OooO0O0 = new HashMap();

    public static void OooO0O0(HashMap map, td tdVar, wl0 wl0Var, Class cls) {
        wl0 wl0Var2 = (wl0) map.get(tdVar);
        if (wl0Var2 == null || wl0Var == wl0Var2) {
            if (wl0Var2 == null) {
                map.put(tdVar, wl0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + tdVar.OooO0O0.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + wl0Var2 + ", new value " + wl0Var);
    }

    public final sd OooO00o(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.OooO00o;
        if (superclass != null) {
            sd sdVarOooO00o = (sd) map2.get(superclass);
            if (sdVarOooO00o == null) {
                sdVarOooO00o = OooO00o(superclass, null);
            }
            map.putAll(sdVarOooO00o.OooO0O0);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            sd sdVarOooO00o2 = (sd) map2.get(cls2);
            if (sdVarOooO00o2 == null) {
                sdVarOooO00o2 = OooO00o(cls2, null);
            }
            for (Map.Entry entry : sdVarOooO00o2.OooO0O0.entrySet()) {
                OooO0O0(map, (td) entry.getKey(), (wl0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            gz0 gz0Var = (gz0) method.getAnnotation(gz0.class);
            if (gz0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!hm0.class.isAssignableFrom(parameterTypes[0])) {
                        ra.OooOOO("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                wl0 wl0VarValue = gz0Var.value();
                if (parameterTypes.length > 1) {
                    if (!wl0.class.isAssignableFrom(parameterTypes[1])) {
                        ra.OooOOO("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (wl0VarValue != wl0.ON_ANY) {
                        ra.OooOOO("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    ra.OooOOO("cannot have more than 2 params");
                    return null;
                }
                OooO0O0(map, new td(i, method), wl0VarValue, cls);
                z = true;
            }
        }
        sd sdVar = new sd(map);
        map2.put(cls, sdVar);
        this.OooO0O0.put(cls, Boolean.valueOf(z));
        return sdVar;
    }
}
