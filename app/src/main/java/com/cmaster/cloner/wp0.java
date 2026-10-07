package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wp0 extends ky0 {
    public final he1 OooO;
    public final wj0 OooO0oo;
    public final pj0 OooOO0;
    public final int OooOO0O;

    public wp0(wj0 wj0Var, he1 he1Var, pj0 pj0Var, pj0 pj0Var2, int i) {
        super(4, 12);
        if (wj0Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-21, 95, -112, -115, -4, -69, 13, 68, -15, 83, -116, -124}, new byte[]{-97, 38, -32, -24, -36, -122, 48, 100}));
            throw null;
        }
        if (pj0Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{78, 113, -105, -60, 48, 13, -124, 109, 69, 56, -40, -118, 100, 42, -123, 100, 68}, new byte[]{40, 24, -27, -73, 68, 68, -16, 8}));
            throw null;
        }
        if (pj0Var2 == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{63, 90, -115, -34, 122, -82, 109, 16, 115, 6, -61, -118, 93, -81, 100, 17}, new byte[]{83, 59, -2, -86, 51, -38, 8, 125}));
            throw null;
        }
        if (i <= 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-71, 98, -36, 20, 89, -91, -119, 8, -92, 54, -123, 68, 58, -6}, new byte[]{-48, 22, -71, 121, 26, -54, -4, 102}));
            throw null;
        }
        this.OooO0oo = wj0Var;
        this.OooO = he1Var;
        this.OooOO0 = pj0Var;
        this.OooOO0O = i;
    }

    public static void OooOO0o(he1[] he1VarArr, zt0 zt0Var) {
        if (he1VarArr == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-69, -63, 92, 107, 9, -16, 105, -52, -24, -103, 2, 63, 14, -22, 107, -45}, new byte[]{-56, -92, 63, 31, 96, -97, 7, -65}));
            return;
        }
        if (zt0Var.OooO0o.size() != 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-91, -82, -123, -87, 68, 108, -7, 43, -89, -95, -37, -109, 85, 106, -32, 49, -32, -26, -37, -119, 72, 117, -24, 106, -31, -17, -44, -57, 1, 63}, new byte[]{-56, -49, -11, -6, 33, 15, -115, 66}));
            return;
        }
        ArrayList arrayList = new ArrayList(50);
        for (he1 he1Var : he1VarArr) {
            int i = 0;
            wj0 wj0Var = null;
            pj0 pj0Var = null;
            pj0 pj0Var2 = null;
            for (pj0 pj0Var3 : he1Var.OooO0Oo()) {
                wj0 wj0VarOooO0O0 = pj0Var3.OooO0O0();
                if (wj0VarOooO0O0 != wj0Var) {
                    if (i != 0) {
                        arrayList.add(new wp0(wj0Var, he1Var, pj0Var, pj0Var2, i));
                    }
                    i = 0;
                    pj0Var = pj0Var3;
                    wj0Var = wj0VarOooO0O0;
                }
                i++;
                pj0Var2 = pj0Var3;
            }
            if (i != 0) {
                arrayList.add(new wp0(wj0Var, he1Var, pj0Var, pj0Var2, i));
            } else if (he1Var == zt0Var) {
                arrayList.add(new wp0(zt0Var));
            }
        }
        zt0Var.OooOOO0(new uq1(wj0.OooOOOo, arrayList));
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOoOO;
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooOO0O(nq nqVar, q9 q9Var) {
        wj0 wj0Var = this.OooO0oo;
        int i = wj0Var.OooO0Oo;
        pj0 pj0Var = this.OooOO0;
        he1 he1Var = this.OooO;
        int iOooO0OO = pj0Var == null ? he1Var.OooO0OO() : he1Var.OooO00o(pj0Var);
        boolean zOooO0Oo = q9Var.OooO0Oo();
        int i2 = this.OooOO0O;
        if (zOooO0Oo) {
            q9Var.OooO0O0(0, OooO0oO() + ' ' + wj0Var.OooO0o0 + u7.OooO00o(new byte[]{-81, 12, -77, -4}, new byte[]{-113, 97, -46, -116, -94, 114, 74, -19}));
            q9Var.OooO0O0(2, u7.OooO00o(new byte[]{-74, 79, -38, -28, 112, 105, 59, 35, -74, 79}, new byte[]{-106, 111, -82, -99, 0, 12, 1, 3}) + js2.OooO0O0(i) + u7.OooO00o(new byte[]{-111, -51, -28, -9}, new byte[]{-79, -30, -53, -41, -17, -83, 40, -55}) + wj0Var.toString());
            q9Var.OooO0O0(2, u7.OooO00o(new byte[]{-64, 40, -27, 28, 28, 9, 99, 110, -38, 40, -96}, new byte[]{-32, 8, -112, 114, 105, 122, 6, 10}));
            rj.OooOO0O(i2, u7.OooO00o(new byte[]{-43, -34, -50, -78, 72, 91, -125, 113, -43, -34}, new byte[]{-11, -2, -67, -37, 50, 62, -71, 81}), q9Var, 4);
            rj.OooOO0O(iOooO0OO, u7.OooO00o(new byte[]{-55, 74, 57, 89, 12, -64, -19, -65, -45, 74}, new byte[]{-23, 106, 86, 63, 106, -77, -120, -53}), q9Var, 4);
        }
        q9Var.OooOO0o(i);
        q9Var.OooOO0o(0);
        q9Var.OooOO0O(i2);
        q9Var.OooOO0O(iOooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(wp0.class.getName());
        sb.append('{');
        sb.append(this.OooO.toString());
        sb.append(' ');
        sb.append(this.OooO0oo.OooO0o);
        sb.append('}');
        return sb.toString();
    }

    public wp0(zt0 zt0Var) {
        super(4, 12);
        if (zt0Var != null) {
            this.OooO0oo = wj0.OooOOOo;
            this.OooO = zt0Var;
            this.OooOO0 = null;
            this.OooOO0O = 1;
            return;
        }
        qa.OooOOO0(u7.OooO00o(new byte[]{-110, -105, -11, 83, 96, -85, 83, -103, -36, -49, -74, 73, 124, -88, 81}, new byte[]{-31, -14, -106, 39, 9, -60, 61, -71}));
        throw null;
    }
}
