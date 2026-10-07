package com.cmaster.cloner;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class h63 {
    public static void OooO00o(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            o000O000.OooO0o0(window, z);
        } else {
            if (i >= 30) {
                o000O000.OooO0Oo(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}
