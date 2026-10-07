package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class wy0 extends m40 implements p30 {
    public final /* synthetic */ int OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.OooOO0o = i4;
    }

    @Override // com.cmaster.cloner.p30
    public final Object OooO00o() throws Exception {
        int i = this.OooOO0o;
        vq1 vq1Var = vq1.OooO00o;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ((xy0) obj).OooO0OO();
                return vq1Var;
            case 1:
                ((xy0) obj).OooO0OO();
                return vq1Var;
            default:
                tb1 tb1Var = (tb1) obj;
                dj djVar = tb1Var.OooO00o;
                if (djVar == null) {
                    ij0.OooO("coroutineScope");
                    throw null;
                }
                nk0 nk0Var = (nk0) djVar.OooO0Oo.OooO0oo(gu0.OooO0o0);
                if (nk0Var == null) {
                    qa.OooO0Oo(djVar, "Scope cannot be cancelled because it does not have a job: ");
                    return null;
                }
                nk0Var.OooOOO0(null);
                tb1Var.OooO0oo();
                pb1 pb1Var = tb1Var.OooO0Oo;
                if (pb1Var != null) {
                    ((zg) pb1Var.OooO0o).close();
                    return vq1Var;
                }
                ij0.OooO("connectionManager");
                throw null;
        }
    }
}
