package com.cmaster.cloner;

import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m21 {
    public static final Class OooO00o;
    public static final xb1 OooO0O0;
    public static final o00OO000 OooO0OO;

    static {
        Class<?> cls;
        u7.OooO00o(new byte[]{62, 29, 47, 108, -6, -46, 98, -128, 60, 28, 37, 106, -16, -43, 114, -128, 47, 30, 101, 78, -12, -55, 101, -53, 51, 22, 47, 82, -4, -56, 114, -3, 51, 26, 40, 123}, new byte[]{95, 115, 75, 30, -107, -69, 6, -82});
        try {
            cls = Class.forName(u7.OooO00o(new byte[]{-124, -32, 109, 115, -100, 121, 37, -83, -122, -31, 103, 117, -106, 126, 53, -83, -107, -29, 39, 81, -110, 98, 34, -26, -119, -21, 109, 77, -102, 99, 53, -48, -119, -25, 106, 100}, new byte[]{-27, -114, 9, 1, -13, 16, 65, -125}));
        } catch (Exception unused) {
            cls = null;
        }
        OooO00o = cls;
        n81.OooO0OO(cls, u7.OooO00o(new byte[]{-93, -82, 56, -61, 101, -81, -48}, new byte[]{-32, -4, 125, -126, 49, -32, -126, 78}));
        OooO0O0 = xb1.Oooo00O(cls, List.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-10, 82, -45, 35, 68, -93, -17, -121, -32, 82, -39, 50, 77}, new byte[]{-127, 32, -70, 87, 33, -9, -128, -41}), Parcel.class, Integer.TYPE);
        OooO0OO = o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-55, 40, 72, 126, 45, 39, -128}, new byte[]{-82, 77, 60, 50, 68, 84, -12, -47}), new Class[0]);
    }

    public static List OooO00o(Object obj) {
        o00OO000 o00oo000 = l21.OooO00o;
        if (o00oo000 != null) {
            return (List) o00oo000.OooOooo(obj, new Object[0]);
        }
        o00OO000 o00oo0002 = OooO0OO;
        if (o00oo0002 != null) {
            return (List) o00oo0002.OooOooo(obj, new Object[0]);
        }
        return null;
    }

    public static boolean OooO0O0(Class cls) {
        Class cls2 = OooO00o;
        return cls2 != null && cls == cls2;
    }

    public static Object OooO0OO(List list) {
        xb1 xb1Var = OooO0O0;
        if (xb1Var == null) {
            return null;
        }
        try {
            return xb1Var.Oooo000(list);
        } catch (Exception unused) {
            return null;
        }
    }
}
