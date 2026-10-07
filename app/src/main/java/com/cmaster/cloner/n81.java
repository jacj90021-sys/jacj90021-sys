package com.cmaster.cloner;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n81 {
    public final Field OooO00o;

    public n81(Class cls, String str, int i) throws NoSuchFieldException, SecurityException {
        switch (i) {
            case 1:
                Field declaredField = cls.getDeclaredField(str);
                this.OooO00o = declaredField;
                declaredField.setAccessible(true);
                break;
            case 2:
                Field declaredField2 = cls.getDeclaredField(str);
                this.OooO00o = declaredField2;
                declaredField2.setAccessible(true);
                break;
            default:
                Field declaredField3 = cls.getDeclaredField(str);
                this.OooO00o = declaredField3;
                declaredField3.setAccessible(true);
                break;
        }
    }

    public static n81 OooO0O0(Class cls, String str) {
        try {
            return new n81(cls, str, 0);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static n81 OooO0OO(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return new n81(cls, str, 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Object OooO00o() {
        try {
            return this.OooO00o.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void OooO0Oo(Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.OooO00o.set(null, obj);
        } catch (Exception unused) {
        }
    }
}
