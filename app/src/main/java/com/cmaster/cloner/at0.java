package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class at0 implements wg1, it0, AdapterView.OnItemClickListener {
    public Rect OooO0Oo;

    public static int OooOOO0(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0O0(Context context, ss0 ss0Var) {
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o(vs0 vs0Var) {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oO(vs0 vs0Var) {
        return false;
    }

    public abstract void OooOO0O(ss0 ss0Var);

    public abstract void OooOOO(View view);

    public abstract void OooOOOO(boolean z);

    public abstract void OooOOOo(int i);

    public abstract void OooOOo(PopupWindow.OnDismissListener onDismissListener);

    public abstract void OooOOo0(int i);

    public abstract void OooOOoo(boolean z);

    public abstract void OooOo00(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (ps0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (ps0) listAdapter).OooO0Oo.OooOOo0((MenuItem) listAdapter.getItem(i), this, !(this instanceof ub) ? 0 : 4);
    }
}
