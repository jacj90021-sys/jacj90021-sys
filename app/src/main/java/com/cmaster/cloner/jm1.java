package com.cmaster.cloner;

import android.graphics.Typeface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jm1 extends py2 {
    public final /* synthetic */ oh1 OooO00o;
    public final /* synthetic */ km1 OooO0O0;

    public jm1(km1 km1Var, oh1 oh1Var) {
        this.OooO0O0 = km1Var;
        this.OooO00o = oh1Var;
    }

    @Override // com.cmaster.cloner.py2
    public final void OooO0O0(int i) {
        this.OooO0O0.OooOO0o = true;
        oh1 oh1Var = this.OooO00o;
        oh1Var.OooO0Oo((Typeface) oh1Var.OooO0o);
    }

    @Override // com.cmaster.cloner.py2
    public final void OooO0OO(Typeface typeface) {
        km1 km1Var = this.OooO0O0;
        Typeface typefaceCreate = Typeface.create(typeface, km1Var.OooO0OO);
        km1Var.OooOOO = typefaceCreate;
        km1Var.OooOO0o = true;
        this.OooO00o.OooO0Oo(typefaceCreate);
    }
}
