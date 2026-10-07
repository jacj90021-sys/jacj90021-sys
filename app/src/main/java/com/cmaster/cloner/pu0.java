package com.cmaster.cloner;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pu0 {
    public Method OooO00o;
    public Method OooO0O0;
    public Method OooO0OO;

    public pu0(Method method, Method method2, Method method3) {
        this.OooO00o = method;
        this.OooO0O0 = method2;
        this.OooO0OO = method3;
    }

    public static void OooO00o() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
