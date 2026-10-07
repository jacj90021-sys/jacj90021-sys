package com.cmaster.cloner;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jg0 {
    public LinearLayout OooO;
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final TimeInterpolator OooO0Oo;
    public final TimeInterpolator OooO0o;
    public final TimeInterpolator OooO0o0;
    public final Context OooO0oO;
    public final TextInputLayout OooO0oo;
    public int OooOO0;
    public FrameLayout OooOO0O;
    public AnimatorSet OooOO0o;
    public int OooOOO;
    public final float OooOOO0;
    public int OooOOOO;
    public CharSequence OooOOOo;
    public AppCompatTextView OooOOo;
    public boolean OooOOo0;
    public CharSequence OooOOoo;
    public boolean OooOo;
    public int OooOo0;
    public int OooOo00;
    public ColorStateList OooOo0O;
    public CharSequence OooOo0o;
    public int OooOoO;
    public AppCompatTextView OooOoO0;
    public ColorStateList OooOoOO;
    public Typeface OooOoo0;

    public jg0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.OooO0oO = context;
        this.OooO0oo = textInputLayout;
        this.OooOOO0 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.OooO00o = ow2.OooO0OO(context, R.attr.motionDurationShort4, 217);
        this.OooO0O0 = ow2.OooO0OO(context, R.attr.motionDurationMedium4, 167);
        this.OooO0OO = ow2.OooO0OO(context, R.attr.motionDurationShort4, 167);
        this.OooO0Oo = ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, oO0oO000.OooO0Oo);
        LinearInterpolator linearInterpolator = oO0oO000.OooO00o;
        this.OooO0o0 = ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.OooO0o = ow2.OooO0Oo(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void OooO(int i, int i2, boolean z) {
        TextView textViewOooO0o0;
        TextView textViewOooO0o02;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.OooOO0o = animatorSet;
            ArrayList arrayList = new ArrayList();
            OooO0Oo(arrayList, this.OooOo, this.OooOoO0, 2, i, i2);
            OooO0Oo(arrayList, this.OooOOo0, this.OooOOo, 1, i, i2);
            rm2.OooO00o(animatorSet, arrayList);
            animatorSet.addListener(new hg0(this, i2, OooO0o0(i), i, OooO0o0(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewOooO0o02 = OooO0o0(i2)) != null) {
                textViewOooO0o02.setVisibility(0);
                textViewOooO0o02.setAlpha(1.0f);
            }
            if (i != 0 && (textViewOooO0o0 = OooO0o0(i)) != null) {
                textViewOooO0o0.setVisibility(4);
                if (i == 1) {
                    textViewOooO0o0.setText((CharSequence) null);
                }
            }
            this.OooOOO = i2;
        }
        TextInputLayout textInputLayout = this.OooO0oo;
        textInputLayout.OooOo00();
        textInputLayout.OooOo0o(z, false);
        textInputLayout.OooOoO();
    }

    public final void OooO00o(AppCompatTextView appCompatTextView, int i) {
        if (this.OooO == null && this.OooOO0O == null) {
            Context context = this.OooO0oO;
            LinearLayout linearLayout = new LinearLayout(context);
            this.OooO = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.OooO;
            TextInputLayout textInputLayout = this.OooO0oo;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.OooOO0O = new FrameLayout(context);
            this.OooO.addView(this.OooOO0O, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                OooO0O0();
            }
        }
        if (i == 0 || i == 1) {
            this.OooOO0O.setVisibility(0);
            this.OooOO0O.addView(appCompatTextView);
        } else {
            this.OooO.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.OooO.setVisibility(0);
        this.OooOO0++;
    }

    public final void OooO0O0() {
        if (this.OooO != null) {
            TextInputLayout textInputLayout = this.OooO0oo;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.OooO0oO;
                boolean zOooO0Oo = wv2.OooO0Oo(context);
                LinearLayout linearLayout = this.OooO;
                int paddingStart = editText.getPaddingStart();
                if (zOooO0Oo) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zOooO0Oo) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zOooO0Oo) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void OooO0OO() {
        AnimatorSet animatorSet = this.OooOO0o;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void OooO0Oo(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.OooO0OO;
            objectAnimatorOfFloat.setDuration(z2 ? this.OooO0O0 : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.OooO0o0 : this.OooO0o);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.OooOOO0, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.OooO00o);
            objectAnimatorOfFloat2.setInterpolator(this.OooO0Oo);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final void OooO0o() {
        this.OooOOOo = null;
        OooO0OO();
        if (this.OooOOO == 1) {
            if (!this.OooOo || TextUtils.isEmpty(this.OooOo0o)) {
                this.OooOOOO = 0;
            } else {
                this.OooOOOO = 2;
            }
        }
        OooO(this.OooOOO, this.OooOOOO, OooO0oo(this.OooOOo, ""));
    }

    public final TextView OooO0o0(int i) {
        if (i == 1) {
            return this.OooOOo;
        }
        if (i != 2) {
            return null;
        }
        return this.OooOoO0;
    }

    public final void OooO0oO(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.OooO;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.OooOO0O) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.OooOO0 - 1;
        this.OooOO0 = i2;
        LinearLayout linearLayout2 = this.OooO;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean OooO0oo(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.OooO0oo;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.OooOOOO == this.OooOOO && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }
}
