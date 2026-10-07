package com.cmaster.cloner;

import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ut0 extends ls0 {
    @Override // com.cmaster.cloner.ls0
    public final String OooO() {
        return u7.OooO00o(new byte[]{83, -120, 118, -21, 5, 80, -19, -94, 91}, new byte[]{35, -6, 25, -97, 106, 15, -124, -58});
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        nqVar.OooO0o.OooOOo(this.OooO0o0);
        nqVar.OooO0o0.OooOOo0(this.OooO0o.OooO0o0.OooO0Oo);
        o51 o51Var = nqVar.OooO0oO;
        p51 p51Var = ((jl) this.OooO0o).OooO0o;
        synchronized (o51Var) {
            if (p51Var == null) {
                throw new NullPointerException(u7.OooO00o(new byte[]{91, 94, -55, -53, -85, 41, 32, 63, 78, 12, -101, -126, -28, 51, 44, 35, 71}, new byte[]{43, 44, -90, -65, -60, 93, 89, 79}));
            }
            o51Var.OooO0oo();
            if (((n51) ((TreeMap) o51Var.OooO0oO).get(p51Var)) == null) {
                ((TreeMap) o51Var.OooO0oO).put(p51Var, new n51(p51Var));
            }
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOO0o;
    }

    @Override // com.cmaster.cloner.ls0
    public final int OooO0oo(nq nqVar) {
        o51 o51Var = nqVar.OooO0oO;
        p51 p51Var = ((jl) this.OooO0o).OooO0o;
        if (p51Var == null) {
            o51Var.getClass();
            qa.OooOOO0(u7.OooO00o(new byte[]{-80, -9, -30, 22, -60, -15, 39, -73, -91, -91, -80, 95, -117, -21, 43, -85, -84}, new byte[]{-64, -123, -115, 98, -85, -123, 94, -57}));
            return 0;
        }
        o51Var.OooO0oO();
        n51 n51Var = (n51) ((TreeMap) o51Var.OooO0oO).get(p51Var);
        if (n51Var != null) {
            return n51Var.OooO0o0();
        }
        ra.OooOOO(u7.OooO00o(new byte[]{97, 78, -26, -42, -128, 25, 77, -61, 107}, new byte[]{15, 33, -110, -10, -26, 118, 56, -83}));
        return 0;
    }
}
