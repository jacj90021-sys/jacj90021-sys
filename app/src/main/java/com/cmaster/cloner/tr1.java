package com.cmaster.cloner;

import android.os.Process;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class tr1 {
    public static boolean OooO00o;
    public static boolean OooO0O0;
    public static final a02 OooO0OO;
    public static final o00OO000 OooO0Oo;
    public static final a02 OooO0o0;

    static {
        Class<?> cls;
        u7.OooO00o(new byte[]{-47, 82, 48, 98, -75, 36, 87, -4, -52, 64, 40, 113, -79, 97, 47, -62, -25, 70, 50, 96, -75, 34, 28}, new byte[]{-75, 51, 92, 20, -36, 79, 121, -113});
        try {
            cls = Class.forName(u7.OooO00o(new byte[]{-102, -49, -111, -40, 5, -115, -56, 19, -121, -35, -119, -53, 1, -56, -80, 45, -84, -37, -109, -38, 5, -117, -125}, new byte[]{-2, -82, -3, -82, 108, -26, -26, 96}));
        } catch (Exception unused) {
            cls = null;
        }
        a02.Oooo0o0(cls, u7.OooO00o(new byte[]{22, -7, -105, -79, -116, 93, -128, -64, 22, -17, -77, -128, -99, 89, -126, -62, 0, -46, -126, -116, -101}, new byte[]{101, -100, -29, -31, -2, 50, -29, -91}), String.class);
        a02.Oooo0o0(cls, u7.OooO00o(new byte[]{-25, -27, 122, 45, -87, -9, -85, 68, -25, -13, 74, 28, -81, -7, -116, 72, -26, -27, 109, 9, -76, -22, -79}, new byte[]{-108, -128, 14, 125, -37, -104, -56, 33}), String.class);
        OooO0OO = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{-97, 31, 90, 69, -15, 78, -77, 78, -107, 31}, new byte[]{-8, 122, 46, 23, -124, 32, -57, 39}), new Class[0]);
        String strOooO00o = u7.OooO00o(new byte[]{-14, 88, -93, -50, 98, 122, -39, -114, -11, 110, -77, -15, 85, 109, -52, -104, -24, 82, -71}, new byte[]{-127, 61, -41, -102, 3, 8, -66, -21});
        Class cls2 = Integer.TYPE;
        OooO0Oo = o00OO000.Oooo00o(cls, strOooO00o, cls2);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{81, -38, -37, -92, 89, -120, -38}, new byte[]{56, -87, -19, -112, 27, -31, -82, -14}), new Class[0]);
        a02.Oooo0o0(cls, u7.OooO00o(new byte[]{13, -81, -70, 8, 51, 102, 127, -30, 6, -75}, new byte[]{100, -36, -116, 60, 113, 15, 11, -93}), String.class);
        a02.Oooo0o0(cls, u7.OooO00o(new byte[]{-102, 127, -6, -15, -9, -5, -108, -92, -109, 110, -57, -36, -15, -3, -108, -76, -98, 110, -25, -35, -20, -38, -125, -75}, new byte[]{-3, 26, -114, -78, -126, -119, -26, -63}), new Class[0]);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{21, 40, 5, -67, -128, -83, -113, -47, 30, 46, 40, -69, -105, -82, -89, -47}, new byte[]{124, 91, 79, -36, -10, -52, -53, -76}), new Class[0]);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-75, -22, 56, 30, -49, 122, 48, -95, -96, -13, 24, 31, -46, 93, 39, -96}, new byte[]{-61, -121, 113, 112, -68, 14, 66, -44}), new Class[0]);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{-118, 43, 99, -127, 59, -84, 59, 114, -128, 43, 112, -107, 39, -82, 59, 111}, new byte[]{-28, 78, 20, -44, 85, -36, 90, 22}), Class.class, cls2);
        OooO0o0 = a02.Oooo0o0(cls, u7.OooO00o(new byte[]{-26, -124, -29, -40, -76, 95, 91, 4, -12, -126, -29, -8, -75, 66, 124, 19, -11}, new byte[]{-127, -31, -105, -111, -38, 44, 47, 118}), String.class);
        o00OO000.Oooo00o(cls, u7.OooO00o(new byte[]{37, 19, 102, -32, 3, -92, -48, 113, 56, 55, 98, -63, 47, -72, -47, 121, 38, 2, 123, -57, 4, -77}, new byte[]{86, 118, 18, -88, 106, -64, -76, 20}), String[].class);
    }

    public static boolean OooO00o() {
        if (OooO00o) {
            return OooO0O0;
        }
        boolean zIs64Bit = Process.is64Bit();
        OooO0O0 = zIs64Bit;
        OooO00o = true;
        return zIs64Bit;
    }
}
