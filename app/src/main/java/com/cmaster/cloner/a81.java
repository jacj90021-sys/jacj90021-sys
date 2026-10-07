package com.cmaster.cloner;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class a81 extends o0000O00 {
    public final RecyclerView OooO0Oo;
    public final z71 OooO0o0;

    public a81(RecyclerView recyclerView) {
        this.OooO0Oo = recyclerView;
        o0000O00 o0000o00OooOO0 = OooOO0();
        if (o0000o00OooOO0 == null || !(o0000o00OooOO0 instanceof z71)) {
            this.OooO0o0 = new z71(this);
        } else {
            this.OooO0o0 = (z71) o0000o00OooOO0;
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        super.OooO0OO(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.OooO0Oo.OoooO00()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().OoooOOO(accessibilityEvent);
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0Oo(View view, o000O00O o000o00o) {
        this.OooO00o.onInitializeAccessibilityNodeInfo(view, o000o00o.OooO00o);
        RecyclerView recyclerView = this.OooO0Oo;
        if (recyclerView.OoooO00() || recyclerView.getLayoutManager() == null) {
            return;
        }
        i71 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.OooO0O0;
        layoutManager.OoooOOo(recyclerView2.OooO0o, recyclerView2.Oooooo0, o000o00o);
    }

    @Override // com.cmaster.cloner.o0000O00
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        if (super.OooO0oO(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.OooO0Oo;
        if (recyclerView.OoooO00() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().o0OoOo0(i, bundle);
    }

    public o0000O00 OooOO0() {
        return this.OooO0o0;
    }
}
