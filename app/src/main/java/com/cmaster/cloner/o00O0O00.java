package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O0O00 implements gk1 {
    public char OooO;
    public CharSequence OooO0Oo;
    public Intent OooO0o;
    public CharSequence OooO0o0;
    public char OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public Drawable OooOO0O;
    public Context OooOO0o;
    public CharSequence OooOOO;
    public CharSequence OooOOO0;
    public ColorStateList OooOOOO;
    public PorterDuff.Mode OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public int OooOOoo;

    @Override // com.cmaster.cloner.gk1
    public final ws0 OooO00o() {
        return null;
    }

    @Override // com.cmaster.cloner.gk1
    public final gk1 OooO0O0(ws0 ws0Var) {
        throw new UnsupportedOperationException();
    }

    public final void OooO0OO() {
        Drawable drawable = this.OooOO0O;
        if (drawable != null) {
            if (this.OooOOo0 || this.OooOOo) {
                this.OooOO0O = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.OooOO0O = drawableMutate;
                if (this.OooOOo0) {
                    drawableMutate.setTintList(this.OooOOOO);
                }
                if (this.OooOOo) {
                    this.OooOO0O.setTintMode(this.OooOOOo);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.OooOO0;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.OooO;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.OooOOO0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.OooOO0O;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.OooOOOO;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OooOOOo;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.OooO0o;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.OooO0oo;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.OooO0oO;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.OooO0Oo;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.OooO0o0;
        return charSequence != null ? charSequence : this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.OooOOO;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.OooOOoo & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.OooOOoo & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.OooOOoo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.OooOOoo & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.OooO = Character.toLowerCase(c);
        this.OooOO0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.OooOOoo = (z ? 1 : 0) | (this.OooOOoo & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.OooOOoo = (z ? 2 : 0) | (this.OooOOoo & (-3));
        return this;
    }


    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.OooOOoo = (z ? 16 : 0) | (this.OooOOoo & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.OooOO0O = this.OooOO0o.getDrawable(i);
        OooO0OO();
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.OooOOOO = colorStateList;
        this.OooOOo0 = true;
        OooO0OO();
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OooOOOo = mode;
        this.OooOOo = true;
        OooO0OO();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.OooO0o = intent;
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.OooO0oO = c;
        this.OooO0oo = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.OooO0oO = c;
        this.OooO0oo = KeyEvent.normalizeMetaState(i);
        this.OooO = Character.toLowerCase(c2);
        this.OooOO0 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.OooO0Oo = this.OooOO0o.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.OooO0o0 = charSequence;
        return this;
    }


    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.OooOOoo = (this.OooOOoo & 8) | (z ? 0 : 8);
        return this;
    }


    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final gk1 setTooltipText(CharSequence charSequence) {
        this.OooOOO = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.OooO0oO = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OooOO0O = drawable;
        OooO0OO();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.OooO = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.OooO0Oo = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.OooO0oO = c;
        this.OooO = Character.toLowerCase(c2);
        return this;
    }
}
