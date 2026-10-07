package com.cmaster.cloner;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z71 extends o0000O00 {
    public final a81 OooO0Oo;
    public final WeakHashMap OooO0o0 = new WeakHashMap();

    public z71(a81 a81Var) {
        this.OooO0Oo = a81Var;
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO(View view, AccessibilityEvent accessibilityEvent) {
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        if (o0000o00 != null) {
            o0000o00.OooO(view, accessibilityEvent);
        } else {
            super.OooO(view, accessibilityEvent);
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final boolean OooO00o(View view, AccessibilityEvent accessibilityEvent) {
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        return o0000o00 != null ? o0000o00.OooO00o(view, accessibilityEvent) : this.OooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // com.cmaster.cloner.o0000O00
    public final ay1 OooO0O0(View view) {
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        return o0000o00 != null ? o0000o00.OooO0O0(view) : super.OooO0O0(view);
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        if (o0000o00 != null) {
            o0000o00.OooO0OO(view, accessibilityEvent);
        } else {
            super.OooO0OO(view, accessibilityEvent);
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0Oo(View view, o000O00O o000o00o) {
        AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
        a81 a81Var = this.OooO0Oo;
        RecyclerView recyclerView = a81Var.OooO0Oo;
        RecyclerView recyclerView2 = a81Var.OooO0Oo;
        boolean zOoooO00 = recyclerView.OoooO00();
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        if (zOoooO00 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().OoooOo0(view, o000o00o);
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        if (o0000o00 != null) {
            o0000o00.OooO0Oo(view, o000o00o);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(viewGroup);
        return o0000o00 != null ? o0000o00.OooO0o(viewGroup, view, accessibilityEvent) : this.OooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0o0(View view, AccessibilityEvent accessibilityEvent) {
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        if (o0000o00 != null) {
            o0000o00.OooO0o0(view, accessibilityEvent);
        } else {
            super.OooO0o0(view, accessibilityEvent);
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        a81 a81Var = this.OooO0Oo;
        RecyclerView recyclerView = a81Var.OooO0Oo;
        RecyclerView recyclerView2 = a81Var.OooO0Oo;
        if (recyclerView.OoooO00() || recyclerView2.getLayoutManager() == null) {
            return super.OooO0oO(view, i, bundle);
        }
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        if (o0000o00 != null) {
            if (o0000o00.OooO0oO(view, i, bundle)) {
                return true;
            }
        } else if (super.OooO0oO(view, i, bundle)) {
            return true;
        }
        p71 p71Var = recyclerView2.getLayoutManager().OooO0O0.OooO0o;
        return false;
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0oo(View view, int i) {
        o0000O00 o0000o00 = (o0000O00) this.OooO0o0.get(view);
        if (o0000o00 != null) {
            o0000o00.OooO0oo(view, i);
        } else {
            super.OooO0oo(view, i);
        }
    }
}
