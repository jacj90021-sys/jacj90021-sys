package com.cmaster.cloner;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class hz1 extends gz1 {
    public hz1(qz1 qz1Var, WindowInsets windowInsets) {
        super(qz1Var, windowInsets);
    }

    @Override // com.cmaster.cloner.mz1
    public qz1 OooO00o() {
        return qz1.OooO0oO(this.OooO0OO.consumeDisplayCutout(), null);
    }

    @Override // com.cmaster.cloner.mz1
    public hs OooO0o0() {
        DisplayCutout displayCutout = this.OooO0OO.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new hs(displayCutout);
    }

    @Override // com.cmaster.cloner.fz1, com.cmaster.cloner.mz1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz1)) {
            return false;
        }
        hz1 hz1Var = (hz1) obj;
        return Objects.equals(this.OooO0OO, hz1Var.OooO0OO) && Objects.equals(this.OooO0oO, hz1Var.OooO0oO) && fz1.OooOoO0(this.OooO0oo, hz1Var.OooO0oo);
    }

    @Override // com.cmaster.cloner.mz1
    public int hashCode() {
        return this.OooO0OO.hashCode();
    }
}
