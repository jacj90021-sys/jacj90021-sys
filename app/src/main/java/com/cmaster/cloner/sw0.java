package com.cmaster.cloner;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sw0 {
    public static final SparseArray OooO0Oo;
    public static final /* synthetic */ sw0[] OooO0o0;

    /* JADX INFO: Fake field, exist only in values array */
    sw0 EF1;

    static {
        sw0 sw0Var = new sw0("MOBILE", 0);
        sw0 sw0Var2 = new sw0("WIFI", 1);
        sw0 sw0Var3 = new sw0("MOBILE_MMS", 2);
        sw0 sw0Var4 = new sw0("MOBILE_SUPL", 3);
        sw0 sw0Var5 = new sw0("MOBILE_DUN", 4);
        sw0 sw0Var6 = new sw0("MOBILE_HIPRI", 5);
        sw0 sw0Var7 = new sw0("WIMAX", 6);
        sw0 sw0Var8 = new sw0("BLUETOOTH", 7);
        sw0 sw0Var9 = new sw0("DUMMY", 8);
        sw0 sw0Var10 = new sw0("ETHERNET", 9);
        sw0 sw0Var11 = new sw0("MOBILE_FOTA", 10);
        sw0 sw0Var12 = new sw0("MOBILE_IMS", 11);
        sw0 sw0Var13 = new sw0("MOBILE_CBS", 12);
        sw0 sw0Var14 = new sw0("WIFI_P2P", 13);
        sw0 sw0Var15 = new sw0("MOBILE_IA", 14);
        sw0 sw0Var16 = new sw0("MOBILE_EMERGENCY", 15);
        sw0 sw0Var17 = new sw0("PROXY", 16);
        sw0 sw0Var18 = new sw0("VPN", 17);
        sw0 sw0Var19 = new sw0("NONE", 18);
        OooO0o0 = new sw0[]{sw0Var, sw0Var2, sw0Var3, sw0Var4, sw0Var5, sw0Var6, sw0Var7, sw0Var8, sw0Var9, sw0Var10, sw0Var11, sw0Var12, sw0Var13, sw0Var14, sw0Var15, sw0Var16, sw0Var17, sw0Var18, sw0Var19};
        SparseArray sparseArray = new SparseArray();
        OooO0Oo = sparseArray;
        sparseArray.put(0, sw0Var);
        sparseArray.put(1, sw0Var2);
        sparseArray.put(2, sw0Var3);
        sparseArray.put(3, sw0Var4);
        sparseArray.put(4, sw0Var5);
        sparseArray.put(5, sw0Var6);
        sparseArray.put(6, sw0Var7);
        sparseArray.put(7, sw0Var8);
        sparseArray.put(8, sw0Var9);
        sparseArray.put(9, sw0Var10);
        sparseArray.put(10, sw0Var11);
        sparseArray.put(11, sw0Var12);
        sparseArray.put(12, sw0Var13);
        sparseArray.put(13, sw0Var14);
        sparseArray.put(14, sw0Var15);
        sparseArray.put(15, sw0Var16);
        sparseArray.put(16, sw0Var17);
        sparseArray.put(17, sw0Var18);
        sparseArray.put(-1, sw0Var19);
    }

    public static sw0 valueOf(String str) {
        return (sw0) Enum.valueOf(sw0.class, str);
    }

    public static sw0[] values() {
        return (sw0[]) OooO0o0.clone();
    }
}
