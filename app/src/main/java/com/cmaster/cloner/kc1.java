package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kc1 {
    public ly1 OooO00o;
    public ArrayList OooO0O0;

    public static long OooO00o(up upVar, long j) {
        ly1 ly1Var = upVar.OooO0Oo;
        ArrayList arrayList = upVar.OooOO0O;
        if (ly1Var instanceof p70) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            qp qpVar = (qp) arrayList.get(i);
            if (qpVar instanceof up) {
                up upVar2 = (up) qpVar;
                if (upVar2.OooO0Oo != ly1Var) {
                    jMin = Math.min(jMin, OooO00o(upVar2, upVar2.OooO0o + j));
                }
            }
        }
        up upVar3 = ly1Var.OooO;
        up upVar4 = ly1Var.OooO0oo;
        if (upVar != upVar3) {
            return jMin;
        }
        long jOooOO0 = j - ly1Var.OooOO0();
        return Math.min(Math.min(jMin, OooO00o(upVar4, jOooOO0)), jOooOO0 - upVar4.OooO0o);
    }

    public static long OooO0O0(up upVar, long j) {
        ly1 ly1Var = upVar.OooO0Oo;
        ArrayList arrayList = upVar.OooOO0O;
        if (ly1Var instanceof p70) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            qp qpVar = (qp) arrayList.get(i);
            if (qpVar instanceof up) {
                up upVar2 = (up) qpVar;
                if (upVar2.OooO0Oo != ly1Var) {
                    jMax = Math.max(jMax, OooO0O0(upVar2, upVar2.OooO0o + j));
                }
            }
        }
        up upVar3 = ly1Var.OooO0oo;
        up upVar4 = ly1Var.OooO;
        if (upVar != upVar3) {
            return jMax;
        }
        long jOooOO0 = ly1Var.OooOO0() + j;
        return Math.max(Math.max(jMax, OooO0O0(upVar4, jOooOO0)), jOooOO0 - upVar4.OooO0o);
    }
}
