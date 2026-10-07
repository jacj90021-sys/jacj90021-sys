package com.cmaster.cloner;

import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class O0O0 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ k OooO0o0;

    public /* synthetic */ O0O0(k kVar, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.OooO0Oo;
        k kVar = this.OooO0o0;
        switch (i) {
            case 0:
                if ((kVar.Ooooo0o & 1) != 0) {
                    kVar.OooOo0O(0);
                }
                if ((kVar.Ooooo0o & 4096) != 0) {
                    kVar.OooOo0O(108);
                }
                kVar.Ooooo00 = false;
                kVar.Ooooo0o = 0;
                break;
            default:
                kVar.OooOoO0.showAtLocation(kVar.OooOo, 55, 0, 0);
                gu1 gu1Var = kVar.OooOoOO;
                if (gu1Var != null) {
                    gu1Var.OooO0O0();
                }
                if (!kVar.OooOoo || (viewGroup = kVar.OooOooO) == null || !viewGroup.isLaidOut()) {
                    kVar.OooOo.setAlpha(1.0f);
                    kVar.OooOo.setVisibility(0);
                    break;
                } else {
                    kVar.OooOo.setAlpha(0.0f);
                    gu1 gu1VarOooO00o = nt1.OooO00o(kVar.OooOo);
                    gu1VarOooO00o.OooO00o(1.0f);
                    kVar.OooOoOO = gu1VarOooO00o;
                    gu1VarOooO00o.OooO0Oo(new Oo0000(this, 0));
                    break;
                }
                break;
        }
    }
}
