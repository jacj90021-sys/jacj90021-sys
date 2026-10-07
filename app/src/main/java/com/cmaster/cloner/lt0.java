package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class lt0 extends h implements Menu {
    public final ss0 OooO0o;

    public lt0(Context context, ss0 ss0Var) {
        super(context);
        if (ss0Var != null) {
            this.OooO0o = ss0Var;
        } else {
            ra.OooOOO("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO(this.OooO0o.OooO00o(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.OooO0o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = OooO(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.OooO0o.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        gh1 gh1Var = (gh1) this.OooO0o0;
        if (gh1Var != null) {
            gh1Var.clear();
        }
        this.OooO0o.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.OooO0o.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return OooO(this.OooO0o.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return OooO(this.OooO0o.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.OooO0o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.OooO0o.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.OooO0o.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.OooO0o.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((gh1) this.OooO0o0) != null) {
            int i2 = 0;
            while (true) {
                gh1 gh1Var = (gh1) this.OooO0o0;
                if (i2 >= gh1Var.OooO0o) {
                    break;
                }
                if (((gk1) gh1Var.OooO0o(i2)).getGroupId() == i) {
                    ((gh1) this.OooO0o0).OooO0oo(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.OooO0o.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((gh1) this.OooO0o0) != null) {
            int i2 = 0;
            while (true) {
                gh1 gh1Var = (gh1) this.OooO0o0;
                if (i2 >= gh1Var.OooO0o) {
                    break;
                }
                if (((gk1) gh1Var.OooO0o(i2)).getItemId() == i) {
                    ((gh1) this.OooO0o0).OooO0oo(i2);
                    break;
                }
                i2++;
            }
        }
        this.OooO0o.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.OooO0o.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.OooO0o.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.OooO0o.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.OooO0o.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.OooO0o.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.OooO0o.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.OooO0o.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.OooO0o.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO(this.OooO0o.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO(this.OooO0o.OooO00o(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO(this.OooO0o.add(i, i2, i3, i4));
    }
}
