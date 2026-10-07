package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hy extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public boolean OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public hy(fz fzVar) {
        this.OooO00o = 1;
        this.OooO0OO = fzVar;
        this.OooO0O0 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                this.OooO0O0 = true;
                break;
            case 2:
                this.OooO0O0 = true;
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
        switch (i) {
            case 0:
                if (!this.OooO0O0) {
                    ((View) obj).setVisibility(4);
                    break;
                }
                break;
            case 1:
                fz fzVar = (fz) obj;
                if (!this.OooO0O0) {
                    if (((Float) fzVar.OooOoo.getAnimatedValue()).floatValue() != 0.0f) {
                        fzVar.OooOooO = 2;
                        fzVar.OooOo0O.invalidate();
                        break;
                    } else {
                        fzVar.OooOooO = 0;
                        fzVar.OooOO0(0);
                        break;
                    }
                } else {
                    this.OooO0O0 = false;
                    break;
                }
            default:
                n00 n00Var = (n00) obj;
                n00Var.OooOOo = 0;
                n00Var.OooOOO0 = null;
                if (!this.OooO0O0) {
                    n00Var.OooOOoo.OooO00o(4, false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.OooO00o;
        Object obj = this.OooO0OO;
        switch (i) {
            case 0:
                if (this.OooO0O0) {
                    ((View) obj).setVisibility(0);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                n00 n00Var = (n00) obj;
                n00Var.OooOOoo.OooO00o(0, false);
                n00Var.OooOOo = 1;
                n00Var.OooOOO0 = animator;
                this.OooO0O0 = false;
                break;
        }
    }

    public hy(n00 n00Var) {
        this.OooO00o = 2;
        this.OooO0OO = n00Var;
    }

    public hy(View view, boolean z) {
        this.OooO00o = 0;
        this.OooO0O0 = z;
        this.OooO0OO = view;
    }
}
