package com.cmaster.cloner;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ne {
    public final TextInputLayout OooO00o;
    public float OooO0O0;
    public final Rect OooO0OO;
    public final Rect OooO0Oo;
    public final RectF OooO0o0;
    public ColorStateList OooOO0;
    public ColorStateList OooOO0O;
    public int OooOO0o;
    public float OooOOO;
    public float OooOOO0;
    public float OooOOOO;
    public float OooOOOo;
    public float OooOOo;
    public float OooOOo0;
    public Typeface OooOOoo;
    public Typeface OooOo;
    public Typeface OooOo0;
    public Typeface OooOo00;
    public Typeface OooOo0O;
    public Typeface OooOo0o;
    public oh1 OooOoO;
    public Typeface OooOoO0;
    public CharSequence OooOoo;
    public CharSequence OooOoo0;
    public boolean OooOooO;
    public final TextPaint Oooo;
    public float Oooo0;
    public float Oooo000;
    public float Oooo00O;
    public float Oooo00o;
    public float Oooo0O0;
    public int Oooo0OO;
    public int[] Oooo0o;
    public int Oooo0o0;
    public boolean Oooo0oO;
    public final TextPaint Oooo0oo;
    public float OoooO;
    public TimeInterpolator OoooO0;
    public TimeInterpolator OoooO00;
    public float OoooO0O;
    public float OoooOO0;
    public float OoooOOO;
    public float OoooOOo;
    public float OoooOo0;
    public StaticLayout OoooOoO;
    public float OoooOoo;
    public float Ooooo00;
    public float Ooooo0o;
    public CharSequence OooooO0;
    public ColorStateList o000oOoO;
    public boolean o0OoOo0;
    public int OooO0o = 16;
    public int OooO0oO = 16;
    public float OooO0oo = 15.0f;
    public float OooO = 15.0f;
    public final TextUtils.TruncateAt OooOoOO = TextUtils.TruncateAt.END;
    public final boolean OooOooo = true;
    public int OooooOO = 1;
    public int OooooOo = 1;
    public final float Oooooo0 = 1.0f;
    public final int Oooooo = 1;
    public int OoooooO = -1;
    public int Ooooooo = -1;

    public ne(TextInputLayout textInputLayout) {
        this.OooO00o = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.Oooo0oo = textPaint;
        this.Oooo = new TextPaint(textPaint);
        this.OooO0Oo = new Rect();
        this.OooO0OO = new Rect();
        this.OooO0o0 = new RectF();
        OooO(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int OooO00o(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float OooO0oo(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return oO0oO000.OooO00o(f, f2, f3);
    }

    public final void OooO(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.OooOo0;
            if (typeface != null) {
                this.OooOo00 = j53.OooO00o(configuration, typeface);
            }
            Typeface typeface2 = this.OooOo;
            if (typeface2 != null) {
                this.OooOo0o = j53.OooO00o(configuration, typeface2);
            }
            Typeface typeface3 = this.OooOo00;
            if (typeface3 == null) {
                typeface3 = this.OooOo0;
            }
            this.OooOOoo = typeface3;
            Typeface typeface4 = this.OooOo0o;
            if (typeface4 == null) {
                typeface4 = this.OooOo;
            }
            this.OooOo0O = typeface4;
            OooOO0(true);
        }
    }

    public final void OooO0O0() {
        float f = this.OooO0O0;
        float f2 = this.OooO0OO.left;
        Rect rect = this.OooO0Oo;
        float fOooO0oo = OooO0oo(f2, rect.left, f, this.OoooO00);
        RectF rectF = this.OooO0o0;
        rectF.left = fOooO0oo;
        rectF.top = OooO0oo(this.OooOOO0, this.OooOOO, f, this.OoooO00);
        rectF.right = OooO0oo(r1.right, rect.right, f, this.OoooO00);
        rectF.bottom = OooO0oo(r1.bottom, rect.bottom, f, this.OoooO00);
        this.OooOOo0 = OooO0oo(this.OooOOOO, this.OooOOOo, f, this.OoooO00);
        this.OooOOo = OooO0oo(this.OooOOO0, this.OooOOO, f, this.OoooO00);
        OooO0Oo(f, false);
        TextInputLayout textInputLayout = this.OooO00o;
        textInputLayout.postInvalidateOnAnimation();
        yy yyVar = oO0oO000.OooO0O0;
        this.Ooooo00 = 1.0f - OooO0oo(0.0f, 1.0f, 1.0f - f, yyVar);
        textInputLayout.postInvalidateOnAnimation();
        this.Ooooo0o = OooO0oo(1.0f, 0.0f, f, yyVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.OooOO0O;
        ColorStateList colorStateList2 = this.OooOO0;
        TextPaint textPaint = this.Oooo0oo;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(OooO00o(OooO0oO(colorStateList2), OooO0oO(this.OooOO0O), f));
        } else {
            textPaint.setColor(OooO0oO(colorStateList));
        }
        float f3 = this.OoooOOO;
        float f4 = this.OoooOOo;
        if (f3 != f4) {
            textPaint.setLetterSpacing(OooO0oo(f4, f3, f, yyVar));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.Oooo00o = oO0oO000.OooO00o(0.0f, this.OoooO0O, f);
        this.Oooo0 = oO0oO000.OooO00o(0.0f, this.OoooO, f);
        this.Oooo0O0 = oO0oO000.OooO00o(0.0f, this.OoooOO0, f);
        int iOooO00o = OooO00o(0, OooO0oO(this.o000oOoO), f);
        this.Oooo0OO = iOooO00o;
        textPaint.setShadowLayer(this.Oooo00o, this.Oooo0, this.Oooo0O0, iOooO00o);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean OooO0OO(CharSequence charSequence) {
        boolean z = this.OooO00o.getLayoutDirection() == 1;
        if (this.OooOooo) {
            return (z ? lm1.OooO0Oo : lm1.OooO0OO).OooO0O0(charSequence, charSequence.length());
        }
        return z;
    }

    public final void OooO0Oo(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.OooOoo0 == null) {
            return;
        }
        float fWidth = this.OooO0Oo.width();
        float fWidth2 = this.OooO0OO.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = OooOOOO() ? this.OooO : this.OooO0oo;
            f3 = OooOOOO() ? this.OoooOOO : this.OoooOOo;
            this.Oooo000 = OooOOOO() ? 1.0f : OooO0oo(this.OooO0oo, this.OooO, f, this.OoooO0) / this.OooO0oo;
            if (!OooOOOO()) {
                fWidth = fWidth2;
            }
            typeface = this.OooOOoo;
            fWidth2 = fWidth;
        } else {
            f2 = this.OooO0oo;
            float f4 = this.OoooOOo;
            typeface = this.OooOo0O;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.Oooo000 = 1.0f;
            } else {
                this.Oooo000 = OooO0oo(this.OooO0oo, this.OooO, f, this.OoooO0) / this.OooO0oo;
            }
            float f5 = this.OooO / this.OooO0oo;
            float f6 = fWidth2 * f5;
            if (!z && f6 > fWidth && OooOOOO()) {
                fWidth2 = Math.min(fWidth / f5, fWidth2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.OooooOO : this.OooooOo;
        TextPaint textPaint = this.Oooo0oo;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.Oooo00O != f2;
            boolean z3 = this.OoooOo0 != f3;
            boolean z4 = this.OooOoO0 != typeface;
            StaticLayout staticLayout = this.OoooOoO;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.Oooo0o0 != i) || this.Oooo0oO;
            this.Oooo00O = f2;
            this.OoooOo0 = f3;
            this.OooOoO0 = typeface;
            this.Oooo0oO = false;
            this.Oooo0o0 = i;
            textPaint.setLinearText(this.Oooo000 != 1.0f);
            z = z5;
        }
        if (this.OooOoo == null || z) {
            textPaint.setTextSize(this.Oooo00O);
            textPaint.setTypeface(this.OooOoO0);
            textPaint.setLetterSpacing(this.OoooOo0);
            boolean zOooO0OO = OooO0OO(this.OooOoo0);
            this.OooOooO = zOooO0OO;
            StaticLayout staticLayoutOooO0o0 = OooO0o0(((this.OooooOO > 1 || this.OooooOo > 1) && !zOooO0OO) ? i : 1, textPaint, this.OooOoo0, fWidth2 * (OooOOOO() ? 1.0f : this.Oooo000), this.OooOooO);
            this.OoooOoO = staticLayoutOooO0o0;
            this.OooOoo = staticLayoutOooO0o0.getText();
        }
    }

    public final float OooO0o() {
        int i = this.OoooooO;
        if (i != -1) {
            return i;
        }
        float f = this.OooO;
        TextPaint textPaint = this.Oooo;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.OooOOoo);
        textPaint.setLetterSpacing(this.OoooOOO);
        return -textPaint.ascent();
    }

    public final StaticLayout OooO0o0(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.OooO0o, this.OooOooO ? 1 : 0) & 7;
            if (absoluteGravity != 1) {
                boolean z2 = this.OooOooO;
                alignment = absoluteGravity != 5 ? z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
        }
        wi1 wi1Var = new wi1(charSequence, textPaint, (int) f);
        wi1Var.OooOO0o = this.OooOoOO;
        wi1Var.OooOO0O = z;
        wi1Var.OooO0o0 = alignment;
        wi1Var.OooOO0 = false;
        wi1Var.OooO0o = i;
        wi1Var.OooO0oO = 0.0f;
        wi1Var.OooO0oo = this.Oooooo0;
        wi1Var.OooO = this.Oooooo;
        wi1Var.OooOOO0 = null;
        StaticLayout staticLayoutOooO00o = wi1Var.OooO00o();
        staticLayoutOooO00o.getClass();
        return staticLayoutOooO00o;
    }

    public final int OooO0oO(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.Oooo0o;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void OooOO0(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.OooO00o;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        OooO0Oo(1.0f, z);
        CharSequence charSequence = this.OooOoo;
        TextPaint textPaint = this.Oooo0oo;
        if (charSequence != null && this.OoooOoO != null) {
            boolean zOooOOOO = OooOOOO();
            CharSequence charSequenceEllipsize = this.OooOoo;
            if (zOooOOOO) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, this.OoooOoO.getWidth(), this.OooOoOO);
            }
            this.OooooO0 = charSequenceEllipsize;
        }
        CharSequence charSequence2 = this.OooooO0;
        if (charSequence2 != null) {
            this.OoooOoo = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.OoooOoo = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.OooO0oO, this.OooOooO ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.OooO0Oo;
        if (i == 48) {
            this.OooOOO = rect.top;
        } else if (i != 80) {
            this.OooOOO = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.OooOOO = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.OooOOOo = rect.centerX() - (this.OoooOoo / 2.0f);
        } else if (i2 != 5) {
            this.OooOOOo = rect.left;
        } else {
            this.OooOOOo = rect.right - this.OoooOoo;
        }
        if (this.OoooOoo <= rect.width()) {
            float f = this.OooOOOo;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.OooOOOo = fMax;
            this.OooOOOo = Math.min(0.0f, rect.right - (this.OoooOoo + fMax)) + fMax;
        }
        float f2 = this.OooO;
        TextPaint textPaint2 = this.Oooo;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.OooOOoo);
        textPaint2.setLetterSpacing(this.OoooOOO);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.OooOOO;
            float fMax2 = Math.max(0.0f, rect.top - f3) + f3;
            this.OooOOO = fMax2;
            this.OooOOO = Math.min(0.0f, rect.bottom - (OooO0o() + fMax2)) + fMax2;
        }
        OooO0Oo(0.0f, z);
        float height = this.OoooOoO != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.OoooOoO;
        if (staticLayout == null || this.OooooOO <= 1) {
            CharSequence charSequence3 = this.OooOoo;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.OoooOoO;
        this.OooOO0o = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.OooO0o, this.OooOooO ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.OooO0OO;
        if (i3 == 48) {
            this.OooOOO0 = rect2.top;
        } else if (i3 != 80) {
            this.OooOOO0 = rect2.centerY() - (height / 2.0f);
        } else {
            this.OooOOO0 = (rect2.bottom - height) + (this.o0OoOo0 ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.OooOOOO = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.OooOOOO = rect2.left;
        } else {
            this.OooOOOO = rect2.right - fMeasureText;
        }
        OooO0Oo(this.OooO0O0, false);
        textInputLayout.postInvalidateOnAnimation();
        OooO0O0();
    }

    public final void OooOO0O(ColorStateList colorStateList) {
        if (this.OooOO0O == colorStateList && this.OooOO0 == colorStateList) {
            return;
        }
        this.OooOO0O = colorStateList;
        this.OooOO0 = colorStateList;
        OooOO0(false);
    }

    public final boolean OooOO0o(Typeface typeface) {
        oh1 oh1Var = this.OooOoO;
        if (oh1Var != null) {
            oh1Var.OooO0o0 = true;
        }
        if (this.OooOo0 == typeface) {
            return false;
        }
        this.OooOo0 = typeface;
        Typeface typefaceOooO00o = j53.OooO00o(this.OooO00o.getContext().getResources().getConfiguration(), typeface);
        this.OooOo00 = typefaceOooO00o;
        if (typefaceOooO00o == null) {
            typefaceOooO00o = this.OooOo0;
        }
        this.OooOOoo = typefaceOooO00o;
        return true;
    }

    public final void OooOOO(Typeface typeface) {
        boolean z;
        boolean zOooOO0o = OooOO0o(typeface);
        if (this.OooOo != typeface) {
            this.OooOo = typeface;
            Typeface typefaceOooO00o = j53.OooO00o(this.OooO00o.getContext().getResources().getConfiguration(), typeface);
            this.OooOo0o = typefaceOooO00o;
            if (typefaceOooO00o == null) {
                typefaceOooO00o = this.OooOo;
            }
            this.OooOo0O = typefaceOooO00o;
            z = true;
        } else {
            z = false;
        }
        if (zOooOO0o || z) {
            OooOO0(false);
        }
    }

    public final void OooOOO0(float f) {
        float fOooO00o = cw2.OooO00o(f, 0.0f, 1.0f);
        if (fOooO00o != this.OooO0O0) {
            this.OooO0O0 = fOooO00o;
            OooO0O0();
        }
    }

    public final boolean OooOOOO() {
        return this.OooooOo == 1;
    }
}
