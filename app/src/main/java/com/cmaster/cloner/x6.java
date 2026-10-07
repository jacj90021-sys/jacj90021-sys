package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ f7 OooO0O0;

    public /* synthetic */ x6(f7 f7Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = f7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.OooO00o;
        f7 f7Var = this.OooO0O0;
        switch (i) {
            case 0:
                f7Var.OooO0O0();
                break;
            case 1:
                f7Var.OooO0OO();
                break;
            case 2:
                f7Var.OooO0O0();
                break;
            default:
                f7Var.OooO0OO();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.OooO00o;
        f7 f7Var = this.OooO0O0;
        switch (i) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = f7Var.OooOO0;
                int i2 = f7Var.OooO0OO;
                int i3 = f7Var.OooO00o;
                int i4 = i2 - i3;
                snackbarContentLayout.OooO0Oo.setAlpha(0.0f);
                long j = i3;
                ViewPropertyAnimator duration = snackbarContentLayout.OooO0Oo.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.OooO0o;
                long j2 = i4;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.OooO0o0.getVisibility() == 0) {
                    snackbarContentLayout.OooO0o0.setAlpha(0.0f);
                    snackbarContentLayout.OooO0o0.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    break;
                }
                break;
            case 2:
                SnackbarContentLayout snackbarContentLayout2 = f7Var.OooOO0;
                int i5 = f7Var.OooO0O0;
                snackbarContentLayout2.OooO0Oo.setAlpha(1.0f);
                long j3 = i5;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.OooO0Oo.animate().alpha(0.0f).setDuration(j3);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.OooO0o;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                if (snackbarContentLayout2.OooO0o0.getVisibility() == 0) {
                    snackbarContentLayout2.OooO0o0.setAlpha(1.0f);
                    snackbarContentLayout2.OooO0o0.animate().alpha(0.0f).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ x6(f7 f7Var, int i, int i2) {
        this.OooO00o = i2;
        this.OooO0O0 = f7Var;
    }
}
