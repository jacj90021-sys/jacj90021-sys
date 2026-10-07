package com.cmaster.cloner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class oOOO00o0 extends Button {
    public final oO0OOo0o OooO0Oo;
    public C0006r OooO0o;
    public final s0 OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00o0(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        hn1.OooO00o(context);
        sm1.OooO00o(getContext(), this);
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this);
        this.OooO0Oo = oo0ooo0o;
        oo0ooo0o.OooOO0o(attributeSet, i);
        s0 s0Var = new s0(this);
        this.OooO0o0 = s0Var;
        s0Var.OooO0o(attributeSet, i);
        s0Var.OooO0O0();
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    private C0006r getEmojiTextViewHelper() {
        if (this.OooO0o == null) {
            this.OooO0o = new C0006r(this);
        }
        return this.OooO0o;
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
    public int getAutoSizeMaxTextSize() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeMaxTextSize();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return Math.round(((a1) s0Var.OooOO0o).OooO0o0);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeMinTextSize();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return Math.round(((a1) s0Var.OooOO0o).OooO0Oo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeStepGranularity();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return Math.round(((a1) s0Var.OooOO0o).OooO0OO);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeTextAvailableSizes();
        }
        s0 s0Var = this.OooO0o0;
        return s0Var != null ? ((a1) s0Var.OooOO0o).OooO0o : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return ((a1) s0Var.OooOO0o).OooO00o;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s0 s0Var = this.OooO0o0;
        if (s0Var == null || nu1.OooO0OO) {
            return;
        }
        ((a1) s0Var.OooOO0o).OooO00o();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            a1 a1Var = (a1) s0Var.OooOO0o;
            if (nu1.OooO0OO || !a1Var.OooO0o()) {
                return;
            }
            a1Var.OooO00o();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (nu1.OooO0OO) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (nu1.OooO0OO) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooOO0(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (nu1.OooO0OO) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooOO0O(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o43.OooO0o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            ((TextView) s0Var.OooO0Oo).setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = nu1.OooO0OO;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            a1 a1Var = (a1) s0Var.OooOO0o;
            if (z || a1Var.OooO0o()) {
                return;
            }
            a1Var.OooO0oO(i, f);
        }
    }
}
