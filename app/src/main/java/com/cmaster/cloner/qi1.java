package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qi1 extends LinearLayout {
    public PorterDuff.Mode OooO;
    public final TextInputLayout OooO0Oo;
    public CharSequence OooO0o;
    public final AppCompatTextView OooO0o0;
    public final CheckableImageButton OooO0oO;
    public ColorStateList OooO0oo;
    public int OooOO0;
    public ImageView.ScaleType OooOO0O;
    public View.OnLongClickListener OooOO0o;
    public boolean OooOOO0;

    public qi1(TextInputLayout textInputLayout, a02 a02Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.OooO0Oo = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.OooO0oO = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.OooO0o0 = appCompatTextView;
        if (wv2.OooO0Oo(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.OooOO0o;
        checkableImageButton.setOnClickListener(null);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
        this.OooOO0o = null;
        checkableImageButton.setOnLongClickListener(null);
        ut2.OooO0Oo(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) a02Var.OooO0o;
        if (typedArray.hasValue(70)) {
            this.OooO0oo = wv2.OooO0O0(getContext(), a02Var, 70);
        }
        if (typedArray.hasValue(71)) {
            this.OooO = r53.OooO00o(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            OooO0O0(a02Var.OooOOo(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            ra.OooOOO("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.OooOO0) {
            this.OooOO0 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeOooO0O0 = ut2.OooO0O0(typedArray.getInt(69, -1));
            this.OooOO0O = scaleTypeOooO0O0;
            checkableImageButton.setScaleType(scaleTypeOooO0O0);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(a02Var.OooOOOo(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.OooO0o = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        OooO0o0();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int OooO00o() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.OooO0oO;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.OooO0o0.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void OooO0O0(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.OooO0oO;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.OooO0oo;
            PorterDuff.Mode mode = this.OooO;
            TextInputLayout textInputLayout = this.OooO0Oo;
            ut2.OooO00o(textInputLayout, checkableImageButton, colorStateList, mode);
            OooO0OO(true);
            ut2.OooO0OO(textInputLayout, checkableImageButton, this.OooO0oo);
            return;
        }
        OooO0OO(false);
        View.OnLongClickListener onLongClickListener = this.OooOO0o;
        checkableImageButton.setOnClickListener(null);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
        this.OooOO0o = null;
        checkableImageButton.setOnLongClickListener(null);
        ut2.OooO0Oo(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void OooO0OO(boolean z) {
        CheckableImageButton checkableImageButton = this.OooO0oO;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            OooO0Oo();
            OooO0o0();
        }
    }

    public final void OooO0Oo() {
        EditText editText = this.OooO0Oo.OooO0oo;
        if (editText == null) {
            return;
        }
        this.OooO0o0.setPaddingRelative(this.OooO0oO.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void OooO0o0() {
        int i = (this.OooO0o == null || this.OooOOO0) ? 8 : 0;
        setVisibility((this.OooO0oO.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.OooO0o0.setVisibility(i);
        this.OooO0Oo.OooOOoo();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0Oo();
    }
}
