package com.cmaster.cloner;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0000 extends View.AccessibilityDelegate {
    public final o0000O00 OooO00o;

    public o0000(o0000O00 o0000o00) {
        this.OooO00o = o0000o00;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.OooO00o(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ay1 ay1VarOooO0O0 = this.OooO00o.OooO0O0(view);
        if (ay1VarOooO0O0 != null) {
            return (AccessibilityNodeProvider) ay1VarOooO0O0.OooO0o0;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.OooO0OO(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        int iKeyAt;
        o000O00O o000o00o = new o000O00O(accessibilityNodeInfo);
        WeakHashMap weakHashMap = nt1.OooO00o;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(it1.OooO0OO(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            o000o00o.OooO0o0(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(it1.OooO0O0(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            o000o00o.OooO0o0(2, z2);
        }
        CharSequence charSequenceOooO0o0 = nt1.OooO0o0(view);
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceOooO0o0);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceOooO0o0);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            tag3 = kt1.OooO0O0(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i >= 30) {
            o000O000.OooO0oO(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.OooO00o.OooO0Oo(view, o000o00o);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    if (((WeakReference) sparseArray.valueAt(i2)).get() == null) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    sparseArray.remove(((Integer) arrayList.get(i3)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i4 = 0; i4 < clickableSpanArr.length; i4++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= sparseArray2.size()) {
                            iKeyAt = o000O00O.OooO0O0;
                            o000O00O.OooO0O0 = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i5)).get())) {
                                iKeyAt = sparseArray2.keyAt(i5);
                                break;
                            }
                            i5++;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i4]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i4];
                    Spanned spanned = (Spanned) text;
                    o000o00o.OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    o000o00o.OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    o000o00o.OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    o000o00o.OooO0O0("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            o000o00o.OooO00o((o000) list.get(i6));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.OooO0o0(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.OooO0o(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.OooO00o.OooO0oO(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.OooO00o.OooO0oo(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.OooO(view, accessibilityEvent);
    }
}
