package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class it1 {
    public static CharSequence OooO00o(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean OooO0O0(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean OooO0OO(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void OooO0Oo(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void OooO0o(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static void OooO0o0(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
