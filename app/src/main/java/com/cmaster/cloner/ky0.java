package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ky0 extends pj0 implements Comparable {
    public final int OooO0Oo;
    public zt0 OooO0o;
    public int OooO0o0;
    public int OooO0oO;

    public ky0(int i, int i2) {
        he1.OooO(i);
        if (i2 < -1) {
            ra.OooOOO(u7.OooO00o(new byte[]{61, 64, 83, 15, 46, -127, -79, -119, 47, 18, 6, 91, 102, -29}, new byte[]{74, 50, 58, 123, 75, -46, -40, -13}));
            throw null;
        }
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = null;
        this.OooO0oO = -1;
    }

    public void OooO(zt0 zt0Var, int i) {
    }

    @Override // com.cmaster.cloner.pj0
    public final int OooO0OO() {
        int i = this.OooO0o0;
        if (i >= 0) {
            return i;
        }
        sa.OooO0oO(u7.OooO00o(new byte[]{-55, 90, 12, -118, -22, -126, -79, 69, -37, 8, 12, -115, -81, -92, -74, 84, -48, 71, 18, -112}, new byte[]{-66, 40, 101, -2, -113, -47, -40, 63}));
        return 0;
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO0Oo(nq nqVar, q9 q9Var) {
        q9Var.OooO00o(this.OooO0Oo);
        try {
            if (this.OooO0o0 < 0) {
                throw new UnsupportedOperationException(u7.OooO00o(new byte[]{-27, -95, 111, -116, 20, -72, -76, -28, -9, -13, 111, -117, 81, -98, -77, -11, -4, -68, 113, -106}, new byte[]{-110, -45, 6, -8, 113, -21, -35, -98}));
            }
            q9Var.OooO0o0(OooO0o());
            OooOO0O(nqVar, q9Var);
        } catch (RuntimeException e) {
            throw dx.OooO0O0(u7.OooO00o(new byte[]{-99, -8, 126, -38, -127, 92, -89, 45, -109, -95, 34, -60, -99, 92, -91, 47, -109}, new byte[]{-77, -42, 80, -83, -23, 53, -53, 72}) + this, e);
        }
    }

    public final int OooO0o() {
        int i = this.OooO0oO;
        if (i >= 0) {
            return this.OooO0o.OooO0O0(i);
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-89, -52, -82, 37, 25, -92, -61, 109, -89, -34, -24, 47, 25, -92, -61, 104, -90, -59, -65, 56}, new byte[]{-56, -86, -56, 86, 124, -48, -29, 3}));
        return 0;
    }

    public int OooO0o0(ky0 ky0Var) {
        throw new UnsupportedOperationException(u7.OooO00o(new byte[]{-62, 71, 73, -25, 7, -56, 7, -97, -61, 76, 94}, new byte[]{-73, 41, 58, -110, 119, -72, 104, -19}));
    }

    public final String OooO0oO() {
        return "[" + Integer.toHexString(OooO0o()) + ']';
    }

    public final int OooO0oo(zt0 zt0Var, int i) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-118, 112, -35, -44, -41, 81, -117, 120, -59, 38}, new byte[]{-27, 22, -69, -89, -78, 37, -85, 68}));
            return 0;
        }
        if (this.OooO0o != null) {
            ra.OooOOO0(u7.OooO00o(new byte[]{-43, 44, 63, -90, 67, 112, 23, 54, -61, 50, 36, -73, 86, 113, 0}, new byte[]{-76, 64, 77, -61, 34, 20, 110, 22}));
            return 0;
        }
        int i2 = this.OooO0Oo - 1;
        int i3 = (i + i2) & (~i2);
        this.OooO0o = zt0Var;
        this.OooO0oO = i3;
        OooO(zt0Var, i3);
        return i3;
    }

    public final void OooOO0(int i) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{79, 78, -82, -112, -71, -88, 125, 84, 93, 28, -5, -60, -20}, new byte[]{56, 60, -57, -28, -36, -5, 20, 46}));
        } else if (this.OooO0o0 < 0) {
            this.OooO0o0 = i;
        } else {
            sa.OooO0oO(u7.OooO00o(new byte[]{-84, 45, -109, 22, -92, -23, -38, 31, -66, 127, -101, 14, -77, -33, -46, 1, -94, 127, -119, 7, -75}, new byte[]{-37, 95, -6, 98, -63, -70, -77, 101}));
        }
    }

    public abstract void OooOO0O(nq nqVar, q9 q9Var);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ky0 ky0Var = (ky0) obj;
        if (this == ky0Var) {
            return 0;
        }
        wj0 wj0VarOooO0O0 = OooO0O0();
        wj0 wj0VarOooO0O02 = ky0Var.OooO0O0();
        return wj0VarOooO0O0 != wj0VarOooO0O02 ? wj0VarOooO0O0.compareTo(wj0VarOooO0O02) : OooO0o0(ky0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ky0 ky0Var = (ky0) obj;
        return OooO0O0() == ky0Var.OooO0O0() && OooO0o0(ky0Var) == 0;
    }
}
