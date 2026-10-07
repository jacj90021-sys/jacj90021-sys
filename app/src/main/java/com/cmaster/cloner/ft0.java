package com.cmaster.cloner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ft0 extends ot {
    public final int OooOOOo;
    public us0 OooOOo;
    public final int OooOOo0;
    public vs0 OooOOoo;

    public ft0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.OooOOOo = 21;
            this.OooOOo0 = 22;
        } else {
            this.OooOOOo = 22;
            this.OooOOo0 = 21;
        }
    }

    @Override // com.cmaster.cloner.ot, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ps0 ps0Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.OooOOo != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ps0Var = (ps0) headerViewListAdapter.getWrappedAdapter();
            } else {
                ps0Var = (ps0) adapter;
                headersCount = 0;
            }
            vs0 vs0VarOooO0O0 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ps0Var.getCount()) ? null : ps0Var.getItem(i);
            vs0 vs0Var = this.OooOOoo;
            if (vs0Var != vs0VarOooO0O0) {
                ss0 ss0Var = ps0Var.OooO0Oo;
                if (vs0Var != null) {
                    this.OooOOo.OooOO0O(ss0Var, vs0Var);
                }
                this.OooOOoo = vs0VarOooO0O0;
                if (vs0VarOooO0O0 != null) {
                    this.OooOOo.OooOo0(ss0Var, vs0VarOooO0O0);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.OooOOOo) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.OooOOo0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ps0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ps0) adapter).OooO0Oo.OooO0OO(false);
        return true;
    }

    public void setHoverListener(us0 us0Var) {
        this.OooOOo = us0Var;
    }

    @Override // com.cmaster.cloner.ot, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
