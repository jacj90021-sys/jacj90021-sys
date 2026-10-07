package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class jx1 {
    public static final /* synthetic */ int OooO00o = 0;

    static {
        u7.OooO00o(new byte[]{74, 114, 64, -41, 45, -121, -59, -126, 93, 120, 95, -41, 45, -122, -53, -97, 76, 111, 3, -65, 7, -81, -24, -43, 106, 117, 66, -106, 61, -113}, new byte[]{41, 29, 45, -7, 78, -22, -92, -15});
    }

    public static boolean OooO(Intent intent) {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            return false;
        }
        return component.getClassName().startsWith(u7.OooO00o(new byte[]{-14, 14, 61, -58, 13, -117, 8, 57, -27, 4, 34, -58, 13, -118, 6, 36, -12, 19, 126, -82, 39, -93, 37, 110, -48}, new byte[]{-111, 97, 80, -24, 110, -26, 105, 74}));
    }

    public static String OooO00o(int i) {
        return px0.OooOOOo(new byte[]{-97, -11, -81, -50, -118, -119, 120, -57, -120, -1, -80, -50, -118, -120, 118, -38, -103, -24, -20, -90, -96, -95, 85, -112, -67}, new byte[]{-4, -102, -62, -32, -23, -28, 25, -76}, new StringBuilder(), i);
    }

    public static String OooO0O0(int i, String str) {
        StringBuilder sbOooOO0 = rj.OooOO0(str);
        sbOooOO0.append(u7.OooO00o(new byte[]{16}, new byte[]{62, 62, 104, -8, -26, -27, 9, 95}));
        return px0.OooOOOo(new byte[]{28, -126, -40, -23, -82, -51, 39, 99, 11, -120, -57, -23, -82, -52, 41, 126, 26, -97, -101, -127, -124, -27, 10, 52, 47}, new byte[]{127, -19, -75, -57, -51, -96, 70, 16}, sbOooOO0, i);
    }

    public static String OooO0OO() {
        return u7.OooO00o(new byte[]{52, 0, -52, 123, -100, 123, 24, 77, 35, 10, -45, 123, -100, 122, 22, 80, 50, 29, -113, 19, -74, 83, 53, 26, 29, 0, -61}, new byte[]{87, 111, -95, 85, -1, 22, 121, 62});
    }

    public static String OooO0Oo(String str) {
        return u7.OooO00o(new byte[]{103, 92, 60, 89, 74, -65, 10, -67, 112, 86, 35, 89, 74, -66, 4, -96, 97, 65, 127, 49, 96, -105, 39, -22, 84, 65, 62, 15, 80}, new byte[]{4, 51, 81, 119, 41, -46, 107, -50}).concat(str);
    }

    public static String OooO0o(String str) {
        StringBuilder sbOooOO0 = rj.OooOO0(str);
        sbOooOO0.append(u7.OooO00o(new byte[]{-103}, new byte[]{-73, -51, 74, 33, -92, -91, -1, -43}));
        return rj.OooO0oo(new byte[]{-85, -108, -98, -40, 83, 119, 32, 116, -68, -98, -127, -40, 83, 118, 46, 105, -83, -119, -35, -80, 121, 95, 13, 35, -101, -98, -127, -128, 89, 121, 36}, new byte[]{-56, -5, -13, -10, 48, 26, 65, 7}, sbOooOO0);
    }

    public static String OooO0o0() {
        return u7.OooO00o(new byte[]{-57, -104, 78, 11, 80, 30, -54, -52, -48, -110, 81, 11, 80, 31, -60, -47, -63, -123, 13, 99, 122, 54, -25, -101, -10, -110, 80, 74, 95, 5, -50}, new byte[]{-92, -9, 35, 37, 51, 115, -85, -65});
    }

    public static String OooO0oO() {
        return u7.OooO00o(new byte[]{-86, 85, -59, -11, 47, 76, 27, -113, -67, 95, -38, -11, 47, 77, 21, -110, -84, 72, -122, -99, 5, 100, 54, -40, -101, 123}, new byte[]{-55, 58, -88, -37, 76, 33, 122, -4});
    }

    public static String OooO0oo() {
        return u7.OooO00o(new byte[]{72, -95, -21, -107, 14, 33, -3, -54, 95, -85, -12, -107, 14, 32, -13, -41, 78, -68, -88, -3, 36, 9, -48, -99, 121, -113, -54}, new byte[]{43, -50, -122, -69, 109, 76, -100, -71});
    }

    public static boolean OooOO0(Intent intent) {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            return false;
        }
        return component.getClassName().startsWith(u7.OooO00o(new byte[]{-11, -85, 101, -37, -11, 125, -105, -66, -30, -95, 122, -37, -11, 124, -103, -93, -13, -74, 38, -77, -33, 85, -70, -23, -58, -74, 103, -115, -17}, new byte[]{-106, -60, 8, -11, -106, 16, -10, -51}));
    }
}
