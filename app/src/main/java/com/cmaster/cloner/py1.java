package com.cmaster.cloner;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class py1 extends q53 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ ry1 OooO0O0;

    public /* synthetic */ py1(ry1 ry1Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = ry1Var;
    }

    @Override // com.cmaster.cloner.iu1
    public final void OooO0OO() {
        View view;
        int i = this.OooO00o;
        ry1 ry1Var = this.OooO0O0;
        switch (i) {
            case 0:
                if (ry1Var.OooOOOO && (view = ry1Var.OooO0oO) != null) {
                    view.setTranslationY(0.0f);
                    ry1Var.OooO0Oo.setTranslationY(0.0f);
                }
                ry1Var.OooO0Oo.setVisibility(8);
                ry1Var.OooO0Oo.setTransitioning(false);
                ry1Var.OooOOoo = null;
                o0O000O o0o000o = ry1Var.OooOO0O;
                if (o0o000o != null) {
                    o0o000o.OoooO0O(ry1Var.OooOO0);
                    ry1Var.OooOO0 = null;
                    ry1Var.OooOO0O = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = ry1Var.OooO0OO;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = nt1.OooO00o;
                    dt1.OooO0OO(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                ry1Var.OooOOoo = null;
                ry1Var.OooO0Oo.requestLayout();
                break;
        }
    }
}
