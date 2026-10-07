package com.cmaster.cloner;

import android.widget.LinearLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k80 implements iy0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ m80 OooO0o0;

    public /* synthetic */ k80(m80 m80Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = m80Var;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        int i = this.OooO0Oo;
        m80 m80Var = this.OooO0o0;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = Boolean.TRUE;
                yn1 yn1Var = m80Var.Ooooo00;
                if (bool != bool2) {
                    ((LinearLayout) yn1Var.OooOO0).setVisibility(8);
                    break;
                } else {
                    ((LinearLayout) yn1Var.OooOO0).setVisibility(0);
                    break;
                }
            default:
                m80Var.Ooooo0o.OooO0O0();
                break;
        }
    }
}
