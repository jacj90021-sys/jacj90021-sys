package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ih1 implements iy0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ jh1 OooO0o;
    public final /* synthetic */ iy0 OooO0o0;

    public /* synthetic */ ih1(jh1 jh1Var, iy0 iy0Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o = jh1Var;
        this.OooO0o0 = iy0Var;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        int i = this.OooO0Oo;
        iy0 iy0Var = this.OooO0o0;
        jh1 jh1Var = this.OooO0o;
        switch (i) {
            case 0:
                if (jh1Var.OooOOo0.compareAndSet(true, false)) {
                    iy0Var.OooO00o(obj);
                    break;
                }
                break;
            default:
                if (jh1Var.OooOOo0.compareAndSet(true, false)) {
                    iy0Var.OooO00o(obj);
                    break;
                }
                break;
        }
    }
}
