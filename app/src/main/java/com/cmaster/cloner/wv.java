package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wv extends vv implements Comparable {
    public final le OooO0o;
    public final jl OooO0o0;

    public wv(jl jlVar, int i, ho1 ho1Var, aq1 aq1Var) {
        super(i);
        if (jlVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-115, -100, -83, -88, -67, 95, 40, 28, -35, -39, -73, -75, -66, 87}, new byte[]{-32, -7, -39, -64, -46, 59, 8, 33}));
            throw null;
        }
        this.OooO0o0 = jlVar;
        if (ho1Var == null) {
            this.OooO0o = null;
        } else {
            this.OooO0o = new le(jlVar, ho1Var, (i & 8) != 0, aq1Var);
        }
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        return this.OooO0o0.OooO00o();
    }

    @Override // com.cmaster.cloner.vv
    public final int OooO0OO(nq nqVar, q9 q9Var, int i, int i2) {
        vt0 vt0Var = nqVar.OooO;
        jl jlVar = this.OooO0o0;
        int iOooOOO = vt0Var.OooOOO(jlVar);
        int i3 = iOooOOO - i;
        le leVar = this.OooO0o;
        int iOooO0o = leVar == null ? 0 : leVar.OooO0o();
        boolean z = iOooO0o != 0;
        int i4 = this.OooO0Oo;
        if (z != ((i4 & 1280) == 0)) {
            sa.OooO0oO(u7.OooO00o(new byte[]{120, -64, 45, -57, 61, -104, -112, 43, 59, -50, 42, -63, 120, -99, -112, 90, 125, -61, 40, -59, 110, -50, -114, 108, 104, -62, 40, -42, 126, -122}, new byte[]{27, -81, 73, -94, 29, -18, -29, 5}));
            return 0;
        }
        if (q9Var.OooO0Oo()) {
            q9Var.OooO0O0(0, String.format(u7.OooO00o(new byte[]{92, 106, -120, -43, 84, 97, -113, 91, 15}, new byte[]{124, 74, -45, -16, 44, 60, -81, 126}), Integer.valueOf(i2), jlVar.OooO00o()));
            q9Var.OooO0O0(fv2.OooO00o(i3), u7.OooO00o(new byte[]{-67, 93, -96, -29, -51, -94, -117, 35, -14, 25, -33, -86, -60, -65, -59, 107, -67, 93}, new byte[]{-99, 125, -128, -61, -96, -57, -1, 75}).concat(js2.OooO0OO(iOooOOO)));
            q9Var.OooO0O0(fv2.OooO00o(i4), u7.OooO00o(new byte[]{39, -62, -18, 120, 46, -6, -80, -38, 116, -111, -111, 62, 35, -8, -76, -52, 61, -62}, new byte[]{7, -30, -50, 88, 79, -103, -45, -65}) + xl2.OooO00o(i4, 204287, 3));
            rj.OooOO0O(iOooO0o, u7.OooO00o(new byte[]{-76, 108, 46, -89, -11, 35, -87, -81, -53, 35, 104, -31, -84, 108, -19, -22, -76, 108}, new byte[]{-108, 76, 14, -121, -106, 76, -51, -54}), q9Var, fv2.OooO00o(iOooO0o));
        }
        q9Var.OooOOO(i3);
        q9Var.OooOOO(i4);
        q9Var.OooOOO(iOooO0o);
        return iOooOOO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OooO0o0.compareTo(((wv) obj).OooO0o0);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wv) && this.OooO0o0.compareTo(((wv) obj).OooO0o0) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(wv.class.getName());
        sb.append('{');
        sb.append(js2.OooO0O0(this.OooO0Oo));
        sb.append(' ');
        sb.append(this.OooO0o0);
        le leVar = this.OooO0o;
        if (leVar != null) {
            sb.append(' ');
            sb.append(leVar);
        }
        sb.append('}');
        return sb.toString();
    }
}
