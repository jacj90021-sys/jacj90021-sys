package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class hh0 {
    public static Context OooO00o;
    public static Boolean OooO0O0;
    public static final p12 OooO0OO = new p12(2);

    public static synchronized boolean OooO00o(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = OooO00o;
        if (context2 != null && (bool = OooO0O0) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        OooO0O0 = null;
        if (vx2.OooO00o()) {
            OooO0O0 = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                OooO0O0 = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                OooO0O0 = Boolean.FALSE;
            }
        }
        OooO00o = applicationContext;
        return OooO0O0.booleanValue();
    }
}
