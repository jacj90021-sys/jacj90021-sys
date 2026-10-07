package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class kd2 {
    public static final Handler OooO00o = new Handler(Looper.getMainLooper());
    public static final gd2 OooO0O0 = new gd2();

    public static void OooO00o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        qa.OooO0o("Method must be call on main thread.");
    }
}
