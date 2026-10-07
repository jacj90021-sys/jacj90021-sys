package com.cmaster.cloner;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO0OOO00 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ oO0OO00o OooO0Oo;
    public final /* synthetic */ oO00o0 OooO0o0;

    public oO0OOO00(oO00o0 oo00o0, oO0OO00o oo0oo00o) {
        this.OooO0o0 = oo00o0;
        this.OooO0Oo = oo0oo00o;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        oO00o0 oo00o0 = this.OooO0o0;
        DialogInterface.OnClickListener onClickListener = oo00o0.OooOOo0;
        oO0OO00o oo0oo00o = this.OooO0Oo;
        onClickListener.onClick(oo0oo00o.OooO0O0, i);
        if (oo00o0.OooOo0) {
            return;
        }
        oo0oo00o.OooO0O0.dismiss();
    }
}
