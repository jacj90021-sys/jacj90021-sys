package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class r81 {
    public static final s81 OooO00o;

    static {
        s81 s81Var = null;
        try {
            s81Var = (s81) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (s81Var == null) {
            s81Var = new s81();
        }
        OooO00o = s81Var;
    }

    public static rd OooO00o(Class cls) {
        OooO00o.getClass();
        return new rd(cls);
    }
}
