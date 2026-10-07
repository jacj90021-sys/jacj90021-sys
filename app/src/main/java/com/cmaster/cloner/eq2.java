package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class eq2 {
    public static Boolean OooO00o;
    public static Boolean OooO0O0;
    public static Boolean OooO0OO;
    public static Boolean OooO0Oo;
    public static Boolean OooO0o;
    public static Boolean OooO0o0;

    public static boolean OooO00o(Context context) {
        if (OooO0OO == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            OooO0OO = Boolean.valueOf(z);
        }
        return OooO0OO.booleanValue();
    }

    public static boolean OooO0O0(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (OooO00o == null) {
            OooO00o = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        OooO00o.booleanValue();
        if (OooO0OO(context)) {
            return !vx2.OooO00o() || vx2.OooO0O0();
        }
        return false;
    }

    public static boolean OooO0OO(Context context) {
        if (OooO0O0 == null) {
            OooO0O0 = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return OooO0O0.booleanValue();
    }
}
