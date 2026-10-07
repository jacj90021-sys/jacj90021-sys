package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class i32 {
    public Intent OooO00o(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbcj.zzq OooO0O0(Context context, TelephonyManager telephonyManager) {
        return zzbcj.zzq.ENUM_UNKNOWN;
    }

    public void OooO0OO(Context context) {
    }

    public boolean OooO0Oo(Context context) {
        return false;
    }

    public void OooO0o(Activity activity) {
    }

    public int OooO0o0(AudioManager audioManager) {
        return 0;
    }

    public int OooO0oO(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
