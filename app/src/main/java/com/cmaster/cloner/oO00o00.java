package com.cmaster.cloner;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO00o00 extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView OooO0Oo;
    public final /* synthetic */ oO00o0 OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(oO00o0 oo00o0, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, android.R.id.text1, charSequenceArr);
        this.OooO0o0 = oo00o0;
        this.OooO0Oo = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.OooO0o0.OooOOoo;
        if (zArr != null && zArr[i]) {
            this.OooO0Oo.setItemChecked(i, true);
        }
        return view2;
    }
}
