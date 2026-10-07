package com.cmaster.cloner;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O0OO0 extends ct0 {
    public final /* synthetic */ int OooOO0o = 1;
    public final /* synthetic */ o00O0OOO OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(o00O0OOO o00o0ooo, Context context, vj1 vj1Var, View view) {
        super(context, vj1Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.OooOOO0 = o00o0ooo;
        if ((vj1Var.OooOooO.OooOoOO & 32) != 32) {
            View view2 = o00o0ooo.OooOO0o;
            this.OooO0o0 = view2 == null ? (View) o00o0ooo.OooOO0O : view2;
        }
        xb1 xb1Var = o00o0ooo.OooOoO;
        this.OooO0oo = xb1Var;
        at0 at0Var = this.OooO;
        if (at0Var != null) {
            at0Var.OooO0Oo(xb1Var);
        }
    }

    @Override // com.cmaster.cloner.ct0
    public final void OooO0OO() {
        int i = this.OooOO0o;
        o00O0OOO o00o0ooo = this.OooOOO0;
        switch (i) {
            case 0:
                o00o0ooo.OooOo0o = null;
                super.OooO0OO();
                break;
            default:
                ss0 ss0Var = o00o0ooo.OooO0o;
                if (ss0Var != null) {
                    ss0Var.OooO0OO(true);
                }
                o00o0ooo.OooOo0O = null;
                super.OooO0OO();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(o00O0OOO o00o0ooo, Context context, ss0 ss0Var, View view) {
        super(context, ss0Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.OooOOO0 = o00o0ooo;
        this.OooO0o = 8388613;
        xb1 xb1Var = o00o0ooo.OooOoO;
        this.OooO0oo = xb1Var;
        at0 at0Var = this.OooO;
        if (at0Var != null) {
            at0Var.OooO0Oo(xb1Var);
        }
    }
}
