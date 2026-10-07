package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class an1 extends ch0 {
    public final aq1 OooO0oo;

    public an1(bc1 bc1Var, zh1 zh1Var, v81 v81Var, aq1 aq1Var) {
        super(bc1Var, zh1Var, null, v81Var);
        int i = bc1Var.OooO0o0;
        if (i != 6) {
            ra.OooOOO(px0.OooOOOo(new byte[]{50, 13, -46, -123, 2, 97, -107, -47, 52, 9, -39, -54, 15, 106, -61, -57, 49, 20, -43, -54, 4, 118, -44, -56, 62, 21, -40, -124, 1, 106, -48, -43, 46, 71, -111}, new byte[]{93, 125, -79, -22, 102, 4, -75, -90}, new StringBuilder(), i));
            throw null;
        }
        if (aq1Var != null) {
            this.OooO0oo = aq1Var;
        } else {
            qa.OooOOO0(u7.OooO00o(new byte[]{-96, 117, -34, 12, -45, -113, 94, -54, -2, 41, -118, 1, -50, -122, 65}, new byte[]{-61, 20, -86, 111, -69, -22, 45, -22}));
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String OooO0o(aq1 aq1Var) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(u7.OooO00o(new byte[]{24, -4, 74, 7, -22}, new byte[]{123, -99, 62, 100, -126, -18, -63, -112}));
        int length = ((h00) aq1Var).OooO0o0.length;
        for (int i = 0; i < length; i++) {
            sb.append(" ");
            sb.append(aq1Var.getType(i).OooO00o());
        }
        return sb.toString();
    }

    @Override // com.cmaster.cloner.ch0
    public final void OooO0OO(bh0 bh0Var) {
        bh0Var.OooO00o(this);
    }

    @Override // com.cmaster.cloner.ch0
    public final aq1 OooO0Oo() {
        return this.OooO0oo;
    }

    @Override // com.cmaster.cloner.ch0
    public final String OooO0o0() {
        return OooO0o(this.OooO0oo);
    }
}
