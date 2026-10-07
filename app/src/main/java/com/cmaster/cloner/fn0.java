package com.cmaster.cloner;

import android.widget.AbsListView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fn0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ hn0 OooO00o;

    public fn0(hn0 hn0Var) {
        this.OooO00o = hn0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        hn0 hn0Var = this.OooO00o;
        en0 en0Var = hn0Var.OooOo0;
        u uVar = hn0Var.OooOoo;
        if (i != 1 || uVar.getInputMethodMode() == 2 || uVar.getContentView() == null) {
            return;
        }
        hn0Var.OooOoO0.removeCallbacks(en0Var);
        en0Var.run();
    }
}
