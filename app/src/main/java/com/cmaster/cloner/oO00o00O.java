package com.cmaster.cloner;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO00o00O implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView OooO0Oo;
    public final /* synthetic */ oO00o0 OooO0o;
    public final /* synthetic */ oO0OO00o OooO0o0;

    public oO00o00O(oO00o0 oo00o0, AlertController$RecycleListView alertController$RecycleListView, oO0OO00o oo0oo00o) {
        this.OooO0o = oo00o0;
        this.OooO0Oo = alertController$RecycleListView;
        this.OooO0o0 = oo0oo00o;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        oO00o0 oo00o0 = this.OooO0o;
        boolean[] zArr = oo00o0.OooOOoo;
        AlertController$RecycleListView alertController$RecycleListView = this.OooO0Oo;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        oo00o0.OooOo0o.onClick(this.OooO0o0.OooO0O0, i, alertController$RecycleListView.isItemChecked(i));
    }
}
