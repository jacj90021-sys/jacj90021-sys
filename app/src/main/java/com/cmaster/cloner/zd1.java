package com.cmaster.cloner;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zd1 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ SearchView OooO0o0;

    public /* synthetic */ zd1(SearchView searchView, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        SearchView searchView = this.OooO0o0;
        switch (i) {
            case 0:
                searchView.OooOOoo();
                break;
            default:
                ql qlVar = searchView.OoooO0O;
                if (qlVar instanceof yj1) {
                    qlVar.OooO0O0(null);
                    break;
                }
                break;
        }
    }
}
