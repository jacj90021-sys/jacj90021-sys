package com.cmaster.cloner;

import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o000O00 {
    public static int OooO00o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static int OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean OooO0Oo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void OooO0o0(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }
}
