package com.cmaster.cloner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vj1 extends ss0 implements SubMenu {
    public final ss0 OooOoo;
    public final vs0 OooOooO;

    public vj1(Context context, ss0 ss0Var, vs0 vs0Var) {
        super(context);
        this.OooOoo = ss0Var;
        this.OooOooO = vs0Var;
    }

    @Override // com.cmaster.cloner.ss0
    public final boolean OooO0Oo(vs0 vs0Var) {
        return this.OooOoo.OooO0Oo(vs0Var);
    }

    @Override // com.cmaster.cloner.ss0
    public final boolean OooO0o(vs0 vs0Var) {
        return this.OooOoo.OooO0o(vs0Var);
    }

    @Override // com.cmaster.cloner.ss0
    public final boolean OooO0o0(ss0 ss0Var, MenuItem menuItem) {
        return super.OooO0o0(ss0Var, menuItem) || this.OooOoo.OooO0o0(ss0Var, menuItem);
    }

    @Override // com.cmaster.cloner.ss0
    public final String OooOO0() {
        vs0 vs0Var = this.OooOooO;
        int i = vs0Var != null ? vs0Var.OooO0Oo : 0;
        if (i == 0) {
            return null;
        }
        return px0.OooOOO(i, "android:menu:actionviewstates:");
    }

    @Override // com.cmaster.cloner.ss0
    public final ss0 OooOO0O() {
        return this.OooOoo.OooOO0O();
    }

    @Override // com.cmaster.cloner.ss0
    public final boolean OooOOO() {
        return this.OooOoo.OooOOO();
    }

    @Override // com.cmaster.cloner.ss0
    public final boolean OooOOO0() {
        return this.OooOoo.OooOOO0();
    }

    @Override // com.cmaster.cloner.ss0
    public final boolean OooOOOO() {
        return this.OooOoo.OooOOOO();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.OooOooO;
    }

    @Override // com.cmaster.cloner.ss0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.OooOoo.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        OooOo0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        OooOo0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        OooOo0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.OooOooO.setIcon(drawable);
        return this;
    }

    @Override // com.cmaster.cloner.ss0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.OooOoo.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.OooOooO.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        OooOo0(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        OooOo0(i, null, 0, null, null);
        return this;
    }
}
