package com.cmaster.cloner;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ag implements cm0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ oOOO00 OooO0o0;

    public /* synthetic */ ag(oOOO00 oooo00, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = oooo00;
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        switch (this.OooO0Oo) {
            case 0:
                if (wl0Var == wl0.ON_STOP) {
                    Window window = this.OooO0o0.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (wl0Var == wl0.ON_DESTROY) {
                    this.OooO0o0.OooO0o0.OooO0o0 = null;
                    if (!this.OooO0o0.isChangingConfigurations()) {
                        this.OooO0o0.OooO0OO().OooO00o();
                    }
                    dg dgVar = this.OooO0o0.OooOO0o;
                    oOOO00 oooo00 = dgVar.OooO0oO;
                    oooo00.getWindow().getDecorView().removeCallbacks(dgVar);
                    oooo00.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(dgVar);
                    break;
                }
                break;
            default:
                oOOO00 oooo002 = this.OooO0o0;
                if (oooo002.OooO == null) {
                    cg cgVar = (cg) oooo002.getLastNonConfigurationInstance();
                    if (cgVar != null) {
                        oooo002.OooO = cgVar.OooO00o;
                    }
                    if (oooo002.OooO == null) {
                        oooo002.OooO = new du1();
                    }
                }
                oooo002.OooO0oO.OooOOOO(this);
                break;
        }
    }
}
