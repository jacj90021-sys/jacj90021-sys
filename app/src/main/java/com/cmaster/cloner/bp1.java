package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bp1 extends xo1 {
    public final /* synthetic */ int OooO00o = 1;
    public vo1 OooO0O0;

    public bp1(vo1 vo1Var) {
        this.OooO0O0 = vo1Var;
    }

    @Override // com.cmaster.cloner.to1
    public final void OooO00o(vo1 vo1Var) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0.OooOoO();
                vo1Var.OooOo(this);
                break;
            default:
                o4 o4Var = (o4) this.OooO0O0;
                int i = o4Var.Oooo000 - 1;
                o4Var.Oooo000 = i;
                if (i == 0) {
                    o4Var.Oooo00O = false;
                    o4Var.OooOOO0();
                }
                vo1Var.OooOo(this);
                break;
        }
    }

    @Override // com.cmaster.cloner.xo1, com.cmaster.cloner.to1
    public void OooO0o(vo1 vo1Var) {
        switch (this.OooO00o) {
            case 1:
                o4 o4Var = (o4) this.OooO0O0;
                if (!o4Var.Oooo00O) {
                    o4Var.Oooo00O();
                    o4Var.Oooo00O = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bp1() {
    }
}
