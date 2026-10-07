package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ch0 implements ln1 {
    public final bc1 OooO0Oo;
    public final u81 OooO0o;
    public final zh1 OooO0o0;
    public final v81 OooO0oO;

    public ch0(bc1 bc1Var, zh1 zh1Var, u81 u81Var, v81 v81Var) {
        if (bc1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-29, 5, 76, -115, 17, -73, 84, 72, -79, 85, 65, -105, 25, -66}, new byte[]{-116, 117, 47, -30, 117, -46, 116, 117}));
            throw null;
        }
        if (zh1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-67, 40, -95, -4, 3, -105, 2, -70, -19, 122, -17, -75, 25, -117, 1, -72}, new byte[]{-51, 71, -46, -107, 119, -2, 109, -44}));
            throw null;
        }
        if (v81Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-125, -72, -15, -67, -41, 58, 99, -39, -51, -22, -92, -95, -63, 51, 124}, new byte[]{-16, -41, -124, -49, -76, 95, 16, -7}));
            throw null;
        }
        this.OooO0Oo = bc1Var;
        this.OooO0o0 = zh1Var;
        this.OooO0o = u81Var;
        this.OooO0oO = v81Var;
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        String strOooO0o0 = OooO0o0();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.OooO0o0);
        sb.append(u7.OooO00o(new byte[]{9, 102}, new byte[]{51, 70, -73, -114, -6, 59, -1, 84}));
        bc1 bc1Var = this.OooO0Oo;
        String string = bc1Var.OooO0oO;
        if (string == null) {
            string = bc1Var.toString();
        }
        sb.append(string);
        if (strOooO0o0 != null) {
            rj.OooOOo0(new byte[]{-70}, new byte[]{-110, -31, 79, 23, -79, 125, -58, 111}, sb, strOooO0o0);
            sb.append(u7.OooO00o(new byte[]{-16}, new byte[]{-39, 80, 0, -66, -88, -79, -67, 5}));
        }
        u81 u81Var = this.OooO0o;
        if (u81Var == null) {
            sb.append(u7.OooO00o(new byte[]{1, -92}, new byte[]{33, -118, 49, 33, -115, 72, -53, -57}));
        } else {
            sb.append(" ");
            sb.append(u81Var.OooO0oO(true));
        }
        sb.append(u7.OooO00o(new byte[]{-15, -29, -31}, new byte[]{-47, -33, -52, -128, 24, -108, 123, 22}));
        v81 v81Var = this.OooO0oO;
        int length = v81Var.OooO0o0.length;
        if (length == 0) {
            sb.append(u7.OooO00o(new byte[]{-25, -42}, new byte[]{-57, -8, 34, 89, 69, 55, -75, -52}));
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(" ");
                sb.append(((u81) v81Var.OooO0o0(i)).OooO0oO(true));
            }
        }
        return sb.toString();
    }

    public abstract void OooO0OO(bh0 bh0Var);

    public abstract aq1 OooO0Oo();

    public String OooO0o0() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strOooO0o0 = OooO0o0();
        StringBuilder sb = new StringBuilder(80);
        sb.append(u7.OooO00o(new byte[]{67, 96, -104, 83, 53}, new byte[]{10, 14, -21, 61, 78, 43, -79, 56}));
        sb.append(this.OooO0o0);
        sb.append(' ');
        sb.append(this.OooO0Oo);
        if (strOooO0o0 != null) {
            sb.append(' ');
            sb.append(strOooO0o0);
        }
        sb.append(u7.OooO00o(new byte[]{26, -27, 0, 23}, new byte[]{58, -33, 58, 55, 41, 124, 85, -33}));
        u81 u81Var = this.OooO0o;
        if (u81Var != null) {
            sb.append(u81Var);
            sb.append(u7.OooO00o(new byte[]{-116, 82, 126, -34}, new byte[]{-84, 110, 83, -2, -49, 117, 116, 101}));
        }
        sb.append(this.OooO0oO);
        sb.append('}');
        return sb.toString();
    }
}
