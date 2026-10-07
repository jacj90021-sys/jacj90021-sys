package com.cmaster.cloner;

import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yv2 {
    public static gp2 OooO00o(int i) {
        return i != 0 ? i != 1 ? new hc1() : new qm() : new hc1();
    }

    public static void OooO0O0(View view, wq0 wq0Var) {
        mu muVar = wq0Var.OooO0o0.OooO0OO;
        if (muVar == null || !muVar.OooO00o) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        uq0 uq0Var = wq0Var.OooO0o0;
        if (uq0Var.OooOOO0 != elevation) {
            uq0Var.OooOOO0 = elevation;
            wq0Var.OooOo00();
        }
    }
}
