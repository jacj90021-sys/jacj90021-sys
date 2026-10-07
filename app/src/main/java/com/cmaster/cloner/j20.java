package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j20 implements i20 {
    public final int OooO00o;
    public final /* synthetic */ k20 OooO0O0;

    public j20(k20 k20Var, int i) {
        this.OooO0O0 = k20Var;
        this.OooO00o = i;
    }

    @Override // com.cmaster.cloner.i20
    public final boolean OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        k20 k20Var = this.OooO0O0;
        o10 o10Var = k20Var.OooOo0o;
        int i = this.OooO00o;
        if (o10Var == null || i >= 0 || !o10Var.OooO().Oooo0o()) {
            return k20Var.Oooo0oO(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
