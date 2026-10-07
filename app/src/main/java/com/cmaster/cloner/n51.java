package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n51 extends gg0 {
    public final ml OooO0o;
    public final p51 OooO0o0;
    public cq1 OooO0oO;

    public n51(p51 p51Var) {
        if (p51Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{79, 74, 48, 47, -34, 62, -36, -36, 90, 24, 98, 102, -111, 36, -48, -64, 83}, new byte[]{63, 56, 95, 91, -79, 74, -91, -84}));
            throw null;
        }
        bj1 bj1Var = p51Var.OooO0o;
        Object[] objArr = bj1Var.OooO0o0;
        this.OooO0o0 = p51Var;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder(length + 1);
        char cCharAt = p51Var.OooO0o0.OooO0Oo.charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < length; i++) {
            char cCharAt2 = ((vp1) bj1Var.OooO0o0(i)).OooO0Oo.charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.OooO0o = new ml(sb.toString());
        this.OooO0oO = objArr.length != 0 ? new cq1(bj1Var) : null;
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        o51 o51Var = nqVar.OooO0o0;
        o51 o51Var2 = nqVar.OooO0o;
        zt0 zt0Var = nqVar.OooO0O0;
        o51Var2.OooOOoo(this.OooO0o0.OooO0o0);
        o51Var.OooOOo0(this.OooO0o);
        cq1 cq1Var = this.OooO0oO;
        if (cq1Var != null) {
            this.OooO0oO = (cq1) zt0Var.OooOOO(cq1Var);
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOO0;
    }

    @Override // com.cmaster.cloner.pj0
    public final int OooO0OO() {
        return 12;
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO0Oo(nq nqVar, q9 q9Var) {
        o51 o51Var = nqVar.OooO0o0;
        ml mlVar = this.OooO0o;
        int iOooOOO = o51Var.OooOOO(mlVar);
        o51 o51Var2 = nqVar.OooO0o;
        p51 p51Var = this.OooO0o0;
        vp1 vp1Var = p51Var.OooO0o0;
        vp1 vp1Var2 = p51Var.OooO0o0;
        int iOooOOOo = o51Var2.OooOOOo(vp1Var);
        cq1 cq1Var = this.OooO0oO;
        int iOooO0o = cq1Var == null ? 0 : cq1Var.OooO0o();
        if (q9Var.OooO0Oo()) {
            StringBuilder sb = new StringBuilder();
            sb.append(vp1Var2.OooO00o());
            sb.append(u7.OooO00o(new byte[]{-58, 7, -108, -53, 5, 75, -10}, new byte[]{-26, 119, -26, -92, 113, 36, -34, -104}));
            bj1 bj1Var = p51Var.OooO0o;
            int length = bj1Var.OooO0o0.length;
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(u7.OooO00o(new byte[]{62, 10}, new byte[]{18, 42, 116, 77, -108, 7, -38, -78}));
                }
                sb.append(((vp1) bj1Var.OooO0o0(i)).OooO00o());
            }
            sb.append(u7.OooO00o(new byte[]{59}, new byte[]{18, -19, 90, -107, -18, 126, 69, -122}));
            q9Var.OooO0O0(0, OooO0o() + ' ' + sb.toString());
            q9Var.OooO0O0(4, u7.OooO00o(new byte[]{-116, 102, -22, 34, -44, 57, 79, 39, -13, 47, -3, 50, -127, 107, 27, 126, -116, 102, -71}, new byte[]{-84, 70, -103, 74, -69, 75, 59, 94}) + js2.OooO0OO(iOooOOO) + u7.OooO00o(new byte[]{-79, 14, -81, 50}, new byte[]{-111, 33, -128, 18, -96, -122, 76, -34}) + mlVar.OooO0o());
            q9Var.OooO0O0(4, u7.OooO00o(new byte[]{69, -30, 10, 94, -40, 0, 104, 87, 58, -74, 1, 75, -55, 42, 115, 93, 29, -8, 88}, new byte[]{101, -62, 120, 59, -84, 117, 26, 57}) + js2.OooO0OO(iOooOOOo) + u7.OooO00o(new byte[]{67, 98, -47, -4}, new byte[]{99, 77, -2, -36, 17, -111, 29, -4}) + vp1Var2.OooO00o());
            rj.OooOO0O(iOooO0o, u7.OooO00o(new byte[]{45, -13, 12, -25, 114, 98, -109, 54, 121, -74, 14, -11, 95, 108, -104, 53, 55, -13, 92}, new byte[]{13, -45, 124, -122, 0, 3, -2, 83}), q9Var, 4);
        }
        q9Var.OooOO0O(iOooOOO);
        q9Var.OooOO0O(iOooOOOo);
        q9Var.OooOO0O(iOooO0o);
    }
}
