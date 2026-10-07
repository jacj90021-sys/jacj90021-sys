package com.cmaster.cloner;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yq0 extends cq0 {
    public final float OooO;
    public final float OooO0oO;
    public final float OooO0oo;

    public yq0(View view) {
        super(view);
        Resources resources = view.getResources();
        this.OooO0oO = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.OooO0oo = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.OooO = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void OooO00o(float f, boolean z, int i) {
        float interpolation = this.OooO00o.getInterpolation(f);
        View view = this.OooO0O0;
        boolean z2 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.OooO0oO / f2;
            float f5 = this.OooO0oo / f2;
            float f6 = this.OooO / f3;
            if (z2) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float fOooO00o = oO0oO000.OooO00o(0.0f, f5, interpolation);
            float f7 = fOooO00o + 1.0f;
            float fOooO00o2 = 1.0f - oO0oO000.OooO00o(0.0f, f6, interpolation);
            if (Float.isNaN(f7) || Float.isNaN(fOooO00o2)) {
                return;
            }
            view.setScaleX(f7);
            view.setScaleY(fOooO00o2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - fOooO00o : 1.0f;
                    float f9 = fOooO00o2 != 0.0f ? (f7 / fOooO00o2) * f8 : 1.0f;
                    if (!Float.isNaN(f8) && !Float.isNaN(f9)) {
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }
}
