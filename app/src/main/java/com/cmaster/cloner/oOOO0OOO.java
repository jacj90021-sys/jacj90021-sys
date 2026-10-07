package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class oOOO0OOO extends CheckBox implements kn1 {
    public final oOOOOo0O OooO0Oo;
    public final s0 OooO0o;
    public final oO0OOo0o OooO0o0;
    public C0006r OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OOO(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.checkboxStyle);
        hn1.OooO00o(context);
        sm1.OooO00o(getContext(), this);
        oOOOOo0O oooooo0o = new oOOOOo0O(this);
        this.OooO0Oo = oooooo0o;
        oooooo0o.OooO0OO(attributeSet, R.attr.checkboxStyle);
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this);
        this.OooO0o0 = oo0ooo0o;
        oo0ooo0o.OooOO0o(attributeSet, R.attr.checkboxStyle);
        s0 s0Var = new s0(this);
        this.OooO0o = s0Var;
        s0Var.OooO0o(attributeSet, R.attr.checkboxStyle);
        getEmojiTextViewHelper().OooO0O0(attributeSet, R.attr.checkboxStyle);
    }

    private C0006r getEmojiTextViewHelper() {
        if (this.OooO0oO == null) {
            this.OooO0oO = new C0006r(this);
        }
        return this.OooO0oO;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooO0O0();
        }
        s0 s0Var = this.OooO0o;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            return oo0ooo0o.OooO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            return oo0ooo0o.OooOO0();
        }
        return null;
    }

    @Override // com.cmaster.cloner.kn1
    public ColorStateList getSupportButtonTintList() {
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            return oooooo0o.OooO00o;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            return oooooo0o.OooO0O0;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.OooO0o.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.OooO0o.OooO0o0();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOOO();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOOOO(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            if (oooooo0o.OooO0o0) {
                oooooo0o.OooO0o0 = false;
            } else {
                oooooo0o.OooO0o0 = true;
                oooooo0o.OooO00o();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o;
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
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOo0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOo0O(mode);
        }
    }

    @Override // com.cmaster.cloner.kn1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            oooooo0o.OooO00o = colorStateList;
            oooooo0o.OooO0OO = true;
            oooooo0o.OooO00o();
        }
    }

    @Override // com.cmaster.cloner.kn1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            oooooo0o.OooO0O0 = mode;
            oooooo0o.OooO0Oo = true;
            oooooo0o.OooO00o();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s0 s0Var = this.OooO0o;
        s0Var.OooOO0o(colorStateList);
        s0Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s0 s0Var = this.OooO0o;
        s0Var.OooOOO0(mode);
        s0Var.OooO0O0();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ym2.OooO00o(getContext(), i));
    }
}
