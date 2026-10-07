package com.cmaster.cloner;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class l82 {
    public static final oO00OOOo OooO00o = new oO00OOOo(6);

    public static IBinder OooO00o(String str) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(996);
        bundle.putInt(u7.OooO00o(new byte[]{-99, -55, -79}, new byte[]{-2, -92, -43, 122, 65, 120, 19, -1}), 4);
        bundle.putString(u7.OooO00o(new byte[]{-27, -12, -79, 86, 65, -12}, new byte[]{-128, -102, -42, 63, 47, -111, -75, 62}), str);
        bundle.putString(u7.OooO00o(new byte[]{-110, -51, 104, -14, -61, -92}, new byte[]{-1, -88, 28, -102, -84, -64, -35, -81}), strValueOf);
        ka kaVarOooO0O0 = ka.OooO0O0();
        String strOooO00o = u7.OooO00o(new byte[]{-118, -105, 107, -35}, new byte[]{-28, -10, 6, -72, 116, 14, 8, 37});
        kaVarOooO0O0.getClass();
        ka.OooO00o(bundle, strOooO00o);
        Integer num = qx1.OooO00o;
        Bundle bundleOooO0O0 = s51.OooO00o(str).OooO0O0(strValueOf, null, null);
        if (bundleOooO0O0 == null) {
            return null;
        }
        return bundleOooO0O0.getBinder(u7.OooO00o(new byte[]{122, 80, 111, 36, 60, 55, 111, -115, 114, 80, 127, 51, 61, 42, 37, -58, 99, 74, 121, 55, 125, 23, 69, -9, 94, 112, 95}, new byte[]{27, 62, 11, 86, 83, 94, 11, -93}));
    }

    public static IBinder OooO0O0() {
        return ((ui) OooO00o.OooO0O0()).call(String.valueOf(998), null, null).getBinder(u7.OooO00o(new byte[]{-106, 100, 112, 57, -115, -26, 30, 21, -98, 100, 96, 46, -116, -5, 84, 94, -113, 126, 102, 42, -52, -58, 52, 111, -78, 68, 64}, new byte[]{-9, 10, 20, 75, -30, -113, 122, 59}));
    }
}
