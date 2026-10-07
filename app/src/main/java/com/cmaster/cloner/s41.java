package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s41 {
    public static final s41 OooO0Oo;
    public static final s41 OooO0o;
    public static final s41 OooO0o0;
    public static final /* synthetic */ s41[] OooO0oO;

    static {
        s41 s41Var = new s41("DEFAULT", 0);
        OooO0Oo = s41Var;
        s41 s41Var2 = new s41("VERY_LOW", 1);
        OooO0o0 = s41Var2;
        s41 s41Var3 = new s41("HIGHEST", 2);
        OooO0o = s41Var3;
        OooO0oO = new s41[]{s41Var, s41Var2, s41Var3};
    }

    public static s41 valueOf(String str) {
        return (s41) Enum.valueOf(s41.class, str);
    }

    public static s41[] values() {
        return (s41[]) OooO0oO.clone();
    }
}
