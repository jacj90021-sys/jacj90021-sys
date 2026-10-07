package com.cmaster.cloner;

import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yn2 {
    public static boolean OooO() {
        String strOooO00o = u7.OooO00o(new byte[]{-86, -70, -121, -46, -102, -122}, new byte[]{-30, -17, -58, -123, -33, -49, 44, 34});
        String str = Build.BRAND;
        if (!strOooO00o.equalsIgnoreCase(str) && !u7.OooO00o(new byte[]{-91, 100, -124, -52, 46}, new byte[]{-19, 43, -54, -125, 124, -124, -51, 123}).equalsIgnoreCase(str)) {
            String strOooO00o2 = u7.OooO00o(new byte[]{91, 18, 111, -37, -86, 111}, new byte[]{19, 71, 46, -116, -17, 38, -79, -44});
            String str2 = Build.MANUFACTURER;
            if (!strOooO00o2.equalsIgnoreCase(str2) && !u7.OooO00o(new byte[]{-17, 93, -50, -99, -93}, new byte[]{-89, 18, -128, -46, -15, 43, -7, -81}).equalsIgnoreCase(str2)) {
                String str3 = Build.FINGERPRINT;
                if (!str3.contains(u7.OooO00o(new byte[]{-87, -114, -83, -84, -29, -34}, new byte[]{-31, -37, -20, -5, -90, -105, 84, 86})) && !str3.contains(u7.OooO00o(new byte[]{60, -125, 91, 14, 13}, new byte[]{116, -52, 21, 65, 95, 75, 29, -111}))) {
                    String str4 = Build.ID;
                    if (str4 != null) {
                        return str4.contains(u7.OooO00o(new byte[]{-32, 105, -53, 64, 82, -54}, new byte[]{-88, 60, -118, 23, 23, -125, 66, -65})) || str4.contains(u7.OooO00o(new byte[]{119, -14, -114, -57, 38}, new byte[]{63, -67, -64, -120, 116, -116, 92, -118}));
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean OooO0O0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean OooO0OO() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean OooO0Oo() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean OooO0o() {
        return Build.VERSION.SDK_INT > 30;
    }

    public static boolean OooO0o0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean OooO0oO() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean OooO0oo() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean OooOO0() {
        String strOooO00o = u7.OooO00o(new byte[]{-25, -82, 71, -94, -80, -73, 70}, new byte[]{-120, -64, 34, -46, -36, -62, 53, -66});
        String str = Build.BRAND;
        return strOooO00o.equalsIgnoreCase(str) || u7.OooO00o(new byte[]{91, 6, -62, 16}, new byte[]{52, 118, -78, 127, -124, 43, -45, 93}).equalsIgnoreCase(str);
    }

    public static boolean OooOO0O() {
        return u7.OooO00o(new byte[]{39, -95, 70, 117}, new byte[]{81, -56, 48, 26, -55, -55, 121, 22}).equalsIgnoreCase(Build.BRAND);
    }
}
