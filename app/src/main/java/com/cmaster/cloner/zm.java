package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class zm {
    public int OooO00o;
    public final os OooO0O0;
    public final zh1 OooO0OO;
    public final v81 OooO0Oo;

    public zm(os osVar, zh1 zh1Var, v81 v81Var) {
        if (osVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-128, -39, -119, 28, -105, 102, -27, -84, -46, -119, -124, 6, -97, 111}, new byte[]{-17, -87, -22, 115, -13, 3, -59, -111}));
            throw null;
        }
        if (zh1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-105, -122, 2, -63, 126, 113, -102, 11, -57, -44, 76, -120, 100, 109, -103, 9}, new byte[]{-25, -23, 113, -88, 10, 24, -11, 101}));
            throw null;
        }
        if (v81Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{87, 117, -40, -37, 40, -115, 58, -12, 86, 48, -126, -113, 123, -105, 42, -22, 73}, new byte[]{37, 16, -65, -78, 91, -7, 95, -122}));
            throw null;
        }
        this.OooO00o = -1;
        this.OooO0O0 = osVar;
        this.OooO0OO = zh1Var;
        this.OooO0Oo = v81Var;
    }

    public static hh1 OooO0oo(zh1 zh1Var, u81 u81Var, u81 u81Var2) {
        boolean z = u81Var.OooO0OO() == 1;
        boolean z2 = u81Var.OooO0o0.getType().OooO0o0 == 9;
        int i = u81Var.OooO0Oo;
        return new hh1((u81Var2.OooO0Oo | i) < 16 ? z2 ? ps.OooOO0 : z ? ps.OooO0Oo : ps.OooO0oO : i < 256 ? z2 ? ps.OooOO0O : z ? ps.OooO0o0 : ps.OooO0oo : z2 ? ps.OooOO0o : z ? ps.OooO0o : ps.OooO, zh1Var, v81.OooOO0(u81Var, u81Var2));
    }

    public abstract zm OooO(os osVar);

    public abstract String OooO00o();

    public abstract int OooO0O0();

    public String OooO0OO() {
        throw new UnsupportedOperationException(u7.OooO00o(new byte[]{107, -4, -38, -98, -94, 111, 88, -91, 74, -31, -38, -37, -75, 52}, new byte[]{37, -109, -82, -66, -47, 26, 40, -43}));
    }

    public String OooO0Oo() {
        throw new UnsupportedOperationException(u7.OooO00o(new byte[]{95, -46, -15, 45, 98, -32, 44, -53, 126, -49, -15, 104, 117, -69}, new byte[]{17, -67, -123, 13, 17, -107, 92, -69}));
    }

    public final String OooO0o() {
        return this.OooO00o != -1 ? String.format(u7.OooO00o(new byte[]{-110, -115, 119, -76}, new byte[]{-73, -67, 67, -52, 61, 114, 30, 120}), Integer.valueOf(this.OooO00o)) : js2.OooO0OO(System.identityHashCode(this));
    }

    public final int OooO0o0() {
        int i = this.OooO00o;
        if (i >= 0) {
            return i;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-109, -118, -95, 127, -57, 27, 47, -74, -100, -127, -79, 45, -37, 13, 40, -74, -103, -128, -86, 122, -52}, new byte[]{-14, -18, -59, 13, -94, 104, 92, -106}));
        return 0;
    }

    public abstract String OooO0oO();

    public abstract zm OooOO0(int i);

    public abstract zm OooOO0O(v81 v81Var);

    public abstract void OooOO0o(q9 q9Var);

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(OooO0o());
        sb.append(' ');
        sb.append(this.OooO0OO);
        sb.append(u7.OooO00o(new byte[]{-66, 40}, new byte[]{-124, 8, -18, -123, -127, -90, -25, -98}));
        sb.append(this.OooO0O0.OooO00o());
        v81 v81Var = this.OooO0Oo;
        if (v81Var.OooO0o0.length != 0) {
            z = true;
            sb.append(v81Var.OooO0oo(" ", u7.OooO00o(new byte[]{82, 29}, new byte[]{126, 61, -51, -83, -36, 83, -45, -37}), null, true));
        } else {
            z = false;
        }
        String strOooO00o = OooO00o();
        if (strOooO00o != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(strOooO00o);
        }
        return sb.toString();
    }
}
