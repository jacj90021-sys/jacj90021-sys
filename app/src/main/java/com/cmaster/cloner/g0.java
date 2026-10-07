package com.cmaster.cloner;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ b0 OooO0Oo;
    public final /* synthetic */ h0 OooO0o0;

    public g0(h0 h0Var, b0 b0Var) {
        this.OooO0o0 = h0Var;
        this.OooO0Oo = b0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.OooO0o0.Oooo0O0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.OooO0Oo);
        }
    }
}
