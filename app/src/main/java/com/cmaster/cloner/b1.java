package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b1 extends ToggleButton {
    public final oO0OOo0o OooO0Oo;
    public C0006r OooO0o;
    public final s0 OooO0o0;

    public b1(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, android.R.attr.buttonStyleToggle);
        sm1.OooO00o(getContext(), this);
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this);
        this.OooO0Oo = oo0ooo0o;
        oo0ooo0o.OooOO0o(attributeSet, android.R.attr.buttonStyleToggle);
        s0 s0Var = new s0(this);
        this.OooO0o0 = s0Var;
        s0Var.OooO0o(attributeSet, android.R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().OooO0O0(attributeSet, android.R.attr.buttonStyleToggle);
    }

    private C0006r getEmojiTextViewHelper() {
        if (this.OooO0o == null) {
            this.OooO0o = new C0006r(this);
        }
        return this.OooO0o;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooO0O0();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            return oo0ooo0o.OooO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            return oo0ooo0o.OooOO0();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.OooO0o0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.OooO0o0.OooO0o0();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOOO();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOOOO(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOo0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOo0O(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s0 s0Var = this.OooO0o0;
        s0Var.OooOO0o(colorStateList);
        s0Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s0 s0Var = this.OooO0o0;
        s0Var.OooOOO0(mode);
        s0Var.OooO0O0();
    }
}
