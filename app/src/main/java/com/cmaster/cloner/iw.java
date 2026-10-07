package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class iw extends LinearLayout {
    public View.OnLongClickListener OooO;
    public final TextInputLayout OooO0Oo;
    public final CheckableImageButton OooO0o;
    public final FrameLayout OooO0o0;
    public ColorStateList OooO0oO;
    public PorterDuff.Mode OooO0oo;
    public final CheckableImageButton OooOO0;
    public final hw OooOO0O;
    public int OooOO0o;
    public ColorStateList OooOOO;
    public final LinkedHashSet OooOOO0;
    public PorterDuff.Mode OooOOOO;
    public int OooOOOo;
    public View.OnLongClickListener OooOOo;
    public ImageView.ScaleType OooOOo0;
    public CharSequence OooOOoo;
    public AccessibilityManager.TouchExplorationStateChangeListener OooOo;
    public boolean OooOo0;
    public final AppCompatTextView OooOo00;
    public EditText OooOo0O;
    public final AccessibilityManager OooOo0o;
    public final fw OooOoO0;

    public iw(TextInputLayout textInputLayout, a02 a02Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.OooOO0o = 0;
        this.OooOOO0 = new LinkedHashSet();
        this.OooOoO0 = new fw(this, 0);
        gw gwVar = new gw(this);
        this.OooOo0o = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.OooO0Oo = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.OooO0o0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (wv2.OooO0Oo(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.OooO0o = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (wv2.OooO0Oo(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.OooOO0 = checkableImageButton2;
        this.OooOO0O = new hw(this, a02Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.OooOo00 = appCompatTextView;
        TypedArray typedArray = (TypedArray) a02Var.OooO0o;
        if (typedArray.hasValue(38)) {
            this.OooO0oO = wv2.OooO0O0(getContext(), a02Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.OooO0oo = r53.OooO00o(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            OooO0oo(a02Var.OooOOo(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setCheckable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.OooOOO = wv2.OooO0O0(getContext(), a02Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.OooOOOO = r53.OooO00o(typedArray.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray.hasValue(30)) {
            OooO0o(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButton2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButton2.setContentDescription(text);
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.OooOOO = wv2.OooO0O0(getContext(), a02Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.OooOOOO = r53.OooO00o(typedArray.getInt(56, -1), null);
            }
            OooO0o(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButton2.getContentDescription() != text2) {
                checkableImageButton2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            ra.OooOOO("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.OooOOOo) {
            this.OooOOOo = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeOooO0O0 = ut2.OooO0O0(typedArray.getInt(31, -1));
            this.OooOOo0 = scaleTypeOooO0O0;
            checkableImageButton2.setScaleType(scaleTypeOooO0O0);
            checkableImageButton.setScaleType(scaleTypeOooO0O0);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(a02Var.OooOOOo(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.OooOOoo = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        OooOOO0();
        frameLayout.addView(checkableImageButton2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButton);
        textInputLayout.OooooOo.add(gwVar);
        if (textInputLayout.OooO0oo != null) {
            gwVar.OooO00o(textInputLayout);
        }
        addOnAttachStateChangeListener(new rb(this, i));
    }

    public final void OooO(jw jwVar) {
        if (this.OooOo0O == null) {
            return;
        }
        if (jwVar.OooO0o0() != null) {
            this.OooOo0O.setOnFocusChangeListener(jwVar.OooO0o0());
        }
        if (jwVar.OooO0oO() != null) {
            this.OooOO0.setOnFocusChangeListener(jwVar.OooO0oO());
        }
    }

    public final jw OooO00o() {
        jw tlVar;
        int i = this.OooOO0o;
        hw hwVar = this.OooOO0O;
        SparseArray sparseArray = (SparseArray) hwVar.OooO0OO;
        jw jwVar = (jw) sparseArray.get(i);
        if (jwVar != null) {
            return jwVar;
        }
        iw iwVar = (iw) hwVar.OooO0Oo;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                tlVar = new tl(iwVar, i2);
            } else if (i == 1) {
                tlVar = new n21(iwVar, hwVar.OooO0O0);
            } else if (i == 2) {
                tlVar = new zd(iwVar);
            } else {
                if (i != 3) {
                    ra.OooOOO(px0.OooOOO(i, "Invalid end icon mode: "));
                    return null;
                }
                tlVar = new tt(iwVar);
            }
        } else {
            tlVar = new tl(iwVar, 0);
        }
        sparseArray.append(i, tlVar);
        return tlVar;
    }

    public final int OooO0O0() {
        int marginStart;
        if (OooO0OO() || OooO0Oo()) {
            CheckableImageButton checkableImageButton = this.OooOO0;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.OooOo00.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean OooO0OO() {
        return this.OooO0o0.getVisibility() == 0 && this.OooOO0.getVisibility() == 0;
    }

    public final boolean OooO0Oo() {
        return this.OooO0o.getVisibility() == 0;
    }

    public final void OooO0o(int i) {
        if (this.OooOO0o == i) {
            return;
        }
        jw jwVarOooO00o = OooO00o();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.OooOo;
        AccessibilityManager accessibilityManager = this.OooOo0o;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.OooOo = null;
        jwVarOooO00o.OooOOo();
        this.OooOO0o = i;
        Iterator it = this.OooOOO0.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
        OooO0oO(i != 0);
        jw jwVarOooO00o2 = OooO00o();
        int iOooO0Oo = this.OooOO0O.OooO00o;
        if (iOooO0Oo == 0) {
            iOooO0Oo = jwVarOooO00o2.OooO0Oo();
        }
        Drawable drawableOooO00o = iOooO0Oo != 0 ? ym2.OooO00o(getContext(), iOooO0Oo) : null;
        CheckableImageButton checkableImageButton = this.OooOO0;
        checkableImageButton.setImageDrawable(drawableOooO00o);
        TextInputLayout textInputLayout = this.OooO0Oo;
        if (drawableOooO00o != null) {
            ut2.OooO00o(textInputLayout, checkableImageButton, this.OooOOO, this.OooOOOO);
            ut2.OooO0OO(textInputLayout, checkableImageButton, this.OooOOO);
        }
        int iOooO0OO = jwVarOooO00o2.OooO0OO();
        CharSequence text = iOooO0OO != 0 ? getResources().getText(iOooO0OO) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(jwVarOooO00o2.OooOO0());
        if (!jwVarOooO00o2.OooO(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        jwVarOooO00o2.OooOOo0();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerOooO0oo = jwVarOooO00o2.OooO0oo();
        this.OooOo = touchExplorationStateChangeListenerOooO0oo;
        if (touchExplorationStateChangeListenerOooO0oo != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.OooOo);
        }
        View.OnClickListener onClickListenerOooO0o = jwVarOooO00o2.OooO0o();
        View.OnLongClickListener onLongClickListener = this.OooOOo;
        checkableImageButton.setOnClickListener(onClickListenerOooO0o);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
        EditText editText = this.OooOo0O;
        if (editText != null) {
            jwVarOooO00o2.OooOO0o(editText);
            OooO(jwVarOooO00o2);
        }
        ut2.OooO00o(textInputLayout, checkableImageButton, this.OooOOO, this.OooOOOO);
        OooO0o0(true);
    }

    public final void OooO0o0(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        jw jwVarOooO00o = OooO00o();
        boolean zOooOO0 = jwVarOooO00o.OooOO0();
        CheckableImageButton checkableImageButton = this.OooOO0;
        boolean z4 = true;
        if (!zOooOO0 || (z3 = checkableImageButton.OooO0oO) == jwVarOooO00o.OooOO0O()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(jwVarOooO00o instanceof tt) || (zIsActivated = checkableImageButton.isActivated()) == ((tt) jwVarOooO00o).OooOO0o) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ut2.OooO0OO(this.OooO0Oo, checkableImageButton, this.OooOOO);
        }
    }

    public final void OooO0oO(boolean z) {
        if (OooO0OO() != z) {
            this.OooOO0.setVisibility(z ? 0 : 8);
            OooOO0();
            OooOO0o();
            this.OooO0Oo.OooOOoo();
        }
    }

    public final void OooO0oo(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.OooO0o;
        checkableImageButton.setImageDrawable(drawable);
        OooOO0O();
        ut2.OooO00o(this.OooO0Oo, checkableImageButton, this.OooO0oO, this.OooO0oo);
    }

    public final void OooOO0() {
        this.OooO0o0.setVisibility((this.OooOO0.getVisibility() != 0 || OooO0Oo()) ? 8 : 0);
        setVisibility((OooO0OO() || OooO0Oo() || !((this.OooOOoo == null || this.OooOo0) ? 8 : false)) ? 0 : 8);
    }

    public final void OooOO0O() {
        CheckableImageButton checkableImageButton = this.OooO0o;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.OooO0Oo;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.OooOOO.OooOOo0 && textInputLayout.OooOOOO()) ? 0 : 8);
        OooOO0();
        OooOO0o();
        if (this.OooOO0o != 0) {
            return;
        }
        textInputLayout.OooOOoo();
    }

    public final void OooOO0o() {
        TextInputLayout textInputLayout = this.OooO0Oo;
        if (textInputLayout.OooO0oo == null) {
            return;
        }
        this.OooOo00.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.OooO0oo.getPaddingTop(), (OooO0OO() || OooO0Oo()) ? 0 : textInputLayout.OooO0oo.getPaddingEnd(), textInputLayout.OooO0oo.getPaddingBottom());
    }

    public final void OooOOO0() {
        AppCompatTextView appCompatTextView = this.OooOo00;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.OooOOoo == null || this.OooOo0) ? 8 : 0;
        if (visibility != i) {
            OooO00o().OooOOOO(i == 0);
        }
        OooOO0();
        appCompatTextView.setVisibility(i);
        this.OooO0Oo.OooOOoo();
    }
}
