package com.cmaster.cloner;

import android.provider.Settings;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class eg0 extends et {
    public h OooOOo;
    public fd OooOOo0;
    public hs1 OooOOoo;

    @Override // com.cmaster.cloner.et
    public final boolean OooO0o0(boolean z, boolean z2, boolean z3) {
        hs1 hs1Var;
        boolean zOooO0o0 = super.OooO0o0(z, z2, z3);
        if (this.OooO0o != null && Settings.Global.getFloat(this.OooO0Oo.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (hs1Var = this.OooOOoo) != null) {
            return hs1Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.OooOOo.OooO0OO();
        }
        if (z && z3) {
            this.OooOOo.OooOOOO();
        }
        return zOooO0o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.eg0.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.OooOOo0.OooO0oO();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.OooOOo0.OooO0oO();
    }
}
