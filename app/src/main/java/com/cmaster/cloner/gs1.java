package com.cmaster.cloner;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gs1 extends Drawable.ConstantState {
    public final Drawable.ConstantState OooO00o;

    public gs1(Drawable.ConstantState constantState) {
        this.OooO00o = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.OooO00o.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.OooO00o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        hs1 hs1Var = new hs1();
        hs1Var.OooO0Oo = (VectorDrawable) this.OooO00o.newDrawable();
        return hs1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        hs1 hs1Var = new hs1();
        hs1Var.OooO0Oo = (VectorDrawable) this.OooO00o.newDrawable(resources);
        return hs1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        hs1 hs1Var = new hs1();
        hs1Var.OooO0Oo = (VectorDrawable) this.OooO00o.newDrawable(resources, theme);
        return hs1Var;
    }
}
