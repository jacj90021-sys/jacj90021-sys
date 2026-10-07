package com.cmaster.cloner;

import android.os.SystemClock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s6 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ u6 OooO0o0;

    public /* synthetic */ s6(u6 u6Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        u6 u6Var = this.OooO0o0;
        switch (i) {
            case 0:
                if (u6Var.OooO0oO > 0) {
                    SystemClock.uptimeMillis();
                }
                u6Var.setVisibility(0);
                break;
            default:
                ((et) u6Var.getCurrentDrawable()).OooO0Oo(false, false, true);
                if (u6Var.getProgressDrawable() == null || !u6Var.getProgressDrawable().isVisible()) {
                    if (u6Var.getIndeterminateDrawable() == null || !u6Var.getIndeterminateDrawable().isVisible()) {
                        u6Var.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
