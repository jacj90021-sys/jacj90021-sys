package com.cmaster.cloner;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class mn1 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Toolbar OooO0o0;

    public /* synthetic */ mn1(Toolbar toolbar, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        Toolbar toolbar = this.OooO0o0;
        switch (i) {
            case 0:
                on1 on1Var = toolbar.Oooo;
                vs0 vs0Var = on1Var == null ? null : on1Var.OooO0o0;
                if (vs0Var != null) {
                    vs0Var.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.OooOOO0();
                break;
        }
    }
}
