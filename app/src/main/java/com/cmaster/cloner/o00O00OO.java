package com.cmaster.cloner;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O00OO implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ ActionBarOverlayLayout OooO0o0;

    public /* synthetic */ o00O00OO(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        ActionBarOverlayLayout actionBarOverlayLayout = this.OooO0o0;
        switch (i) {
            case 0:
                actionBarOverlayLayout.OooO0oo();
                actionBarOverlayLayout.OooOoO = actionBarOverlayLayout.OooO0oO.animate().translationY(0.0f).setListener(actionBarOverlayLayout.OooOoOO);
                break;
            default:
                actionBarOverlayLayout.OooO0oo();
                actionBarOverlayLayout.OooOoO = actionBarOverlayLayout.OooO0oO.animate().translationY(-actionBarOverlayLayout.OooO0oO.getHeight()).setListener(actionBarOverlayLayout.OooOoOO);
                break;
        }
    }
}
