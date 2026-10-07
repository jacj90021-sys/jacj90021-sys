package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o0OO0oO0 {
    public static final a02 OooO;
    public static final l81 OooO00o;
    public static final l81 OooO0O0;
    public static final l81 OooO0OO;
    public static final l81 OooO0Oo;
    public static final l81 OooO0o;
    public static final l81 OooO0o0;
    public static final l81 OooO0oO;
    public static final l81 OooO0oo;
    public static final o00OO000 OooOO0;
    public static final o00OO000 OooOO0O;
    public static final o00OO000 OooOO0o;
    public static final o00OO000 OooOOO;
    public static final o00OO000 OooOOO0;
    public static final o00OO000 OooOOOO;
    public static final o00OO000 OooOOOo;
    public static final l81 OooOOo;
    public static final l81 OooOOo0;
    public static Object OooOOoo;

    static {
        Class<?> cls;
        u7.OooO00o(new byte[]{-116, 1, 8, -32, 38, 7, -39, -91, -116, 31, 28, -68, 8, 13, -55, -30, -101, 6, 24, -21, 29, 6, -49, -18, -116, 11}, new byte[]{-19, 111, 108, -110, 73, 110, -67, -117});
        try {
            cls = Class.forName(u7.OooO00o(new byte[]{-58, 23, -55, -86, 48, 98, 60, 88, -58, 9, -35, -10, 30, 104, 44, 31, -47, 16, -39, -95, 11, 99, 42, 19, -58, 29}, new byte[]{-89, 121, -83, -40, 95, 11, 88, 118}));
        } catch (Exception unused) {
            cls = null;
        }
        n81.OooO0OO(cls, u7.OooO00o(new byte[]{53, 113, -53, 108, 33, -24, -43, 87, 11, 64, -60, 110, 45, -20, -64}, new byte[]{70, 33, -86, 15, 74, -119, -78, 50}));
        n81.OooO0OO(cls, u7.OooO00o(new byte[]{-25, 65, -16, -71, -117, 1, 97, 99, -3, 126, -5, -122, -121, 6, 115, 119, -15, 99}, new byte[]{-108, 17, -107, -53, -26, 104, 18, 16}));
        OooO00o = l81.OooO0o(cls, u7.OooO00o(new byte[]{-73, 65}, new byte[]{-38, 9, -69, 86, 14, -112, -23, -47}));
        OooO0O0 = l81.OooO0o(cls, u7.OooO00o(new byte[]{-40, 122, -53, -59, 29, -2, 97, -39, -36, 94, -37}, new byte[]{-75, 59, -88, -79, 116, -120, 8, -83}));
        l81.OooO0o(cls, u7.OooO00o(new byte[]{-17, -85, 51, 30, 46, -78, 36, -41, -15}, new byte[]{-126, -8, 86, 108, 88, -37, 71, -78}));
        OooO0OO = l81.OooO0o(cls, u7.OooO00o(new byte[]{-70, -11, -76, 25, -89, -80, 85, 6, -89, -37, -78, 15, -88, -96, 125, 25, -71}, new byte[]{-41, -73, -37, 108, -55, -44, 20, 118}));
        OooO0Oo = l81.OooO0o0(cls, u7.OooO00o(new byte[]{-6, -48, -15, 101, -117, 116, 126, 69, -30, -1, -16, 83, -90, 98, 104, 72, -10, -22, -64, 103, -90}, new byte[]{-105, -109, -124, 23, -49, 17, 24, 36}));
        OooO0o0 = l81.OooO0Oo(cls, u7.OooO00o(new byte[]{-54, 31, -48, -79, 71, -18, 68, -80, -28, 52, -40, -81, 85, -13, 125, -90, -61, 62}, new byte[]{-89, 91, -75, -33, 52, -121, 48, -55}));
        OooO0o = l81.OooO0o(cls, u7.OooO00o(new byte[]{-57, 78, 104, -121, -74, 99, 87, -76, -21, 119, 118, -126, -85, 105, 87, -84, -61, 104, 104}, new byte[]{-86, 7, 6, -18, -62, 10, 54, -40}));
        OooO0oO = l81.OooO0o(cls, u7.OooO00o(new byte[]{107, 119, -12, 25, -28, -41, -56, -19, 111, 85, -7, 1, -52, -56, -42, -14}, new byte[]{6, 54, -104, 117, -91, -89, -72, -127}));
        l81.OooO0o(cls, u7.OooO00o(new byte[]{25, 5, 14, -92, 30, -117, -3, -123, 17, 34, 20, -74, 30, -112, -25, -122}, new byte[]{116, 76, 96, -41, 106, -7, -120, -24}));
        l81.OooO0o(cls, u7.OooO00o(new byte[]{-13, 96, -119, 25, 24, 111, -116, 30, -19}, new byte[]{-98, 48, -24, 122, 115, 14, -21, 123}));
        OooO0oo = l81.OooO0o(cls, u7.OooO00o(new byte[]{87, -80, 84, 54, -59, 123, -89, 31, 72, -83, 71, 41}, new byte[]{58, -32, 38, 89, -77, 18, -61, 122}));
        l81.OooO0o(cls, u7.OooO00o(new byte[]{73, 124, 10, -104, -5, 9, 123, 126, 86, 126, 29, -111, -50, 15, 106, 117, 80, 97, 25, -121}, new byte[]{36, 44, 120, -9, -115, 96, 31, 27}));
        l81.OooO0o(cls, u7.OooO00o(new byte[]{62, -78, 32, -52, -96, 71, -81, 3, 16, -115, 43, -60, -83, 73, -76, 22, 50, -106, 44, -51, -86}, new byte[]{83, -30, 69, -94, -60, 46, -63, 100}));
        l81.OooO0o(cls, u7.OooO00o(new byte[]{-99, -122, 119, -72, 109, -36, 115, -20, -126, -92, 108, -65, 100, -37}, new byte[]{-16, -59, 24, -42, 11, -75, 20, -103}));
        l81.OooO0o(cls, u7.OooO00o(new byte[]{-29, -22, 13, 126, 106, 82, -60, 95, -31, -48, 11, 121, 110, 76, -25, 111, -9, -24, 3, 112, 110}, new byte[]{-114, -90, 98, 29, 11, 62, -108, 45}));
        String strOooO00o = u7.OooO00o(new byte[]{39, -36, -88, 53, 10, -94, -19, -37, 55}, new byte[]{114, -113, -19, 106, 73, -29, -82, -109});
        if (cls != null) {
            try {
                cls.getDeclaredField(strOooO00o).setAccessible(true);
            } catch (Throwable unused2) {
            }
        }
        OooO = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{85, -90, -22, 31, -123, -108, -87, 20, 85, -89, -15, 27, -119, -114, -92, 1, 94, -95, -3, 12, -124}, new byte[]{54, -45, -104, 109, -32, -6, -35, 85}), new Class[0]);
        OooOO0 = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{88, 113, 60, -3, -114, 17, -95, 62, 92, 117, 60, -43, -111, 15, -103, 63, 77, 113, 41, -40}, new byte[]{63, 20, 72, -68, -2, 97, -51, 87}), new Class[0]);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-43, 65, 112, 92, -99, -38, 107, 63, -63, 87, 74, 109, -126, -48}, new byte[]{-78, 36, 4, 12, -17, -75, 8, 90}), new Class[0]);
        String strOooO00o2 = u7.OooO00o(new byte[]{-82, 55, 33, 108, -110, 72, 106, -110, -85, 59, 59, 113, -127, 78, 109, -114, -79, 38}, new byte[]{-35, 82, 79, 8, -45, 43, 30, -5});
        Class cls2 = Integer.TYPE;
        OooOO0O = o00OO000.Oooo00o(cls, strOooO00o2, IBinder.class, String.class, cls2, cls2, Intent.class);
        OooOO0o = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-8, 82, 31, -118, -18, -42, 35, -112, -22, 90, 14, -83, -12, -60, 35, -117, -16, 89}, new byte[]{-97, 55, 107, -61, -128, -91, 87, -30}), new Class[0]);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{59, 93, -85, -128, -17, 100, 96, 28, 49, 123, -80, -67, -30, 114, 108, 13}, new byte[]{92, 56, -33, -45, -106, 23, 20, 121}), new Class[0]);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-117, 119, 45, 14, -66, -127, 9, -33, -98, 101, 22, 6, -91, -106, 10, -27, -120}, new byte[]{-5, 18, 95, 104, -47, -13, 100, -111}), IBinder.class, List.class);
        String strOooO00o3 = u7.OooO00o(new byte[]{-55, -43, 114, 33, 42, -8, 102, -45, -36, -57, 73, 41, 49, -17, 101, -23, -54}, new byte[]{-71, -80, 0, 71, 69, -118, 11, -99});
        Class cls3 = Boolean.TYPE;
        o00OO000.Oooo00o(cls, strOooO00o3, IBinder.class, List.class, cls3);
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-4, 73, 61, -76, 110, -104, -77, 17, -23, 91, 6, -68, 117, -113, -80, 43, -1}, new byte[]{-116, 44, 79, -46, 1, -22, -34, 95}), new Class[0]);
        } else if (o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-69, 90, 34, -37, 13, 112, 114, -106, -82, 72, 25, -45, 22, 103, 113, -84, -72}, new byte[]{-53, 63, 80, -67, 98, 2, 31, -40}), new Class[0]) == null) {
            o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{44, -64, -38, 76, -52, 115, -95, -114, 57, -46, -31, 68, -41, 100, -94, -76, 47}, new byte[]{92, -91, -88, 42, -93, 1, -52, -64}), new Class[0]);
        }
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-11, -26, 64, 34, -86, -60, 18, -113, -24, -12, 75, 7, -91, -43, 43, -104, -12, -13, 87}, new byte[]{-99, -121, 46, 70, -58, -95, 66, -18}), IBinder.class, cls3, cls3, cls2, q21.OooO00o, String.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-75, 125, 104, -10, 73, 75, 53, 82, -86, 85, 104, -26, 64, 64, 15}, new byte[]{-35, 28, 6, -110, 37, 46, 123, 55}), IBinder.class, List.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-38, 102, -53, -36, 18, -77, -30, 113, -63, 114, -56, -35, 63, -75, -60, 125, -60, 110, -47, -63}, new byte[]{-78, 7, -91, -72, 126, -42, -80, 20}), IBinder.class, cls3, cls3, String.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{9, 20, 91, -82, 2, 120, -17, -59, 18, 21, 94, -77, 7, 113, -15}, new byte[]{96, 122, 40, -38, 99, 20, -125, -107}), Context.class, xi.OooO00o, ProviderInfo.class, cls3, cls3, cls3);
        OooOOO0 = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{71, -82, -69, 73, 112, -57, -121, -115, 71, -82, -122, 119, 119, -53, -94, -125, 99, -93, -86, 122, 122}, new byte[]{32, -53, -49, 25, 17, -92, -20, -20}), ApplicationInfo.class);
        OooOOO = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-49, 114, 40, -20, 16, 118, -4, -88, -49, 114, 21, -46, 23, 122, -39, -90, -21, 127, 57, -33, 26}, new byte[]{-88, 23, 92, -68, 113, 21, -105, -55}), ApplicationInfo.class, nf.OooO00o);
        OooOOOO = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{55, 48, -19, 15, 0, -70, 58, 84, 49, 48, -22, 30, 15, -94, 6, 101, 49, 40, -9, 31, 4, -92, 37}, new byte[]{94, 94, -98, 123, 97, -42, 86, 23}), Context.class, List.class);
        OooOOOo = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{99, 98, 34, -33, 90, 103, -120, 59, 122, 104, 32, -34, 90, 123, -118, 46, 112, 110, 37, -61, 87, 112, -97}, new byte[]{2, 1, 83, -86, 51, 21, -19, 126}), Context.class, String.class, cls2, cls3);
        OooOOo0 = l81.OooO0o(cls, u7.OooO00o(new byte[]{115, 17, -122, -83, 30, 7, -65, 85, 125, 55, -102, -82, 53, 39, -87, 79, 119, 41, -102, -76, 59, 3, -71}, new byte[]{30, 95, -13, -64, 82, 102, -54, 59}));
        if (i >= 31) {
            OooOOo = l81.OooO0o(cls, u7.OooO00o(new byte[]{-15, -56, -115, 118, -85, 127, 40, -118, -14, -29, -83, 96, -79, 117, 54, -118, -24, -19, -119, 112}, new byte[]{-100, -124, -20, 3, -59, 28, 64, -29}));
        }
        OooOOoo = null;
    }

    public static synchronized Object OooO00o() {
        try {
            if (OooOOoo == null) {
                Object objOooO0o0 = OooO.OooO0o0(new Object[0]);
                OooOOoo = objOooO0o0;
                if (objOooO0o0 == null) {
                    OooOOoo = OooO0O0();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooOOoo;
    }

    public static Object OooO0O0() {
        Handler handler = new Handler(Looper.getMainLooper());
        Object obj = new Object();
        handler.post(new o00OOO00(obj, 1));
        if (OooOOoo == null && Looper.getMainLooper() != Looper.myLooper()) {
            synchronized (obj) {
                try {
                    obj.wait(300L);
                } catch (InterruptedException unused) {
                }
            }
        }
        return OooOOoo;
    }

    public static Binder OooO0OO() {
        return (Binder) OooOO0.OooOooo(OooO00o(), new Object[0]);
    }
}
