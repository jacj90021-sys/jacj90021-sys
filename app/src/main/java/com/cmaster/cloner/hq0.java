package com.cmaster.cloner;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hq0 extends cq0 {
    public final float OooO0oO;
    public final float OooO0oo;

    public hq0(View view) {
        super(view);
        Resources resources = view.getResources();
        this.OooO0oO = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.OooO0oo = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet OooO00o() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.OooO0O0;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new yy(1));
        return animatorSet;
    }

    public final void OooO0O0(float f) {
        float interpolation = this.OooO00o.getInterpolation(f);
        View view = this.OooO0O0;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.OooO0oO / width;
        float f3 = this.OooO0oo / height;
        float fOooO00o = 1.0f - oO0oO000.OooO00o(0.0f, f2, interpolation);
        float fOooO00o2 = 1.0f - oO0oO000.OooO00o(0.0f, f3, interpolation);
        if (Float.isNaN(fOooO00o) || Float.isNaN(fOooO00o2)) {
            return;
        }
        view.setScaleX(fOooO00o);
        view.setPivotY(height);
        view.setScaleY(fOooO00o2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fOooO00o2 != 0.0f ? fOooO00o / fOooO00o2 : 1.0f);
            }
        }
    }
}
