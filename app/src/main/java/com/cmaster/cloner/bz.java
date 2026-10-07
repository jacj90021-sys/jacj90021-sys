package com.cmaster.cloner;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bz {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ RecyclerView OooO0O0;

    public /* synthetic */ bz(RecyclerView recyclerView, int i) {
        this.OooO00o = i;
        this.OooO0O0 = recyclerView;
    }

    public void OooO00o() {
        RecyclerView recyclerView = this.OooO0O0;
        if (!recyclerView.OooOo0o || !recyclerView.OooOo0O) {
            recyclerView.OooOooO = true;
            recyclerView.requestLayout();
        } else {
            x61 x61Var = recyclerView.OooOO0o;
            WeakHashMap weakHashMap = nt1.OooO00o;
            recyclerView.postOnAnimation(x61Var);
        }
    }
}
