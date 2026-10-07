package com.cmaster.cloner;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ld1 {
    public static final List OooO00o;
    public static final List OooO0O0;

    static {
        List listAsList = Arrays.asList(Application.class, bd1.class);
        listAsList.getClass();
        OooO00o = listAsList;
        OooO0O0 = te.OooO0O0(bd1.class);
    }

    public static final Constructor OooO00o(Class cls, List list) throws SecurityException {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        int i = 0;
        while (true) {
            if (!(i < constructors.length)) {
                return null;
            }
            int i2 = i + 1;
            try {
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                parameterTypes.getClass();
                int length = parameterTypes.length;
                List arrayList = length != 0 ? length != 1 ? new ArrayList(new d3(parameterTypes, 0)) : te.OooO0O0(parameterTypes[0]) : nv.OooO0Oo;
                if (list.equals(arrayList)) {
                    return constructor;
                }
                if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                    throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
    }

    public static final yt1 OooO0O0(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (yt1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            ra.OooOO0O("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            qa.OooO0oO("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
