package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zs0 extends h implements MenuItem {
    public final gk1 OooO0o;
    public Method OooO0oO;

    public zs0(Context context, gk1 gk1Var) {
        super(context);
        if (gk1Var != null) {
            this.OooO0o = gk1Var;
        } else {
            ra.OooOOO("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.OooO0o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.OooO0o.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ws0 ws0VarOooO00o = this.OooO0o.OooO00o();
        if (ws0VarOooO00o != null) {
            return ws0VarOooO00o.OooO0O0;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.OooO0o.getActionView();
        return actionView instanceof xs0 ? (View) ((xs0) actionView).OooO0Oo : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.OooO0o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.OooO0o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.OooO0o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.OooO0o.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.OooO0o.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.OooO0o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OooO0o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.OooO0o.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.OooO0o.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.OooO0o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.OooO0o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.OooO0o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.OooO0o.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.OooO0o.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.OooO0o.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.OooO0o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.OooO0o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.OooO0o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.OooO0o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.OooO0o.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.OooO0o.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.OooO0o.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.OooO0o.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ws0 ws0Var = new ws0(this, actionProvider);
        if (actionProvider == null) {
            ws0Var = null;
        }
        this.OooO0o.OooO0O0(ws0Var);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        gk1 gk1Var = this.OooO0o;
        gk1Var.setActionView(i);
        View actionView = gk1Var.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            gk1Var.setActionView(new xs0(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.OooO0o.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.OooO0o.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.OooO0o.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.OooO0o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.OooO0o.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OooO0o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.OooO0o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OooO0o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.OooO0o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.OooO0o.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.OooO0o.setOnActionExpandListener(onActionExpandListener != null ? new ys0(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.OooO0o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new dk1(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.OooO0o.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.OooO0o.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.OooO0o.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.OooO0o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.OooO0o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.OooO0o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.OooO0o.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.OooO0o.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.OooO0o.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.OooO0o.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.OooO0o.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.OooO0o.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new xs0(view);
        }
        this.OooO0o.setActionView(view);
        return this;
    }
}
