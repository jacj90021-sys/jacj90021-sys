package com.cmaster.cloner;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bn0 implements it0, AdapterView.OnItemClickListener {
    public an0 OooO;
    public Context OooO0Oo;
    public ss0 OooO0o;
    public LayoutInflater OooO0o0;
    public ExpandedMenuView OooO0oO;
    public ht0 OooO0oo;

    public bn0(ContextWrapper contextWrapper) {
        this.OooO0Oo = contextWrapper;
        this.OooO0o0 = LayoutInflater.from(contextWrapper);
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0O0(Context context, ss0 ss0Var) {
        if (this.OooO0Oo != null) {
            this.OooO0Oo = context;
            if (this.OooO0o0 == null) {
                this.OooO0o0 = LayoutInflater.from(context);
            }
        }
        this.OooO0o = ss0Var;
        an0 an0Var = this.OooO;
        if (an0Var != null) {
            an0Var.notifyDataSetChanged();
        }
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0OO(ss0 ss0Var, boolean z) {
        ht0 ht0Var = this.OooO0oo;
        if (ht0Var != null) {
            ht0Var.OooO0OO(ss0Var, z);
        }
    }

    @Override // com.cmaster.cloner.it0
    public final void OooO0Oo(ht0 ht0Var) {
        throw null;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o(vs0 vs0Var) {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oO(vs0 vs0Var) {
        return false;
    }

    @Override // com.cmaster.cloner.it0
    public final boolean OooO0oo(vj1 vj1Var) {
        boolean zHasVisibleItems = vj1Var.hasVisibleItems();
        Context context = vj1Var.OooO0Oo;
        if (!zHasVisibleItems) {
            return false;
        }
        ts0 ts0Var = new ts0();
        ts0Var.OooO0Oo = vj1Var;
        oOo000Oo ooo000oo = new oOo000Oo(context);
        oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
        bn0 bn0Var = new bn0(oo00o0.OooO00o);
        ts0Var.OooO0o = bn0Var;
        bn0Var.OooO0oo = ts0Var;
        vj1Var.OooO0O0(bn0Var, context);
        bn0 bn0Var2 = ts0Var.OooO0o;
        if (bn0Var2.OooO == null) {
            bn0Var2.OooO = new an0(bn0Var2);
        }
        oo00o0.OooOOOo = bn0Var2.OooO;
        oo00o0.OooOOo0 = ts0Var;
        View view = vj1Var.OooOOo;
        if (view != null) {
            oo00o0.OooO0o0 = view;
        } else {
            oo00o0.OooO0OO = vj1Var.OooOOo0;
            oo00o0.OooO0Oo = vj1Var.OooOOOo;
        }
        oo00o0.OooOOO = ts0Var;
        oOo0000O ooo0000oOooO0OO = ooo000oo.OooO0OO();
        ts0Var.OooO0o0 = ooo0000oOooO0OO;
        ooo0000oOooO0OO.setOnDismissListener(ts0Var);
        WindowManager.LayoutParams attributes = ts0Var.OooO0o0.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ts0Var.OooO0o0.show();
        ht0 ht0Var = this.OooO0oo;
        if (ht0Var == null) {
            return true;
        }
        ht0Var.OooOOOO(vj1Var);
        return true;
    }

    @Override // com.cmaster.cloner.it0
    public final void OooOO0() {
        an0 an0Var = this.OooO;
        if (an0Var != null) {
            an0Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.OooO0o.OooOOo0(this.OooO.getItem(i), this, 0);
    }
}
