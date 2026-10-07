package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kv1 extends AnimatorListenerAdapter implements to1 {
    public final View OooO00o;
    public final int OooO0O0;
    public final ViewGroup OooO0OO;
    public boolean OooO0o0;
    public boolean OooO0o = false;
    public final boolean OooO0Oo = true;

    public kv1(View view, int i) {
        this.OooO00o = view;
        this.OooO0O0 = i;
        this.OooO0OO = (ViewGroup) view.getParent();
        OooO0oO(true);
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO00o(vo1 vo1Var) {
        vo1Var.OooOo(this);
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0OO() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        OooO0oO(false);
        if (this.OooO0o) {
            return;
        }
        mu1.OooO0O0(this.OooO00o, this.OooO0O0);
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0Oo(vo1 vo1Var) {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0o(vo1 vo1Var) {
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO0o0() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        OooO0oO(true);
        if (this.OooO0o) {
            return;
        }
        mu1.OooO0O0(this.OooO00o, 0);
    }

    public final void OooO0oO(boolean z) {
        ViewGroup viewGroup;
        if (!this.OooO0Oo || this.OooO0o0 == z || (viewGroup = this.OooO0OO) == null) {
            return;
        }
        this.OooO0o0 = z;
        p53.OooO00o(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.OooO0o = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z) {
            return;
        }
        if (!this.OooO0o) {
            mu1.OooO0O0(this.OooO00o, this.OooO0O0);
            ViewGroup viewGroup = this.OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        OooO0oO(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z) {
            mu1.OooO0O0(this.OooO00o, 0);
            ViewGroup viewGroup = this.OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.OooO0o) {
            mu1.OooO0O0(this.OooO00o, this.OooO0O0);
            ViewGroup viewGroup = this.OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        OooO0oO(false);
    }
}
