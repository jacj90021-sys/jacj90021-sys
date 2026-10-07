package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fs1 extends Drawable.ConstantState {
    public int OooO;
    public int OooO00o;
    public es1 OooO0O0;
    public ColorStateList OooO0OO;
    public PorterDuff.Mode OooO0Oo;
    public Bitmap OooO0o;
    public boolean OooO0o0;
    public ColorStateList OooO0oO;
    public PorterDuff.Mode OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public Paint OooOO0o;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new hs1(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new hs1(this);
    }
}
