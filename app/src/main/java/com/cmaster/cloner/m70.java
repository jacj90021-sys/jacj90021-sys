package com.cmaster.cloner;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m70 extends fu1 {
    public final Rect OooO0OO;
    public final Rect OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    public m70() {
        this.OooO0OO = new Rect();
        this.OooO0Oo = new Rect();
        this.OooO0o0 = 0;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOOO0(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutOooOoO;
        qz1 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutOooOoO = AppBarLayout.ScrollingViewBehavior.OooOoO(coordinatorLayout.OooOO0O(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutOooOoO.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.OooO00o() + lastWindowInsets.OooO0Oo();
        }
        int totalScrollRange = appBarLayoutOooOoO.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutOooOoO.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.OooOOoo(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // com.cmaster.cloner.fu1
    public final void OooOo(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutOooOoO = AppBarLayout.ScrollingViewBehavior.OooOoO(coordinatorLayout.OooOO0O(view));
        if (appBarLayoutOooOoO == null) {
            coordinatorLayout.OooOOo(view, i);
            this.OooO0o0 = 0;
            return;
        }
        oj ojVar = (oj) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ojVar).leftMargin;
        int bottom = appBarLayoutOooOoO.getBottom() + ((ViewGroup.MarginLayoutParams) ojVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) ojVar).rightMargin;
        int bottom2 = ((appBarLayoutOooOoO.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) ojVar).bottomMargin;
        Rect rect = this.OooO0OO;
        rect.set(paddingLeft, bottom, width, bottom2);
        qz1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.OooO0O0() + rect.left;
            rect.right -= lastWindowInsets.OooO0OO();
        }
        int i2 = ojVar.OooO0OO;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.OooO0Oo;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iOooOoO0 = OooOoO0(appBarLayoutOooOoO);
        view.layout(rect2.left, rect2.top - iOooOoO0, rect2.right, rect2.bottom - iOooOoO0);
        this.OooO0o0 = rect2.top - appBarLayoutOooOoO.getBottom();
    }

    public final int OooOoO0(View view) {
        int i;
        if (this.OooO0o == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            lj ljVar = ((oj) appBarLayout.getLayoutParams()).OooO00o;
            int iOooOoO0 = ljVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) ljVar).OooOoO0() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iOooOoO0 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iOooOoO0 / i) + 1.0f;
            }
        }
        int i2 = this.OooO0o;
        return cw2.OooO0O0((int) (f * i2), 0, i2);
    }

    public m70(int i) {
        super(0);
        this.OooO0OO = new Rect();
        this.OooO0Oo = new Rect();
        this.OooO0o0 = 0;
    }
}
