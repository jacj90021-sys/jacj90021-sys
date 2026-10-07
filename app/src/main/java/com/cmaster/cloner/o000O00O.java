package com.cmaster.cloner;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o000O00O {
    public static int OooO0O0;
    public final AccessibilityNodeInfo OooO00o;

    public o000O00O(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.OooO00o = accessibilityNodeInfo;
    }

    public static String OooO0OO(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case UnixStat.DIR_FLAG /* 16384 */:
                return "ACTION_COPY";
            case UnixStat.FILE_FLAG /* 32768 */:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case android.R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void OooO00o(o000 o000Var) {
        this.OooO00o.addAction((AccessibilityNodeInfo.AccessibilityAction) o000Var.OooO00o);
    }

    public final ArrayList OooO0O0(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean OooO0Oo(int i) {
        Bundle extras = this.OooO00o.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void OooO0o() {
        this.OooO00o.setScrollable(true);
    }

    public final void OooO0o0(int i, boolean z) {
        Bundle extras = this.OooO00o.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o000O00O)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = ((o000O00O) obj).OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.OooO00o;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.text.SpannableString] */
    public final String toString() {
        CharSequence text;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.OooO00o;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        if (Build.VERSION.SDK_INT >= 34) {
            o000Oo0.OooO0OO(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        if (OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            text = accessibilityNodeInfo.getText();
        } else {
            ArrayList arrayListOooO0O0 = OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList arrayListOooO0O02 = OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList arrayListOooO0O03 = OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList arrayListOooO0O04 = OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString textSpans = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < arrayListOooO0O0.size(); i++) {
                textSpans.setSpan(new o0000Ooo(((Integer) arrayListOooO0O04.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListOooO0O0.get(i)).intValue(), ((Integer) arrayListOooO0O02.get(i)).intValue(), ((Integer) arrayListOooO0O03.get(i)).intValue());
            }
            text = textSpans;
        }
        sb.append(text);
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        int i2 = Build.VERSION.SDK_INT;
        sb.append(i2 >= 30 ? o000O000.OooO0OO(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i2 >= 36 ? o000O00.OooO0OO(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i2 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i2 >= 33 ? o000O0o.OooO0O0(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int iOooO00o = i2 >= 36 ? o000O00.OooO00o(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(iOooO00o == 1 ? "TRUE" : iOooO00o == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i2 >= 36 ? o000O00.OooO0Oo(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int iOooO0O0 = i2 >= 36 ? o000O00.OooO0O0(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (iOooO0O0 == 0) {
            str = "UNDEFINED";
        } else if (iOooO0O0 == 1) {
            str = "COLLAPSED";
        } else if (iOooO0O0 != 2) {
            str = iOooO0O0 != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i2 >= 34 ? o000Oo0.OooO0Oo(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(OooO0Oo(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i2 >= 33 ? o000O0o.OooO0OO(accessibilityNodeInfo) : OooO0Oo(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i2 >= 34 ? o000Oo0.OooO0oO(accessibilityNodeInfo) : OooO0Oo(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new o000(actionList.get(i3), 0, null, null, null));
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            o000 o000Var = (o000) arrayList.get(i4);
            int iOooO00o2 = o000Var.OooO00o();
            Object obj = o000Var.OooO00o;
            String strOooO0OO = OooO0OO(iOooO00o2);
            if (strOooO0OO.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strOooO0OO = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(strOooO0OO);
            if (i4 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
