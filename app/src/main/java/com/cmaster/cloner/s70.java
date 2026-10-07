package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s70 extends zm {
    public hh1[] OooO0o0;

    public s70(zh1 zh1Var, v81 v81Var) {
        super(ps.OooO0O0, zh1Var, v81Var);
        if (v81Var.OooO0o0.length != 0) {
            this.OooO0o0 = null;
        } else {
            ra.OooOOO(u7.OooO00o(new byte[]{-61, 117, 35, -83, -20, -40, 5, 86, -62, 62, 55, -83, -27, -55, 72, 13, -111, 45, 121, -28, -81}, new byte[]{-79, 16, 68, -60, -97, -84, 96, 36}));
            throw null;
        }
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooO(os osVar) {
        throw new RuntimeException(u7.OooO00o(new byte[]{13, 10, 53, 2, -71, -62, -121, 57, 12, 1, 34}, new byte[]{120, 100, 70, 119, -55, -78, -24, 75}));
    }

    @Override // com.cmaster.cloner.zm
    public final String OooO00o() {
        return null;
    }

    @Override // com.cmaster.cloner.zm
    public final int OooO0O0() {
        OooOOO0();
        int iOooO0O0 = 0;
        for (hh1 hh1Var : this.OooO0o0) {
            iOooO0O0 += hh1Var.OooO0O0();
        }
        return iOooO0O0;
    }

    @Override // com.cmaster.cloner.zm
    public final String OooO0oO() {
        v81 v81Var = this.OooO0Oo;
        int length = v81Var.OooO0o0.length;
        StringBuilder sb = new StringBuilder(100);
        int iOooO0OO = 0;
        for (int i = 0; i < length; i++) {
            u81 u81Var = (u81) v81Var.OooO0o0(i);
            hh1 hh1VarOooO0oo = zm.OooO0oo(zh1.OooO00o, u81.OooO0Oo(iOooO0OO, u81Var.OooO0o0.getType()), u81Var);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(hh1VarOooO0oo.OooO0oO());
            iOooO0OO += u81Var.OooO0OO();
        }
        return sb.toString();
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooOO0(int i) {
        return OooOO0O(this.OooO0Oo.OooOO0o(i));
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooOO0O(v81 v81Var) {
        return new s70(this.OooO0OO, v81Var);
    }

    @Override // com.cmaster.cloner.zm
    public final void OooOO0o(q9 q9Var) {
        OooOOO0();
        for (hh1 hh1Var : this.OooO0o0) {
            hh1Var.OooOO0o(q9Var);
        }
    }

    public final void OooOOO0() {
        if (this.OooO0o0 != null) {
            return;
        }
        v81 v81Var = this.OooO0Oo;
        int length = v81Var.OooO0o0.length;
        this.OooO0o0 = new hh1[length];
        int iOooO0OO = 0;
        for (int i = 0; i < length; i++) {
            u81 u81Var = (u81) v81Var.OooO0o0(i);
            this.OooO0o0[i] = zm.OooO0oo(zh1.OooO00o, u81.OooO0Oo(iOooO0OO, u81Var.OooO0o0.getType()), u81Var);
            iOooO0OO += u81Var.OooO0OO();
        }
    }
}
