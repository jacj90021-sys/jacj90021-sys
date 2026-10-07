package com.cmaster.cloner;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pl extends DataSetObserver {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ pl(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                yj1 yj1Var = (yj1) obj;
                yj1Var.OooO0Oo = true;
                yj1Var.notifyDataSetChanged();
                break;
            default:
                hn0 hn0Var = (hn0) obj;
                if (hn0Var.OooOoo.isShowing()) {
                    hn0Var.OooO();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                yj1 yj1Var = (yj1) obj;
                yj1Var.OooO0Oo = false;
                yj1Var.notifyDataSetInvalidated();
                break;
            default:
                ((hn0) obj).dismiss();
                break;
        }
    }
}
