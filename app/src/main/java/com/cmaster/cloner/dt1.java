package com.cmaster.cloner;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dt1 {
    public static WindowInsets OooO00o(View view, WindowInsets windowInsets) {
        int i = tt1.OooO00o;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets OooO0O0(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void OooO0OO(View view) {
        view.requestApplyInsets();
    }
}
