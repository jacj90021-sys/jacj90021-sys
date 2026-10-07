package com.cmaster.cloner;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class hd0 {
    public static final o00OO000 OooO00o = o00OO000.Oooo00o(IServiceConnection.class, u7.OooO00o(new byte[]{-85, 102, -87, 50, -1, 7, 118, -120, -84}, new byte[]{-56, 9, -57, 92, -102, 100, 2, -19}), ComponentName.class, IBinder.class);
    public static final o00OO000 OooO0O0;
    public static final o00OO000 OooO0OO;

    static {
        o00OO000 o00oo000;
        String strOooO00o = u7.OooO00o(new byte[]{98, 98, -38, 64, -103, 50, 4, 124, 101}, new byte[]{1, 13, -76, 46, -4, 81, 112, 25});
        Class cls = Boolean.TYPE;
        OooO0O0 = o00OO000.Oooo00o(IServiceConnection.class, strOooO00o, ComponentName.class, IBinder.class, cls);
        try {
            o00oo000 = new o00OO000(IServiceConnection.class, u7.OooO00o(new byte[]{-83, -109, 105, -43, 99, 40, 80, 5, -86}, new byte[]{-50, -4, 7, -69, 6, 75, 36, 96}), jy2.OooO0O0(IServiceConnection.class.getClassLoader(), new Object[]{ComponentName.class, IBinder.class, u7.OooO00o(new byte[]{51, -108, -34, 29, -36, 51, -54, 18, 51, -118, -54, 65, -6, 24, -57, 82, 54, -97, -56, 60, -42, 41, -35, 85, 61, -108}, new byte[]{82, -6, -70, 111, -77, 90, -82, 60}), cls}));
        } catch (Throwable unused) {
            o00oo000 = null;
        }
        OooO0OO = o00oo000;
    }

    public static void OooO00o(IServiceConnection iServiceConnection, ComponentName componentName, IBinder iBinder, boolean z) {
        o00OO000 o00oo000 = OooO0OO;
        if (o00oo000 != null) {
            o00oo000.OooOooo(iServiceConnection, componentName, iBinder, null, Boolean.valueOf(z));
            return;
        }
        o00OO000 o00oo0002 = OooO0O0;
        if (o00oo0002 != null) {
            o00oo0002.OooOooo(iServiceConnection, componentName, iBinder, Boolean.valueOf(z));
            return;
        }
        o00OO000 o00oo0003 = OooO00o;
        if (o00oo0003 != null) {
            o00oo0003.OooOooo(iServiceConnection, componentName, iBinder);
        }
    }
}
