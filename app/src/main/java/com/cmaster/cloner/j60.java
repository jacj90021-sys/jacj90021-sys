package com.cmaster.cloner;

import com.google.android.gms.internal.ads.zzbxf;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class j60 extends cr0 implements hz0, kz0 {
    public final i60 OooOO0O;

    public j60(er0 er0Var) {
        super(er0Var);
        this.OooOO0O = new i60(this);
    }

    @Override // com.cmaster.cloner.cr0
    public final boolean OooO0OO() {
        if (!super.OooO0OO()) {
            return false;
        }
        wa1 wa1Var = (wa1) this.OooO00o.OooO0Oo();
        if (((wa1Var == null || !wa1Var.OooO0Oo()) ? null : wa1Var.OooO0O0) != null) {
            return new Date().getTime() - this.OooO0oO < 14400000;
        }
        return false;
    }

    @Override // com.cmaster.cloner.kz0
    public final void onUserEarnedReward(gb1 gb1Var) {
        gb1Var.getType();
        gb1Var.getAmount();
        ay1 ay1Var = new ay1((zzbxf) gb1Var, 24);
        this.OooO0OO.OooOO0o(wa1.OooO0o0(ay1Var));
        ArrayList arrayList = this.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o30) obj).OooO0OO(ay1Var);
        }
    }
}
