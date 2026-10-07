package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class en0 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ hn0 OooO0o0;

    public /* synthetic */ en0(hn0 hn0Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = hn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        hn0 hn0Var = this.OooO0o0;
        switch (i) {
            case 0:
                ot otVar = hn0Var.OooO0o;
                if (otVar != null) {
                    otVar.setListSelectionHidden(true);
                    otVar.requestLayout();
                    break;
                }
                break;
            default:
                ot otVar2 = hn0Var.OooO0o;
                if (otVar2 != null && otVar2.isAttachedToWindow() && hn0Var.OooO0o.getCount() > hn0Var.OooO0o.getChildCount() && hn0Var.OooO0o.getChildCount() <= hn0Var.OooOOOo) {
                    hn0Var.OooOoo.setInputMethodMode(2);
                    hn0Var.OooO();
                    break;
                }
                break;
        }
    }
}
