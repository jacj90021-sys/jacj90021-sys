package com.cmaster.cloner;

import android.util.SparseArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rt0 {
    public final SparseArray OooO00o;
    public nq1 OooO0O0;

    public rt0(int i) {
        this.OooO00o = new SparseArray(i);
    }

    public final void OooO00o(nq1 nq1Var, int i, int i2) {
        int iOooO00o = nq1Var.OooO00o(i);
        SparseArray sparseArray = this.OooO00o;
        rt0 rt0Var = sparseArray == null ? null : (rt0) sparseArray.get(iOooO00o);
        if (rt0Var == null) {
            rt0Var = new rt0(1);
            sparseArray.put(nq1Var.OooO00o(i), rt0Var);
        }
        if (i2 > i) {
            rt0Var.OooO00o(nq1Var, i + 1, i2);
        } else {
            rt0Var.OooO0O0 = nq1Var;
        }
    }
}
