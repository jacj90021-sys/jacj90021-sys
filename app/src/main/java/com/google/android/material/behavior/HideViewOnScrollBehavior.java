package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.R;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.oOO00O;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.ow2;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.q70;
import com.cmaster.cloner.r70;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rb;
import com.cmaster.cloner.rj;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends lj {
    public r70 OooO00o;
    public AccessibilityManager OooO0O0;
    public q70 OooO0OO;
    public int OooO0o;
    public int OooO0o0;
    public TimeInterpolator OooO0oO;
    public TimeInterpolator OooO0oo;
    public ViewPropertyAnimator OooOO0O;
    public final LinkedHashSet OooO0Oo = new LinkedHashSet();
    public int OooO = 0;
    public int OooOO0 = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        if (this.OooO0O0 == null) {
            this.OooO0O0 = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.OooO0O0;
        if (accessibilityManager != null && this.OooO0OO == null) {
            q70 q70Var = new q70(this, view, 1);
            this.OooO0OO = q70Var;
            accessibilityManager.addTouchExplorationStateChangeListener(q70Var);
            view.addOnAttachStateChangeListener(new rb(this, 4));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((oj) view.getLayoutParams()).OooO0OO;
        if (i3 == 80 || i3 == 81) {
            OooOo0o(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            OooOo0o((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.OooO00o.OooO00o) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.OooO = measuredHeight + i2;
        this.OooO0o0 = ow2.OooO0OO(view.getContext(), R.attr.motionDurationLong2, 225);
        this.OooO0o = ow2.OooO0OO(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.OooO0oO = ow2.OooO0Oo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO0oO000.OooO0Oo);
        this.OooO0oo = ow2.OooO0Oo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO0oO000.OooO0OO);
        return false;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOOOo(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                OooOo(view);
                return;
            }
            return;
        }
        if (this.OooOO0 == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.OooO0O0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.OooOO0O;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.OooOO0 = 1;
            Iterator it = this.OooO0Oo.iterator();
            if (it.hasNext()) {
                throw px0.OooOO0o(it);
            }
            this.OooOO0O = this.OooO00o.OooO00o(view, this.OooO).setInterpolator(this.OooO0oo).setDuration(this.OooO0o).setListener(new oOO00O(this, 8));
        }
    }

    public final void OooOo(View view) {
        if (this.OooOO0 == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.OooOO0O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.OooOO0 = 2;
        Iterator it = this.OooO0Oo.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
        this.OooO00o.getClass();
        this.OooOO0O = this.OooO00o.OooO00o(view, 0).setInterpolator(this.OooO0oO).setDuration(this.OooO0o0).setListener(new oOO00O(this, 8));
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOo00(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void OooOo0o(int i) {
        int i2;
        r70 r70Var = this.OooO00o;
        if (r70Var != null) {
            switch (r70Var.OooO00o) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i == 0) {
            this.OooO00o = new r70(2);
            return;
        }
        if (i == 1) {
            this.OooO00o = new r70(0);
        } else if (i == 2) {
            this.OooO00o = new r70(1);
        } else {
            ra.OooOOO(rj.OooO00o(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
