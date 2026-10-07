package com.cmaster.cloner;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wy1 extends xy1 {
    public final WindowInsetsAnimation OooO0o0;

    public wy1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.OooO0o0 = windowInsetsAnimation;
    }

    @Override // com.cmaster.cloner.xy1
    public final long OooO00o() {
        return this.OooO0o0.getDurationMillis();
    }

    @Override // com.cmaster.cloner.xy1
    public final float OooO0O0() {
        return this.OooO0o0.getInterpolatedFraction();
    }

    @Override // com.cmaster.cloner.xy1
    public final int OooO0OO() {
        return this.OooO0o0.getTypeMask();
    }

    @Override // com.cmaster.cloner.xy1
    public final void OooO0Oo(float f) {
        this.OooO0o0.setFraction(f);
    }
}
