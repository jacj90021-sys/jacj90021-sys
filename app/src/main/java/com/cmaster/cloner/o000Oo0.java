package com.cmaster.cloner;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o000Oo0 {
    public static AccessibilityNodeInfo.AccessibilityAction OooO00o() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float OooO0O0(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence OooO0Oo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int OooO0o(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static int OooO0o0(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static boolean OooO0oO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void OooO0oo(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }
}
