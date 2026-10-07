package com.cmaster.cloner;

import android.app.ActivityManager;
import android.content.AttributionSource;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class t43 {
    public static void OooO00o(Object[] objArr, boolean z) throws IllegalAccessException, IllegalArgumentException {
        int iOooO00o = fn2.OooO00o(objArr, e4.OooO00o, 0);
        if (iOooO00o >= 0) {
            fn2.OooO0O0(z, qx1.OooO0Oo(), objArr[iOooO00o]);
        }
        int iOooO00o2 = fn2.OooO00o(objArr, t8.OooOo00(), 0);
        if (iOooO00o2 >= 0) {
            AttributionSource attributionSourceOooO = t8.OooO(objArr[iOooO00o2]);
            l81 l81Var = d4.OooO0Oo;
            fn2.OooO0O0(z, qx1.OooO0Oo(), l81Var != null ? l81Var.OooO0O0(attributionSourceOooO) : null);
        }
    }

    public static String OooO0O0(String str) {
        Integer num = qx1.OooO00o;
        Object systemService = e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{-96, 15, 31, 17, -56, -47, 44, -109}, new byte[]{-63, 108, 107, 120, -66, -72, 88, -22}));
        if (systemService instanceof ActivityManager) {
            Object objOooO00o = b8.OooO00o();
            try {
                List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(1);
                if (runningTasks != null && !runningTasks.isEmpty() && runningTasks.get(0) != null) {
                    String className = runningTasks.get(0).topActivity.getClassName();
                    b8.OooO0O0(objOooO00o);
                    return className;
                }
                b8.OooO0O0(objOooO00o);
                return str;
            } catch (Throwable unused) {
                b8.OooO0O0(objOooO00o);
            }
        }
        return str;
    }

    public static void OooO0OO(yq yqVar) {
        Class<?> returnType = yqVar.OooO0o0.getReturnType();
        if (!returnType.isPrimitive()) {
            if (List.class.isAssignableFrom(returnType)) {
                yqVar.OooO0oo(new ArrayList());
                return;
            }
            if (Map.class.isAssignableFrom(returnType)) {
                yqVar.OooO0oo(new HashMap());
                return;
            }
            if (Bundle.class.isAssignableFrom(returnType)) {
                yqVar.OooO0oo(new Bundle());
                return;
            }
            if (String[].class.isAssignableFrom(returnType)) {
                yqVar.OooO0oo(new String[0]);
                return;
            }
            if (int[].class.isAssignableFrom(returnType)) {
                yqVar.OooO0oo(new int[0]);
                return;
            } else if (m21.OooO0O0(yqVar.OooO0o0.getReturnType())) {
                yqVar.OooO0oo(m21.OooO0OO(Collections.EMPTY_LIST));
                return;
            } else {
                yqVar.OooO0oo(null);
                return;
            }
        }
        if (returnType == Boolean.TYPE) {
            yqVar.OooO0oo(Boolean.FALSE);
            return;
        }
        if (returnType == Void.TYPE) {
            yqVar.OooO0oo(null);
            return;
        }
        if (returnType == Integer.TYPE) {
            yqVar.OooO0oo(0);
            return;
        }
        if (returnType == Double.TYPE) {
            yqVar.OooO0oo(Double.valueOf(0.0d));
            return;
        }
        if (returnType == Float.TYPE) {
            yqVar.OooO0oo(Float.valueOf(0.0f));
            return;
        }
        if (returnType == Short.TYPE) {
            yqVar.OooO0oo((short) 0);
            return;
        }
        if (returnType == Long.TYPE) {
            yqVar.OooO0oo(0L);
        } else if (returnType == Character.TYPE) {
            yqVar.OooO0oo((char) 0);
        } else if (returnType == Byte.TYPE) {
            yqVar.OooO0oo((byte) 0);
        }
    }

    public static void OooO0Oo(Object[] objArr, boolean z) {
        if (objArr == null) {
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                String str = (String) obj;
                if (TextUtils.equals(qx1.OooO00o(), str) || mx1.OooO0oO().OooOO0(str)) {
                    objArr[i] = qx1.OooO0Oo();
                }
            }
        }
        if (yn2.OooO0o()) {
            OooO00o(objArr, z);
        }
    }

    public static void OooO0o(int i, Object[] objArr) {
        int iOooO00o = jr1.OooO00o();
        if (iOooO00o == ((Integer) objArr[i]).intValue()) {
            return;
        }
        objArr[i] = Integer.valueOf(iOooO00o);
    }

    public static void OooO0o0(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        for (int length = objArr.length - 1; length >= 0; length--) {
            Object obj = objArr[length];
            if (obj instanceof String) {
                if (TextUtils.equals(qx1.OooO00o(), (String) obj)) {
                    objArr[length] = qx1.OooO0Oo();
                }
            }
        }
        if (yn2.OooO0o()) {
            OooO00o(objArr, true);
        }
    }
}
