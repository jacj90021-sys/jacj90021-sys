package com.cmaster.cloner;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class kt1 {
    public static WindowInsets OooO00o(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence OooO0O0(View view) {
        return view.getStateDescription();
    }

    public static void OooO0OO(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
