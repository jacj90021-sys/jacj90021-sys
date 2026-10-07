package com.cmaster.cloner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class kq0 extends oOOO00o0 implements Checkable, lg1 {
    public static final int[] OooOooO = {android.R.attr.state_checkable};
    public static final int[] OooOooo = {android.R.attr.state_checked};
    public PorterDuff.Mode OooO;
    public final lq0 OooO0oO;
    public final LinkedHashSet OooO0oo;
    public ColorStateList OooOO0;
    public Drawable OooOO0O;
    public String OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public int OooOOoo;
    public boolean OooOo;
    public float OooOo0;
    public int OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public int OooOoO;
    public int OooOoO0;
    public int OooOoOO;
    public float OooOoo;
    public float OooOoo0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kq0(android.content.Context r17, android.util.AttributeSet r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.kq0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static /* synthetic */ void OooO00o(kq0 kq0Var) {
        kq0Var.OooOoO0 = kq0Var.getOpticalCenterShift();
        kq0Var.OooO();
        kq0Var.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.OooOoo0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        lq0 lq0Var = this.OooO0oO;
        if (lq0Var == null || !lq0Var.OooOo00 || this.OooOOo0 == z) {
            return;
        }
        this.OooOOo0 = z;
        refreshDrawableState();
        getParent();
        if (this.OooOOo) {
            return;
        }
        this.OooOOo = true;
        Iterator it = this.OooO0oo.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
        this.OooOOo = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.OooOoo0 != f) {
            this.OooOoo0 = f;
            OooO();
            invalidate();
            getParent();
        }
    }

    public final void OooO() {
        int i = (int) (this.OooOoo0 - this.OooOoo);
        int i2 = (i / 2) + this.OooOoO0;
        getLayoutParams().width = (int) (this.OooOo0 + i);
        setPaddingRelative(this.OooOo0O + i2, getPaddingTop(), (this.OooOo0o + i) - i2, getPaddingBottom());
    }

    public final gi1 OooO0Oo() {
        Context context = getContext();
        TypedValue typedValueOooO00o = sv2.OooO00o(context, R.attr.motionSpringFastSpatial);
        int[] iArr = k61.OooOOOo;
        TypedArray typedArrayObtainStyledAttributes = typedValueOooO00o == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueOooO00o.resourceId, iArr);
        gi1 gi1Var = new gi1();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            gi1Var.OooO0O0(f);
            gi1Var.OooO00o(f2);
            return gi1Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void OooO0o() {
        int i = this.OooOOoo;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.OooOO0O, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.OooOO0O, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.OooOO0O, null, null);
        }
    }

    public final boolean OooO0o0() {
        lq0 lq0Var = this.OooO0oO;
        return (lq0Var == null || lq0Var.OooOOo) ? false : true;
    }

    public final void OooO0oO(boolean z) {
        Drawable drawable = this.OooOO0O;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.OooOO0O = drawableMutate;
            drawableMutate.setTintList(this.OooOO0);
            PorterDuff.Mode mode = this.OooO;
            if (mode != null) {
                this.OooOO0O.setTintMode(mode);
            }
            int intrinsicWidth = this.OooOOO0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.OooOO0O.getIntrinsicWidth();
            }
            int intrinsicHeight = this.OooOOO0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.OooOO0O.getIntrinsicHeight();
            }
            Drawable drawable2 = this.OooOO0O;
            int i = this.OooOOO;
            int i2 = this.OooOOOO;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.OooOO0O.setVisible(true, z);
        }
        if (z) {
            OooO0o();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.OooOOoo;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.OooOO0O) || (((i3 == 3 || i3 == 4) && drawable5 != this.OooOO0O) || ((i3 == 16 || i3 == 32) && drawable4 != this.OooOO0O))) {
            OooO0o();
        }
    }

    public final void OooO0oo(int i, int i2) {
        if (this.OooOO0O == null || getLayout() == null) {
            return;
        }
        int i3 = this.OooOOoo;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.OooOOO = 0;
                if (i3 == 16) {
                    this.OooOOOO = 0;
                    OooO0oO(false);
                    return;
                }
                int intrinsicHeight = this.OooOOO0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.OooOO0O.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.OooOOOo) - getPaddingBottom()) / 2);
                if (this.OooOOOO != iMax) {
                    this.OooOOOO = iMax;
                    OooO0oO(false);
                    return;
                }
                return;
            }
            return;
        }
        this.OooOOOO = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.OooOOoo;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.OooOOO = 0;
            OooO0oO(false);
            return;
        }
        int intrinsicWidth = this.OooOOO0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.OooOO0O.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.OooOOOo) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.OooOOoo == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.OooOOO != textLayoutWidth) {
            this.OooOOO = textLayoutWidth;
            OooO0oO(false);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.OooOO0o)) {
            return this.OooOO0o;
        }
        lq0 lq0Var = this.OooO0oO;
        return ((lq0Var == null || !lq0Var.OooOo00) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.OooOoO;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (OooO0o0()) {
            return this.OooO0oO.OooOO0;
        }
        return 0;
    }

    public gi1 getCornerSpringForce() {
        return this.OooO0oO.OooO0Oo;
    }

    public Drawable getIcon() {
        return this.OooOO0O;
    }

    public int getIconGravity() {
        return this.OooOOoo;
    }

    public int getIconPadding() {
        return this.OooOOOo;
    }

    public int getIconSize() {
        return this.OooOOO0;
    }

    public ColorStateList getIconTint() {
        return this.OooOO0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.OooO;
    }

    public int getInsetBottom() {
        return this.OooO0oO.OooO;
    }

    public int getInsetTop() {
        return this.OooO0oO.OooO0oo;
    }

    public ColorStateList getRippleColor() {
        if (OooO0o0()) {
            return this.OooO0oO.OooOOOO;
        }
        return null;
    }

    @Override // com.cmaster.cloner.lg1
    public ag1 getShapeAppearanceModel() {
        if (OooO0o0()) {
            return this.OooO0oO.OooO0O0;
        }
        qa.OooO0o("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ti1 getStateListShapeAppearanceModel() {
        if (OooO0o0()) {
            return this.OooO0oO.OooO0OO;
        }
        qa.OooO0o("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (OooO0o0()) {
            return this.OooO0oO.OooOOO;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (OooO0o0()) {
            return this.OooO0oO.OooOO0O;
        }
        return 0;
    }

    @Override // com.cmaster.cloner.oOOO00o0
    public ColorStateList getSupportBackgroundTintList() {
        return OooO0o0() ? this.OooO0oO.OooOOO0 : super.getSupportBackgroundTintList();
    }

    @Override // com.cmaster.cloner.oOOO00o0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return OooO0o0() ? this.OooO0oO.OooOO0o : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.OooOOo0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (OooO0o0()) {
            yv2.OooO0O0(this, this.OooO0oO.OooO00o(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        lq0 lq0Var = this.OooO0oO;
        if (lq0Var != null && lq0Var.OooOo00) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, OooOooO);
        }
        if (this.OooOOo0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, OooOooo);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // com.cmaster.cloner.oOOO00o0, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.OooOOo0);
    }

    @Override // com.cmaster.cloner.oOOO00o0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        lq0 lq0Var = this.OooO0oO;
        accessibilityNodeInfo.setCheckable(lq0Var != null && lq0Var.OooOo00);
        accessibilityNodeInfo.setChecked(this.OooOOo0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // com.cmaster.cloner.oOOO00o0, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        OooO0oo(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.OooOo00 != i6) {
            this.OooOo00 = i6;
            this.OooOo0 = -1.0f;
        }
        if (this.OooOo0 == -1.0f) {
            this.OooOo0 = getMeasuredWidth();
            getParent();
        }
        if (this.OooOoO == -1) {
            if (this.OooOO0O == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.OooOOO0;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.OooOO0O.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.OooOoO = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.OooOo0O == -1) {
            this.OooOo0O = getPaddingStart();
        }
        if (this.OooOo0o == -1) {
            this.OooOo0o = getPaddingEnd();
        }
        getParent();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jq0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jq0 jq0Var = (jq0) parcelable;
        super.onRestoreInstanceState(jq0Var.OooO0Oo);
        setChecked(jq0Var.OooO0o);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        jq0 jq0Var = new jq0(super.onSaveInstanceState());
        jq0Var.OooO0o = this.OooOOo0;
        return jq0Var;
    }

    @Override // com.cmaster.cloner.oOOO00o0, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        OooO0oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.OooO0oO.OooOo0) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.OooOO0O != null) {
            if (this.OooOO0O.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.OooOO0o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!OooO0o0()) {
            super.setBackgroundColor(i);
            return;
        }
        lq0 lq0Var = this.OooO0oO;
        if (lq0Var.OooO00o(false) != null) {
            lq0Var.OooO00o(false).setTint(i);
        }
    }

    @Override // com.cmaster.cloner.oOOO00o0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!OooO0o0()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        lq0 lq0Var = this.OooO0oO;
        lq0Var.OooOOo = true;
        kq0 kq0Var = lq0Var.OooO00o;
        kq0Var.setSupportBackgroundTintList(lq0Var.OooOOO0);
        kq0Var.setSupportBackgroundTintMode(lq0Var.OooOO0o);
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.cmaster.cloner.oOOO00o0, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ym2.OooO00o(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (OooO0o0()) {
            this.OooO0oO.OooOo00 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (OooO0o0()) {
            lq0 lq0Var = this.OooO0oO;
            if (lq0Var.OooOOoo && lq0Var.OooOO0 == i) {
                return;
            }
            lq0Var.OooOO0 = i;
            lq0Var.OooOOoo = true;
            float f = i;
            yf1 yf1VarOooO0o = lq0Var.OooO0O0.OooO0o();
            yf1VarOooO0o.OooO0o0 = new OooOO0(f);
            yf1VarOooO0o.OooO0o = new OooOO0(f);
            yf1VarOooO0o.OooO0oO = new OooOO0(f);
            yf1VarOooO0o.OooO0oo = new OooOO0(f);
            lq0Var.OooO0O0 = yf1VarOooO0o.OooO00o();
            lq0Var.OooO0OO = null;
            lq0Var.OooO0Oo();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (OooO0o0()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(gi1 gi1Var) {
        lq0 lq0Var = this.OooO0oO;
        lq0Var.OooO0Oo = gi1Var;
        if (lq0Var.OooO0OO != null) {
            lq0Var.OooO0Oo();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.OooOoo = Math.min(i, this.OooOoO);
        OooO();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (OooO0o0()) {
            this.OooO0oO.OooO00o(false).OooOO0O(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.OooOO0O != drawable) {
            this.OooOO0O = drawable;
            OooO0oO(true);
            OooO0oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.OooOOoo != i) {
            this.OooOOoo = i;
            OooO0oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.OooOOOo != i) {
            this.OooOOOo = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? ym2.OooO00o(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            ra.OooOOO("iconSize cannot be less than 0");
        } else if (this.OooOOO0 != i) {
            this.OooOOO0 = i;
            OooO0oO(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.OooOO0 != colorStateList) {
            this.OooOO0 = colorStateList;
            OooO0oO(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.OooO != mode) {
            this.OooO = mode;
            OooO0oO(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ep2.OooO0O0(getContext(), i));
    }

    public void setInsetBottom(int i) {
        lq0 lq0Var = this.OooO0oO;
        lq0Var.OooO0O0(lq0Var.OooO0oo, i);
    }

    public void setInsetTop(int i) {
        lq0 lq0Var = this.OooO0oO;
        lq0Var.OooO0O0(i, lq0Var.OooO);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(iq0 iq0Var) {
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.OooOo != z) {
            this.OooOo = z;
            lq0 lq0Var = this.OooO0oO;
            if (z) {
                pg0 pg0Var = new pg0(this);
                lq0Var.OooO0o0 = pg0Var;
                wq0 wq0VarOooO00o = lq0Var.OooO00o(false);
                if (wq0VarOooO00o != null) {
                    wq0VarOooO00o.Oooo00o = pg0Var;
                }
            } else {
                lq0Var.OooO0o0 = null;
                wq0 wq0VarOooO00o2 = lq0Var.OooO00o(false);
                if (wq0VarOooO00o2 != null) {
                    wq0VarOooO00o2.Oooo00o = null;
                }
            }
            post(new o00OOOOo(this, 10));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (OooO0o0()) {
            lq0 lq0Var = this.OooO0oO;
            kq0 kq0Var = lq0Var.OooO00o;
            if (lq0Var.OooOOOO != colorStateList) {
                lq0Var.OooOOOO = colorStateList;
                if (kq0Var.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) kq0Var.getBackground()).setColor(lb1.OooO00o(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (OooO0o0()) {
            setRippleColor(ep2.OooO0O0(getContext(), i));
        }
    }

    @Override // com.cmaster.cloner.lg1
    public void setShapeAppearanceModel(ag1 ag1Var) {
        if (!OooO0o0()) {
            qa.OooO0o("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        lq0 lq0Var = this.OooO0oO;
        lq0Var.OooO0O0 = ag1Var;
        lq0Var.OooO0OO = null;
        lq0Var.OooO0Oo();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (OooO0o0()) {
            lq0 lq0Var = this.OooO0oO;
            lq0Var.OooOOo0 = z;
            lq0Var.OooO0o0();
        }
    }

    public void setSizeChange(ui1 ui1Var) {
    }

    public void setStateListShapeAppearanceModel(ti1 ti1Var) {
        if (!OooO0o0()) {
            qa.OooO0o("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        lq0 lq0Var = this.OooO0oO;
        if (lq0Var.OooO0Oo == null && ti1Var.OooO00o > 1) {
            lq0Var.OooO0Oo = OooO0Oo();
            if (lq0Var.OooO0OO != null) {
                lq0Var.OooO0Oo();
            }
        }
        lq0Var.OooO0OO = ti1Var;
        lq0Var.OooO0Oo();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (OooO0o0()) {
            lq0 lq0Var = this.OooO0oO;
            if (lq0Var.OooOOO != colorStateList) {
                lq0Var.OooOOO = colorStateList;
                lq0Var.OooO0o0();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (OooO0o0()) {
            setStrokeColor(ep2.OooO0O0(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (OooO0o0()) {
            lq0 lq0Var = this.OooO0oO;
            if (lq0Var.OooOO0O != i) {
                lq0Var.OooOO0O = i;
                lq0Var.OooO0o0();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (OooO0o0()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // com.cmaster.cloner.oOOO00o0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!OooO0o0()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        lq0 lq0Var = this.OooO0oO;
        if (lq0Var.OooOOO0 != colorStateList) {
            lq0Var.OooOOO0 = colorStateList;
            if (lq0Var.OooO00o(false) != null) {
                lq0Var.OooO00o(false).setTintList(lq0Var.OooOOO0);
            }
        }
    }

    @Override // com.cmaster.cloner.oOOO00o0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!OooO0o0()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        lq0 lq0Var = this.OooO0oO;
        if (lq0Var.OooOO0o != mode) {
            lq0Var.OooOO0o = mode;
            if (lq0Var.OooO00o(false) == null || lq0Var.OooOO0o == null) {
                return;
            }
            lq0Var.OooO00o(false).setTintMode(lq0Var.OooOO0o);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        OooO0oo(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.OooO0oO.OooOo0 = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.OooOo0 = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.OooOoOO != i) {
            this.OooOoOO = i;
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.OooOOo0);
    }
}
