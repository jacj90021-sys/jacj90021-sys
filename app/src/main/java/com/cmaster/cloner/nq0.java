package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nq0 extends oOOO0OOO {
    public final LinkedHashSet OooO;
    public final LinkedHashSet OooO0oo;
    public ColorStateList OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public CharSequence OooOOO;
    public boolean OooOOO0;
    public Drawable OooOOOO;
    public Drawable OooOOOo;
    public ColorStateList OooOOo;
    public boolean OooOOo0;
    public ColorStateList OooOOoo;
    public CharSequence OooOo;
    public int OooOo0;
    public PorterDuff.Mode OooOo00;
    public int[] OooOo0O;
    public boolean OooOo0o;
    public final oO0OO00 OooOoO;
    public CompoundButton.OnCheckedChangeListener OooOoO0;
    public final t6 OooOoOO;
    public static final int[] OooOoo0 = {R.attr.state_indeterminate};
    public static final int[] OooOoo = {R.attr.state_error};
    public static final int[][] OooOooO = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int OooOooo = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public nq0(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(s62.OooO00o(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet);
        this.OooO0oo = new LinkedHashSet();
        this.OooO = new LinkedHashSet();
        Context context2 = getContext();
        oO0OO00 oo0oo00 = new oO0OO00(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = ta1.OooO00o;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        oo0oo00.OooO0Oo = drawable;
        drawable.setCallback(oo0oo00.OooO);
        new ooo0o(oo0oo00.OooO0Oo.getConstantState(), 0);
        this.OooOoO = oo0oo00;
        this.OooOoOO = new t6(this, 2);
        Context context3 = getContext();
        this.OooOOOO = getButtonDrawable();
        this.OooOOo = getSuperButtonTintList();
        setSupportButtonTintList(null);
        t82.OooO00o(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = k61.OooOOO0;
        t82.OooO0O0(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        a02 a02Var = new a02(context3, typedArrayObtainStyledAttributes);
        this.OooOOOo = a02Var.OooOOo(2);
        if (this.OooOOOO != null && sv2.OooO0O0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == OooOooo && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.OooOOOO = ym2.OooO00o(context3, R.drawable.mtrl_checkbox_button);
                this.OooOOo0 = true;
                if (this.OooOOOo == null) {
                    this.OooOOOo = ym2.OooO00o(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.OooOOoo = wv2.OooO0O0(context3, a02Var, 3);
        this.OooOo00 = r53.OooO00o(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.OooOO0O = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.OooOO0o = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.OooOOO0 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.OooOOO = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        a02Var.Oooo0oO();
        OooO00o();
    }

    private String getButtonStateDescription() {
        int i = this.OooOo0;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.OooOO0 == null) {
            int iOooO0OO = uv2.OooO0OO(this, R.attr.colorControlActivated);
            int iOooO0OO2 = uv2.OooO0OO(this, R.attr.colorError);
            int iOooO0OO3 = uv2.OooO0OO(this, R.attr.colorSurface);
            int iOooO0OO4 = uv2.OooO0OO(this, R.attr.colorOnSurface);
            this.OooOO0 = new ColorStateList(OooOooO, new int[]{uv2.OooO0o0(iOooO0OO3, iOooO0OO2, 1.0f), uv2.OooO0o0(iOooO0OO3, iOooO0OO, 1.0f), uv2.OooO0o0(iOooO0OO3, iOooO0OO4, 0.54f), uv2.OooO0o0(iOooO0OO3, iOooO0OO4, 0.38f), uv2.OooO0o0(iOooO0OO3, iOooO0OO4, 0.38f)});
        }
        return this.OooOO0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.OooOOo;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void OooO00o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        oOO00O ooo00o;
        Drawable drawableMutate = this.OooOOOO;
        ColorStateList colorStateList3 = this.OooOOo;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.OooOOOO = drawableMutate;
        Drawable drawableMutate2 = this.OooOOOo;
        ColorStateList colorStateList4 = this.OooOOoo;
        PorterDuff.Mode mode = this.OooOo00;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.OooOOOo = drawableMutate2;
        if (this.OooOOo0) {
            oO0OO00 oo0oo00 = this.OooOoO;
            if (oo0oo00 != null) {
                ooOOO00O ooooo00o = oo0oo00.OooO0o0;
                Drawable drawable = oo0oo00.OooO0Oo;
                t6 t6Var = this.OooOoOO;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (t6Var.OooO00o == null) {
                        t6Var.OooO00o = new oOo0oooO(t6Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(t6Var.OooO00o);
                }
                ArrayList arrayList = oo0oo00.OooO0oo;
                if (arrayList != null && t6Var != null) {
                    arrayList.remove(t6Var);
                    if (oo0oo00.OooO0oo.size() == 0 && (ooo00o = oo0oo00.OooO0oO) != null) {
                        ooooo00o.OooO0O0.removeListener(ooo00o);
                        oo0oo00.OooO0oO = null;
                    }
                }
                Drawable drawable2 = oo0oo00.OooO0Oo;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (t6Var.OooO00o == null) {
                        t6Var.OooO00o = new oOo0oooO(t6Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(t6Var.OooO00o);
                } else if (t6Var != null) {
                    if (oo0oo00.OooO0oo == null) {
                        oo0oo00.OooO0oo = new ArrayList();
                    }
                    if (!oo0oo00.OooO0oo.contains(t6Var)) {
                        oo0oo00.OooO0oo.add(t6Var);
                        if (oo0oo00.OooO0oO == null) {
                            oo0oo00.OooO0oO = new oOO00O(oo0oo00, 1);
                        }
                        ooooo00o.OooO0O0.addListener(oo0oo00.OooO0oO);
                    }
                }
            }
            Drawable drawable3 = this.OooOOOO;
            if ((drawable3 instanceof AnimatedStateListDrawable) && oo0oo00 != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, oo0oo00, false);
                ((AnimatedStateListDrawable) this.OooOOOO).addTransition(R.id.indeterminate, R.id.unchecked, oo0oo00, false);
            }
        }
        Drawable drawable4 = this.OooOOOO;
        if (drawable4 != null && (colorStateList2 = this.OooOOo) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.OooOOOo;
        if (drawable5 != null && (colorStateList = this.OooOOoo) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.OooOOOO;
        Drawable drawable7 = this.OooOOOo;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.OooOOOO;
    }

    public Drawable getButtonIconDrawable() {
        return this.OooOOOo;
    }

    public ColorStateList getButtonIconTintList() {
        return this.OooOOoo;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.OooOo00;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.OooOOo;
    }

    public int getCheckedState() {
        return this.OooOo0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.OooOOO;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.OooOo0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.OooOO0O && this.OooOOo == null && this.OooOOoo == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, OooOoo0);
        }
        if (this.OooOOO0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, OooOoo);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.OooOo0O = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.OooOO0o || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.OooOOO0) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.OooOOO));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mq0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mq0 mq0Var = (mq0) parcelable;
        super.onRestoreInstanceState(mq0Var.getSuperState());
        setCheckedState(mq0Var.OooO0Oo);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        mq0 mq0Var = new mq0(super.onSaveInstanceState());
        mq0Var.OooO0Oo = getCheckedState();
        return mq0Var;
    }

    @Override // com.cmaster.cloner.oOOO0OOO, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ym2.OooO00o(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.OooOOOo = drawable;
        OooO00o();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(ym2.OooO00o(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.OooOOoo == colorStateList) {
            return;
        }
        this.OooOOoo = colorStateList;
        OooO00o();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.OooOo00 == mode) {
            return;
        }
        this.OooOo00 = mode;
        OooO00o();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.OooOOo == colorStateList) {
            return;
        }
        this.OooOOo = colorStateList;
        OooO00o();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        OooO00o();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.OooOO0o = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.OooOo0 != i) {
            this.OooOo0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.OooOo == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.OooOo0o) {
                return;
            }
            this.OooOo0o = true;
            LinkedHashSet linkedHashSet = this.OooO;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw px0.OooOO0o(it);
                }
            }
            if (this.OooOo0 != 2 && (onCheckedChangeListener = this.OooOoO0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.OooOo0o = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.OooOOO = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.OooOOO0 == z) {
            return;
        }
        this.OooOOO0 = z;
        refreshDrawableState();
        Iterator it = this.OooO0oo.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.OooOoO0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.OooOo = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.OooOO0O = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // com.cmaster.cloner.oOOO0OOO, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.OooOOOO = drawable;
        this.OooOOo0 = false;
        OooO00o();
    }
}
