package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ TextView OooO0O0;
    public final /* synthetic */ int OooO0OO;
    public final /* synthetic */ TextView OooO0Oo;
    public final /* synthetic */ jg0 OooO0o0;

    public hg0(jg0 jg0Var, int i, TextView textView, int i2, TextView textView2) {
        this.OooO0o0 = jg0Var;
        this.OooO00o = i;
        this.OooO0O0 = textView;
        this.OooO0OO = i2;
        this.OooO0Oo = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i = this.OooO00o;
        jg0 jg0Var = this.OooO0o0;
        jg0Var.OooOOO = i;
        jg0Var.OooOO0o = null;
        TextView textView = this.OooO0O0;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.OooO0OO == 1 && (appCompatTextView = jg0Var.OooOOo) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.OooO0Oo;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.OooO0Oo;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
