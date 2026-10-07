package com.cmaster.cloner;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zd extends jw {
    public EditText OooO;
    public final int OooO0o;
    public final int OooO0o0;
    public final TimeInterpolator OooO0oO;
    public final TimeInterpolator OooO0oo;
    public final o0oOOo OooOO0;
    public final wd OooOO0O;
    public AnimatorSet OooOO0o;
    public ValueAnimator OooOOO0;

    public zd(iw iwVar) {
        super(iwVar);
        this.OooOO0 = new o0oOOo(this, 1);
        this.OooOO0O = new wd(this, 0);
        this.OooO0o0 = ow2.OooO0OO(iwVar.getContext(), R.attr.motionDurationShort3, 100);
        this.OooO0o = ow2.OooO0OO(iwVar.getContext(), R.attr.motionDurationShort3, 150);
        this.OooO0oO = ow2.OooO0Oo(iwVar.getContext(), R.attr.motionEasingLinearInterpolator, oO0oO000.OooO00o);
        this.OooO0oo = ow2.OooO0Oo(iwVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO0oO000.OooO0Oo);
    }

    @Override // com.cmaster.cloner.jw
    public final void OooO00o() {
        if (this.OooO0O0.OooOOoo != null) {
            return;
        }
        OooOOoo(OooOo00());
    }

    @Override // com.cmaster.cloner.jw
    public final int OooO0OO() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.cmaster.cloner.jw
    public final int OooO0Oo() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.cmaster.cloner.jw
    public final View.OnClickListener OooO0o() {
        return this.OooOO0;
    }

    @Override // com.cmaster.cloner.jw
    public final View.OnFocusChangeListener OooO0o0() {
        return this.OooOO0O;
    }

    @Override // com.cmaster.cloner.jw
    public final View.OnFocusChangeListener OooO0oO() {
        return this.OooOO0O;
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOO0o(EditText editText) {
        this.OooO = editText;
        this.OooO00o.setEndIconVisible(OooOo00());
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOOO(boolean z) {
        if (this.OooO0O0.OooOOoo == null) {
            return;
        }
        OooOOoo(z);
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOo() {
        EditText editText = this.OooO;
        if (editText != null) {
            editText.post(new o00OOOOo(this, 4));
        }
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOo0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.OooO0oo);
        valueAnimatorOfFloat.setDuration(this.OooO0o);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.cmaster.cloner.xd
            public final /* synthetic */ zd OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                zd zdVar = this.OooO0O0;
                switch (i2) {
                    case 0:
                        zdVar.OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = zdVar.OooO0Oo;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.OooO0oO;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.OooO0o0;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.cmaster.cloner.xd
            public final /* synthetic */ zd OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                zd zdVar = this.OooO0O0;
                switch (i22) {
                    case 0:
                        zdVar.OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = zdVar.OooO0Oo;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.OooOO0o = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.OooOO0o.addListener(new yd(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.cmaster.cloner.xd
            public final /* synthetic */ zd OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i3;
                zd zdVar = this.OooO0O0;
                switch (i22) {
                    case 0:
                        zdVar.OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = zdVar.OooO0Oo;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.OooOOO0 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new yd(this, i));
    }

    public final void OooOOoo(boolean z) {
        boolean z2 = this.OooO0O0.OooO0OO() == z;
        if (z && !this.OooOO0o.isRunning()) {
            this.OooOOO0.cancel();
            this.OooOO0o.start();
            if (z2) {
                this.OooOO0o.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.OooOO0o.cancel();
        this.OooOOO0.start();
        if (z2) {
            this.OooOOO0.end();
        }
    }

    public final boolean OooOo00() {
        EditText editText = this.OooO;
        if (editText != null) {
            return (editText.hasFocus() || this.OooO0Oo.hasFocus()) && this.OooO.getText().length() > 0;
        }
        return false;
    }
}
