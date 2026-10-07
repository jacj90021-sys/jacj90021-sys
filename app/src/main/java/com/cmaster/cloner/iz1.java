package com.cmaster.cloner;

import android.view.WindowInsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class iz1 extends hz1 {
    public zg0 OooOOOO;
    public zg0 OooOOOo;
    public zg0 OooOOo0;

    public iz1(qz1 qz1Var, WindowInsets windowInsets) {
        super(qz1Var, windowInsets);
        this.OooOOOO = null;
        this.OooOOOo = null;
        this.OooOOo0 = null;
    }

    @Override // com.cmaster.cloner.mz1
    public zg0 OooO() {
        if (this.OooOOOO == null) {
            this.OooOOOO = zg0.OooO0OO(this.OooO0OO.getSystemGestureInsets());
        }
        return this.OooOOOO;
    }

    @Override // com.cmaster.cloner.mz1
    public zg0 OooO0oO() {
        if (this.OooOOOo == null) {
            this.OooOOOo = zg0.OooO0OO(this.OooO0OO.getMandatorySystemGestureInsets());
        }
        return this.OooOOOo;
    }

    @Override // com.cmaster.cloner.mz1
    public zg0 OooOO0O() {
        if (this.OooOOo0 == null) {
            this.OooOOo0 = zg0.OooO0OO(this.OooO0OO.getTappableElementInsets());
        }
        return this.OooOOo0;
    }

    @Override // com.cmaster.cloner.fz1, com.cmaster.cloner.mz1
    public qz1 OooOO0o(int i, int i2, int i3, int i4) {
        return qz1.OooO0oO(this.OooO0OO.inset(i, i2, i3, i4), null);
    }

    @Override // com.cmaster.cloner.gz1, com.cmaster.cloner.mz1
    public void OooOOo0(zg0 zg0Var) {
    }
}
