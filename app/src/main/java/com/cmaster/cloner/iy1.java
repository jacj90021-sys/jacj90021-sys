package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class iy1 {
    public static final jy1 OooO00o;

    static {
        jy1 s60Var;
        try {
            s60Var = new nz0((WebViewProviderFactoryBoundaryInterface) g9.OooO00o(WebViewProviderFactoryBoundaryInterface.class, v53.OooO00o()), 11);
        } catch (ClassNotFoundException unused) {
            s60Var = new s60();
        } catch (IllegalAccessException e) {
            sa.OooOO0(e);
            return;
        } catch (NoSuchMethodException e2) {
            sa.OooOO0(e2);
            return;
        } catch (InvocationTargetException e3) {
            sa.OooOO0(e3);
            return;
        }
        OooO00o = s60Var;
    }
}
