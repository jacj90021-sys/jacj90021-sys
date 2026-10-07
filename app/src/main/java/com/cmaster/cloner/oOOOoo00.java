package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOOOoo00 extends CheckedTextView {
    public final oOOOOo0O OooO0Oo;
    public final s0 OooO0o;
    public final oO0OOo0o OooO0o0;
    public C0006r OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        hn1.OooO00o(context);
        sm1.OooO00o(getContext(), this);
        s0 s0Var = new s0(this);
        this.OooO0o = s0Var;
        s0Var.OooO0o(attributeSet, R.attr.checkedTextViewStyle);
        s0Var.OooO0O0();
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this);
        this.OooO0o0 = oo0ooo0o;
        oo0ooo0o.OooOO0o(attributeSet, R.attr.checkedTextViewStyle);
        this.OooO0Oo = new oOOOOo0O(this);
        Context context2 = getContext();
        int[] iArr = l61.OooOO0o;
        a02 a02VarOooo0OO = a02.Oooo0OO(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        nt1.OooOO0o(this, getContext(), iArr, attributeSet, (TypedArray) a02VarOooo0OO.OooO0o, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(ym2.OooO00o(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(ym2.OooO00o(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(a02VarOooo0OO.OooOOOo(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(ct.OooO0OO(typedArray.getInt(3, -1), null));
            }
            a02VarOooo0OO.Oooo0oO();
            getEmojiTextViewHelper().OooO0O0(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            a02VarOooo0OO.Oooo0oO();
            throw th;
        }
    }

    private C0006r getEmojiTextViewHelper() {
        if (this.OooO0oO == null) {
            this.OooO0oO = new C0006r(this);
        }
        return this.OooO0oO;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s0 s0Var = this.OooO0o;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
        oO0OOo0o oo0ooo0o = this.OooO0o0;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooO0O0();
        }
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            oooooo0o.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o43.OooO0o0(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            return oooooo0o.OooO00o;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        um2.OooO00o(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            if (oooooo0o.OooO0o0) {
                oooooo0o.OooO0o0 = false;
            } else {
                oooooo0o.OooO0o0 = true;
                oooooo0o.OooO0O0();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o43.OooO0o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            oooooo0o.OooO00o = colorStateList;
            oooooo0o.OooO0OO = true;
            oooooo0o.OooO0O0();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        oOOOOo0O oooooo0o = this.OooO0Oo;
        if (oooooo0o != null) {
            oooooo0o.OooO0O0 = mode;
            oooooo0o.OooO0Oo = true;
            oooooo0o.OooO0O0();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        s0 s0Var = this.OooO0o;
        if (s0Var != null) {
            s0Var.OooO0oO(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ym2.OooO00o(getContext(), i));
    }
}
