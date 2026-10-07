package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO00o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout OooO00o;
    public final /* synthetic */ AppBarLayout OooO0O0;
    public final /* synthetic */ AppBarLayout.BaseBehavior OooO0OO;

    public OooO00o(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.OooO0OO = baseBehavior;
        this.OooO00o = coordinatorLayout;
        this.OooO0O0 = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.OooO0OO.OooOoOO(this.OooO00o, this.OooO0O0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
