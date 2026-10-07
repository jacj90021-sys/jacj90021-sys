package com.cmaster.cloner;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dn0 {
    public static void OooO00o(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void OooO0O0(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
