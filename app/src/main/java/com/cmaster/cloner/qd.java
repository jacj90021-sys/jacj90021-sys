package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qd extends tq1 {
    public final TreeMap OooO0o;
    public ArrayList OooO0oO;

    public qd(nq nqVar) {
        super(u7.OooO00o(new byte[]{-24, 72, -90, -36, -85, -81, -7, -51, -19, 87}, new byte[]{-117, 36, -57, -81, -40, -16, -99, -88}), nqVar, 4);
        this.OooO0o = new TreeMap();
        this.OooO0oO = null;
    }

    @Override // com.cmaster.cloner.he1
    public final Collection OooO0Oo() {
        ArrayList arrayList = this.OooO0oO;
        return arrayList != null ? arrayList : this.OooO0o.values();
    }

    public final int OooOOO(vp1 vp1Var, int i, int i2) {
        pd pdVar = (pd) this.OooO0o.get(vp1Var);
        if (pdVar == null || pdVar.OooO0Oo >= 0) {
            return i;
        }
        if (i2 < 0) {
            qa.OooOO0O(u7.OooO00o(new byte[]{41, -104, 11, 35, -74, -18, -85, 7, 56, -105, 31, 60, -92, -68, -95, 26, 51, -44, 29, 57, -79, -90, -24}, new byte[]{74, -12, 106, 80, -59, -50, -56, 110}), vp1Var);
            return 0;
        }
        int i3 = i2 - 1;
        nl nlVar = pdVar.OooO0oO;
        if (nlVar != null) {
            i = OooOOO(nlVar.OooO0Oo, i, i3);
        }
        cq1 cq1Var = pdVar.OooO0oo;
        aq1 aq1Var = cq1Var == null ? bj1.OooO0o : cq1Var.OooO0oo;
        int length = ((h00) aq1Var).OooO0o0.length;
        for (int i4 = 0; i4 < length; i4++) {
            i = OooOOO(aq1Var.getType(i4), i, i3);
        }
        pdVar.OooO0oO(i);
        this.OooO0oO.add(pdVar);
        return i + 1;
    }

    @Override // com.cmaster.cloner.tq1
    public final void OooOOO0() {
        TreeMap treeMap = this.OooO0o;
        int size = treeMap.size();
        this.OooO0oO = new ArrayList(size);
        Iterator it = treeMap.keySet().iterator();
        int iOooOOO = 0;
        while (it.hasNext()) {
            iOooOOO = OooOOO((vp1) it.next(), iOooOOO, size - iOooOOO);
        }
    }
}
