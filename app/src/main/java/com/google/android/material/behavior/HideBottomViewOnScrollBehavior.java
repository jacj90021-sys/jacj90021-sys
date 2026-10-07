package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.R;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.oOO00O;
import com.cmaster.cloner.ow2;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.q70;
import com.cmaster.cloner.rb;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends lj {
    public int OooO0O0;
    public int OooO0OO;
    public TimeInterpolator OooO0Oo;
    public TimeInterpolator OooO0o0;
    public AccessibilityManager OooO0oO;
    public q70 OooO0oo;
    public ViewPropertyAnimator OooOO0O;
    public final LinkedHashSet OooO00o = new LinkedHashSet();
    public int OooO0o = 0;
    public final boolean OooO = true;
    public int OooOO0 = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // com.cmaster.cloner.lj
    public boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.OooO0o = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.OooO0O0 = ow2.OooO0OO(view.getContext(), R.attr.motionDurationLong2, 225);
        this.OooO0OO = ow2.OooO0OO(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.OooO0Oo = ow2.OooO0Oo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO0oO000.OooO0Oo);
        this.OooO0o0 = ow2.OooO0Oo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO0oO000.OooO0OO);
        if (this.OooO0oO == null) {
            this.OooO0oO = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.OooO0oO;
        if (accessibilityManager != null && this.OooO0oo == null) {
            q70 q70Var = new q70(this, view, 0);
            this.OooO0oo = q70Var;
            accessibilityManager.addTouchExplorationStateChangeListener(q70Var);
            view.addOnAttachStateChangeListener(new rb(this, 3));
        }
        return false;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOOOo(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                OooOo0o(view);
                return;
            }
            return;
        }
        if (this.OooOO0 == 1) {
            return;
        }
        if (this.OooO && (accessibilityManager = this.OooO0oO) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.OooOO0O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.OooOO0 = 1;
        Iterator it = this.OooO00o.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
        this.OooOO0O = view.animate().translationY(this.OooO0o).setInterpolator(this.OooO0o0).setDuration(this.OooO0OO).setListener(new oOO00O(this, 7));
    }

    @Override // com.cmaster.cloner.lj
    public boolean OooOo00(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void OooOo0o(View view) {
        if (this.OooOO0 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.OooOO0O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.OooOO0 = 2;
        Iterator it = this.OooO00o.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
        this.OooOO0O = view.animate().translationY(0.0f).setInterpolator(this.OooO0Oo).setDuration(this.OooO0O0).setListener(new oOO00O(this, 7));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
