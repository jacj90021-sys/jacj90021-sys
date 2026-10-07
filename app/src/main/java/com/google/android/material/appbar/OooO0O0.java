package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.o000;
import com.cmaster.cloner.o0000O00;
import com.cmaster.cloner.o000O00O;
import com.cmaster.cloner.oOO0OoO0;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO0O0 extends o0000O00 {
    public final /* synthetic */ AppBarLayout OooO0Oo;
    public final /* synthetic */ AppBarLayout.BaseBehavior OooO0o;
    public final /* synthetic */ CoordinatorLayout OooO0o0;

    public OooO0O0(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.OooO0o = baseBehavior;
        this.OooO0Oo = appBarLayout;
        this.OooO0o0 = coordinatorLayout;
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0Oo(View view, o000O00O o000o00o) {
        AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
        this.OooO00o.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        AppBarLayout appBarLayout = this.OooO0Oo;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.OooO0o0;
        AppBarLayout.BaseBehavior baseBehavior = this.OooO0o;
        View viewOooOoo0 = AppBarLayout.BaseBehavior.OooOoo0(baseBehavior, coordinatorLayout);
        if (viewOooOoo0 == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((oOO0OoO0) appBarLayout.getChildAt(i).getLayoutParams()).OooO00o != 0) {
                if (baseBehavior.OooOoO0() != (-appBarLayout.getTotalScrollRange())) {
                    o000o00o.OooO00o(o000.OooO0o0);
                    o000o00o.OooO0o();
                }
                if (baseBehavior.OooOoO0() != 0) {
                    if (!viewOooOoo0.canScrollVertically(-1)) {
                        o000o00o.OooO00o(o000.OooO0o);
                        o000o00o.OooO0o();
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            o000o00o.OooO00o(o000.OooO0o);
                            o000o00o.OooO0o();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.OooO0Oo;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.OooO0oO(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.OooO0o;
        if (baseBehavior.OooOoO0() != 0) {
            CoordinatorLayout coordinatorLayout = this.OooO0o0;
            View viewOooOoo0 = AppBarLayout.BaseBehavior.OooOoo0(baseBehavior, coordinatorLayout);
            if (!viewOooOoo0.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.OooOooo(coordinatorLayout, this.OooO0Oo, viewOooOoo0, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
