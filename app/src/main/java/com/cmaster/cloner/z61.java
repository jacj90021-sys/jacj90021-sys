package com.cmaster.cloner;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z61 implements lr {
    public final /* synthetic */ RecyclerView OooO0Oo;

    public /* synthetic */ z61(RecyclerView recyclerView) {
        this.OooO0Oo = recyclerView;
    }

    @Override // com.cmaster.cloner.lr
    public boolean OooOo(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.OooO0Oo;
        if (recyclerView.OooOOo0.OooO0o0()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.OooOOo0.OooO0Oo()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.o00ooo();
        return recyclerView.Oooo0OO(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // com.cmaster.cloner.lr
    public void OooOoo() {
        this.OooO0Oo.o00ooo();
    }

    @Override // com.cmaster.cloner.lr
    public float OooOoo0() {
        float f;
        RecyclerView recyclerView = this.OooO0Oo;
        if (recyclerView.OooOOo0.OooO0o0()) {
            f = recyclerView.Ooooo00;
        } else {
            if (!recyclerView.OooOOo0.OooO0Oo()) {
                return 0.0f;
            }
            f = recyclerView.OoooOoo;
        }
        return -f;
    }
}
