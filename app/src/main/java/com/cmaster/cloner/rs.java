package com.cmaster.cloner;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rs extends n80 {
    public static final String[] OooO;
    public static final String OooO0OO;
    public static final String OooO0Oo;
    public static final String OooO0o;
    public static final String OooO0o0;
    public static final String OooO0oO;
    public static final String OooO0oo;
    public static final String OooOO0;
    public static final String OooOO0O;

    static {
        u7.OooO00o(new byte[]{-107, -57, -80, -18, 20, -108, -76, -20, -126}, new byte[]{-15, -88, -57, -128, 120, -5, -43, -120});
        OooO0OO = u7.OooO00o(new byte[]{-65, -78, 40, -66, -66, 52, -35, 108, -91, -76, 51, -71, -88, 60, -35, 102, -80, -70, 57}, new byte[]{-47, -35, 92, -41, -40, 93, -66, 13});
        OooO0Oo = u7.OooO00o(new byte[]{47, -108, -93, 79, -115, -46, -26, -115, 37, -72, -99, 79, -111}, new byte[]{70, -25, -4, 63, -8, -80, -118, -28});
        u7.OooO00o(new byte[]{1, -114, 100, -79, 73, 29, -97, 60}, new byte[]{110, -6, 12, -44, 59, 104, -10, 88});
        OooO0o0 = u7.OooO00o(new byte[]{108, -7, -126, -20, -42, 43, 61, -65, 123, -9}, new byte[]{15, -106, -19, -121, -65, 78, 89, -34});
        u7.OooO00o(new byte[]{-111, -17, -104, 102, 117, -19, 22, -101, -117, -23, -125, 97, 112, -24, 20, -119, -116}, new byte[]{-1, -128, -20, 15, 19, -124, 117, -6});
        OooO0o = u7.OooO00o(new byte[]{6, -65, -39, 24, 38, 19, -98, -47, 10, -82, -33, 55}, new byte[]{110, -53, -83, 104, 121, 123, -5, -80});
        u7.OooO00o(new byte[]{70, 12, -14, -76, -102}, new byte[]{25, 104, -109, -64, -5, 3, -77, 105});
        OooO0oO = u7.OooO00o(new byte[]{29, -116, -21, -99, 93, -84, 99, -64, 16, -122, -10}, new byte[]{121, -23, -104, -23, 52, -62, 2, -76});
        OooO0oo = u7.OooO00o(new byte[]{-125, -94, 124, -111}, new byte[]{-21, -53, 18, -27, -109, -27, -35, -99});
        OooOO0 = u7.OooO00o(new byte[]{82, 111, -73, 74, 111, -17, -85, 16, 66, 116, -74, 74, 121, -85, -82, 88, 84, 44, -96, 73, 108, -85, -68, 79, 95, 100, -80, 76, 105, -23, -95}, new byte[]{51, 1, -45, 56, 0, -122, -49, 42});
        OooOO0O = u7.OooO00o(new byte[]{-60, -74, -32, -8, 28, 72, -79, -36, -44, -83, -31, -8, 10, 12, -76, -108, -62, -11, -9, -5, 31, 12, -90, -125, -55, -67, -25, -2, 26, 78, -69, -53, -60, -86, -29, -7}, new byte[]{-91, -40, -124, -118, 115, 33, -43, -26});
        u7.OooO00o(new byte[]{-26, 9, -26, -98, 50, -18, 67, -115, -10, 18, -25, -98, 36, -86, 70, -59, -32, 74, -15, -99, 49, -86, 84, -40, -11, 19, -81, -125, 47, -29, 66, -59}, new byte[]{-121, 103, -126, -20, 93, -121, 39, -73});
        OooO = new String[]{u7.OooO00o(new byte[]{32, -26, 88, 117, 46, 122, -100, 50}, new byte[]{79, -110, 48, 16, 92, 15, -11, 86}), u7.OooO00o(new byte[]{-66, -122, 78, 28, -88, 106, -110, 76, -92, -128, 85, 27, -83, 111, -112, 94, -93}, new byte[]{-48, -23, 58, 117, -50, 3, -15, 45})};
    }

    @Override // com.cmaster.cloner.n80
    public final void OooO0o(yq yqVar) {
        String str;
        String str2;
        String asString;
        Object[] objArr = yqVar.OooO0o;
        int iOooO0o = fn2.OooO0o(objArr, ContentValues.class);
        if (iOooO0o >= 2) {
            ContentValues contentValues = (ContentValues) objArr[iOooO0o];
            int iIntValue = contentValues.getAsInteger(OooO0oO).intValue();
            String string = null;
            if (qx1.OooO0o0() > 29 && iIntValue == 6) {
                yqVar.OooO0oo(null);
                return;
            }
            if (iIntValue == 4 && (asString = contentValues.getAsString((str2 = OooO0oo))) != null) {
                Uri uri = Uri.parse(asString);
                if (!TextUtils.equals(uri.getScheme(), u7.OooO00o(new byte[]{13, -73, -96, -66}, new byte[]{107, -34, -52, -37, -9, -51, 65, 11}))) {
                    uri = null;
                }
                if (uri != null) {
                    String path = uri.getPath();
                    int i = d02.OooO00o;
                    String strJMXEH = PAM.JMXEH(path);
                    if (strJMXEH != null) {
                        string = Uri.fromFile(new File(strJMXEH)).toString();
                    }
                }
                if (string != null && !TextUtils.equals(string, asString)) {
                    contentValues.put(str2, string);
                }
            }
            String str3 = OooO0OO;
            if (contentValues.getAsString(str3) == null) {
                return;
            }
            contentValues.put(str3, qx1.OooO0Oo());
            String str4 = OooO0o0;
            if (contentValues.containsKey(str4)) {
                String asString2 = contentValues.getAsString(str4);
                contentValues.remove(str4);
                int i2 = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    str = OooO0o;
                    sb.append(str);
                    sb.append(i2);
                    if (!contentValues.containsKey(sb.toString())) {
                        break;
                    } else {
                        i2++;
                    }
                }
                contentValues.put(str + i2, u7.OooO00o(new byte[]{105, -88, -110, 113, -15, 99, -4, -54}, new byte[]{42, -57, -3, 26, -104, 6, -58, -22}) + asString2);
            }
            String str5 = OooO0Oo;
            if (!contentValues.containsKey(str5)) {
                contentValues.put(str5, Boolean.TRUE);
            }
            for (String str6 : OooO) {
                contentValues.remove(str6);
            }
            contentValues.put(u7.OooO00o(new byte[]{14, 78, -72, 33, 2, 36, -107, -44, 3, 68, -91}, new byte[]{106, 43, -53, 66, 112, 77, -27, -96}), qx1.OooO0Oo());
        }
    }

    @Override // com.cmaster.cloner.n80
    public final void OooO0oO(yq yqVar) {
        Object[] objArr = yqVar.OooO0o;
        int iOooO0o = fn2.OooO0o(objArr, Bundle.class);
        if (iOooO0o >= 3) {
            Bundle bundle = (Bundle) objArr[iOooO0o];
            if (bundle == null || !yn2.OooO0O0()) {
                return;
            }
            String str = OooOO0;
            if (u7.OooO00o(new byte[]{92, -32, -42, 57, -102, 115, 29, -65, 70, -26, -51, 62, -97, 118, 31, -83, 65, -78, -99}, new byte[]{50, -113, -94, 80, -4, 26, 126, -34}).equals(bundle.getString(str))) {
                String strOooO00o = u7.OooO00o(new byte[]{2, 30, -38, 99, -111, 107, 6, -35, 15, 20, -57, 61, -36}, new byte[]{102, 123, -87, 0, -29, 2, 118, -87});
                String[] strArr = {qx1.OooO0Oo()};
                bundle.remove(str);
                String str2 = OooOO0O;
                bundle.remove(str2);
                bundle.putString(str, strOooO00o);
                bundle.putStringArray(str2, strArr);
            }
        }
    }
}
