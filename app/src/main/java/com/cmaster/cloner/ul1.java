package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ul1 extends g00 {
    public final ke OooO0o0;

    public ul1(os osVar, zh1 zh1Var, v81 v81Var, ke keVar) {
        super(osVar, zh1Var, v81Var);
        if (keVar != null) {
            this.OooO0o0 = keVar;
        } else {
            qa.OooOOO0(u7.OooO00o(new byte[]{-22, 29, 6, -117, 95, -67, 124, 100, -93, 92, 26, -103, 86, -91}, new byte[]{-98, 124, 116, -20, 58, -55, 92, 89}));
            throw null;
        }
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooO(os osVar) {
        return new ul1(osVar, this.OooO0OO, this.OooO0Oo, this.OooO0o0);
    }

    @Override // com.cmaster.cloner.zm
    public final String OooO00o() {
        ke keVar = this.OooO0o0;
        return keVar == null ? u7.OooO00o(new byte[]{-71, -71, 126, -126}, new byte[]{-122, -122, 65, -67, 111, -127, 114, 82}) : keVar.OooO0o();
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooOO0O(v81 v81Var) {
        return new ul1(this.OooO0O0, this.OooO0OO, v81Var, this.OooO0o0);
    }

    public final boolean OooOOO() {
        return this.OooO00o >= 0 && this.OooO0o0.OooO00o >= 0;
    }

    public final int OooOOO0() {
        return this.OooO0o0.OooO0o0() - OooO0o0();
    }

    public final ul1 OooOOOO(ke keVar) {
        os osVar;
        os osVar2 = this.OooO0O0;
        switch (osVar2.OooO00o) {
            case 50:
                osVar = ps.OoooO00;
                break;
            case 51:
                osVar = ps.Oooo;
                break;
            case 52:
                osVar = ps.OoooO0O;
                break;
            case 53:
                osVar = ps.OoooO0;
                break;
            case 54:
                osVar = ps.OoooOO0;
                break;
            case 55:
                osVar = ps.OoooO;
                break;
            case 56:
                osVar = ps.OoooOOO;
                break;
            case 57:
                osVar = ps.o000oOoO;
                break;
            case 58:
                osVar = ps.OoooOo0;
                break;
            case 59:
                osVar = ps.OoooOOo;
                break;
            case 60:
                osVar = ps.OoooOoo;
                break;
            case 61:
                osVar = ps.OoooOoO;
                break;
            default:
                ra.OooO0OO(u7.OooO00o(new byte[]{-30, 73, -121, -102, 109, 42, 119, 69, -29, 73, -124, -118, 36, 42}, new byte[]{-128, 38, -32, -17, 30, 10, 24, 53}), osVar2);
                return null;
        }
        return new ul1(osVar, this.OooO0OO, this.OooO0Oo, keVar);
    }
}
