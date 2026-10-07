package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ey0 extends q12 implements fc0 {
    public final Object OooO0o0;

    public ey0(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.OooO0o0 = obj;
    }

    public static fc0 o00O0000(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof fc0 ? (fc0) iInterfaceQueryLocalInterface : new w62(1, iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object o0O0ooO(fc0 fc0Var) throws SecurityException {
        if (fc0Var instanceof ey0) {
            return ((ey0) fc0Var).OooO0o0;
        }
        IBinder iBinderAsBinder = fc0Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            ra.OooOOO(px0.OooOOO(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
            return null;
        }
        by2.OooO0oo(field);
        if (field.isAccessible()) {
            ra.OooOOO("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
