package com.cmaster.cloner;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class o0000O00 {
    public static final View.AccessibilityDelegate OooO0OO = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate OooO00o;
    public final o0000 OooO0O0;

    public o0000O00(View.AccessibilityDelegate accessibilityDelegate) {
        this.OooO00o = accessibilityDelegate;
        this.OooO0O0 = new o0000(this);
    }

    public void OooO(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean OooO00o(View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public ay1 OooO0O0(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.OooO00o.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new ay1(accessibilityNodeProvider, 2);
        }
        return null;
    }

    public void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void OooO0Oo(View view, o000O00O o000o00o) {
        this.OooO00o.onInitializeAccessibilityNodeInfo(view, o000o00o.OooO00o);
    }

    public boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void OooO0o0(View view, AccessibilityEvent accessibilityEvent) {
        this.OooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean OooO0oO(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            o000 o000Var = (o000) list.get(i2);
            if (o000Var.OooO00o() == i) {
                Class cls = o000Var.OooO0OO;
                o00 o00Var = o000Var.OooO0Oo;
                if (o00Var != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    zPerformAccessibilityAction = o00Var.OooO00o(view);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.OooO00o.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i4++;
            }
        }
        return z;
    }

    public void OooO0oo(View view, int i) {
        this.OooO00o.sendAccessibilityEvent(view, i);
    }

    public o0000O00() {
        this(OooO0OO);
    }
}
