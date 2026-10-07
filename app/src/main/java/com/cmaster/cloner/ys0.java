package com.cmaster.cloner;

import android.view.MenuItem;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ys0 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener OooO00o;
    public final /* synthetic */ zs0 OooO0O0;

    public ys0(zs0 zs0Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.OooO0O0 = zs0Var;
        this.OooO00o = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.OooO00o.onMenuItemActionCollapse(this.OooO0O0.OooO(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.OooO00o.onMenuItemActionExpand(this.OooO0O0.OooO(menuItem));
    }
}
