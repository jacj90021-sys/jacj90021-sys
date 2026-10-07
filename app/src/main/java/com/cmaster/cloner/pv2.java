package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pv2 {
    public static void OooO00o(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                OooO0O0(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                OooO0O0(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                OooO0O0(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                OooO0O0(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void OooO0O0(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
