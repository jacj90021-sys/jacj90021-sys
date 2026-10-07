package com.cmaster.cloner;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z51 {
    public static final z51 OooO0Oo;
    public static final /* synthetic */ z51[] OooO0o0;

    static {
        z51 z51Var = new z51("DEFAULT", 0);
        OooO0Oo = z51Var;
        z51 z51Var2 = new z51("UNMETERED_ONLY", 1);
        z51 z51Var3 = new z51("UNMETERED_OR_DAILY", 2);
        z51 z51Var4 = new z51("FAST_IF_RADIO_AWAKE", 3);
        z51 z51Var5 = new z51("NEVER", 4);
        z51 z51Var6 = new z51("UNRECOGNIZED", 5);
        OooO0o0 = new z51[]{z51Var, z51Var2, z51Var3, z51Var4, z51Var5, z51Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, z51Var);
        sparseArray.put(1, z51Var2);
        sparseArray.put(2, z51Var3);
        sparseArray.put(3, z51Var4);
        sparseArray.put(4, z51Var5);
        sparseArray.put(-1, z51Var6);
    }

    public static z51 valueOf(String str) {
        return (z51) Enum.valueOf(z51.class, str);
    }

    public static z51[] values() {
        return (z51[]) OooO0o0.clone();
    }
}
