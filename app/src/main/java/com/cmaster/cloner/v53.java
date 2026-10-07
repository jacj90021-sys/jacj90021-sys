package com.cmaster.cloner;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v53 {
    public static InvocationHandler OooO00o() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = oOO0O00O.OooO0O0();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e) {
                sa.OooOO0(e);
                return null;
            } catch (NoSuchMethodException e2) {
                sa.OooOO0(e2);
                return null;
            } catch (InvocationTargetException e3) {
                sa.OooOO0(e3);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
