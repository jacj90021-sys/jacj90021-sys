package com.cmaster.cloner;

import java.util.Collection;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vt0 extends ms0 {
    public final TreeMap OooO0o;

    public vt0(nq nqVar) {
        super(u7.OooO00o(new byte[]{56, 66, -75, 58, -72, 4, 64, -1, 49, 84}, new byte[]{85, 39, -63, 82, -41, 96, 31, -106}), nqVar, 4);
        this.OooO0o = new TreeMap();
    }

    @Override // com.cmaster.cloner.he1
    public final Collection OooO0Oo() {
        return this.OooO0o.values();
    }

    public final int OooOOO(jl jlVar) {
        if (jlVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{91, -64, -76, -31, -10, 80, -109, 118, 92, -55, -66}, new byte[]{41, -91, -46, -63, -53, 109, -77, 24}));
            return 0;
        }
        OooO0oO();
        ut0 ut0Var = (ut0) this.OooO0o.get(jlVar);
        if (ut0Var != null) {
            return ut0Var.OooO0o0();
        }
        ra.OooOOO(u7.OooO00o(new byte[]{-125, -6, -128, 23, 12, -92, -93, 58, -119}, new byte[]{-19, -107, -12, 55, 106, -53, -42, 84}));
        return 0;
    }

    public final synchronized void OooOOOO(jl jlVar) {
        if (jlVar == null) {
            throw new NullPointerException(u7.OooO00o(new byte[]{-81, -109, -55, 59, -94, 68, 40, 63, -1, -42, -45, 38, -95, 76}, new byte[]{-62, -10, -67, 83, -51, 32, 8, 2}));
        }
        OooO0oo();
        if (((ut0) this.OooO0o.get(jlVar)) == null) {
            this.OooO0o.put(jlVar, new ut0(jlVar));
        }
    }
}
