package com.cmaster.cloner;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class su2 {
    public static yt1 OooO00o(Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (yt1) objNewInstance;
            } catch (IllegalAccessException e) {
                ra.OooOO0O("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                ra.OooOO0O("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            ra.OooOO0O("Cannot create an instance of ", cls, e3);
            return null;
        }
    }
}
