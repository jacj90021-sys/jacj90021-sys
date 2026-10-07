package com.cmaster.cloner;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vf1 extends n80 {
    public static final String OooO0OO;
    public static final String OooO0Oo;
    public static final HashSet OooO0o;
    public static final List OooO0o0;
    public static final HashMap OooO0oO;
    public static final HashSet OooO0oo;

    static {
        u7.OooO00o(new byte[]{-5, 7, -26, 6, 33, -92, -98, 123}, new byte[]{-120, 98, -110, 114, 72, -54, -7, 8});
        OooO0OO = u7.OooO00o(new byte[]{90, 120, -3, -68, -29, 78, 102, -38, 92, 99, -52, -88, -17, 93, 76, -37, 87}, new byte[]{57, 23, -109, -38, -118, 41, 57, -87});
        OooO0Oo = u7.OooO00o(new byte[]{-10, -120, -43, -80, 86, -80, 69, -75, -16, -109, -28, -73, 83, -69, 69, -76, -16, -109, -50, -92, 81}, new byte[]{-107, -25, -69, -42, 63, -41, 26, -58});
        u7.OooO00o(new byte[]{6, 119, -110, -115, -109, -21, -79, 86, 1, 123, -116, -112, -107, -11}, new byte[]{114, 18, -22, -7, -16, -121, -48, 37});
        u7.OooO00o(new byte[]{86, -91, 67, 55, 72, -49, -88}, new byte[]{36, -48, 45, 67, 33, -94, -51, -83});
        OooO0o0 = Arrays.asList(u7.OooO00o(new byte[]{-46, 66, 27, 112, 127, 10, 14, -91, -43, 78, 5, 109, 121, 20}, new byte[]{-90, 39, 99, 4, 28, 102, 111, -42}), u7.OooO00o(new byte[]{-16, 21, -64, -89, -58, 74, -73}, new byte[]{-126, 96, -82, -45, -81, 39, -46, 44}));
        HashSet hashSet = new HashSet();
        OooO0o = hashSet;
        HashMap map = new HashMap();
        OooO0oO = map;
        map.put(u7.OooO00o(new byte[]{70, -42, 68, 123, 105, 3, 46, 71, 70, -43, 126, 106, 89, 29, 59, 95, 86, -47, 68}, new byte[]{51, -91, 33, 9, 54, 112, 75, 51}), u7.OooO00o(new byte[]{-58}, new byte[]{-9, 105, 126, 81, -76, 70, 22, 36}));
        map.put(u7.OooO00o(new byte[]{-82, 46, -44, -22, -69, -100, -51, -120, -87, 47, -55, -63, -73, -111, -45, -68, -94, 52, -8, -1, -86, -128, -46}, new byte[]{-57, 64, -89, -98, -38, -16, -95, -41}), u7.OooO00o(new byte[]{-37}, new byte[]{-22, 77, 37, 19, -46, 58, 98, -126}));
        hashSet.add(u7.OooO00o(new byte[]{-51, -75, 121, 100, 100, -51, -114, 56, -112, -76, 106, 127, 122, -63, -127, 59, -11, -67, 119, 114, 105, -9, -100, 57, -34, -92, 113, 120, 107, -37, -80, 57, -60, -79, 122, 122, 105, -52}, new byte[]{-86, -48, 24, 22, 12, -88, -17, 92}));
        HashSet hashSet2 = new HashSet();
        OooO0oo = hashSet2;
        hashSet2.add(u7.OooO00o(new byte[]{63, 60, -59, -92, -98, -45, -77, -57, 4, 62, -45, -92, -109, -37, -73, -47, 4, 33, -41, -87, -99, -47, -65, -58, 53, 55, -41, -82, -83, -47, -77, -37, 4, 49, -53, -66, -105, -49, -115, -52, 45, 54, -64, -107, -97, -45, -80, -54, 55, 54}, new byte[]{91, 83, -78, -54, -14, -68, -46, -93}));
        hashSet2.add(u7.OooO00o(new byte[]{103, -99, 111, 3, -43, -8, 19, 101, 123, -127, 115, 11, -43, -12, 46, 111, 120, -123, 119, 19, -2, -22, 45, 106, 75, -118, 111, 11, -58, -18}, new byte[]{20, -20, 3, 106, -95, -99, 76, 6}));
        hashSet2.add(u7.OooO00o(new byte[]{88, -78, -32, 64, -77, -18, 75, -39, 78, -72, -32, 64, -93, -30, 123, -57, 89, -77}, new byte[]{60, -41, -106, 41, -48, -117, 20, -87}));
        hashSet2.add(u7.OooO00o(new byte[]{65, 98, 67, 57, 7, 101, 11, -127, 114, 125, 82, 55, 5, 101, 0, -118, 95, 126, 127, 57, 31, 96, 11, -104, 72, 105}, new byte[]{45, 13, 32, 88, 115, 12, 100, -17}));
    }

    public static int OooO(String str) {
        if (str.contains(u7.OooO00o(new byte[]{-105, -125, -11, -18, 117, 76}, new byte[]{-28, -26, -106, -101, 7, 41, 5, -128}))) {
            return 1;
        }
        if (str.contains(u7.OooO00o(new byte[]{-122, 90, 10, 89, 56, 54}, new byte[]{-11, 35, 121, 45, 93, 91, 110, 15}))) {
            return 0;
        }
        if (str.contains(u7.OooO00o(new byte[]{0, -13, -115, 63, 116, 63}, new byte[]{103, -97, -30, 93, 21, 83, 108, -11}))) {
            return 2;
        }
        return str.contains(u7.OooO00o(new byte[]{94, 51, 69, -97, -57, 40}, new byte[]{61, 92, 43, -7, -82, 79, 22, 32})) ? 3 : -1;
    }

    public static Bundle OooO0oo(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(u7.OooO00o(new byte[]{-17, -46, 109, 66}, new byte[]{-127, -77, 0, 39, -81, 69, -47, -125}), str);
        bundle.putString(u7.OooO00o(new byte[]{-99, -44, -9, 42, -124}, new byte[]{-21, -75, -101, 95, -31, -85, -12, 10}), str2);
        return bundle;
    }

    @Override // com.cmaster.cloner.n80
    public final void OooO0o(yq yqVar) {
        Object[] objArr = yqVar.OooO0o;
        int iOooO00o = fn2.OooO00o(objArr, Uri.class, 0);
        int iOooO00o2 = fn2.OooO00o(objArr, ContentValues.class, 0);
        if (iOooO00o < 0 || iOooO00o2 < 0) {
            return;
        }
        Uri uri = (Uri) objArr[iOooO00o];
        ContentValues contentValues = (ContentValues) objArr[iOooO00o2];
        int iOooO = OooO(uri.getLastPathSegment());
        if (iOooO != -1) {
            Set<Map.Entry<String, Object>> setValueSet = contentValues.valueSet();
            if (setValueSet != null) {
                Iterator<Map.Entry<String, Object>> it = setValueSet.iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (iOooO != 0 || key == null || !OooO0oo.contains(key)) {
                        String asString = contentValues.getAsString(key);
                        if (asString != null) {
                            lw1.OooO0O0().OooO0oo(iOooO, key, asString);
                        }
                    }
                }
            }
            yqVar.OooO0oo(null);
        }
    }

    @Override // com.cmaster.cloner.n80
    public final void OooO0o0(yq yqVar) {
        int iOooO0O0;
        int i = Build.VERSION.SDK_INT == 30 ? 3 : 2;
        if (!yn2.OooO0Oo()) {
            i = 1;
        }
        Object[] objArr = yqVar.OooO0o;
        Bundle bundle = (Bundle) objArr[i + 2];
        String str = (String) objArr[i + 1];
        String str2 = (String) objArr[i];
        if (yn2.OooO0Oo()) {
        }
        char c = str2.startsWith(u7.OooO00o(new byte[]{-29, 91, -99, 88}, new byte[]{-92, 30, -55, 7, -8, -87, -4, -83})) ? (char) 0 : str2.startsWith(u7.OooO00o(new byte[]{114, -13, -74, 10}, new byte[]{34, -90, -30, 85, 89, -59, 122, 101})) ? (char) 1 : str2.startsWith(u7.OooO00o(new byte[]{-59, -39, -34, 65}, new byte[]{-106, -100, -118, 30, 7, -16, 64, -42})) ? (char) 2 : str2.startsWith(u7.OooO00o(new byte[]{-3, 81, 47, 62, -121}, new byte[]{-79, 24, 124, 106, -40, 101, -110, 125})) ? (char) 3 : (char) 65535;
        u7.OooO00o(new byte[]{-65, 6, -60, -15, 71}, new byte[]{-36, 103, -88, -99, 103, -124, 54, 117});
        Objects.toString(bundle);
        int i2 = fp0.OooO00o;
        String strO000oo0O = null;
        if (c == 3) {
            yqVar.OooO0oo(null);
            return;
        }
        if (c == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(OooO0OO, false);
            bundle2.putInt(OooO0Oo, 2);
            yqVar.OooO0oo(bundle2);
            return;
        }
        int iOooO = OooO(str2);
        if (iOooO == -1) {
            return;
        }
        HashSet hashSet = OooO0oo;
        if (c == 1 && bundle != null) {
            if (i21.OooO0OO(qx1.OooO00o())) {
                if (iOooO == 0 && OooO0o.contains(str)) {
                    String string = bundle.getString(u7.OooO00o(new byte[]{61, 31, 20, -106, -101}, new byte[]{75, 126, 120, -29, -2, 90, -49, -84}));
                    if (string != null) {
                        lw1.OooO0O0().OooO0oo(iOooO, str, string);
                    }
                    yqVar.OooO0oo(new Bundle());
                    return;
                }
                if (iOooO != 0) {
                    String string2 = bundle.getString(u7.OooO00o(new byte[]{-3, -49, 17, 2, 124}, new byte[]{-117, -82, 125, 119, 25, -59, 113, -94}));
                    if (string2 != null && (str == null || !hashSet.contains(str))) {
                        lw1.OooO0O0().OooO0oo(iOooO, str, string2);
                    }
                    yqVar.OooO0oo(new Bundle());
                    return;
                }
                return;
            }
            return;
        }
        if (c == 0) {
            if (str == null || !hashSet.contains(str)) {
                if (TextUtils.equals(u7.OooO00o(new byte[]{81, -86, -87, -58, 27, 85, 32, -36, 89, -96}, new byte[]{48, -60, -51, -76, 116, 60, 68, -125}), str)) {
                    aq aqVarOooO0O0 = zw1.OooO00o().OooO0O0();
                    if (aqVarOooO0O0.OooO0OO()) {
                        yqVar.OooO0oo(OooO0oo(u7.OooO00o(new byte[]{82, 59, 77, -123, 98, 52, 105, -22, 90, 49}, new byte[]{51, 85, 41, -9, 13, 93, 13, -75}), aqVarOooO0O0.OooO0Oo.getString(u7.OooO00o(new byte[]{-48, -23, 70, -73, 23, -113, 38, -88, -41, -27, 74, -73, 6, -109, 45, -66, -51, -17, 90}, new byte[]{-94, -122, 62, -103, 103, -3, 73, -52}))));
                        return;
                    }
                } else if (yn2.OooO0oO() && ((i21.OooO0OO(qx1.OooO00o()) || ((iOooO0O0 = qx1.OooO0O0()) >= 0 && iOooO0O0 <= 31)) && (TextUtils.equals(u7.OooO00o(new byte[]{24, -36, -22, 26, 57, 20, 90, -6, 18, -17, -2, 27, 41, 9, 80, -3, 9}, new byte[]{122, -80, -97, 127, 77, 123, 53, -114}), str) || TextUtils.equals(u7.OooO00o(new byte[]{85, -90, -112, -42, -83, -115, 2, 121, 95, -107, -117, -46, -76, -121}, new byte[]{55, -54, -27, -77, -39, -30, 109, 13}), str)))) {
                    yqVar.OooO0oo(new Bundle());
                    return;
                }
                if (TextUtils.equals(u7.OooO00o(new byte[]{-67, -107, -102, -31, 116, -37, 38, 97, -68, -98, -104, -37, 107, -47, 34, 120, -80, -98, -117, -9, 71, -47, 56, 109, -69, -100, -119, -32}, new byte[]{-39, -16, -20, -124, 24, -76, 86, 12}), str)) {
                    yqVar.OooO0oo(OooO0oo(u7.OooO00o(new byte[]{18, 40, -87, 109, -91, 6, 126, -45, 19, 35, -85, 87, -70, 12, 122, -54, 31, 35, -72, 123, -106, 12, 96, -33, 20, 33, -70, 108}, new byte[]{118, 77, -33, 8, -55, 105, 14, -66}), u7.OooO00o(new byte[]{19}, new byte[]{35, -3, -85, 45, -66, 81, 89, -126})));
                    return;
                }
                if (TextUtils.equals(u7.OooO00o(new byte[]{19, -39, -18, 90, -28, 65, -16, -74, 30, -40, -24}, new byte[]{114, -67, -116, 5, -127, 47, -111, -44}), str)) {
                    yqVar.OooO0oo(OooO0oo(u7.OooO00o(new byte[]{-65, -106, -122, 29, 22, 4, -102, 84, -78, -105, -128}, new byte[]{-34, -14, -28, 66, 115, 106, -5, 54}), u7.OooO00o(new byte[]{96}, new byte[]{80, -93, 58, -115, -61, 26, -36, 100})));
                    return;
                }
                if (iOooO == 0 || !i21.OooO0OO(qx1.OooO00o())) {
                    return;
                }
                String str3 = (String) OooO0oO.get(str);
                Object objOooO0oo = str3 != null ? OooO0oo(str, str3) : null;
                if (iOooO == 1 && objOooO0oo != null) {
                    yqVar.OooO0oo(objOooO0oo);
                    return;
                }
                try {
                    lw1 lw1VarOooO0O0 = lw1.OooO0O0();
                    lw1VarOooO0O0.getClass();
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            strO000oo0O = lw1VarOooO0O0.OooO00o.o000oo0O(qx1.OooO0oO(), iOooO, str);
                        }
                    } catch (RemoteException e) {
                        lw1.OooO00o(e);
                    }
                } catch (Exception unused) {
                }
                yqVar.OooO0oo(OooO0oo(str, strO000oo0O));
            }
        }
    }
}
