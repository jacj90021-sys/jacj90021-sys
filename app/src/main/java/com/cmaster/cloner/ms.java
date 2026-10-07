package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ms extends gk0 {
    public final Object OooO;
    public final /* synthetic */ int OooO0oo;

    public /* synthetic */ ms(Object obj, int i) {
        this.OooO0oo = i;
        this.OooO = obj;
    }

    @Override // com.cmaster.cloner.fj0
    public final void OooO0o0(Throwable th) {
        int i = this.OooO0oo;
        Object obj = this.OooO;
        switch (i) {
            case 0:
                ((ks) obj).OooO0OO();
                break;
            case 1:
                ((fj0) obj).OooO0o0(th);
                break;
            default:
                Object objOooOoo0 = OooOO0O().OooOoo0();
                jk0 jk0Var = (jk0) obj;
                if (!(objOooOoo0 instanceof rf)) {
                    jk0Var.OooO0Oo(j62.OooO00o(objOooOoo0));
                    break;
                } else {
                    jk0Var.OooO0Oo(ty2.OooO00o(((rf) objOooOoo0).OooO00o));
                    break;
                }
        }
    }
}
