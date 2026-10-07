package com.cmaster.cloner;

import android.os.Build;
import android.os.IBinder;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o0OOO00 {
    public static final o00OO000 OooO00o;
    public static final o00OO000 OooO0O0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(u7.OooO00o(new byte[]{122, -20, -96, -52, -29, 69, 37, -5, 122, -14, -76, -112, -51, 79, 53, -68, 109, -21, -80, -57, -40, 68, 51, -80, 122, -26}, new byte[]{27, -126, -60, -66, -116, 44, 65, -43}));
        } catch (Exception unused) {
            cls = null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            OooO0O0 = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{106, 122, 31, -102, -63, 123, 53, 87, 117, 82, 31, -118, -56, 112, 15}, new byte[]{2, 27, 113, -2, -83, 30, 123, 50}), o0OO0.OooO00o, List.class);
        } else {
            OooO00o = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-95, -18, -122, -110, -75, -97, -66, -70, -66, -58, -122, -126, -68, -108, -124}, new byte[]{-55, -113, -24, -10, -39, -6, -16, -33}), IBinder.class, List.class);
        }
    }
}
