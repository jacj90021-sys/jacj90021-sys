package com.cmaster.cloner;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qq2 {
    public static float OooO00o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return hu.OooO0O0(edgeEffect);
        }
        return 0.0f;
    }

    public static float OooO0O0(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return hu.OooO0OO(edgeEffect, f, f2);
        }
        gu.OooO00o(edgeEffect, f, f2);
        return f;
    }
}
