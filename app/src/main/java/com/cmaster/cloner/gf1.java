package com.cmaster.cloner;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gf1 implements Runnable {
    public final /* synthetic */ int OooO0Oo = 0;
    public final Object OooO0o;
    public boolean OooO0o0;
    public final Object OooO0oO;

    public gf1(jm0 jm0Var, wl0 wl0Var) {
        jm0Var.getClass();
        wl0Var.getClass();
        this.OooO0o = jm0Var;
        this.OooO0oO = wl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ay1 ay1Var;
        int i = this.OooO0Oo;
        Object obj = this.OooO0oO;
        Object obj2 = this.OooO0o;
        switch (i) {
            case 0:
                if (!this.OooO0o0) {
                    ((jm0) obj2).OooO((wl0) obj);
                    this.OooO0o0 = true;
                    break;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                st1 st1Var = swipeDismissBehavior.OooO00o;
                if (st1Var != null && st1Var.OooO0o()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.OooO0o0 && (ay1Var = swipeDismissBehavior.OooO0O0) != null) {
                    ay1Var.OooOOoo(view);
                    break;
                }
                break;
        }
    }

    public gf1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.OooO0oO = swipeDismissBehavior;
        this.OooO0o = view;
        this.OooO0o0 = z;
    }
}
