package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sn1 extends cm2 {
    public final un1 OooO00o;
    public final Window.Callback OooO0O0;
    public final na1 OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public final ArrayList OooO0oO = new ArrayList();
    public final u91 OooO0oo = new u91(this, 6);

    public sn1(Toolbar toolbar, CharSequence charSequence, e eVar) throws Resources.NotFoundException {
        vk1 vk1Var = new vk1(this, 1);
        toolbar.getClass();
        un1 un1Var = new un1(toolbar, false);
        this.OooO00o = un1Var;
        eVar.getClass();
        this.OooO0O0 = eVar;
        un1Var.OooOO0O = eVar;
        toolbar.setOnMenuItemClickListener(vk1Var);
        if (!un1Var.OooO0oO) {
            un1Var.OooO0oo = charSequence;
            if ((un1Var.OooO0O0 & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (un1Var.OooO0oO) {
                    nt1.OooOOO(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.OooO0OO = new na1(this, 4);
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooO(int i, KeyEvent keyEvent) {
        Menu menuOooOOo = OooOOo();
        if (menuOooOOo == null) {
            return false;
        }
        menuOooOOo.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuOooOOo.performShortcut(i, keyEvent, 0);
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooO00o() {
        o00O0OOO o00o0ooo;
        ActionMenuView actionMenuView = this.OooO00o.OooO00o.OooO0Oo;
        return (actionMenuView == null || (o00o0ooo = actionMenuView.OooOo0o) == null || !o00o0ooo.OooO()) ? false : true;
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooO0O0() {
        vs0 vs0Var;
        on1 on1Var = this.OooO00o.OooO00o.Oooo;
        if (on1Var == null || (vs0Var = on1Var.OooO0o0) == null) {
            return false;
        }
        if (on1Var == null) {
            vs0Var = null;
        }
        if (vs0Var == null) {
            return true;
        }
        vs0Var.collapseActionView();
        return true;
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooO0OO(boolean z) {
        if (z == this.OooO0o) {
            return;
        }
        this.OooO0o = z;
        ArrayList arrayList = this.OooO0oO;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ra.OooOO0o();
    }

    @Override // com.cmaster.cloner.cm2
    public final int OooO0Oo() {
        return this.OooO00o.OooO0O0;
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooO0o() {
        un1 un1Var = this.OooO00o;
        Toolbar toolbar = un1Var.OooO00o;
        u91 u91Var = this.OooO0oo;
        toolbar.removeCallbacks(u91Var);
        Toolbar toolbar2 = un1Var.OooO00o;
        WeakHashMap weakHashMap = nt1.OooO00o;
        toolbar2.postOnAnimation(u91Var);
        return true;
    }

    @Override // com.cmaster.cloner.cm2
    public final Context OooO0o0() {
        return this.OooO00o.OooO00o.getContext();
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooO0oO() {
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooO0oo() {
        this.OooO00o.OooO00o.removeCallbacks(this.OooO0oo);
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooOO0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            OooOO0O();
        }
        return true;
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooOO0O() {
        return this.OooO00o.OooO00o.OooOo0();
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOO0o(boolean z) {
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOO(boolean z) {
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOO0(boolean z) throws Resources.NotFoundException {
        un1 un1Var = this.OooO00o;
        un1Var.OooO00o((un1Var.OooO0O0 & (-5)) | 4);
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOOO(int i) throws Resources.NotFoundException {
        un1 un1Var = this.OooO00o;
        CharSequence text = i != 0 ? un1Var.OooO00o.getContext().getText(i) : null;
        un1Var.OooO0oO = true;
        Toolbar toolbar = un1Var.OooO00o;
        un1Var.OooO0oo = text;
        if ((un1Var.OooO0O0 & 8) != 0) {
            toolbar.setTitle(text);
            if (un1Var.OooO0oO) {
                nt1.OooOOO(toolbar.getRootView(), text);
            }
        }
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOOo(CharSequence charSequence) throws Resources.NotFoundException {
        un1 un1Var = this.OooO00o;
        if (un1Var.OooO0oO) {
            return;
        }
        Toolbar toolbar = un1Var.OooO00o;
        un1Var.OooO0oo = charSequence;
        if ((un1Var.OooO0O0 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (un1Var.OooO0oO) {
                nt1.OooOOO(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu OooOOo() {
        boolean z = this.OooO0o0;
        un1 un1Var = this.OooO00o;
        if (!z) {
            v8 v8Var = new v8(this);
            nz0 nz0Var = new nz0(this, 7);
            Toolbar toolbar = un1Var.OooO00o;
            toolbar.OoooO00 = v8Var;
            toolbar.OoooO0 = nz0Var;
            ActionMenuView actionMenuView = toolbar.OooO0Oo;
            if (actionMenuView != null) {
                actionMenuView.OooOo = v8Var;
                actionMenuView.OooOoO0 = nz0Var;
            }
            this.OooO0o0 = true;
        }
        return un1Var.OooO00o.getMenu();
    }
}
