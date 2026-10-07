package com.cmaster.cloner;

import android.app.AlertDialog;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k30 implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ l30 OooO0o;
    public final /* synthetic */ x10 OooO0o0;

    public /* synthetic */ k30(l30 l30Var, x10 x10Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o = l30Var;
        this.OooO0o0 = x10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0Oo;
        l30 l30Var = this.OooO0o;
        switch (i) {
            case 0:
                l30Var.Ooooo00.OooO0oo(this.OooO0o0.OooO0oo, 10000L, l30Var.OooOOOo(), new q5(l30Var, l30Var.OoooOOO().OooOoOO(), 2));
                break;
            default:
                i81 i81Var = i81.OooO0oo;
                c81 c81Var = i81Var.OooO0OO;
                if (c81Var != null) {
                    if (c81Var.OooO0o - c81Var.OooO0oo <= 5184000000L) {
                        f81 f81Var = l30Var.Ooooo0o;
                        h81 h81Var = new h81(i81Var, ((j81) f81Var.OooO0OO.get(f81Var.OooO0Oo)).OooO00o, r1.OooO0O0 * 86400000);
                        h81Var.OooOOo0(i81Var.OooO0o0);
                        h81Var.OooO0o0(l30Var.OooOOOo(), new k1(this, 9));
                        break;
                    } else {
                        ar arVar = new ar();
                        new AlertDialog.Builder(l30Var.Oooo()).setMessage(R.string.banner_vip_time_limit).setCancelable(false).setPositiveButton(R.string.positive, arVar).setNegativeButton(R.string.negative, arVar).setOnCancelListener(arVar).create().show();
                        arVar.OooO0o0(l30Var.OooOOOo(), new oOO0OO0O(3));
                        break;
                    }
                }
                break;
        }
    }
}
