package com.cmaster.cloner;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ar1 implements Spannable {
    public boolean OooO0Oo = false;
    public Spannable OooO0o0;

    public ar1(Spannable spannable) {
        this.OooO0o0 = spannable;
    }

    public final void OooO00o() {
        Spannable spannable = this.OooO0o0;
        if (!this.OooO0Oo) {
            if ((Build.VERSION.SDK_INT < 28 ? new im2() : new zq1()).OooO0oo(spannable)) {
                this.OooO0o0 = new SpannableString(spannable);
            }
        }
        this.OooO0Oo = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.OooO0o0.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.OooO0o0.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.OooO0o0.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.OooO0o0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.OooO0o0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.OooO0o0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.OooO0o0.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.OooO0o0.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.OooO0o0.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        OooO00o();
        this.OooO0o0.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        OooO00o();
        this.OooO0o0.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.OooO0o0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.OooO0o0.toString();
    }
}
