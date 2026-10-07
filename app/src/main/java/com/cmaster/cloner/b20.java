package com.cmaster.cloner;

import android.content.res.Configuration;

public final class b20 implements mi {
    public final int OooO00o;
    public final k20 OooO0O0;

    public b20(k20 k20Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = k20Var;
    }

    @Override
    public final void accept(Object obj) {
        k20 k20Var = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                if (k20Var.Oooo00o()) {
                    k20Var.OooO0oo(false);
                }
                return;
            case 1:
                if (k20Var.Oooo00o() && ((Integer) obj).intValue() == 80) {
                    k20Var.OooOO0o(false);
                }
                return;
            case 2:
                if (k20Var.Oooo00o() && ((dv0) obj).OooO00o) {
                    k20Var.OooOOO0(false);
                }
                return;
            default:
                throw new NullPointerException();
        }
    }
}