package com.cmaster.cloner;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wi1 {
    public CharSequence OooO00o;
    public final TextPaint OooO0O0;
    public final int OooO0OO;
    public int OooO0Oo;
    public boolean OooOO0O;
    public pg0 OooOOO0;
    public Layout.Alignment OooO0o0 = Layout.Alignment.ALIGN_NORMAL;
    public int OooO0o = Integer.MAX_VALUE;
    public float OooO0oO = 0.0f;
    public float OooO0oo = 1.0f;
    public int OooO = 1;
    public boolean OooOO0 = true;
    public TextUtils.TruncateAt OooOO0o = null;

    public wi1(CharSequence charSequence, TextPaint textPaint, int i) {
        this.OooO00o = charSequence;
        this.OooO0O0 = textPaint;
        this.OooO0OO = i;
        this.OooO0Oo = charSequence.length();
    }

    public final StaticLayout OooO00o() {
        if (this.OooO00o == null) {
            this.OooO00o = "";
        }
        int iMax = Math.max(0, this.OooO0OO);
        CharSequence charSequenceEllipsize = this.OooO00o;
        int i = this.OooO0o;
        TextPaint textPaint = this.OooO0O0;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.OooOO0o);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.OooO0Oo);
        this.OooO0Oo = iMin;
        if (this.OooOO0O && this.OooO0o == 1) {
            this.OooO0o0 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.OooO0o0);
        builderObtain.setIncludePad(this.OooOO0);
        builderObtain.setTextDirection(this.OooOO0O ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.OooOO0o;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.OooO0o);
        float f = this.OooO0oO;
        if (f != 0.0f || this.OooO0oo != 1.0f) {
            builderObtain.setLineSpacing(f, this.OooO0oo);
        }
        if (this.OooO0o > 1) {
            builderObtain.setHyphenationFrequency(this.OooO);
        }
        pg0 pg0Var = this.OooOOO0;
        if (pg0Var != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) pg0Var.OooO0Oo).OooOo.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
