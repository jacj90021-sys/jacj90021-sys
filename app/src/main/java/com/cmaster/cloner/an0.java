package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class an0 extends BaseAdapter {
    public int OooO0Oo = -1;
    public final /* synthetic */ bn0 OooO0o0;

    public an0(bn0 bn0Var) {
        this.OooO0o0 = bn0Var;
        OooO00o();
    }

    public final void OooO00o() {
        ss0 ss0Var = this.OooO0o0.OooO0o;
        vs0 vs0Var = ss0Var.OooOoO0;
        if (vs0Var != null) {
            ss0Var.OooO();
            ArrayList arrayList = ss0Var.OooOOO0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vs0) arrayList.get(i)) == vs0Var) {
                    this.OooO0Oo = i;
                    return;
                }
            }
        }
        this.OooO0Oo = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final vs0 getItem(int i) {
        bn0 bn0Var = this.OooO0o0;
        ss0 ss0Var = bn0Var.OooO0o;
        ss0Var.OooO();
        ArrayList arrayList = ss0Var.OooOOO0;
        bn0Var.getClass();
        int i2 = this.OooO0Oo;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vs0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        bn0 bn0Var = this.OooO0o0;
        ss0 ss0Var = bn0Var.OooO0o;
        ss0Var.OooO();
        int size = ss0Var.OooOOO0.size();
        bn0Var.getClass();
        return this.OooO0Oo < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.OooO0o0.OooO0o0.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((jt0) view).OooO00o(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        OooO00o();
        super.notifyDataSetChanged();
    }
}
