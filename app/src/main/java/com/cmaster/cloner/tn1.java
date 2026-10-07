package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tn1 extends q53 {
    public final /* synthetic */ int OooO00o;
    public boolean OooO0O0;
    public int OooO0OO;
    public final /* synthetic */ Object OooO0Oo;

    public tn1(hu1 hu1Var) {
        this.OooO00o = 1;
        this.OooO0Oo = hu1Var;
        this.OooO0O0 = false;
        this.OooO0OO = 0;
    }

    @Override // com.cmaster.cloner.q53, com.cmaster.cloner.iu1
    public void OooO00o() {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0 = true;
                break;
        }
    }

    @Override // com.cmaster.cloner.q53, com.cmaster.cloner.iu1
    public final void OooO0O0() {
        int i = this.OooO00o;
        Object obj = this.OooO0Oo;
        switch (i) {
            case 0:
                ((un1) obj).OooO00o.setVisibility(0);
                break;
            default:
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    iu1 iu1Var = ((hu1) obj).OooO0Oo;
                    if (iu1Var != null) {
                        iu1Var.OooO0O0();
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.iu1
    public final void OooO0OO() {
        int i = this.OooO00o;
        Object obj = this.OooO0Oo;
        switch (i) {
            case 0:
                if (!this.OooO0O0) {
                    ((un1) obj).OooO00o.setVisibility(this.OooO0OO);
                    break;
                }
                break;
            default:
                int i2 = this.OooO0OO + 1;
                this.OooO0OO = i2;
                hu1 hu1Var = (hu1) obj;
                if (i2 == hu1Var.OooO00o.size()) {
                    iu1 iu1Var = hu1Var.OooO0Oo;
                    if (iu1Var != null) {
                        iu1Var.OooO0OO();
                    }
                    this.OooO0OO = 0;
                    this.OooO0O0 = false;
                    hu1Var.OooO0o0 = false;
                    break;
                }
                break;
        }
    }

    public tn1(un1 un1Var, int i) {
        this.OooO00o = 0;
        this.OooO0Oo = un1Var;
        this.OooO0OO = i;
        this.OooO0O0 = false;
    }
}
