package com.cmaster.cloner;

import android.location.ILocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.location.LocationRequest;
import android.os.Build;
import android.os.WorkSource;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vb0 extends ef1 {
    public static final String OooOOO = u7.OooO00o(new byte[]{-123, -36, -67, 31, 0}, new byte[]{-29, -87, -50, 122, 100, 30, 50, -97});
    public static Method OooOOOO;
    public final HashMap OooOO0O;
    public LocationManager OooOO0o;
    public LocationProvider OooOOO0;

    static {
        u7.OooO00o(new byte[]{-96, -110, -62, 8, 12, -118, -10, -61, -83, -109, -59, 27, 23, -118, -3, -125, -17, -75, -22, 21, 0, -126, -26, -124, -82, -110, -21, 27, 13, -126, -11, -120, -77}, new byte[]{-63, -4, -90, 122, 99, -29, -110, -19});
    }

    public vb0() {
        super(u7.OooO00o(new byte[]{-25, -108, -81, -120, 83, -27, -79, 45, -22, -107, -88, -101, 72, -27, -70, 109, -88, -77, -121, -107, 95, -19, -95, 106, -23, -108, -122, -101, 82, -19, -78, 102, -12}, new byte[]{-122, -6, -53, -6, 60, -116, -43, 3}));
        this.OooOO0O = new HashMap();
        this.OooOO0o = null;
        this.OooOOO0 = null;
    }

    public static boolean OooOO0(vb0 vb0Var) {
        if (TextUtils.equals(qx1.OooO00o(), u7.OooO00o(new byte[]{124, -36, 34, -34, 49, -61, 19, 82, 115, -42, 97, -111, 56, -56, 14, 90, 118, -41, 97, -105, 59, -33}, new byte[]{31, -77, 79, -16, 86, -84, 124, 53}))) {
            synchronized (vb0Var) {
                try {
                    if (vb0Var.OooOOO0 == null) {
                        try {
                            if (vb0Var.OooOO0o == null) {
                                vb0Var.OooOO0o = (LocationManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{-85, 3, -122, -102, 62, -80, -127, 92}, new byte[]{-57, 108, -27, -5, 74, -39, -18, 50}));
                            }
                            LocationProvider provider = vb0Var.OooOO0o.getProvider(OooOOO);
                            vb0Var.OooOOO0 = provider;
                            if (provider == null) {
                                return false;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public static tb0 OooOO0O(vb0 vb0Var, ILocationListener iLocationListener, String str) {
        tb0 tb0Var;
        synchronized (vb0Var.OooOO0O) {
            try {
                tb0Var = (tb0) vb0Var.OooOO0O.get(iLocationListener);
                if (tb0Var == null) {
                    tb0Var = new tb0(iLocationListener, str);
                    vb0Var.OooOO0O.put(iLocationListener, tb0Var);
                } else {
                    tb0Var.OooO0o0 = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tb0Var;
    }

    public static void OooOOO0(LocationRequest locationRequest) {
        if (locationRequest != null) {
            l81 l81Var = to0.OooO00o;
            if (l81Var != null) {
                l81Var.OooO(locationRequest, false);
            }
            l81 l81Var2 = to0.OooO0O0;
            if (l81Var2 != null) {
                if (!yn2.OooO0o()) {
                    l81Var2.OooO0oo(locationRequest, null);
                    return;
                }
                WorkSource workSource = (WorkSource) l81Var2.OooO0O0(locationRequest);
                if (workSource != null) {
                    workSource.clear();
                }
            }
        }
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        String strOooO00o = u7.OooO00o(new byte[]{8, -33, 39, -26, 93, 12, 77, -22, 27, -44, 53, -37, 92, 26, 75}, new byte[]{105, -69, 67, -78, 56, 127, 57, -70});
        int i = 0;
        OooO0O0(strOooO00o, new sb0(strOooO00o, i));
        String strOooO00o2 = u7.OooO00o(new byte[]{36, -109, -68, 58, -94, 88, -1, 85, 37, -126, -127, 39, -69, 75, -62, 84, 51, -124}, new byte[]{86, -10, -47, 85, -44, 61, -85, 48});
        OooO0O0(strOooO00o2, new sb0(strOooO00o2, i));
        String strOooO00o3 = u7.OooO00o(new byte[]{49, 74, -90, -124, 27, 78, -65, 106, 48, 64, -92, -71, 26, 88, -71, 118, 45, 76, -77, -92, 23, 82, -91}, new byte[]{66, 47, -46, -48, 126, 61, -53, 58});
        OooO0O0(strOooO00o3, new sb0(strOooO00o3, i));
        String strOooO00o4 = u7.OooO00o(new byte[]{-51, 72, -5, -121, -22, -53, -12, -127, -38, 116, -20, -119, -18, -10, -11, -105, -36, 104, -15, -123, -7, -21, -8, -99, -64}, new byte[]{-82, 36, -98, -26, -104, -97, -111, -14});
        OooO0O0(strOooO00o4, new sb0(strOooO00o4, i));
        String strOooO00o5 = u7.OooO00o(new byte[]{99, 3, -82, 30, 37, 120, -65, 44, 98, 9, -84, 35, 36, 110, -71, 57, 126, 7, -72, 38, 37, 111}, new byte[]{16, 102, -38, 74, 64, 11, -53, 124});
        OooO0O0(strOooO00o5, new sb0(strOooO00o5, i));
        String strOooO00o6 = u7.OooO00o(new byte[]{55, 95, -33, -70, 21, 40, 40, -26, 32, 99, -56, -76, 17, 21, 41, -16, 38, 118, -44, -70, 5, 16, 40, -15}, new byte[]{84, 51, -70, -37, 103, 124, 77, -107});
        OooO0O0(strOooO00o6, new sb0(strOooO00o6, i));
        String strOooO00o7 = u7.OooO00o(new byte[]{-85, -63, -39, -50, -54, -68, 31, -77, -86, -53, -37, -13, -53, -86, 25, -80, -84, -59, -39, -17, -36}, new byte[]{-40, -92, -83, -102, -81, -49, 107, -29});
        OooO0O0(strOooO00o7, new sb0(strOooO00o7, i));
        String strOooO00o8 = u7.OooO00o(new byte[]{102, -9, 26, 48, -84, 37, -57, 71, 113, -53, 13, 62, -88, 24, -58, 81, 119, -56, 11, 48, -86, 4, -47}, new byte[]{5, -101, 127, 81, -34, 113, -94, 52});
        OooO0O0(strOooO00o8, new sb0(strOooO00o8, i));
        String strOooO00o9 = u7.OooO00o(new byte[]{33, 119, -82, 111, 109, 117, 26, 35, 33, 96, -65, 90, 120, 107, 50, 40, 52, 95, -93, 91, 105, 99, 57, 35, 50}, new byte[]{64, 19, -54, 40, 29, 6, 87, 70});
        OooO0O0(strOooO00o9, new sb0(strOooO00o9, i));
        String strOooO00o10 = u7.OooO00o(new byte[]{47, -44, 13, 77, 41, 21, 98, 100, 56, -39, 14, 107, 45, 15, 67, 107, 3, -43, 26, 121, 56, 1, 73, 73, 39, -61, 29, 111, 55, 3, 94}, new byte[]{78, -80, 105, 10, 89, 102, 44, 5});
        OooO0O0(strOooO00o10, new sb0(strOooO00o10, i));
        String strOooO00o11 = u7.OooO00o(new byte[]{-127, 64, 53, -107, 70, -62, 37, -55, -128, 104, 61, -101, 67, -46, 16, -36, -98, 64, 54, -114, 124, -50, 17, -51, -106, 75, 61, -120}, new byte[]{-13, 37, 88, -6, 48, -89, 98, -71});
        OooO0O0(strOooO00o11, new sb0(strOooO00o11, i));
        String strOooO00o12 = u7.OooO00o(new byte[]{72, 89, 123, 63, 79, -109, -68, 39, 73, 114, 119, 38, 80, -111, -102, 35, 83, 83, 120, 29, 92, -123, -120, 54, 93, 89, 90, 57, 74, -126, -98, 57, 95, 78}, new byte[]{58, 60, 22, 80, 57, -10, -5, 87});
        OooO0O0(strOooO00o12, new sb0(strOooO00o12, i));
        String strOooO00o13 = u7.OooO00o(new byte[]{123, -34, 92, 16, -47, -69, -64, 8, 108, -44, 75, 0, -38, -85, -47}, new byte[]{9, -69, 45, 101, -76, -56, -76, 79});
        OooO0O0(strOooO00o13, new sb0(strOooO00o13, i));
        String strOooO00o14 = u7.OooO00o(new byte[]{-96, -22, -22, 84, -96, 70, -104, 23, -67, -23, -30, 85, -75, 70}, new byte[]{-46, -113, -121, 59, -42, 35, -33, 114});
        OooO0O0(strOooO00o14, new sb0(strOooO00o14, i));
        String strOooO00o15 = u7.OooO00o(new byte[]{-87, -82, -115, -60, 66, -107, -1, 42, -95, -71, -99, -17, 65, -107, -20}, new byte[]{-56, -54, -23, -118, 47, -16, -98, 102});
        OooO0O0(strOooO00o15, new sb0(strOooO00o15, i));
        String strOooO00o16 = u7.OooO00o(new byte[]{81, 120, -23, -15, 106, -122, 105, 6, 70, 124, -56, -9, 111, -105, 66, 5, 70, 111}, new byte[]{35, 29, -124, -98, 28, -29, 39, 107});
        OooO0O0(strOooO00o16, new sb0(strOooO00o16, i));
        String strOooO00o17 = u7.OooO00o(new byte[]{-23, -9, 112, 59, -81, 104, 90, -17, -1, -13, 105, 49, -86}, new byte[]{-101, -110, 29, 84, -39, 13, 15, -97});
        OooO0O0(strOooO00o17, new sb0(strOooO00o17, i));
        OooOO0o(new sb0(u7.OooO00o(new byte[]{54, 30, 86, 112, 46, 78, -74, 112, 54, 14, 71, 68, 18, 84, -106, 112, 50, 20, 87, 69}, new byte[]{87, 122, 50, 55, 94, 61, -27, 4}), i));
        OooOO0o(new sb0(u7.OooO00o(new byte[]{120, -116, 93, 56, -106, 112, -29, 9, 121, -70, 68, 54, -108, 96, -41, 53, 99, -102, 68, 50, -114, 112, -42}, new byte[]{10, -23, 48, 87, -32, 21, -92, 121}), i));
        int i2 = 1;
        OooO0O0(u7.OooO00o(new byte[]{-44, 116, 108, -7, -90, 119, 4, 61, -55, 114, 124, -8, -86, 107, 30, 36, -42, 117, 124, -8, -90, 119}, new byte[]{-90, 17, 29, -116, -61, 4, 112, 113}), new ub0(this, i2));
        OooO0O0(u7.OooO00o(new byte[]{-81, -19, -51, 24, 97, 2, 93, -7, -128, -29, -62, 21, 119, 10, 81, -4, -123, -21, -64, 16, 102, 3, 87, -13}, new byte[]{-61, -126, -82, 121, 21, 107, 50, -105}), new ub0(this, i));
        OooO0O0(u7.OooO00o(new byte[]{94, 25, -14, -52, 57, -82, -116, 68, 86, 31, -25, -12, 49, -78, -106}, new byte[]{57, 124, -122, -128, 88, -35, -8, 8}), new f90(17));
        OooOO0o(new sb0(u7.OooO00o(new byte[]{107, 104, 100, 9, 64, 65, -77, 75, 123, 116, 81, 2, 84, 91, -109, 75, 127, 114, 99, 31, 100, 73, -84, 83, 124, 103, 117, 7}, new byte[]{30, 6, 22, 108, 39, 40, -64, 63}), i));
        if (yn2.OooO0o()) {
            OooOO0o(new sb0(u7.OooO00o(new byte[]{-98, -11, 47, -121, 111, -120, 122, 90, -85, -2, 59, -99, 79, -120, 126, 92, -103, -29, 11, -113, 112, -112, 125, 73, -113, -5}, new byte[]{-20, -112, 72, -18, 28, -4, 31, 40}), i));
        } else {
            OooO0O0(u7.OooO00o(new byte[]{-57, -31, -86, -29, 20, -84, -68, -116, -14, -22, -66, -7, 52, -84, -72, -118, -64, -9, -114, -21, 11, -76, -69, -97, -42, -17}, new byte[]{-75, -124, -51, -118, 103, -40, -39, -2}), new ya0(15));
        }
        if (yn2.OooO0OO()) {
            OooO0O0(u7.OooO00o(new byte[]{77, -80, 105, -15, -93, 118, 3, -98, 71, -65, 119, -3, -81, 108}, new byte[]{36, -34, 3, -108, -64, 2, 79, -15}), new nd0(Boolean.TRUE, 1));
        }
        if (yn2.OooO0Oo()) {
            OooO0O0(u7.OooO00o(new byte[]{-11, 64, -11, -53, 41, 47, 66, -16, -17, 74, -17, -60, 41, 34, 87, -10, -23, 73, -19, -30, 52, 9, 91, -16, -12, 68, -47, -26, 37, 39, 66, -29, -29, 96, -17, -26, 36, 32, 70, -32}, new byte[]{-122, 37, -127, -121, 70, 76, 35, -124}), new nd0((Object) null, 1));
            OooO0O0(u7.OooO00o(new byte[]{-24, 91, 48, -127, -62, 14, 57, -38, -41, 81, 39, -91, -50, 19, 36, -43, -40, 81, 42, -80, -56, 21, 39, -41, -2, 76, 20, -91, -39, 17, 42, -36, -2, 123, 42, -91, -40, 22, 46, -33}, new byte[]{-101, 62, 68, -60, -70, 122, 75, -69}), new nd0((Object) null, 1));
            OooO0O0(u7.OooO00o(new byte[]{-124, 70, -22, 65, -39, 3, 4, -61, -69, 76, -3, 101, -43, 30, 25, -52, -76, 76, -16, 112, -45, 24, 26, -50, -110, 81, -50, 101, -62, 28, 23, -59, -110}, new byte[]{-9, 35, -98, 4, -95, 119, 118, -94}), new nd0((Object) null, 1));
            OooOO0o(new sb0(u7.OooO00o(new byte[]{-105, -89, 43, -32, -106, 29, -25, -78, -109, -94, 60, -46, -118, 11, -7, -102, -104, -73, 60, -21, -111, 29, -32, -102, -104, -90, 61}, new byte[]{-10, -61, 79, -89, -8, 110, -108, -1}), i));
        }
        if (Build.VERSION.SDK_INT == 29) {
            OooO0O0(u7.OooO00o(new byte[]{52, -17, -3, 86, -3, -35, -48, -69, 50, -6, -24, 115, -6, -62, -54, -116, 58, -17, -6}, new byte[]{83, -118, -119, 17, -109, -82, -93, -8}), new nd0((Object) (-1), 1));
        }
        if (yn2.OooO0o0()) {
            OooO0O0(u7.OooO00o(new byte[]{40, -121, 57, 115, 117, -98, -11, 94, 50, -115, 35, 122, 116, -100, -10, 70, 62, -122, 11, 80, 104, -88, -25, 79, 41}, new byte[]{91, -30, 77, 63, 26, -3, -108, 42}), new nd0((Object) null, 1));
            OooOO0o(new sb0(u7.OooO00o(new byte[]{33, 121, -31, -111, 32, -33, -78, -32, 40, 104, -39, -67, 54, -52, -76, -20, 41, 114}, new byte[]{70, 28, -107, -46, 85, -83, -64, -123}), i));
        }
        if (yn2.OooO0o()) {
            OooOO0o(new sb0(u7.OooO00o(new byte[]{-75, 54, -114, 119, 97, -65, 34, -105, -117, 60, -118, 127, 102, -94, 40, -117, -105, 54, -121, 122, 123, -91, 32, -84, -87, 39, -116, 112, 102}, new byte[]{-57, 83, -23, 30, 18, -53, 71, -27}), i));
            OooOO0o(new sb0(u7.OooO00o(new byte[]{57, 71, -20, -115, 39, 68, -109, -118, 12, 76, -8, -105, 26, 93, -109, -103, 8, 67, -25, -120, 54, 81, -107, -109}, new byte[]{75, 34, -117, -28, 84, 48, -10, -8}), i));
            OooO0O0(u7.OooO00o(new byte[]{120, -62, -70, -50, 69, -102, 119, -125, 70, -56, -66, -58, 66, -121, 125, -97, 70, -50, -82, -45, 83, -128, 119, -125}, new byte[]{10, -89, -35, -89, 54, -18, 18, -15}), new sb0(this, i2));
            int i3 = 16;
            OooO0O0(u7.OooO00o(new byte[]{112, -88, 111, -92, 64, 94, 96, -88, 120, -82, 122, -106, 91, 94, 99, -86, 118, -96, 126}, new byte[]{23, -51, 27, -30, 50, 49, 13, -28}), new f90(i3));
            OooO0O0(u7.OooO00o(new byte[]{50, -71, 126, -15, -46, -39, -57, 101, 58, -65, 107, -61, -55, -39, -60}, new byte[]{85, -36, 10, -73, -96, -74, -86, 41}), new f90(i3));
        }
        if (yn2.OooO0oo()) {
            OooO0O0(u7.OooO00o(new byte[]{89, -36, -14, 39, -61, -53, 6, 32, 78, -42, -25, 45, -43, -35}, new byte[]{43, -71, -124, 66, -79, -72, 99, 103}), new f90(18));
        }
    }

    public final void OooOO0o(sb0 sb0Var) {
        OooO0O0((String) sb0Var.OooO0OO, sb0Var);
    }
}
