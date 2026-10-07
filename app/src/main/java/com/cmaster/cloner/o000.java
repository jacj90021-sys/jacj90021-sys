package com.cmaster.cloner;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o000 {
    public static final o000 OooO;
    public static final o000 OooO0o;
    public static final o000 OooO0o0;
    public static final o000 OooO0oO;
    public static final o000 OooO0oo;
    public static final o000 OooOO0;
    public static final o000 OooOO0O;
    public static final o000 OooOO0o;
    public static final o000 OooOOO0;
    public final Object OooO00o;
    public final int OooO0O0;
    public final Class OooO0OO;
    public final o00 OooO0Oo;

    static {
        new o000(1);
        new o000(2);
        new o000(4);
        new o000(8);
        new o000(16);
        new o000(32);
        new o000(64);
        new o000(128);
        new o000(256, o000O0.class);
        new o000(512, o000O0.class);
        new o000(1024, o000O0Oo.class);
        new o000(2048, o000O0Oo.class);
        OooO0o0 = new o000(4096);
        OooO0o = new o000(8192);
        new o000(UnixStat.DIR_FLAG);
        new o000(UnixStat.FILE_FLAG);
        new o000(65536);
        new o000(131072, o000OO00.class);
        OooO0oO = new o000(262144);
        OooO0oo = new o000(524288);
        OooO = new o000(1048576);
        new o000(2097152, o000OOo0.class);
        new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, android.R.id.accessibilityActionShowOnScreen, null, null, null);
        OooOO0 = new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, android.R.id.accessibilityActionScrollToPosition, null, null, o000O0O0.class);
        OooOO0O = new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, android.R.id.accessibilityActionScrollUp, null, null, null);
        new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, android.R.id.accessibilityActionScrollLeft, null, null, null);
        OooOO0o = new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, android.R.id.accessibilityActionScrollDown, null, null, null);
        new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, android.R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        new o000(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, android.R.id.accessibilityActionPageUp, null, null, null);
        new o000(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, android.R.id.accessibilityActionPageDown, null, null, null);
        new o000(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, android.R.id.accessibilityActionPageLeft, null, null, null);
        new o000(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, android.R.id.accessibilityActionPageRight, null, null, null);
        new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, android.R.id.accessibilityActionContextClick, null, null, null);
        new o000(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, android.R.id.accessibilityActionSetProgress, null, null, o000O.class);
        new o000(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, android.R.id.accessibilityActionMoveWindow, null, null, o000OO0O.class);
        new o000(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, android.R.id.accessibilityActionShowTooltip, null, null, null);
        new o000(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, android.R.id.accessibilityActionHideTooltip, null, null, null);
        new o000(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, android.R.id.accessibilityActionPressAndHold, null, null, null);
        new o000(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, android.R.id.accessibilityActionImeEnter, null, null, null);
        new o000(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, android.R.id.accessibilityActionDragStart, null, null, null);
        new o000(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, android.R.id.accessibilityActionDragDrop, null, null, null);
        new o000(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, android.R.id.accessibilityActionDragCancel, null, null, null);
        new o000(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, android.R.id.accessibilityActionShowTextSuggestions, null, null, null);
        OooOOO0 = new o000(i >= 34 ? o000Oo0.OooO00o() : null, android.R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public o000(Object obj, int i, String str, o00 o00Var, Class cls) {
        this.OooO0O0 = i;
        this.OooO0Oo = o00Var;
        if (obj == null) {
            this.OooO00o = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.OooO00o = obj;
        }
        this.OooO0OO = cls;
    }

    public final int OooO00o() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.OooO00o).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof o000)) {
            return false;
        }
        Object obj2 = ((o000) obj).OooO00o;
        Object obj3 = this.OooO00o;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.OooO00o;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strOooO0OO = o000O00O.OooO0OO(this.OooO0O0);
        if (strOooO0OO.equals("ACTION_UNKNOWN")) {
            Object obj = this.OooO00o;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strOooO0OO = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strOooO0OO);
        return sb.toString();
    }

    public o000(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public o000(int i) {
        this(null, i, null, null, null);
    }
}
