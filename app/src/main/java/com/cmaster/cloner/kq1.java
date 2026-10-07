package com.cmaster.cloner;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kq1 extends jq1 {
    @Override // com.cmaster.cloner.jq1
    public final Typeface OooO(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.OooO0o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.OooOO0o.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            sa.OooOO0(e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.jq1
    public final Method OooOO0o(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
