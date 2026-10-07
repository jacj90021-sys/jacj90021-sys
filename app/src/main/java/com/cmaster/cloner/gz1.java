package com.cmaster.cloner;

import android.view.WindowInsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class gz1 extends fz1 {
    public zg0 OooOOO;

    public gz1(qz1 qz1Var, WindowInsets windowInsets) {
        super(qz1Var, windowInsets);
        this.OooOOO = null;
    }

    @Override // com.cmaster.cloner.mz1
    public qz1 OooO0O0() {
        return qz1.OooO0oO(this.OooO0OO.consumeStableInsets(), null);
    }

    @Override // com.cmaster.cloner.mz1
    public qz1 OooO0OO() {
        return qz1.OooO0oO(this.OooO0OO.consumeSystemWindowInsets(), null);
    }

    @Override // com.cmaster.cloner.mz1
    public final zg0 OooO0oo() {
        if (this.OooOOO == null) {
            WindowInsets windowInsets = this.OooO0OO;
            this.OooOOO = zg0.OooO0O0(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.OooOOO;
    }

    @Override // com.cmaster.cloner.mz1
    public boolean OooOOO0() {
        return this.OooO0OO.isConsumed();
    }

    @Override // com.cmaster.cloner.mz1
    public void OooOOo0(zg0 zg0Var) {
        this.OooOOO = zg0Var;
    }
}
