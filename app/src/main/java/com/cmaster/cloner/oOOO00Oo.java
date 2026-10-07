package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class oOOO00Oo extends AutoCompleteTextView {
    public static final int[] OooO0oO = {android.R.attr.popupBackground};
    public final oO0OOo0o OooO0Oo;
    public final e81 OooO0o;
    public final s0 OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        hn1.OooO00o(context);
        sm1.OooO00o(getContext(), this);
        a02 a02VarOooo0OO = a02.Oooo0OO(getContext(), attributeSet, OooO0oO, i);
        if (((TypedArray) a02VarOooo0OO.OooO0o).hasValue(0)) {
            setDropDownBackgroundDrawable(a02VarOooo0OO.OooOOo(0));
        }
        a02VarOooo0OO.Oooo0oO();
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this);
        this.OooO0Oo = oo0ooo0o;
        oo0ooo0o.OooOO0o(attributeSet, i);
        s0 s0Var = new s0(this);
        this.OooO0o0 = s0Var;
        s0Var.OooO0o(attributeSet, i);
        s0Var.OooO0O0();
        e81 e81Var = new e81(this);
        this.OooO0o = e81Var;
        e81Var.OooOOo(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerOooOO0o = e81Var.OooOO0o(keyListener);
        if (keyListenerOooOO0o == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerOooOO0o);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o43.OooO0o0(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        um2.OooO00o(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.OooO0o.OooOOoo(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o43.OooO0o(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ym2.OooO00o(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.OooO0o.OooOoOO(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.OooO0o.OooOO0o(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0oO(context, i);
        }
    }
}
