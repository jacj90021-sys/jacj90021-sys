package com.cmaster.cloner;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ih2 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
