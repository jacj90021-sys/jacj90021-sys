package com.cmaster.cloner;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cq implements DialogInterface.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ gq OooO0o;
    public final /* synthetic */ int OooO0o0;

    public /* synthetic */ cq(gq gqVar, int i, int i2) {
        this.OooO0Oo = i2;
        this.OooO0o = gqVar;
        this.OooO0o0 = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.OooO0Oo;
        gq gqVar = this.OooO0o;
        switch (i2) {
            case 0:
                gqVar.OoooOOo(this.OooO0o0, false);
                break;
            default:
                m1 m1Var = (m1) j1.OooO00o(gqVar.Oooo());
                if (m1Var != null) {
                    m1Var.OooOo0(new o00OOO00(this, 14));
                    break;
                }
                break;
        }
    }
}
