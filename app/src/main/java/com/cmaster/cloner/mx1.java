package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import android.util.AndroidRuntimeException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mx1 {
    public static final oO00OOOo OooO0OO;
    public hf0 OooO00o;
    public Context OooO0O0;

    static {
        u7.OooO00o(new byte[]{-50, -27, -72, 16, 58, -61, -85, -126, -52, -28, -78, 22, 48, -60, -69, -126, -33, -26, -14, 7, 45, -34, -67, -51, -127, -51, -99, 43, 25, -1, -99, -23, -16, -50, -124, 43, 6, -2, -122, -30, -24, -44, -116, 35, 22, -31, -114, -21, -22}, new byte[]{-81, -117, -36, 98, 85, -86, -49, -84});
        u7.OooO00o(new byte[]{-100, 122, 38, -53, 95, 101, 80, 95, -98, 123, 44, -51, 85, 98, 64, 95, -115, 121, 108, -40, 83, 120, 93, 30, -109, 58, 16, -4, 97, 89, 113, 34, -87, 75, 18, -4, 98, 65, 125, 34, -82, 93, 13, -9, 99}, new byte[]{-3, 20, 66, -71, 48, 12, 52, 113});
        u7.OooO00o(new byte[]{-126, 64, -65, -115, 102, -96, -45, 81, -128, 65, -75, -117, 108, -89, -61, 81, -109, 67, -11, -102, 113, -67, -59, 30, -51, 124, -98, -82, 92, -116, -28, 43, -68, 126, -98, -83, 68, -128, -28, 44, -86, 97, -107, -84, 86, -121, -10, 50, -90, 125}, new byte[]{-29, 46, -37, -1, 9, -55, -73, 127});
        OooO0OO = new oO00OOOo(20);
    }

    public static String OooO(int i) {
        if (i == -122) {
            return u7.OooO00o(new byte[]{-121, -13, -38, -115, 111, 78, 89, -104, -120, -4, -64, -107, 107, 70, 74, -105, -100, -14, -54, -100, 125, 81, 74, -119, -127, -23, -42, -99, 107, 68, 92, -119, -117, -7}, new byte[]{-50, -67, -119, -39, 46, 2, 21, -57});
        }
        if (i == -121) {
            return u7.OooO00o(new byte[]{-121, 97, -22, 45, -55, -61, -104, -61, -120, 110, -16, 53, -51, -53, -117, -53, -100, 96, -9, 62, -41, -58, -102, -49, -102, 110, -11, 53, -51, -53, -117, -54, -117, 125, -22, 48, -57, -63}, new byte[]{-50, 47, -71, 121, -120, -113, -44, -100});
        }
        if (i == -28) {
            return u7.OooO00o(new byte[]{-110, -46, 65, -80, 87, -25, 87, -92, -99, -35, 91, -88, 83, -17, 68, -74, -110, -49, 65, -83, 88, -20, 68, -88, -117, -48, 91, -80}, new byte[]{-37, -100, 18, -28, 22, -85, 27, -5});
        }
        if (i == 1) {
            return u7.OooO00o(new byte[]{85, 34, 79, 2, 70, -28, -96, 58, 79, 57, 95, 21, 66, -19, -88, 32, 88}, new byte[]{28, 108, 28, 86, 7, -88, -20, 101});
        }
        switch (i) {
            case -118:
                return u7.OooO00o(new byte[]{-15, 51, 75, 92, -61, 25, -121, -116, -2, 60, 81, 68, -57, 17, -108, -111, -7, 57, 71, 91, -53, 18, -123, -110, -20, 40, 74, 77}, new byte[]{-72, 125, 24, 8, -126, 85, -53, -45});
            case -117:
                return u7.OooO00o(new byte[]{124, -109, -30, 96, -82, 98, -74, -53, 115, -100, -8, 120, -86, 106, -91, -42, 116, -103, -18, 112, -86, 118, -91, -39, 112, -119, -16, 112, -82, 122, -69}, new byte[]{53, -35, -79, 52, -17, 46, -6, -108});
            case -116:
                return u7.OooO00o(new byte[]{-120, -103, -124, -109, 97, 1, -78, 12, -121, -106, -98, -117, 101, 9, -95, 0, -124, -124, -124, -114, 111, 3, -95, 26, -113, -127, -106, -117, 105, 9}, new byte[]{-63, -41, -41, -57, 32, 77, -2, 83});
            case -115:
                return u7.OooO00o(new byte[]{62, -6, 10, 33, -62, 68, 42, 6, 49, -11, 16, 57, -58, 76, 57, 24, 53, -5, 11, 33, -58, 76}, new byte[]{119, -76, 89, 117, -125, 8, 102, 89});
            default:
                switch (i) {
                    case -113:
                        return u7.OooO00o(new byte[]{71, 13, 116, -57, 69, -65, 119, 3, 72, 2, 110, -33, 65, -73, 100, 18, 65, 28, 106, -46, 80, -80, 115, 21, 64, 4, 120, -46, 70, -70, 104}, new byte[]{14, 67, 39, -109, 4, -13, 59, 92});
                    case -112:
                        return u7.OooO00o(new byte[]{13, -75, -63, -62, 47, 20, 95, -62, 2, -70, -37, -38, 43, 28, 76, -39, 17, -85, -34, -33, 45, 25, 71, -40, 27, -85, -41, -60, 35, 17, 64, -50, 13, -76, -36}, new byte[]{68, -5, -110, -106, 110, 88, 19, -99});
                    case -111:
                        return u7.OooO00o(new byte[]{-99, 120, -45, -22, -44, -106, -108, 48, -110, 119, -55, -14, -48, -98, -121, 58, -121, 115, -46, -31, -57, -97, -117, 59, -122, 127, -61, -22, -48, -98}, new byte[]{-44, 54, -128, -66, -107, -38, -40, 111});
                    case -110:
                        return u7.OooO00o(new byte[]{-68, 24, -107, -43, -50, -11, 15, -66, -77, 23, -113, -51, -54, -3, 28, -88, -69, 2, -125, -45, -63, -8, 15, -66, -80, 4, -108, -50, -35}, new byte[]{-11, 86, -58, -127, -113, -71, 67, -31});
                    case -109:
                        return u7.OooO00o(new byte[]{62, 94, 8, 50, 33, -125, -95, -12, 39, 81, 9, 53, 37, -112, -85, -22, 62, 92, 30, 34, 63, -126, -84, -27, 62, 86, 30, 53, 52, -112, -88, -26, 39, 68, 2}, new byte[]{119, 16, 91, 102, 96, -49, -19, -85});
                    case -108:
                        return u7.OooO00o(new byte[]{74, -78, 53, 119, 111, -1, -60, 78, 83, -67, 52, 112, 107, -20, -50, 80, 74, -80, 35, 103, 113, -2, -55, 95, 74, -70, 35, 112, 122, -20, -59, 80, 79, -70, 41, 113, 99, -10, -52}, new byte[]{3, -4, 102, 35, 46, -77, -120, 17});
                    case -107:
                        return u7.OooO00o(new byte[]{41, 3, -82, 74, -15, -38, 16, -9, 48, 12, -81, 77, -11, -55, 26, -23, 41, 1, -72, 90, -17, -44, 29, -20, 63, 30, -75, 95, -30, -45, 24, -9, 53, 30, -72, 76, -17, -33, 24}, new byte[]{96, 77, -3, 30, -80, -106, 92, -88});
                    case -106:
                        return u7.OooO00o(new byte[]{-96, -86, 58, -38, 107, -13, -81, 105, -71, -91, 59, -35, 111, -32, -91, 119, -96, -88, 44, -54, 117, -3, -94, 114, -74, -76, 40, -51, 97, -2, -92, 115, -74, -86, 40, -61, 111}, new byte[]{-23, -28, 105, -114, 42, -65, -29, 54});
                    case -105:
                        return u7.OooO00o(new byte[]{-126, 83, 120, -26, -53, -16, 26, -65, -101, 92, 121, -31, -49, -29, 16, -95, -126, 81, 110, -10, -43, -1, 19, -78, -97, 84, 109, -5, -55, -3, 2, -91, -108, 88, 101, -15, -59, -8, 31, -82, -116}, new byte[]{-53, 29, 43, -78, -118, -68, 86, -32});
                    case -104:
                        return u7.OooO00o(new byte[]{-51, 122, -92, 1, 12, 36, -18, 48, -44, 117, -91, 6, 8, 55, -28, 46, -51, 120, -78, 17, 18, 33, -20, 44, -53, 122, -92, 28, 30, 60, -25, 33, -48, 107, -76, 16, 31, 60, -21, 41, -51, 119, -74, 1, 8, 59}, new byte[]{-124, 52, -9, 85, 77, 104, -94, 111});
                    case -103:
                        return u7.OooO00o(new byte[]{-76, 62, 37, 80, -58, 53, -52, 18, -83, 49, 36, 87, -62, 38, -58, 12, -76, 60, 51, 64, -40, 55, -49, 18, -66, 53, 36, 80, -50, 63, -55, 14, -68, 36, 51, 87}, new byte[]{-3, 112, 118, 4, -121, 121, -128, 77});
                    case -102:
                        return u7.OooO00o(new byte[]{-21, -86, 42, -86, 17, 19, 13, 76, -14, -91, 43, -83, 21, 0, 7, 82, -21, -88, 60, -70, 15, 10, 15, 86, -6, -76, 60, -67, 4, 26, 5, 76, -25, -68, 58, -69, 0, 11, 8, 92, -20}, new byte[]{-94, -28, 121, -2, 80, 95, 65, 19});
                    case -101:
                        return u7.OooO00o(new byte[]{94, -68, -43, -50, 1, 30, -105, 45, 71, -77, -44, -55, 5, 13, -99, 51, 94, -66, -61, -34, 31, 16, -102, 54, 72, -65, -57, -44, 9, 20, -98, 33, 67}, new byte[]{23, -14, -122, -102, 64, 82, -37, 114});
                    case -100:
                        return u7.OooO00o(new byte[]{-10, -48, 96, 126, -102, -16, -115, -108, -17, -33, 97, 121, -98, -29, -121, -118, -10, -46, 118, 110, -124, -14, -114, -97, -32, -33, 99, 97}, new byte[]{-65, -98, 51, 42, -37, -68, -63, -53});
                    default:
                        switch (i) {
                            case -25:
                                return u7.OooO00o(new byte[]{30, 35, 83, -20, -11, -104, -81, -37, 17, 44, 73, -12, -15, -112, -68, -46, 18, 63, 83, -15, -5, -102, -68, -64, 24, 58, 78, -1, -26, -107, -89, -63}, new byte[]{87, 109, 0, -72, -76, -44, -29, -124});
                            case -24:
                                return u7.OooO00o(new byte[]{-46, 64, -32, 116, -68, 41, 43, -45, -35, 79, -6, 108, -72, 33, 56, -39, -46, 74, -20, 99, -75, 36, 41, -53, -34, 74}, new byte[]{-101, 14, -77, 32, -3, 101, 103, -116});
                            case -23:
                                return u7.OooO00o(new byte[]{71, 35, -115, -41, 107, 76, 99, 35, 72, 44, -105, -49, 111, 68, 112, 44, 79, 46, -107, -62, 109, 69, 112, 63, 70, 44, -112, -60, 111, 68}, new byte[]{14, 109, -34, -125, 42, 0, 47, 124});
                            case -22:
                                return u7.OooO00o(new byte[]{-78, -14, 51, 52, -75, -51, 1, 104, -67, -3, 41, 44, -79, -59, 18, 97, -66, -18, 41, 38, -67, -62, 12, 99, -78, -13, 46, 63, -78, -64, 4, 123, -82, -18, 37}, new byte[]{-5, -68, 96, 96, -12, -127, 77, 55});
                            case -21:
                                return u7.OooO00o(new byte[]{-12, -88, 7, 92, -23, 10, 113, 50, -5, -89, 29, 68, -19, 2, 98, 59, -8, -76, 29, 78, -31, 5, 124, 57, -12, -87, 26, 87, -4, 15, 112, 40, -14, -77, 0}, new byte[]{-67, -26, 84, 8, -88, 70, 61, 109});
                            case -20:
                                return u7.OooO00o(new byte[]{-65, 110, -31, 29, -64, -13, -90, -73, -80, 97, -5, 5, -60, -5, -75, -91, -77, 100, -5, 8, -34, -22, -92, -87, -96, 97, -5, 5, -64, -3, -90, -83}, new byte[]{-10, 32, -78, 73, -127, -65, -22, -24});
                            case -19:
                                return u7.OooO00o(new byte[]{-63, -42, -120, -85, -13, 2, -53, -28, -50, -39, -110, -77, -9, 10, -40, -14, -58, -50, -102, -77, -5, 10, -40, -14, -58, -53, -113, -66, -2, 2, -40, -9, -57, -37, -102, -85, -5, 1, -55}, new byte[]{-120, -104, -37, -1, -78, 78, -121, -69});
                            case -18:
                                return u7.OooO00o(new byte[]{-98, 6, 108, -56, -62, -62, 24, 115, -111, 9, 118, -48, -58, -54, 11, 111, -104, 6, 107, -35, -54, -64, 17, 126, -120, 13, 109, -50, -52, -36}, new byte[]{-41, 72, 63, -100, -125, -114, 84, 44});
                            case -17:
                                return u7.OooO00o(new byte[]{-108, -21, -115, -122, -21, 86, 60, -92, -101, -28, -105, -98, -17, 94, 47, -74, -108, -10, -115, -101, -28, 93, 47, -67, -104, -28, -118, -121, -8, 95}, new byte[]{-35, -91, -34, -46, -86, 26, 112, -5});
                            case -16:
                                return u7.OooO00o(new byte[]{105, -19, -27, -22, 8, 75, 19, -87, 102, -30, -1, -14, 12, 67, 0, -75, 112, -10, -23, -1, 11, 78, 0, -65, 110, -32, -7, -13, 25, 70, 11, -65, 98, -17, -13}, new byte[]{32, -93, -74, -66, 73, 7, 95, -10});
                            case -15:
                                return u7.OooO00o(new byte[]{-4, 79, -73, 125, -50, 49, -126, 103, -13, 64, -83, 101, -54, 57, -111, 108, -16, 82, -80, 118, -64, 51, -126, 97}, new byte[]{-75, 1, -28, 41, -113, 125, -50, 56});
                            case -14:
                                return u7.OooO00o(new byte[]{112, 8, 105, -76, -113, 120, -42, 12, 127, 7, 115, -84, -117, 112, -59, 29, 124, 17, 127, -78, -111, 103, -34, 24}, new byte[]{57, 70, 58, -32, -50, 52, -102, 83});
                            case -13:
                                return u7.OooO00o(new byte[]{-127, -32, -36, -92, -102, -61, -113, 121, -114, -17, -58, -68, -98, -53, -100, 101, -121, -32, -55, -68, -110, -52, -105, 111, -122, -23, -48, -96, -119, -64, -107, 111, -116, -21, -35}, new byte[]{-56, -82, -113, -16, -37, -113, -61, 38});
                            case -12:
                                return u7.OooO00o(new byte[]{-61, 63, -69, 65, -39, -81, -62, 5, -52, 48, -95, 89, -35, -89, -47, 21, -58, 53, -83, 71, -57, -80, -54, 17}, new byte[]{-118, 113, -24, 21, -104, -29, -114, 90});
                            case -11:
                                return u7.OooO00o(new byte[]{-31, 78, 79, -11, 47, 32, 10, -56, -18, 65, 85, -19, 43, 40, 25, -45, -19, 88, 83, -15, 58}, new byte[]{-88, 0, 28, -95, 110, 108, 70, -105});
                            case -10:
                                return u7.OooO00o(new byte[]{-10, 69, 77, 11, 66, -30, -121, -10, -7, 74, 87, 19, 70, -22, -108, -5, -6, 91, 82, 30, 64, -21, -108, -22, -16, 94, 82, 27, 77, -6, -108, -19, -6, 71, 91, 11, 70}, new byte[]{-65, 11, 30, 95, 3, -82, -53, -87});
                            case -9:
                                return u7.OooO00o(new byte[]{-117, 102, 102, 76, -70, -16, 20, -45, -124, 105, 124, 84, -66, -8, 7, -63, -117, 123, 102, 81, -75, -5, 7, -33, -118, 105, 103, 93, -65, -29, 20, -59, -128, 122, 116, 74, -94}, new byte[]{-62, 40, 53, 24, -5, -68, 88, -116});
                            case -8:
                                return u7.OooO00o(new byte[]{44, 88, -21, -60, 65, 117, 103, -74, 35, 87, -15, -36, 69, 125, 116, -70, 45, 87, -22, -43, 68, 102, 126, -70, 32, 68, -25, -39, 78, 122, 100, -92, 53, 87, -20, -39, 66, 117, 110}, new byte[]{101, 22, -72, -112, 0, 57, 43, -23});
                            case -7:
                                return u7.OooO00o(new byte[]{-95, -42, -101, -86, 108, 124, -37, -85, -82, -39, -127, -78, 104, 116, -56, -95, -72, -36, -119, -86, 104, 111, -34, -70, -85, -41, -123, -82, 108, 100, -34, -74, -92, -35}, new byte[]{-24, -104, -56, -2, 45, 48, -105, -12});
                            case -6:
                                return u7.OooO00o(new byte[]{120, 125, -34, -127, -113, 109, -3, 89, 119, 114, -60, -103, -117, 101, -18, 72, 126, 108, -34, -99, -113, 115, -12, 66, 110, 102, -34, -112, -100}, new byte[]{49, 51, -115, -43, -50, 33, -79, 6});
                            case -5:
                                return u7.OooO00o(new byte[]{81, -58, 83, 5, 28, 31, 31, -88, 94, -55, 73, 29, 24, 23, 12, -77, 77, -40, 76, 24, 30, 18, 7, -78, 71, -40, 65, 18, 22, 18, 20, -78}, new byte[]{24, -120, 0, 81, 93, 83, 83, -9});
                            case -4:
                                return u7.OooO00o(new byte[]{50, -20, -39, 96, 66, 84, -33, 30, 61, -29, -61, 120, 70, 92, -52, 8, 53, -15, -33, 114, 69, 81, -48, 8, 62, -20, -34, 107, 80, 76, -36, 19, 58, -27, -49}, new byte[]{123, -94, -118, 52, 3, 24, -109, 65});
                            case -3:
                                return u7.OooO00o(new byte[]{87, 97, 123, -112, 73, 72, 100, 20, 88, 110, 97, -120, 77, 64, 119, 2, 80, 121, 105, -120, 65, 64, 119, 30, 76, 102}, new byte[]{30, 47, 40, -60, 8, 4, 40, 75});
                            case -2:
                                return u7.OooO00o(new byte[]{2, 62, 2, -55, 106, -91, 118, -69, 13, 49, 24, -47, 110, -83, 101, -83, 5, 38, 16, -47, 98, -83, 101, -91, 27, 59}, new byte[]{75, 112, 81, -99, 43, -23, 58, -28});
                            case -1:
                                return u7.OooO00o(new byte[]{-25, -57, 96, -117, -51, 68, -78, 88, -24, -56, 122, -109, -55, 76, -95, 70, -30, -37, 118, -98, -56, 81, -95, 66, -10, -64, 96, -117, -33}, new byte[]{-82, -119, 51, -33, -116, 8, -2, 7});
                            default:
                                return Integer.toString(i);
                        }
                }
        }
    }

    public static void OooO00o(Exception exc) {
        u7.OooO00o(new byte[]{-104, -56, -36}, new byte[]{-53, -111, -113, 11, 48, -93, 87, -81});
        Thread.currentThread();
        oO00OOOo oo00oooo = lw1.OooO0O0;
        if (!(exc instanceof RemoteException) && (exc instanceof RuntimeException)) {
            throw ((RuntimeException) exc);
        }
    }

    public static void OooO0O0(int i, ApplicationInfo applicationInfo) {
        if (applicationInfo == null) {
            return;
        }
        String str = applicationInfo.packageName;
        HashSet hashSet = i21.OooO00o;
        if (i21.OooO0Oo(qx1.OooO00o(), str)) {
            applicationInfo.uid = 99992;
        }
        if (m63.OooO0OO == 0 || m63.OooO0O0()) {
            if (i21.OooOO0O.contains(applicationInfo.packageName) && !new File(applicationInfo.sourceDir).exists()) {
                File file = (m63.OooO0OO == 0 ? qx1.OooO0o() : ox1.o0O0ooO().Oooo0oO(i, applicationInfo.packageName)).OooO0oo;
                if (file == null) {
                    throw new AndroidRuntimeException(u7.OooO00o(new byte[]{-10, -65, -116, 48, -3, 43, -34, 55, -8, -34, -102, 39, -113, 42, -39, 90}, new byte[]{-76, -2, -33, 117, -35, 101, -117, 123}));
                }
                String absolutePath = file.getAbsolutePath();
                String absolutePath2 = new File(absolutePath, applicationInfo.sourceDir).getAbsolutePath();
                if (new File(absolutePath2).exists()) {
                    applicationInfo.sourceDir = absolutePath2;
                    applicationInfo.publicSourceDir = absolutePath2;
                    if (!fn2.OooO0o0(applicationInfo.splitSourceDirs)) {
                        for (int i2 = 0; i2 < applicationInfo.splitSourceDirs.length; i2++) {
                            if (!new File(applicationInfo.splitSourceDirs[i2]).exists()) {
                                applicationInfo.splitSourceDirs[i2] = new File(absolutePath, applicationInfo.splitSourceDirs[i2]).getAbsolutePath();
                            }
                        }
                    }
                    if (fn2.OooO0o0(applicationInfo.splitPublicSourceDirs)) {
                        return;
                    }
                    for (int i3 = 0; i3 < applicationInfo.splitPublicSourceDirs.length; i3++) {
                        if (!new File(applicationInfo.splitPublicSourceDirs[i3]).exists()) {
                            applicationInfo.splitPublicSourceDirs[i3] = new File(absolutePath, applicationInfo.splitPublicSourceDirs[i3]).getAbsolutePath();
                        }
                    }
                }
            }
        }
    }

    public static boolean OooO0OO(ComponentInfo componentInfo, int i) {
        if (componentInfo == null) {
            return false;
        }
        OooO0O0(i, componentInfo.applicationInfo);
        return i21.OooO00o(componentInfo.packageName);
    }

    public static void OooO0Oo(PackageInfo packageInfo, int i) {
        if (packageInfo == null) {
            return;
        }
        OooO0O0(i, packageInfo.applicationInfo);
        ActivityInfo[] activityInfoArr = packageInfo.activities;
        if (activityInfoArr != null) {
            for (ActivityInfo activityInfo : activityInfoArr) {
                OooO0OO(activityInfo, i);
            }
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                OooO0OO(serviceInfo, i);
            }
        }
        ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
        if (activityInfoArr2 != null) {
            for (ActivityInfo activityInfo2 : activityInfoArr2) {
                OooO0OO(activityInfo2, i);
            }
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        if (providerInfoArr != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                OooO0OO(providerInfo, i);
            }
        }
    }

    public static void OooO0o(int i, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (OooO0o0(i, (ResolveInfo) it.next())) {
                it.remove();
            }
        }
    }

    public static boolean OooO0o0(int i, ResolveInfo resolveInfo) {
        if (resolveInfo == null) {
            return false;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        boolean zOooO0OO = activityInfo != null ? OooO0OO(activityInfo, i) : false;
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            zOooO0OO = OooO0OO(serviceInfo, i);
        }
        ProviderInfo providerInfo = resolveInfo.providerInfo;
        return providerInfo != null ? OooO0OO(providerInfo, i) : zOooO0OO;
    }

    public static mx1 OooO0oO() {
        return (mx1) OooO0OO.OooO0O0();
    }

    public final PackageInfo OooO0oo(int i, int i2, String str) {
        try {
            PackageInfo packageInfoO000o0oo = this.OooO00o.o000o0oo(i, i2, qx1.OooO00o(), str);
            OooO0Oo(packageInfoO000o0oo, i);
            return packageInfoO000o0oo;
        } catch (Exception e) {
            OooO00o(e);
            return null;
        }
    }

    public final boolean OooOO0(String str) {
        return OooOO0O(qx1.OooO0oO(), str);
    }

    public final boolean OooOO0O(int i, String str) {
        try {
            return this.OooO00o.OooOO0(i, str);
        } catch (Exception e) {
            OooO00o(e);
            return false;
        }
    }

    public final boolean OooOO0o(int i, String str) {
        if (str == null) {
            return false;
        }
        try {
            return this.OooO00o.o000OooO(i, str);
        } catch (Exception e) {
            OooO00o(e);
            return false;
        }
    }

    public final List OooOOO(Intent intent, String str, int i, int i2) {
        try {
            List listOooo0 = this.OooO00o.Oooo0(qx1.OooO00o(), intent, str, i, i2);
            OooO0o(i2, listOooo0);
            return listOooo0;
        } catch (Exception e) {
            OooO00o(e);
            return new ArrayList(0);
        }
    }

    public final List OooOOO0(int i, int i2, String str, int i3) {
        try {
            List listOooOO0O = this.OooO00o.OooOO0O(i, i2, i3, qx1.OooO00o(), str);
            if (!fn2.OooO0Oo(listOooOO0O)) {
                Iterator it = listOooOO0O.iterator();
                while (it.hasNext()) {
                    OooO0OO((ProviderInfo) it.next(), i3);
                }
            }
            return listOooOO0O;
        } catch (Exception e) {
            OooO00o(e);
            return new ArrayList(0);
        }
    }

    public final ActivityInfo OooOOOO(int i, Intent intent) {
        ResolveInfo resolveInfoO000O0;
        ActivityInfo activityInfo;
        if (intent.getComponent() != null) {
            try {
                ActivityInfo activityInfoOooOo0 = this.OooO00o.OooOo0(qx1.OooO00o(), intent.getComponent(), 0, i);
                OooO0OO(activityInfoOooOo0, i);
                return activityInfoOooOo0;
            } catch (Exception e) {
                OooO00o(e);
                return null;
            }
        }
        try {
            resolveInfoO000O0 = this.OooO00o.o000O0(qx1.OooO00o(), intent, intent.resolveTypeIfNeeded(this.OooO0O0.getContentResolver()), 0, i);
            OooO0o0(i, resolveInfoO000O0);
        } catch (Exception e2) {
            OooO00o(e2);
            resolveInfoO000O0 = null;
        }
        if (resolveInfoO000O0 == null || (activityInfo = resolveInfoO000O0.activityInfo) == null) {
            return null;
        }
        return activityInfo;
    }

    public final ResolveInfo OooOOOo(Intent intent, String str, int i, int i2) {
        try {
            ResolveInfo resolveInfoO000OoOo = this.OooO00o.o000OoOo(qx1.OooO00o(), intent, str, i, i2);
            OooO0o0(i2, resolveInfoO000OoOo);
            return resolveInfoO000OoOo;
        } catch (Exception e) {
            OooO00o(e);
            return null;
        }
    }
}
