package com.google.android.material.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean OooO0oO;

    public SearchBar$ScrollingViewBehavior() {
        this.OooO0oO = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, com.cmaster.cloner.lj
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
        super.OooO0oo(coordinatorLayout, view, view2);
        if (!this.OooO0oO && (view2 instanceof AppBarLayout)) {
            this.OooO0oO = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0oO = false;
    }
}
