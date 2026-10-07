package com.cmaster.cloner;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m81 {
    public final Field OooO00o;

    public m81(Class cls, String str, int i) throws NoSuchFieldException, SecurityException {
        switch (i) {
            case 1:
                Field declaredField = cls.getDeclaredField(str);
                this.OooO00o = declaredField;
                declaredField.setAccessible(true);
                break;
            default:
                Field declaredField2 = cls.getDeclaredField(str);
                this.OooO00o = declaredField2;
                declaredField2.setAccessible(true);
                break;
        }
    }

    public static m81 OooO0O0(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return new m81(cls, str, 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    public int OooO00o() {
        try {
            return this.OooO00o.getInt(null);
        } catch (Exception unused) {
            return 0;
        }
    }
}
