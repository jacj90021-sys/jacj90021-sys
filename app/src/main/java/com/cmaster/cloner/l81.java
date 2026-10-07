package com.cmaster.cloner;

import android.app.PendingIntent;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l81 {
    public final Field OooO00o;

    public l81(Class cls, String str, int i) throws NoSuchFieldException, SecurityException {
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

    public static l81 OooO0Oo(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return new l81(cls, str, 0);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static l81 OooO0o(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return new l81(cls, str, 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static l81 OooO0o0(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return new l81(cls, str, 1);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void OooO(Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.OooO00o.setBoolean(obj, z);
        } catch (Exception unused) {
        }
    }

    public int OooO00o(Object obj) {
        try {
            return this.OooO00o.getInt(obj);
        } catch (Exception unused) {
            return 0;
        }
    }

    public Object OooO0O0(Object obj) {
        try {
            return this.OooO00o.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean OooO0OO(Object obj) {
        try {
            return this.OooO00o.getBoolean(obj);
        } catch (Exception unused) {
            return false;
        }
    }

    public void OooO0oO(int i, Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.OooO00o.setInt(obj, i);
        } catch (Exception unused) {
        }
    }

    public void OooO0oo(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.OooO00o.set(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public l81(String str) throws NoSuchFieldException, SecurityException {
        Field declaredField = PendingIntent.class.getDeclaredField(str);
        this.OooO00o = declaredField;
        declaredField.setAccessible(true);
    }
}
