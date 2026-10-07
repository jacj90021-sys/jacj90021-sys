package com.cmaster.cloner;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class t1 extends o1 {
    public yn1 Ooooo00;
    public final d01 Ooooo0o = d01.OooO;

    @Override // com.cmaster.cloner.o10
    public final void OooOoO(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_apps, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        if (searchView != null) {
            searchView.setOnQueryTextListener(new o00OO000(this, 5));
            d01 d01Var = this.Ooooo0o;
            if (TextUtils.isEmpty(d01Var.OooO0oO)) {
                return;
            }
            searchView.OooOOo0(d01Var.OooO0oO);
            searchView.setIconified(false);
        }
    }

    @Override // com.cmaster.cloner.o10
    public final View OooOoOO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        OoooO();
        this.Ooooo00 = yn1.OooO00o(layoutInflater);
        if (!i81.OooO0oo.OooO0O0()) {
            kn2.OooO0O0(this, (CardView) this.Ooooo00.OooO0o);
        }
        cz czVar = new cz(Oooo());
        czVar.setPopupBgColor(Oooo().getColor(R.color.colorPrimary));
        czVar.setAutoHideEnabled(true);
        czVar.setFastScrollEnabled(true);
        czVar.setThumbColor(Oooo().getColor(R.color.colorPrimary));
        czVar.setThumbInactiveColor(Oooo().getColor(R.color.colorPrimary));
        Oooo();
        czVar.setLayoutManager(new LinearLayoutManager(0));
        ((FrameLayout) this.Ooooo00.OooO0oO).addView(czVar, new FrameLayout.LayoutParams(-1, -1));
        s1 s1Var = new s1(0);
        s1Var.OooOO0o(o2.class, new c2(0));
        s1Var.OooOO0o(y50.class, new c2(2));
        s1Var.OooO0o = true;
        d01 d01Var = this.Ooooo0o;
        d01Var.OooO0OO.OooO0o0(OooOOOo(), new k1(s1Var, 1));
        s1Var.OooO.OooOO0O = new r1(this, Integer.valueOf(R.string.app_retry), s1Var, 0);
        d01Var.OooO0O0.OooO0o0(OooOOOo(), new k1(this, 2));
        s1Var.OooO0o = true;
        s1Var.OooO0o0 = new xb1(this, 4);
        czVar.setAdapter(s1Var);
        return (LinearLayout) this.Ooooo00.OooO0o0;
    }

    @Override // com.cmaster.cloner.o10
    public final boolean Oooo000(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_system_app) {
            return false;
        }
        d01 d01Var = this.Ooooo0o;
        d01Var.OooO0o = !d01Var.OooO0o;
        d01Var.OooO00o();
        return false;
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo00O(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.action_system_app);
        if (this.Ooooo0o.OooO0o) {
            menuItemFindItem.setTitle(R.string.title_hide_system_app);
        } else {
            menuItemFindItem.setTitle(R.string.title_show_system_app);
        }
    }
}
