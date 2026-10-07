package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sv extends g7 {
    public final Integer OooO0o0;

    public sv(Integer num) {
        this.OooO0o0 = num;
    }

    @Override // com.cmaster.cloner.g7, com.cmaster.cloner.fz0
    public final boolean OooO00o(View view, xj0 xj0Var) {
        return false;
    }

    @Override // com.cmaster.cloner.g7, com.cmaster.cloner.cc
    public final c2 OooOo0o() {
        return new c2(3);
    }

    @Override // com.cmaster.cloner.g7, android.view.View.OnClickListener
    public abstract void onClick(View view);

    @Override // com.cmaster.cloner.g7, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return false;
    }
}
