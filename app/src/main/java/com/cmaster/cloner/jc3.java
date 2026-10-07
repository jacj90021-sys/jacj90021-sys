package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jc3 implements dc3 {
    public final il0 OooO00o;
    public final il0 OooO0O0;
    public final cc3 OooO0OO;

    public jc3(Context context, cc3 cc3Var) {
        this.OooO0OO = cc3Var;
        ca caVar = ca.OooO0o0;
        ip1.OooO0O0(context);
        hx2 hx2VarOooO0OO = ip1.OooO00o().OooO0OO(caVar);
        if (ca.OooO0Oo.contains(new dw("json"))) {
            this.OooO00o = new il0(new g03(hx2VarOooO0OO, 2));
        }
        this.OooO0O0 = new il0(new g03(hx2VarOooO0OO, 3));
    }

    @Override // com.cmaster.cloner.dc3
    public final void OooO00o(o00Oo00 o00oo00) {
        int i = this.OooO0OO.OooO0O0;
        s41 s41Var = s41.OooO0o0;
        s41 s41Var2 = s41.OooO0Oo;
        if (i != 0) {
            ((hp1) this.OooO0O0.get()).OooO00o(o00oo00.OooO0o0 != 0 ? new w4(o00oo00.OooOOOO(i), s41Var2) : new w4(o00oo00.OooOOOO(i), s41Var));
            return;
        }
        il0 il0Var = this.OooO00o;
        if (il0Var != null) {
            ((hp1) il0Var.get()).OooO00o(o00oo00.OooO0o0 != 0 ? new w4(o00oo00.OooOOOO(i), s41Var2) : new w4(o00oo00.OooOOOO(i), s41Var));
        }
    }
}
