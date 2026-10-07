package com.cmaster.cloner;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a7 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ f7 OooO0o0;

    public /* synthetic */ a7(f7 f7Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = f7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        int i = this.OooO0Oo;
        f7 f7Var = this.OooO0o0;
        switch (i) {
            case 0:
                e7 e7Var = f7Var.OooO;
                if (e7Var != null) {
                    WindowManager windowManager = (WindowManager) f7Var.OooO0oo.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int iHeight = rect.height();
                    int[] iArr = new int[2];
                    e7Var.getLocationInWindow(iArr);
                    int height = (iHeight - (e7Var.getHeight() + iArr[1])) + ((int) e7Var.getTranslationY());
                    int i2 = f7Var.OooOOOO;
                    if (height < i2) {
                        ViewGroup.LayoutParams layoutParams = e7Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(f7.OooOoO0, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i3 = f7Var.OooOOOO;
                            f7Var.OooOOOo = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height) + marginLayoutParams.bottomMargin;
                            e7Var.requestLayout();
                            break;
                        }
                    } else {
                        f7Var.OooOOOo = i2;
                        break;
                    }
                }
                break;
            case 1:
                f7Var.OooO0O0();
                break;
            default:
                e7 e7Var2 = f7Var.OooO;
                if (e7Var2 != null) {
                    if (e7Var2.getParent() != null) {
                        e7Var2.setVisibility(0);
                    }
                    if (e7Var2.getAnimationMode() != 1) {
                        int height2 = e7Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = e7Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        e7Var2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(f7Var.OooO0o0);
                        valueAnimator.setDuration(f7Var.OooO0OO);
                        valueAnimator.addListener(new x6(f7Var, 1));
                        valueAnimator.addUpdateListener(new y6(f7Var, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(f7Var.OooO0Oo);
                        valueAnimatorOfFloat.addUpdateListener(new y6(f7Var, 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(f7Var.OooO0o);
                        valueAnimatorOfFloat2.addUpdateListener(new y6(f7Var, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(f7Var.OooO00o);
                        animatorSet.addListener(new x6(f7Var, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
