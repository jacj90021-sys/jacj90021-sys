package com.cmaster.cloner;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ooo0o extends Drawable.ConstantState {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public ooo0o(r8 r8Var) {
        this.OooO00o = 1;
        this.OooO0O0 = r8Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.OooO00o) {
            case 0:
                return ((Drawable.ConstantState) this.OooO0O0).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.OooO00o) {
            case 0:
                return ((Drawable.ConstantState) this.OooO0O0).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.OooO00o) {
            case 0:
                oO0OO00 oo0oo00 = new oO0OO00(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.OooO0O0).newDrawable(resources);
                oo0oo00.OooO0Oo = drawableNewDrawable;
                drawableNewDrawable.setCallback(oo0oo00.OooO);
                return oo0oo00;
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                return new x40(this);
        }
    }

    public /* synthetic */ ooo0o(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                oO0OO00 oo0oo00 = new oO0OO00(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) obj).newDrawable();
                oo0oo00.OooO0Oo = drawableNewDrawable;
                drawableNewDrawable.setCallback(oo0oo00.OooO);
                return oo0oo00;
            case 1:
                return (r8) obj;
            default:
                return new x40(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.OooO00o) {
            case 0:
                oO0OO00 oo0oo00 = new oO0OO00(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.OooO0O0).newDrawable(resources, theme);
                oo0oo00.OooO0Oo = drawableNewDrawable;
                drawableNewDrawable.setCallback(oo0oo00.OooO);
                return oo0oo00;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
