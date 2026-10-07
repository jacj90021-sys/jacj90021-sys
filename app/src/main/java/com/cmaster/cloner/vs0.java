package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vs0 implements gk1 {
    public CharSequence OooO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;
    public CharSequence OooO0oo;
    public Intent OooOO0;
    public char OooOO0O;
    public char OooOOO0;
    public Drawable OooOOOO;
    public vj1 OooOOo;
    public final ss0 OooOOo0;
    public MenuItem.OnMenuItemClickListener OooOOoo;
    public CharSequence OooOo0;
    public CharSequence OooOo00;
    public View OooOoo;
    public int OooOoo0;
    public ws0 OooOooO;
    public MenuItem.OnActionExpandListener OooOooo;
    public int OooOO0o = 4096;
    public int OooOOO = 4096;
    public int OooOOOo = 0;
    public ColorStateList OooOo0O = null;
    public PorterDuff.Mode OooOo0o = null;
    public boolean OooOo = false;
    public boolean OooOoO0 = false;
    public boolean OooOoO = false;
    public int OooOoOO = 16;
    public boolean Oooo000 = false;

    public vs0(ss0 ss0Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.OooOOo0 = ss0Var;
        this.OooO0Oo = i2;
        this.OooO0o0 = i;
        this.OooO0o = i3;
        this.OooO0oO = i4;
        this.OooO0oo = charSequence;
        this.OooOoo0 = i5;
    }

    public static void OooO0OO(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // com.cmaster.cloner.gk1
    public final ws0 OooO00o() {
        return this.OooOooO;
    }

    @Override // com.cmaster.cloner.gk1
    public final gk1 OooO0O0(ws0 ws0Var) {
        this.OooOoo = null;
        this.OooOooO = ws0Var;
        this.OooOOo0.OooOOOo(true);
        ws0 ws0Var2 = this.OooOooO;
        if (ws0Var2 != null) {
            ws0Var2.OooO00o = new xb1(this, 23);
            ws0Var2.OooO0O0.setVisibilityListener(ws0Var2);
        }
        return this;
    }

    public final Drawable OooO0Oo(Drawable drawable) {
        if (drawable != null && this.OooOoO && (this.OooOo || this.OooOoO0)) {
            drawable = drawable.mutate();
            if (this.OooOo) {
                drawable.setTintList(this.OooOo0O);
            }
            if (this.OooOoO0) {
                drawable.setTintMode(this.OooOo0o);
            }
            this.OooOoO = false;
        }
        return drawable;
    }

    public final void OooO0o(boolean z) {
        int i = this.OooOoOO;
        if (z) {
            this.OooOoOO = i | 32;
        } else {
            this.OooOoOO = i & (-33);
        }
    }

    public final boolean OooO0o0() {
        ws0 ws0Var;
        if ((this.OooOoo0 & 8) != 0) {
            if (this.OooOoo == null && (ws0Var = this.OooOooO) != null) {
                this.OooOoo = ws0Var.OooO0O0.onCreateActionView(this);
            }
            if (this.OooOoo != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.OooOoo0 & 8) == 0) {
            return false;
        }
        if (this.OooOoo == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.OooOooo;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.OooOOo0.OooO0Oo(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!OooO0o0()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.OooOooo;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.OooOOo0.OooO0o(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.OooOoo;
        if (view != null) {
            return view;
        }
        ws0 ws0Var = this.OooOooO;
        if (ws0Var == null) {
            return null;
        }
        View viewOnCreateActionView = ws0Var.OooO0O0.onCreateActionView(this);
        this.OooOoo = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.OooOOO;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.OooOOO0;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.OooOo00;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.OooO0o0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.OooOOOO;
        if (drawable != null) {
            return OooO0Oo(drawable);
        }
        int i = this.OooOOOo;
        if (i == 0) {
            return null;
        }
        Drawable drawableOooO00o = ym2.OooO00o(this.OooOOo0.OooO0Oo, i);
        this.OooOOOo = 0;
        this.OooOOOO = drawableOooO00o;
        return OooO0Oo(drawableOooO00o);
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.OooOo0O;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OooOo0o;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.OooOO0;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.OooO0Oo;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.OooOO0o;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.OooOO0O;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.OooO0o;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.OooOOo;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.OooO0oo;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.OooO;
        return charSequence != null ? charSequence : this.OooO0oo;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.OooOo0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.OooOOo != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.Oooo000;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.OooOoOO & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.OooOoOO & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.OooOoOO & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ws0 ws0Var = this.OooOooO;
        return (ws0Var == null || !ws0Var.OooO0O0.overridesItemVisibility()) ? (this.OooOoOO & 8) == 0 : (this.OooOoOO & 8) == 0 && this.OooOooO.OooO0O0.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        ss0 ss0Var = this.OooOOo0;
        Context context = ss0Var.OooO0Oo;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.OooOoo = viewInflate;
        this.OooOooO = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.OooO0Oo) > 0) {
            viewInflate.setId(i2);
        }
        ss0Var.OooOOO = true;
        ss0Var.OooOOOo(true);
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.OooOOO0 == c && this.OooOOO == i) {
            return this;
        }
        this.OooOOO0 = Character.toLowerCase(c);
        this.OooOOO = KeyEvent.normalizeMetaState(i);
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.OooOoOO;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.OooOoOO = i2;
        if (i != i2) {
            this.OooOOo0.OooOOOo(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.OooOoOO;
        int i2 = i & 4;
        ss0 ss0Var = this.OooOOo0;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.OooOoOO = i3;
            if (i != i3) {
                ss0Var.OooOOOo(false);
            }
            return this;
        }
        ArrayList arrayList = ss0Var.OooO;
        int size = arrayList.size();
        ss0Var.OooOo0o();
        for (int i4 = 0; i4 < size; i4++) {
            vs0 vs0Var = (vs0) arrayList.get(i4);
            if (vs0Var.OooO0o0 == this.OooO0o0 && (vs0Var.OooOoOO & 4) != 0 && vs0Var.isCheckable()) {
                boolean z2 = vs0Var == this;
                int i5 = vs0Var.OooOoOO;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                vs0Var.OooOoOO = i6;
                if (i5 != i6) {
                    vs0Var.OooOOo0.OooOOOo(false);
                }
            }
        }
        ss0Var.OooOo0O();
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final gk1 setContentDescription(CharSequence charSequence) {
        this.OooOo00 = charSequence;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.OooOoOO;
        if (z) {
            this.OooOoOO = i | 16;
        } else {
            this.OooOoOO = i & (-17);
        }
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.OooOOOO = null;
        this.OooOOOo = i;
        this.OooOoO = true;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.OooOo0O = colorStateList;
        this.OooOo = true;
        this.OooOoO = true;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OooOo0o = mode;
        this.OooOoO0 = true;
        this.OooOoO = true;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.OooOO0 = intent;
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.OooOO0O == c && this.OooOO0o == i) {
            return this;
        }
        this.OooOO0O = c;
        this.OooOO0o = KeyEvent.normalizeMetaState(i);
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.OooOooo = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.OooOOoo = onMenuItemClickListener;
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.OooOO0O = c;
        this.OooOO0o = KeyEvent.normalizeMetaState(i);
        this.OooOOO0 = Character.toLowerCase(c2);
        this.OooOOO = KeyEvent.normalizeMetaState(i2);
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            ra.OooOOO("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.OooOoo0 = i;
        ss0 ss0Var = this.OooOOo0;
        ss0Var.OooOOO = true;
        ss0Var.OooOOOo(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.OooO0oo = charSequence;
        this.OooOOo0.OooOOOo(false);
        vj1 vj1Var = this.OooOOo;
        if (vj1Var != null) {
            vj1Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.OooO = charSequence;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // com.cmaster.cloner.gk1, android.view.MenuItem
    public final gk1 setTooltipText(CharSequence charSequence) {
        this.OooOo0 = charSequence;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.OooOoOO;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.OooOoOO = i2;
        if (i != i2) {
            ss0 ss0Var = this.OooOOo0;
            ss0Var.OooOO0O = true;
            ss0Var.OooOOOo(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.OooO0oo;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OooOOOo = 0;
        this.OooOOOO = drawable;
        this.OooOoO = true;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.OooOOo0.OooO0Oo.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.OooOO0O == c) {
            return this;
        }
        this.OooOO0O = c;
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.OooOO0O = c;
        this.OooOOO0 = Character.toLowerCase(c2);
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.OooOOO0 == c) {
            return this;
        }
        this.OooOOO0 = Character.toLowerCase(c);
        this.OooOOo0.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.OooOoo = view;
        this.OooOooO = null;
        if (view != null && view.getId() == -1 && (i = this.OooO0Oo) > 0) {
            view.setId(i);
        }
        ss0 ss0Var = this.OooOOo0;
        ss0Var.OooOOO = true;
        ss0Var.OooOOOo(true);
        return this;
    }
}
