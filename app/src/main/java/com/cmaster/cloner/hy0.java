package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hy0 {
    public static final hy0 OooO0Oo;
    public static final hy0 OooO0o;
    public static final hy0 OooO0o0;
    public static final /* synthetic */ hy0[] OooO0oO;

    static {
        hy0 hy0Var = new hy0("NO_OP", 0);
        OooO0Oo = hy0Var;
        hy0 hy0Var2 = new hy0("ADD", 1);
        OooO0o0 = hy0Var2;
        hy0 hy0Var3 = new hy0("REMOVE", 2);
        OooO0o = hy0Var3;
        OooO0oO = new hy0[]{hy0Var, hy0Var2, hy0Var3};
    }

    public static hy0 valueOf(String str) {
        return (hy0) Enum.valueOf(hy0.class, str);
    }

    public static hy0[] values() {
        return (hy0[]) OooO0oO.clone();
    }
}
