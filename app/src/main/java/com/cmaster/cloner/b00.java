package com.cmaster.cloner;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b00 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View OooO0Oo;
    public final /* synthetic */ c00 OooO0o0;

    public b00(c00 c00Var, View view) {
        this.OooO0o0 = c00Var;
        this.OooO0Oo = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        pr1.OooO0o().post(new pi2((Object) this, (Object) this, 20, false));
    }
}
