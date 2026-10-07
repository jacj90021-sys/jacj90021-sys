package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class w01 {
    public static final a02 OooO00o;
    public static final a02 OooO0O0;
    public static final a02 OooO0OO;
    public static final a02 OooO0Oo;
    public static final n81 OooO0o;
    public static final a02 OooO0o0;

    static {
        Class<?> cls;
        u7.OooO00o(new byte[]{44, 79, -93, -126, 100, 92, -112, 52, 46, 78, -87, -124, 110, 91, -128, 52, 61, 76, -23, -96, 106, 86, -97, 123, 42, 68, -118, -111, 101, 84, -109, 127, 63}, new byte[]{77, 33, -57, -16, 11, 53, -12, 26});
        try {
            cls = Class.forName(u7.OooO00o(new byte[]{110, -67, -51, -72, 122, 95, 44, -78, 108, -68, -57, -66, 112, 88, 60, -78, 127, -66, -121, -102, 116, 85, 35, -3, 104, -74, -28, -85, 123, 87, 47, -7, 125}, new byte[]{15, -45, -87, -54, 21, 54, 72, -100}));
        } catch (Exception unused) {
            cls = null;
        }
        OooO00o = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{127, -4, 93, 38, 34, -72, 121, -63, 122, -10, 69, 38, 39, -79, 85, -1, 125, -6, 109, 38, 35, -68, 121}, new byte[]{27, -107, 46, 71, 64, -44, 28, -111}), new Class[0]);
        String strOooO00o = u7.OooO00o(new byte[]{100, 87, 53, 96, -105, -3, -14, 31, 100, 87, 8, 94, -112, -15, -40, 13, 86, 65, 36, 66, -93, -16, -6, 31, 96, 90, 36, 84}, new byte[]{3, 50, 65, 48, -10, -98, -103, 126});
        Class cls2 = Integer.TYPE;
        OooO0O0 = a02.Oooo0o0(cls, strOooO00o, String.class, cls2, cls2);
        String strOooO00o2 = u7.OooO00o(new byte[]{-7, -25, 40, 24, -107, -22, 33, 17, -7, -25, 21, 38, -110, -26, 11, 3, -53, -15, 57, 58, -95, -25, 41, 17, -3, -22, 57, 44}, new byte[]{-98, -126, 92, 72, -12, -119, 74, 112});
        Class cls3 = Long.TYPE;
        OooO0OO = a02.Oooo0o0(cls, strOooO00o2, String.class, cls3, cls2);
        OooO0Oo = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{-49, -7, -125, -45, -29, -10, -73, 9, -53, -3, -125, -5, -4, -24, -110, 14, -50, -13, -74, -31, -58, -11, -66, 18, -3, -14, -108, -13, -16, -18, -66, 4}, new byte[]{-88, -100, -9, -110, -109, -122, -37, 96}), String.class, cls2, cls2);
        OooO0o0 = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{96, -99, 63, -46, 118, 100, -31, 121, 100, -103, 63, -6, 105, 122, -60, 126, 97, -105, 10, -32, 83, 103, -24, 98, 82, -106, 40, -14, 101, 124, -24, 116}, new byte[]{7, -8, 75, -109, 6, 20, -115, 16}), String.class, cls3, cls2);
        OooO0o = n81.OooO0OO(cls, u7.OooO00o(new byte[]{52, -104, 103, 116, 120, 88, 16, 20, 14, -90, 96, 120, 80, 88, 20, 25, 34}, new byte[]{71, -56, 6, 23, 19, 57, 119, 113}));
    }

    public static ApplicationInfo OooO00o(PackageManager packageManager, String str) {
        a02 a02Var = OooO0o0;
        if (a02Var != null) {
            return (ApplicationInfo) a02Var.OooO0o0(str, 0L, Integer.valueOf(jr1.OooO00o()));
        }
        a02 a02Var2 = OooO0Oo;
        if (a02Var2 != null) {
            return (ApplicationInfo) a02Var2.OooO0o0(str, 0, Integer.valueOf(jr1.OooO00o()));
        }
        try {
            return packageManager.getApplicationInfo(str, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static PackageInfo OooO0O0(PackageManager packageManager, String str, int i) {
        a02 a02Var = OooO0OO;
        if (a02Var != null) {
            return (PackageInfo) a02Var.OooO0o0(str, Long.valueOf(i), Integer.valueOf(jr1.OooO00o()));
        }
        a02 a02Var2 = OooO0O0;
        if (a02Var2 != null) {
            return (PackageInfo) a02Var2.OooO0o0(str, Integer.valueOf(i), Integer.valueOf(jr1.OooO00o()));
        }
        try {
            return packageManager.getPackageInfo(str, i);
        } catch (Exception unused) {
            return null;
        }
    }
}
