package com.cmaster.cloner;

import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o000O000 {
    public static Icon OooO00o(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void OooO0O0(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void OooO0Oo(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void OooO0o(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void OooO0o0(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void OooO0oO(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
