package com.cmaster.cloner;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class os0 {
    public static final int OooO0o0;
    public final Context OooO00o;
    public final ActivityManager OooO0O0;
    public final ay1 OooO0OO;
    public final float OooO0Oo;

    static {
        OooO0o0 = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public os0(Context context) {
        this.OooO0Oo = OooO0o0;
        this.OooO00o = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.OooO0O0 = activityManager;
        this.OooO0OO = new ay1(context.getResources().getDisplayMetrics(), 29);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.OooO0Oo = 0.0f;
    }
}
