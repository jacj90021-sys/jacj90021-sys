package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dv1 implements iy0 {
    public final /* synthetic */ fv1 OooO0Oo;
    public final /* synthetic */ cr0 OooO0o;
    public final /* synthetic */ hm0 OooO0o0;
    public final /* synthetic */ hv1 OooO0oO;

    public dv1(hv1 hv1Var, fv1 fv1Var, hm0 hm0Var, cr0 cr0Var) {
        this.OooO0oO = hv1Var;
        this.OooO0Oo = fv1Var;
        this.OooO0o0 = hm0Var;
        this.OooO0o = cr0Var;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        hm0 hm0Var = this.OooO0o0;
        fv1 fv1Var = this.OooO0Oo;
        hv1 hv1Var = this.OooO0oO;
        if (iIntValue != -2) {
            hv1Var.OooO0O0(fv1Var, this.OooO0o, hm0Var);
        } else {
            hv1Var.OooO0O0(fv1Var, dr0.OooO00o().OooO0O0(2, (er0) kn2.OooO00o.OooOO0), hm0Var);
        }
    }
}
