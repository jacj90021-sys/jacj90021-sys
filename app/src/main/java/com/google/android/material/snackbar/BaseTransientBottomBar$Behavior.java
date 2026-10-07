package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.c7;
import com.cmaster.cloner.e7;
import com.cmaster.cloner.ho1;
import com.cmaster.cloner.xb1;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final xb1 OooO;

    public BaseTransientBottomBar$Behavior() {
        xb1 xb1Var = new xb1(7, false);
        this.OooO0o = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.OooO0oO = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.OooO0o0 = 0;
        this.OooO = xb1Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, com.cmaster.cloner.lj
    public final boolean OooOO0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        xb1 xb1Var = this.OooO;
        xb1Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                ho1.OooOoO0().Oooo0o0((c7) xb1Var.OooO0o0);
            }
        } else if (coordinatorLayout.OooOOOo(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            ho1.OooOoO0().Oooo0OO((c7) xb1Var.OooO0o0);
        }
        return super.OooOO0O(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean OooOo0o(View view) {
        this.OooO.getClass();
        return view instanceof e7;
    }
}
