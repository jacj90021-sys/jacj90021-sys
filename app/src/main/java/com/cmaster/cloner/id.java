package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class id extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ jd OooO0O0;

    public /* synthetic */ id(jd jdVar, int i) {
        this.OooO00o = i;
        this.OooO0O0 = jdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                super.onAnimationEnd(animator);
                jd jdVar = this.OooO0O0;
                jdVar.OooO0OO();
                t6 t6Var = jdVar.OooOOO0;
                if (t6Var != null) {
                    t6Var.OooO00o((eg0) jdVar.OooO0Oo);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                super.onAnimationRepeat(animator);
                jd jdVar = this.OooO0O0;
                jdVar.OooOO0 = (jdVar.OooOO0 + jd.OooOOOO.length) % jdVar.OooO.OooO0o0.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
