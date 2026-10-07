package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bl extends g00 {
    public int OooO0o;
    public final oh OooO0o0;
    public int OooO0oO;

    public bl(os osVar, zh1 zh1Var, v81 v81Var, oh ohVar) {
        super(osVar, zh1Var, v81Var);
        if (ohVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{66, -120, -3, -124, -118, -25, 24, -4, 1, -38, -82, -41, -112, -13, 26, -28}, new byte[]{33, -25, -109, -9, -2, -122, 118, -120}));
            throw null;
        }
        this.OooO0o0 = ohVar;
        this.OooO0o = -1;
        this.OooO0oO = -1;
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooO(os osVar) {
        bl blVar = new bl(osVar, this.OooO0OO, this.OooO0Oo, this.OooO0o0);
        int i = this.OooO0o;
        if (i >= 0) {
            blVar.OooOOOO(i);
        }
        int i2 = this.OooO0oO;
        if (i2 >= 0) {
            blVar.OooOOO(i2);
        }
        return blVar;
    }

    @Override // com.cmaster.cloner.zm
    public final String OooO00o() {
        return this.OooO0o0.OooO00o();
    }

    @Override // com.cmaster.cloner.zm
    public final String OooO0OO() {
        if (this.OooO0o < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.OooO0o0.OooO0o0());
        sb.append('@');
        int i = this.OooO0o;
        if (i < 65536) {
            sb.append(js2.OooO0O0(i));
        } else {
            sb.append(js2.OooO0OO(i));
        }
        return sb.toString();
    }

    @Override // com.cmaster.cloner.zm
    public final String OooO0Oo() {
        oh ohVar = this.OooO0o0;
        return ohVar instanceof ml ? ((ml) ohVar).OooO0o() : ohVar.OooO00o();
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooOO0O(v81 v81Var) {
        bl blVar = new bl(this.OooO0O0, this.OooO0OO, v81Var, this.OooO0o0);
        int i = this.OooO0o;
        if (i >= 0) {
            blVar.OooOOOO(i);
        }
        int i2 = this.OooO0oO;
        if (i2 >= 0) {
            blVar.OooOOO(i2);
        }
        return blVar;
    }

    public final void OooOOO(int i) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{75, 29, -61, 41, -120, -87, 127, -103, 18}, new byte[]{34, 115, -89, 76, -16, -119, 67, -71}));
        } else if (this.OooO0oO < 0) {
            this.OooO0oO = i;
        } else {
            qa.OooO0o(u7.OooO00o(new byte[]{60, -4, 70, -90, 114, -74, -73, 3, 59, -11, 95, -11, 96, -6, -84, 8, 62, -12, 94, -11, 114, -13, -86}, new byte[]{95, -112, 39, -43, 1, -106, -34, 109}));
        }
    }

    public final int OooOOO0() {
        int i = this.OooO0o;
        if (i >= 0) {
            return i;
        }
        qa.OooO0OO(u7.OooO00o(new byte[]{38, 15, 68, 47, -21, -121, 12, 90, 59, 65, 89, 47, -25, -121, 17, 80, 59, 65, 70, 37, -31, -121}, new byte[]{79, 97, 32, 74, -109, -89, 98, 53}), this.OooO0o0);
        return 0;
    }

    public final void OooOOOO(int i) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{33, -25, -21, -31, 7, -65, -81, -55, 120}, new byte[]{72, -119, -113, -124, 127, -97, -109, -23}));
        } else if (this.OooO0o < 0) {
            this.OooO0o = i;
        } else {
            qa.OooO0o(u7.OooO00o(new byte[]{94, 54, -62, -55, 50, -14, 32, -124, 69, 61, -57, -56, 51, -14, 50, -115, 67}, new byte[]{55, 88, -90, -84, 74, -46, 65, -24}));
        }
    }
}
