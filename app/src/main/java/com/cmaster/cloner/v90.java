package com.cmaster.cloner;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v90 {
    public static final Class OooO00o;
    public static final o00OO000 OooO0O0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(u7.OooO00o(new byte[]{63, -90, 112, -19, 103, 89, 8, -81, 63, -72, 100, -79, 65, 113, 28, -15, 50, -95, 119, -2, 124, 89, 3, -17, 10, -96, 102, -6, 105, 84}, new byte[]{94, -56, 20, -97, 8, 48, 108, -127}));
        } catch (Exception unused) {
            cls = null;
        }
        OooO00o = cls;
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-18, -90, 47, 119, -19, 75, 124, -66, -45, -96, 48, 91, -25, 74, 117, -75, -23}, new byte[]{-99, -59, 71, 18, -119, 62, 16, -37}), List.class, IBinder.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{101, -81, -103, -14, -67, -64, -19, 80, 85, -66, -108, -10, -83, -48, -46, 80, 100, -70, -104, -12, -68}, new byte[]{22, -52, -15, -105, -39, -75, -127, 53}), IBinder.class, ServiceInfo.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-6, -128, -70, 67, 99, -105, -82, 114, -53, -118, -68, 66, 84, -121, -80, 97, -32, -128, -73}, new byte[]{-119, -29, -46, 38, 7, -30, -62, 23}), IBinder.class, Intent.class, Boolean.TYPE);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-74, 66, -6, 53, 48, -48, 96, -43, -112, 79, -16, 57, 58, -63, 95, -43, -73, 87, -5, 51, 49}, new byte[]{-59, 33, -110, 80, 84, -91, 12, -80}), IBinder.class, Intent.class);
        String strOooO00o = u7.OooO00o(new byte[]{114, 116, 110, -112, 78, -102, -85, -54, 82, 114, 116, -125, 67, -116, -94, -18, 115, 112, 117}, new byte[]{1, 23, 6, -11, 42, -17, -57, -81});
        Class cls2 = Integer.TYPE;
        o00OO000.Oooo00o(cls, strOooO00o, IBinder.class, cls2, cls2, Intent.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{36, -120, 127, 100, -101, 47, -127, 51, 4, -97, 120, 113, -84, 63, -97, 32, 62, -120, 114}, new byte[]{87, -21, 23, 1, -1, 90, -19, 86}), IBinder.class);
        OooO0O0 = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-128, 21, -127, -48, -114, -117, 99, 103, -70, 24, -102, -63, -117, -110, 99, 82, -127, 25, -97, -36, -114, -101, 125}, new byte[]{-13, 118, -23, -75, -22, -2, 15, 2}), ProviderInfo.class);
    }
}
