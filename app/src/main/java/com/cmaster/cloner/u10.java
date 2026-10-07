package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u10 implements nj0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ w10 OooO0o0;

    public /* synthetic */ u10(w10 w10Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = w10Var;
    }

    @Override // com.cmaster.cloner.nj0
    public final void OooO0Oo() {
        fy0 fy0Var;
        gy0 gy0Var;
        int i = this.OooO0Oo;
        w10 w10Var = this.OooO0o0;
        switch (i) {
            case 0:
                boolean zIsChecked = w10Var.OooOo0.isChecked();
                kq kqVar = w10Var.OooOo;
                if (kqVar != null && (fy0Var = kqVar.OooO0o) != null) {
                    fy0Var.OooO0Oo(zIsChecked);
                    break;
                }
                break;
            default:
                String string = w10Var.OooOooo.getText().toString();
                kq kqVar2 = w10Var.OooOo;
                if (kqVar2 != null && (gy0Var = kqVar2.OooOO0O) != null) {
                    gy0Var.OooO0Oo(string);
                    break;
                }
                break;
        }
    }
}
