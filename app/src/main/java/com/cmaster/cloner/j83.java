package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j83 {
    public static final j83 OooO0Oo;
    public static final j83 OooO0o;
    public static final j83 OooO0o0;
    public static final j83 OooO0oO;
    public static final /* synthetic */ j83[] OooO0oo;

    static {
        j83 j83Var = new j83("SUCCESS", 0);
        OooO0Oo = j83Var;
        j83 j83Var2 = new j83("PERMANENT_FAILURE", 1);
        OooO0o0 = j83Var2;
        j83 j83Var3 = new j83("RETRIABLE_FAILURE", 2);
        OooO0o = j83Var3;
        j83 j83Var4 = new j83("BUFFERED", 3);
        OooO0oO = j83Var4;
        OooO0oo = new j83[]{j83Var, j83Var2, j83Var3, j83Var4};
    }

    public static j83[] values() {
        return (j83[]) OooO0oo.clone();
    }
}
