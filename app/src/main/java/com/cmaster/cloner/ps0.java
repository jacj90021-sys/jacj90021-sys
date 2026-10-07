package com.cmaster.cloner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ps0 extends BaseAdapter {
    public final int OooO;
    public final ss0 OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0 = -1;
    public final boolean OooO0oO;
    public final LayoutInflater OooO0oo;

    public ps0(ss0 ss0Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.OooO0oO = z;
        this.OooO0oo = layoutInflater;
        this.OooO0Oo = ss0Var;
        this.OooO = i;
        OooO00o();
    }

    public final void OooO00o() {
        ss0 ss0Var = this.OooO0Oo;
        vs0 vs0Var = ss0Var.OooOoO0;
        if (vs0Var != null) {
            ss0Var.OooO();
            ArrayList arrayList = ss0Var.OooOOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vs0) arrayList.get(i)) == vs0Var) {
                    this.OooO0o0 = i;
                    return;
                }
            }
        }
        this.OooO0o0 = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final vs0 getItem(int i) {
        ArrayList arrayListOooOO0o;
        boolean z = this.OooO0oO;
        ss0 ss0Var = this.OooO0Oo;
        if (z) {
            ss0Var.OooO();
            arrayListOooOO0o = ss0Var.OooOOO0;
        } else {
            arrayListOooOO0o = ss0Var.OooOO0o();
        }
        int i2 = this.OooO0o0;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vs0) arrayListOooOO0o.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListOooOO0o;
        boolean z = this.OooO0oO;
        ss0 ss0Var = this.OooO0Oo;
        if (z) {
            ss0Var.OooO();
            arrayListOooOO0o = ss0Var.OooOOO0;
        } else {
            arrayListOooOO0o = ss0Var.OooOO0o();
        }
        return this.OooO0o0 < 0 ? arrayListOooOO0o.size() : arrayListOooOO0o.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.OooO0oo.inflate(this.OooO, viewGroup, false);
        }
        int i2 = getItem(i).OooO0o0;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).OooO0o0 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.OooO0Oo.OooOOO0() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        jt0 jt0Var = (jt0) view;
        if (this.OooO0o) {
            listMenuItemView.setForceShowIcon(true);
        }
        jt0Var.OooO00o(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO00o();
        super.notifyDataSetChanged();
    }
}
