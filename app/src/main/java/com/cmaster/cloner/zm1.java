package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zm1 extends al {
    public final aq1 OooO;

    public zm1(bc1 bc1Var, zh1 zh1Var, v81 v81Var, aq1 aq1Var, oh ohVar) {
        super(bc1Var, zh1Var, null, v81Var, ohVar);
        if (bc1Var.OooO0o0 == 6) {
            if (aq1Var != null) {
                this.OooO = aq1Var;
                return;
            } else {
                qa.OooOOO0(u7.OooO00o(new byte[]{-97, 126, 108, -105, -115, -103, -84, 5, -63, 34, 56, -102, -112, -112, -77}, new byte[]{-4, 31, 24, -12, -27, -4, -33, 37}));
                throw null;
            }
        }
        throw new IllegalArgumentException(u7.OooO00o(new byte[]{-89, 2, -45, -23, -37, 56, -4, -123, -95, 6, -40, -90, -42, 51, -86, -109, -92, 27, -44, -90, -35, 47, -67, -100, -85, 26, -39, -24, -40, 51, -71, -127, -69, 72, -112}, new byte[]{-56, 114, -80, -122, -65, 93, -36, -14}) + bc1Var.OooO0o0);
    }

    @Override // com.cmaster.cloner.ch0
    public final void OooO0OO(bh0 bh0Var) {
        bh0Var.OooO0OO(this);
    }

    @Override // com.cmaster.cloner.ch0
    public final aq1 OooO0Oo() {
        return this.OooO;
    }

    @Override // com.cmaster.cloner.al, com.cmaster.cloner.ch0
    public final String OooO0o0() {
        oh ohVar = this.OooO0oo;
        String strOooO00o = ohVar.OooO00o();
        if (ohVar instanceof ml) {
            strOooO00o = ((ml) ohVar).OooO0o();
        }
        return strOooO00o + " " + an1.OooO0o(this.OooO);
    }
}
