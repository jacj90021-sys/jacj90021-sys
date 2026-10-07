package com.cmaster.cloner;

import android.view.WindowInsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class az1 extends ez1 {
    public final WindowInsets.Builder OooO0OO;

    public az1(qz1 qz1Var) {
        super(qz1Var);
        WindowInsets windowInsetsOooO0o = qz1Var.OooO0o();
        this.OooO0OO = windowInsetsOooO0o != null ? fq1.OooO(windowInsetsOooO0o) : fq1.OooO0oo();
    }

    @Override // com.cmaster.cloner.ez1
    public qz1 OooO0O0() {
        OooO00o();
        qz1 qz1VarOooO0oO = qz1.OooO0oO(this.OooO0OO.build(), null);
        qz1VarOooO0oO.OooO00o.OooOOOO(this.OooO0O0);
        return qz1VarOooO0oO;
    }

    @Override // com.cmaster.cloner.ez1
    public void OooO0Oo(zg0 zg0Var) {
        this.OooO0OO.setMandatorySystemGestureInsets(zg0Var.OooO0Oo());
    }

    @Override // com.cmaster.cloner.ez1
    public void OooO0o(zg0 zg0Var) {
        this.OooO0OO.setSystemGestureInsets(zg0Var.OooO0Oo());
    }

    @Override // com.cmaster.cloner.ez1
    public void OooO0o0(zg0 zg0Var) {
        this.OooO0OO.setStableInsets(zg0Var.OooO0Oo());
    }

    @Override // com.cmaster.cloner.ez1
    public void OooO0oO(zg0 zg0Var) {
        this.OooO0OO.setSystemWindowInsets(zg0Var.OooO0Oo());
    }

    @Override // com.cmaster.cloner.ez1
    public void OooO0oo(zg0 zg0Var) {
        this.OooO0OO.setTappableElementInsets(zg0Var.OooO0Oo());
    }

    public az1() {
        this.OooO0OO = fq1.OooO0oo();
    }
}
