package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f82 {
    public final String[] OooO00o;
    public final double[] OooO0O0;
    public final double[] OooO0OO;
    public final int[] OooO0Oo;
    public int OooO0o0;

    public f82(hx2 hx2Var) {
        ArrayList arrayList = (ArrayList) hx2Var.OooO0o;
        int size = arrayList.size();
        this.OooO00o = (String[]) ((ArrayList) hx2Var.OooO0o0).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.OooO0O0 = dArr;
        ArrayList arrayList2 = (ArrayList) hx2Var.OooO0oO;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            dArr2[i2] = ((Double) arrayList2.get(i2)).doubleValue();
        }
        this.OooO0OO = dArr2;
        this.OooO0Oo = new int[size];
        this.OooO0o0 = 0;
    }
}
