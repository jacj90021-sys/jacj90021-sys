package com.cmaster.cloner;

import java.util.Collection;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mz extends ms0 {
    public final TreeMap OooO0o;

    public mz(nq nqVar) {
        super(u7.OooO00o(new byte[]{-6, 125, -32, 98, 87, -126, 42, 36, -17}, new byte[]{-100, 20, -123, 14, 51, -35, 67, 64}), nqVar, 4);
        this.OooO0o = new TreeMap();
    }

    @Override // com.cmaster.cloner.he1
    public final Collection OooO0Oo() {
        return this.OooO0o.values();
    }

    public final int OooOOO(yk ykVar) {
        if (ykVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-7, -72, -38, 16, 20, 100, -112, -65, -2, -79, -48}, new byte[]{-117, -35, -68, 48, 41, 89, -80, -47}));
            return 0;
        }
        OooO0oO();
        lz lzVar = (lz) this.OooO0o.get(ykVar);
        if (lzVar != null) {
            return lzVar.OooO0o0();
        }
        ra.OooOOO(u7.OooO00o(new byte[]{-11, 108, 86, 86, 1, -27, 50, -117, -1}, new byte[]{-101, 3, 34, 118, 103, -118, 71, -27}));
        return 0;
    }

    public final synchronized void OooOOOO(yk ykVar) {
        if (ykVar == null) {
            throw new NullPointerException(u7.OooO00o(new byte[]{77, -79, -38, -89, -77, 94, -46, -30, 11, -74, -54, -89, -69}, new byte[]{43, -40, -65, -53, -41, 126, -17, -33}));
        }
        OooO0oo();
        if (((lz) this.OooO0o.get(ykVar)) == null) {
            this.OooO0o.put(ykVar, new lz(ykVar));
        }
    }
}
