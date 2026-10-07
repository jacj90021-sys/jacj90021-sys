package com.cmaster.cloner;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O0O0 extends k10 {
    public final /* synthetic */ View OooOOO;
    public final /* synthetic */ int OooOOO0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.OooOOO = actionMenuItemView;
    }

    @Override // com.cmaster.cloner.k10
    public final wg1 OooO0O0() {
        o00O0OO0 o00o0oo0;
        int i = this.OooOOO0;
        View view = this.OooOOO;
        switch (i) {
            case 0:
                o00O0O0O o00o0o0o = ((ActionMenuItemView) view).OooOOOo;
                if (o00o0o0o == null || (o00o0oo0 = ((oo0o0O0) o00o0o0o).OooO00o.OooOo0o) == null) {
                    return null;
                }
                return o00o0oo0.OooO00o();
            default:
                o00O0OO0 o00o0oo02 = ((o00O0OO) view).OooO0oO.OooOo0O;
                if (o00o0oo02 == null) {
                    return null;
                }
                return o00o0oo02.OooO00o();
        }
    }

    @Override // com.cmaster.cloner.k10
    public final boolean OooO0OO() {
        wg1 wg1VarOooO0O0;
        int i = this.OooOOO0;
        View view = this.OooOOO;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                rs0 rs0Var = actionMenuItemView.OooOOO;
                if (rs0Var == null || !rs0Var.OooO0O0(actionMenuItemView.OooOO0O) || (wg1VarOooO0O0 = OooO0O0()) == null || !wg1VarOooO0O0.OooO00o()) {
                }
                break;
            default:
                ((o00O0OO) view).OooO0oO.OooOO0o();
                break;
        }
        return true;
    }

    @Override // com.cmaster.cloner.k10
    public boolean OooO0Oo() {
        switch (this.OooOOO0) {
            case 1:
                o00O0OOO o00o0ooo = ((o00O0OO) this.OooOOO).OooO0oO;
                if (o00o0ooo.OooOo != null) {
                    return false;
                }
                o00o0ooo.OooO();
                return true;
            default:
                return super.OooO0Oo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(o00O0OO o00o0oo, o00O0OO o00o0oo2) {
        super(o00o0oo2);
        this.OooOOO = o00o0oo;
    }
}
