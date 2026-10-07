package com.cmaster.cloner;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lz0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View OooO0Oo;
    public final Runnable OooO0o;
    public ViewTreeObserver OooO0o0;

    public lz0(View view, Runnable runnable) {
        this.OooO0Oo = view;
        this.OooO0o0 = view.getViewTreeObserver();
        this.OooO0o = runnable;
    }

    public static void OooO00o(View view, Runnable runnable) {
        if (view == null) {
            qa.OooOOO0("view == null");
            return;
        }
        lz0 lz0Var = new lz0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(lz0Var);
        view.addOnAttachStateChangeListener(lz0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.OooO0o0.isAlive();
        View view = this.OooO0Oo;
        if (zIsAlive) {
            this.OooO0o0.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.OooO0o.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.OooO0o0 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.OooO0o0.isAlive();
        View view2 = this.OooO0Oo;
        if (zIsAlive) {
            this.OooO0o0.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
