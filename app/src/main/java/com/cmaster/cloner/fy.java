package com.cmaster.cloner;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fy {
    public static final oO00OOOo OooO0OO;
    public int OooO00o;
    public String OooO0O0;

    static {
        u7.OooO00o(new byte[]{52, 127}, new byte[]{117, 50, -32, 64, 116, -107, 7, 27});
        OooO0OO = new oO00OOOo(4);
    }

    public final void OooO00o(Uri uri) {
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment == null) {
            return;
        }
        Uri uriBuild = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).encodedQuery(encodedFragment).build();
        for (String str : uriBuild.getQueryParameterNames()) {
            String queryParameter = uriBuild.getQueryParameter(str);
            if (TextUtils.equals(str, u7.OooO00o(new byte[]{-79, -48, -87, -97, -123}, new byte[]{-62, -92, -56, -21, -32, -19, 96, 103}))) {
                JSONObject jSONObject = new JSONObject(queryParameter);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (TextUtils.equals(next, u7.OooO00o(new byte[]{114, -49, 59, 97, 80, 51, 93, -92, 49, -106, 109}, new byte[]{67, -1, 9, 85, 15, 70, 46, -63}))) {
                        this.OooO00o = jSONObject.optInt(next);
                    } else if (TextUtils.equals(next, u7.OooO00o(new byte[]{89, 11, 38, -91, 41, 94, 12, 111, 3, 90, 115, -12, 41, 64, 12, 97, 13}, new byte[]{104, 59, 20, -111, 118, 46, 109, 12}))) {
                        this.OooO0O0 = jSONObject.optString(next);
                    }
                }
            }
        }
    }
}
