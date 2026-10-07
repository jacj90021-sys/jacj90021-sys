package com.cmaster.cloner;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lr2 {
    public static Uri OooO00o(int i, Intent intent, String str) {
        Uri uri;
        Uri uriOooO0O0;
        Uri uriOooO0O02;
        Parcelable parcelableExtra = intent.getParcelableExtra(u7.OooO00o(new byte[]{-112, -12, -117, 126, 15, -5, -94, -68, -104, -12, -101, 105, 14, -26, -24, -9, -119, -18, -99, 109, 78, -37, -120, -58, -76, -44, -69}, new byte[]{-15, -102, -17, 12, 96, -110, -58, -110}));
        if (parcelableExtra != null && (parcelableExtra instanceof Intent)) {
            OooO00o(i, (Intent) parcelableExtra, str);
        }
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra(u7.OooO00o(new byte[]{-56, -58, -4, -45, 76, 94, -126, 86, -64, -58, -20, -60, 77, 67, -56, 29, -47, -36, -22, -64, 13, 126, -88, 49, -3, -31, -39, -19, 124, 126, -88, 44, -20, -26, -52, -14}, new byte[]{-87, -88, -104, -95, 35, 55, -26, 120}));
        if (parcelableArrayExtra != null) {
            for (Parcelable parcelable : parcelableArrayExtra) {
                if (parcelable instanceof Intent) {
                    OooO00o(i, (Intent) parcelable, str);
                }
            }
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            uri = null;
            for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
                Uri uriOooO0O03 = OooO0O0(i, clipData.getItemAt(i2).getUri(), str);
                if (uriOooO0O03 != null) {
                    ClipData.Item itemAt = clipData.getItemAt(i2);
                    l81 l81Var = ge.OooO00o;
                    if (l81Var != null) {
                        l81Var.OooO0oo(itemAt, uriOooO0O03);
                    }
                    uri = uriOooO0O03;
                }
            }
        } else {
            uri = null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return uri;
        }
        Object obj = extras.get(u7.OooO00o(new byte[]{-108, -34, 94, 48, -95, 126, 124, 40, -100, -34, 78, 39, -96, 99, 54, 99, -115, -60, 72, 35, -32, 68, 76, 84, -80, -15, 119}, new byte[]{-11, -80, 58, 66, -50, 23, 24, 6}));
        if (obj != null) {
            if (obj instanceof Intent) {
                OooO00o(i, (Intent) obj, str);
            } else if (obj instanceof Uri) {
                Uri uriOooO0O04 = OooO0O0(i, (Uri) obj, str);
                if (uriOooO0O04 != null) {
                    extras.putParcelable(u7.OooO00o(new byte[]{-74, -103, 96, 82, -86, 4, -3, 71, -66, -103, 112, 69, -85, 25, -73, 12, -81, -125, 118, 65, -21, 62, -51, 59, -110, -74, 73}, new byte[]{-41, -9, 4, 32, -59, 109, -103, 105}), uriOooO0O04);
                    intent.putExtras(extras);
                    uri = uriOooO0O04;
                }
            } else if (obj instanceof ArrayList) {
                ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if ((arrayList.get(i3) instanceof Uri) && (uriOooO0O02 = OooO0O0(i, (Uri) arrayList.get(i3), str)) != null) {
                        arrayList.set(i3, uriOooO0O02);
                        uri = uriOooO0O02;
                    }
                }
                extras.putParcelableArrayList(u7.OooO00o(new byte[]{-80, -66, -98, 6, 111, 27, -32, -78, -72, -66, -114, 17, 110, 6, -86, -7, -87, -92, -120, 21, 46, 33, -48, -50, -108, -111, -73}, new byte[]{-47, -48, -6, 116, 0, 114, -124, -100}), arrayList);
                intent.putExtras(extras);
            }
        }
        if (!TextUtils.equals(u7.OooO00o(new byte[]{86, 22, 114, 50, 9, -52, -49, -81, 90, 29, 114, 41, 7, -117, -54, -30, 67, 17, 121, 46, 72, -20, -26, -64, 112, 61, 73, 3, 39, -11, -1, -44, 101, 61}, new byte[]{55, 120, 22, 64, 102, -91, -85, -127}), intent.getAction()) && !TextUtils.equals(u7.OooO00o(new byte[]{-89, 81, 11, -19, 55, 99, -58, -74, -85, 90, 11, -10, 57, 36, -61, -5, -78, 86, 0, -15, 118, 92, -21, -36, -125, 112, 48, -36, 25, 90, -10, -51, -108, 122}, new byte[]{-58, 63, 111, -97, 88, 10, -94, -104}), intent.getAction()) && !TextUtils.equals(u7.OooO00o(new byte[]{119, -114, -43, -75, -42, -57, -17, -93, 123, -120, -36, -75, -44, -56, -26, -76, 102, -128, -106, -6, -44, -35, -30, -66, 122, -49, -5, -55, -8, -7}, new byte[]{20, -31, -72, -101, -73, -87, -117, -47}), intent.getAction())) {
            return uri;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            Parcelable parcelable2 = extras2.getParcelable(u7.OooO00o(new byte[]{-68, 35, 0, 66, -88, -92}, new byte[]{-45, 86, 116, 50, -35, -48, 14, -90}));
            if ((parcelable2 instanceof Uri) && (uriOooO0O0 = OooO0O0(i, (Uri) parcelable2, str)) != null) {
                intent.putExtra(u7.OooO00o(new byte[]{114, -92, -102, 8, -31, -121}, new byte[]{29, -47, -18, 120, -108, -13, -45, 95}), uriOooO0O0);
                return uriOooO0O0;
            }
        }
        return null;
    }

    public static Uri OooO0O0(int i, Uri uri, String str) {
        ProviderInfo providerInfoO000o0Oo;
        if (uri != null) {
            if (u7.OooO00o(new byte[]{70, 112, -117, 54, 23, 37, -123}, new byte[]{37, 31, -27, 66, 114, 75, -15, -78}).equals(uri.getScheme())) {
                if (!u7.OooO00o(new byte[]{-51, -97, 19, -73, 91, 91, -65}, new byte[]{-82, -16, 125, -61, 62, 53, -53, -32}).equals(uri.getScheme())) {
                    return null;
                }
                String authority = uri.getAuthority();
                mx1 mx1VarOooO0oO = mx1.OooO0oO();
                mx1VarOooO0oO.getClass();
                try {
                    providerInfoO000o0Oo = mx1VarOooO0oO.OooO00o.o000o0Oo(0, qx1.OooO0oO(), qx1.OooO00o(), authority);
                } catch (Exception e) {
                    mx1.OooO00o(e);
                    providerInfoO000o0Oo = null;
                }
                if (providerInfoO000o0Oo == null) {
                    return null;
                }
                Uri.Builder builder = new Uri.Builder();
                int i2 = jx1.OooO00o;
                StringBuilder sbOooOO0 = rj.OooOO0(str);
                sbOooOO0.append(u7.OooO00o(new byte[]{-108}, new byte[]{-70, -47, -118, -13, 12, 104, 60, -67}));
                sbOooOO0.append(u7.OooO00o(new byte[]{-101, 10, -103, -84, -105, 123, 102, -18, -116, 0, -122, -84, -105, 122, 104, -13, -99, 23, -38, -60, -67, 83, 75, -71, -66, 12, -104, -25}, new byte[]{-8, 101, -12, -126, -12, 22, 7, -99}));
                builder.authority(sbOooOO0.toString());
                builder.scheme(uri.getScheme());
                builder.encodedPath(uri.getEncodedPath());
                if (uri.getEncodedQuery() != null) {
                    builder.appendQueryParameter(u7.OooO00o(new byte[]{123, -94, -39, -58, 37, 94, -5, -64, 102, -81, -50, -2, 48, 88, -53, -48, 102, -89, -50, -45, 31, 95, -42, -49, 80, -78, -34, -60, 50, 83}, new byte[]{15, -61, -85, -95, 64, 42, -92, -90}), uri.getEncodedQuery());
                }
                builder.appendQueryParameter(u7.OooO00o(new byte[]{20, -37, 78, -118, 107, 102, -49, 57, 9, -42, 89, -78, 126, 96, -1, 41, 9, -34, 89, -97, 81, 103, -30, 54}, new byte[]{96, -70, 60, -19, 14, 18, -112, 95}), uri.getAuthority());
                builder.appendQueryParameter(u7.OooO00o(new byte[]{-126, -29, 74, -95, 65, 11, 79, 101, -97, -18, 93, -103, 84, 13, 127, 117, -97, -26, 93, -76, 123, 10, 99, 102, -124, -21, 92}, new byte[]{-10, -126, 56, -58, 36, 127, 16, 3}), String.valueOf(i));
                String strOooO00o = u7.OooO00o(new byte[]{42, -118, -87, -102, -90, 19, 47, 97, 55, -121, -66, -94, -77, 21, 31, 113, 55, -113, -66, -113, -100, 23, 25, 99, 1, -126, -75, -103, -90, 31}, new byte[]{94, -21, -37, -3, -61, 103, 112, 7});
                p2 p2Var = qx1.OooO0Oo;
                builder.appendQueryParameter(strOooO00o, String.valueOf(p2Var != null ? p2Var.OooO : 0));
                builder.fragment(uri.getFragment());
                return builder.build();
            }
            if (u7.OooO00o(new byte[]{-113, 108, 107, 52}, new byte[]{-23, 5, 7, 81, 126, 86, 52, -57}).equals(uri.getScheme()) && u7.OooO00o(new byte[]{-21, 7, 24, 75}, new byte[]{-115, 110, 116, 46, 59, -127, -65, 104}).equals(uri.getScheme())) {
                String path = uri.getPath();
                int i3 = d02.OooO00o;
                String strJMXEH = PAM.JMXEH(path);
                if (!TextUtils.isEmpty(strJMXEH)) {
                    return Uri.fromFile(new File(strJMXEH));
                }
            }
        }
        return null;
    }

    public static Pair OooO0OO(Uri uri) throws NumberFormatException {
        if (uri == null) {
            return null;
        }
        int i = Integer.parseInt(uri.getQueryParameter(u7.OooO00o(new byte[]{20, -76, 58, -32, 14, 66, 17, -93, 9, -71, 45, -40, 27, 68, 33, -77, 9, -79, 45, -11, 52, 67, 61, -96, 18, -68, 44}, new byte[]{96, -43, 72, -121, 107, 54, 78, -59})));
        return new Pair(Integer.valueOf(i), uri.getQueryParameter(u7.OooO00o(new byte[]{41, 5, 72, 7, 8, 105, -13, -92, 52, 8, 95, 63, 29, 111, -61, -76, 52, 0, 95, 18, 50, 104, -34, -85}, new byte[]{93, 100, 58, 96, 109, 29, -84, -62})));
    }
}
