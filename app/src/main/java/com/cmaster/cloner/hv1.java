package com.cmaster.cloner;

import android.content.Context;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hv1 {
    public static final hv1 OooO0OO = new hv1();
    public final LinkedHashSet OooO00o = new LinkedHashSet();
    public final ye1 OooO0O0 = yu1.OooOOO0.OooO;

    public final void OooO00o(Context context, String str, int i) {
        gv1 gv1Var = new gv1(context, R.style.Theme_App);
        hm0 hm0Var = (hm0) j1.OooO00o(context);
        fv1 fv1Var = new fv1(hm0Var, gv1Var, str, i);
        gv1Var.OooO0o0 = fv1Var;
        gv1Var.show();
        this.OooO00o.add(fv1Var);
        if (i81.OooO0oo.OooO0O0() || System.currentTimeMillis() - kn2.OooO0O0 <= 30000) {
            fv1Var.OooOOo0(this.OooO0O0);
            return;
        }
        cr0 cr0VarOooO0O0 = dr0.OooO00o().OooO0O0(4, (er0) kn2.OooO00o.OooO0o);
        int i2 = 2;
        if (!cr0VarOooO0O0.OooO0OO()) {
            dr0.OooO00o().OooO0O0(4, (er0) kn2.OooO00o.OooO0o).OooO0o();
            OooO0O0(fv1Var, dr0.OooO00o().OooO0O0(2, (er0) kn2.OooO00o.OooOO0), hm0Var);
            return;
        }
        ev1 ev1Var = new ev1();
        oOo000Oo ooo000oo = new oOo000Oo(context);
        oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
        oo00o0.OooO = oo00o0.OooO00o.getText(R.string.negative);
        oo00o0.OooOO0 = ev1Var;
        oo00o0.OooO0o = oo00o0.OooO00o.getText(R.string.banner_vip_reward);
        oo00o0.OooOOO0 = false;
        oOo0000O ooo0000oOooO0OO = ooo000oo.OooO0OO();
        ooo0000oOooO0OO.show();
        h1.OooO0O0.postDelayed(new bf1(ooo0000oOooO0OO, ev1Var, i2, false), 500L);
        ev1Var.OooOOO(hm0Var, new dv1(this, fv1Var, hm0Var, cr0VarOooO0O0));
    }

    public final void OooO0O0(fv1 fv1Var, cr0 cr0Var, hm0 hm0Var) {
        cr0Var.OooO0oo(fv1Var.OooOo0O.getWindow().getDecorView(), 2000L, hm0Var, new q5(this, fv1Var, 6));
    }
}
