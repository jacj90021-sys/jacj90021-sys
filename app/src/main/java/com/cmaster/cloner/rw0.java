package com.cmaster.cloner;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rw0 {
    public static final SparseArray OooO0Oo;
    public static final /* synthetic */ rw0[] OooO0o0;

    /* JADX INFO: Fake field, exist only in values array */
    rw0 EF1;

    static {
        rw0 rw0Var = new rw0("UNKNOWN_MOBILE_SUBTYPE", 0);
        rw0 rw0Var2 = new rw0("GPRS", 1);
        rw0 rw0Var3 = new rw0("EDGE", 2);
        rw0 rw0Var4 = new rw0("UMTS", 3);
        rw0 rw0Var5 = new rw0("CDMA", 4);
        rw0 rw0Var6 = new rw0("EVDO_0", 5);
        rw0 rw0Var7 = new rw0("EVDO_A", 6);
        rw0 rw0Var8 = new rw0("RTT", 7);
        rw0 rw0Var9 = new rw0("HSDPA", 8);
        rw0 rw0Var10 = new rw0("HSUPA", 9);
        rw0 rw0Var11 = new rw0("HSPA", 10);
        rw0 rw0Var12 = new rw0("IDEN", 11);
        rw0 rw0Var13 = new rw0("EVDO_B", 12);
        rw0 rw0Var14 = new rw0("LTE", 13);
        rw0 rw0Var15 = new rw0("EHRPD", 14);
        rw0 rw0Var16 = new rw0("HSPAP", 15);
        rw0 rw0Var17 = new rw0("GSM", 16);
        rw0 rw0Var18 = new rw0("TD_SCDMA", 17);
        rw0 rw0Var19 = new rw0("IWLAN", 18);
        rw0 rw0Var20 = new rw0("LTE_CA", 19);
        OooO0o0 = new rw0[]{rw0Var, rw0Var2, rw0Var3, rw0Var4, rw0Var5, rw0Var6, rw0Var7, rw0Var8, rw0Var9, rw0Var10, rw0Var11, rw0Var12, rw0Var13, rw0Var14, rw0Var15, rw0Var16, rw0Var17, rw0Var18, rw0Var19, rw0Var20, new rw0("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        OooO0Oo = sparseArray;
        sparseArray.put(0, rw0Var);
        sparseArray.put(1, rw0Var2);
        sparseArray.put(2, rw0Var3);
        sparseArray.put(3, rw0Var4);
        sparseArray.put(4, rw0Var5);
        sparseArray.put(5, rw0Var6);
        sparseArray.put(6, rw0Var7);
        sparseArray.put(7, rw0Var8);
        sparseArray.put(8, rw0Var9);
        sparseArray.put(9, rw0Var10);
        sparseArray.put(10, rw0Var11);
        sparseArray.put(11, rw0Var12);
        sparseArray.put(12, rw0Var13);
        sparseArray.put(13, rw0Var14);
        sparseArray.put(14, rw0Var15);
        sparseArray.put(15, rw0Var16);
        sparseArray.put(16, rw0Var17);
        sparseArray.put(17, rw0Var18);
        sparseArray.put(18, rw0Var19);
        sparseArray.put(19, rw0Var20);
    }

    public static rw0 valueOf(String str) {
        return (rw0) Enum.valueOf(rw0.class, str);
    }

    public static rw0[] values() {
        return (rw0[]) OooO0o0.clone();
    }
}
