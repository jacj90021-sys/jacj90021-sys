package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z80 extends x80 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ b90 OooO0O0;

    public /* synthetic */ z80(b90 b90Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = b90Var;
    }

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        int i = this.OooO00o;
        b90 b90Var = this.OooO0O0;
        switch (i) {
            case 0:
                Object[] objArr = yqVar.OooO0o;
                if (mx1.OooO0oO().OooOO0O(qx1.OooO0oO(), (String) objArr[objArr.length - 1])) {
                    objArr[objArr.length - 1] = b90Var.OooOO0O.getPackageName();
                    break;
                }
                break;
            default:
                Object[] objArr2 = yqVar.OooO0o;
                if (objArr2 != null && objArr2.length != 0 && (objArr2[objArr2.length - 1] instanceof String)) {
                    if (mx1.OooO0oO().OooOO0O(qx1.OooO0oO(), (String) objArr2[objArr2.length - 1])) {
                        objArr2[objArr2.length - 1] = b90Var.OooOO0O.getPackageName();
                        break;
                    }
                }
                break;
        }
    }
}
