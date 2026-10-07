package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f20 {
    public static final gh1 OooO0O0 = new gh1(0);
    public final /* synthetic */ k20 OooO00o;

    public f20(k20 k20Var) {
        this.OooO00o = k20Var;
    }

    public static Class OooO0O0(ClassLoader classLoader, String str) throws ClassNotFoundException {
        gh1 gh1Var = OooO0O0;
        gh1 gh1Var2 = (gh1) gh1Var.get(classLoader);
        if (gh1Var2 == null) {
            gh1Var2 = new gh1(0);
            gh1Var.put(classLoader, gh1Var2);
        }
        Class cls = (Class) gh1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gh1Var2.put(str, cls2);
        return cls2;
    }

    public static Class OooO0OO(ClassLoader classLoader, String str) {
        try {
            return OooO0O0(classLoader, str);
        } catch (ClassCastException e) {
            throw new tf(px0.OooOOOO("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new tf(px0.OooOOOO("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final o10 OooO00o(String str) {
        try {
            return (o10) OooO0OO(this.OooO00o.OooOo00.OooO0o0.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new tf(px0.OooOOOO("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new tf(px0.OooOOOO("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new tf(px0.OooOOOO("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new tf(px0.OooOOOO("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
