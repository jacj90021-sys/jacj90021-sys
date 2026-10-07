package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ro1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public ro1(vo1 vo1Var, k3 k3Var) {
        this.OooO00o = 0;
        this.OooO0OO = vo1Var;
        this.OooO0O0 = k3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                ((iu1) this.OooO0O0).OooO00o();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.OooO00o;
        Object obj = this.OooO0OO;
        Object obj2 = this.OooO0O0;
        switch (i) {
            case 0:
                ((k3) obj2).remove(animator);
                ((vo1) obj).OooOOo0.remove(animator);
                break;
            case 1:
                ((iu1) obj2).OooO0OO();
                break;
            default:
                ((yy1) obj2).OooO00o.OooO0Oo(1.0f);
                uy1.OooO0o0((View) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                ((vo1) this.OooO0OO).OooOOo0.add(animator);
                break;
            case 1:
                ((iu1) this.OooO0O0).OooO0O0();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ro1(Object obj, View view, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = view;
    }
}
