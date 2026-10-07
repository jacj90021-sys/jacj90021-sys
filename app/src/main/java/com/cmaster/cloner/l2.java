package com.cmaster.cloner;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l2 implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo = 0;
    public final /* synthetic */ xj0 OooO0o0;

    public l2(xj0 xj0Var) {
        this.OooO0o0 = xj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0Oo;
        xj0 xj0Var = this.OooO0o0;
        switch (i) {
            case 0:
                g80 g80Var = (g80) j1.OooO0O0(xj0Var.OooO00o);
                if (g80Var != null) {
                    k2 k2Var = (k2) xj0Var.OooOo0O;
                    Context context = view.getContext();
                    ho1 ho1Var = new ho1(context, view);
                    ss0 ss0Var = (ss0) ho1Var.OooO0o0;
                    new fk1(context).inflate(R.menu.menu_card, ss0Var);
                    ss0Var.findItem(R.id.action_add_account).setVisible(false);
                    ho1Var.OooO0oo = new e81(g80Var, k2Var, 6);
                    ct0 ct0Var = (ct0) ho1Var.OooO0oO;
                    if (!ct0Var.OooO0O0()) {
                        if (ct0Var.OooO0o0 == null) {
                            qa.OooO0o("MenuPopupHelper cannot be used without an anchor");
                            break;
                        } else {
                            ct0Var.OooO0Oo(0, 0, false, false);
                            break;
                        }
                    }
                }
                break;
            default:
                sv svVar = (sv) (sv.class.isInstance(xj0Var.OooOo0O) ? xj0Var.OooOo0O : null);
                if (svVar != null) {
                    svVar.onClick(view);
                    break;
                }
                break;
        }
    }

    public l2(c2 c2Var, xj0 xj0Var) {
        this.OooO0o0 = xj0Var;
    }
}
