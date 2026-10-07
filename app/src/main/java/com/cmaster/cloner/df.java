package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class df {
    public static final o0O000O OooO00o = new o0O000O("CommonUtils", "");

    public static String OooO00o(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            o0O000O o0o000o = OooO00o;
            if (!Log.isLoggable((String) o0o000o.OooO0o0, 6)) {
                return "";
            }
            Log.e("CommonUtils", o0o000o.OoooOoo(strConcat));
            return "";
        }
    }
}
