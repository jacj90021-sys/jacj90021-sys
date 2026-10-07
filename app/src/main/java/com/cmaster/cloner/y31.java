package com.cmaster.cloner;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y31 {
    public final TextPaint OooO00o;
    public final TextDirectionHeuristic OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public y31(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            to.OooOOO0(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.OooO00o = textPaint;
        this.OooO0O0 = textDirectionHeuristic;
        this.OooO0OO = i;
        this.OooO0Oo = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y31)) {
            return false;
        }
        y31 y31Var = (y31) obj;
        int i = y31Var.OooO0OO;
        TextPaint textPaint = y31Var.OooO00o;
        if (this.OooO0OO != i || this.OooO0Oo != y31Var.OooO0Oo) {
            return false;
        }
        TextPaint textPaint2 = this.OooO00o;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.OooO0O0 == y31Var.OooO0O0;
    }

    public final int hashCode() {
        TextPaint textPaint = this.OooO00o;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.OooO0O0, Integer.valueOf(this.OooO0OO), Integer.valueOf(this.OooO0Oo));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.OooO00o;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (Build.VERSION.SDK_INT >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.OooO0O0);
        sb.append(", breakStrategy=" + this.OooO0OO);
        sb.append(", hyphenationFrequency=" + this.OooO0Oo);
        sb.append("}");
        return sb.toString();
    }

    public y31(PrecomputedText.Params params) {
        this.OooO00o = params.getTextPaint();
        this.OooO0O0 = params.getTextDirection();
        this.OooO0OO = params.getBreakStrategy();
        this.OooO0Oo = params.getHyphenationFrequency();
    }
}
