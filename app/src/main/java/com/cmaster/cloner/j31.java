package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j31 implements s61, h31 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ j31(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.h31
    public final Object OooO00o(String str, a40 a40Var, ij ijVar) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                return ((p31) obj).OooO00o(str, a40Var, ijVar);
            default:
                return ((mk1) obj).OooO00o(str, a40Var, ijVar);
        }
    }

    @Override // com.cmaster.cloner.s61
    public final mc1 OooO0OO() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                return ((p31) obj).OooO00o;
            default:
                return ((mk1) obj).OooO00o;
        }
    }
}
