package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.ay1;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.nz0;
import com.cmaster.cloner.o000;
import com.cmaster.cloner.st1;
import com.cmaster.cloner.tk1;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends lj {
    public st1 OooO00o;
    public ay1 OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public int OooO0o0 = 2;
    public float OooO0o = 0.0f;
    public float OooO0oO = 0.5f;
    public final tk1 OooO0oo = new tk1(this);

    @Override // com.cmaster.cloner.lj
    public boolean OooOO0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zOooOOOo = this.OooO0OO;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zOooOOOo = coordinatorLayout.OooOOOo(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.OooO0OO = zOooOOOo;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.OooO0OO = false;
        }
        if (zOooOOOo) {
            if (this.OooO00o == null) {
                this.OooO00o = new st1(coordinatorLayout.getContext(), coordinatorLayout, this.OooO0oo);
            }
            if (!this.OooO0Oo && this.OooO00o.OooOOOo(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            nt1.OooOO0(view, 1048576);
            nt1.OooO0oo(view, 0);
            if (OooOo0o(view)) {
                nt1.OooOO0O(view, o000.OooO, new nz0(this, 5));
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOo0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.OooO00o == null) {
            return false;
        }
        if (this.OooO0Oo && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.OooO00o.OooOO0(motionEvent);
        return true;
    }

    public boolean OooOo0o(View view) {
        return true;
    }
}
