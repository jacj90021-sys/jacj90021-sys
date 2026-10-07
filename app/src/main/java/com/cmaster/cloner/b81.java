package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b81 implements View.OnClickListener, View.OnLongClickListener {
    public final xj0 OooO0Oo;
    public final /* synthetic */ qe OooO0o0;

    public b81(qe qeVar, xj0 xj0Var) {
        this.OooO0o0 = qeVar;
        this.OooO0Oo = xj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qe qeVar = this.OooO0o0;
        ez0 ez0Var = qeVar.OooO0o0;
        xj0 xj0Var = this.OooO0Oo;
        if (ez0Var != null) {
            ez0Var.OooOO0(view, xj0Var);
        } else {
            qeVar.OooO0Oo.Oooo0O0(xj0Var.OooO0o).OooOO0(view, xj0Var);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        xj0 xj0Var = this.OooO0Oo;
        xj0Var.OooO0OO();
        return this.OooO0o0.OooO0Oo.Oooo0O0(xj0Var.OooO0o).OooO00o(view, xj0Var);
    }
}
