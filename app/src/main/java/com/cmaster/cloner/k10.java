package com.cmaster.cloner;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class k10 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public j10 OooO;
    public final float OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final View OooO0oO;
    public j10 OooO0oo;
    public boolean OooOO0;
    public int OooOO0O;
    public final int[] OooOO0o = new int[2];

    public k10(View view) {
        this.OooO0oO = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.OooO0Oo = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.OooO0o0 = tapTimeout;
        this.OooO0o = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void OooO00o() {
        j10 j10Var = this.OooO;
        View view = this.OooO0oO;
        if (j10Var != null) {
            view.removeCallbacks(j10Var);
        }
        j10 j10Var2 = this.OooO0oo;
        if (j10Var2 != null) {
            view.removeCallbacks(j10Var2);
        }
    }

    public abstract wg1 OooO0O0();

    public abstract boolean OooO0OO();

    public boolean OooO0Oo() {
        wg1 wg1VarOooO0O0 = OooO0O0();
        if (wg1VarOooO0O0 == null || !wg1VarOooO0O0.OooO00o()) {
            return true;
        }
        wg1VarOooO0O0.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k10.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.OooOO0 = false;
        this.OooOO0O = -1;
        j10 j10Var = this.OooO0oo;
        if (j10Var != null) {
            this.OooO0oO.removeCallbacks(j10Var);
        }
    }
}
