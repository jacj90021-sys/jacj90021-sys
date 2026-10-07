package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sb1 {
    public static final sb1 OooO0Oo;
    public static final sb1 OooO0o;
    public static final sb1 OooO0o0;
    public static final /* synthetic */ sb1[] OooO0oO;

    static {
        sb1 sb1Var = new sb1("AUTOMATIC", 0);
        OooO0Oo = sb1Var;
        sb1 sb1Var2 = new sb1("TRUNCATE", 1);
        OooO0o0 = sb1Var2;
        sb1 sb1Var3 = new sb1("WRITE_AHEAD_LOGGING", 2);
        OooO0o = sb1Var3;
        OooO0oO = new sb1[]{sb1Var, sb1Var2, sb1Var3};
    }

    public static sb1 valueOf(String str) {
        return (sb1) Enum.valueOf(sb1.class, str);
    }

    public static sb1[] values() {
        return (sb1[]) OooO0oO.clone();
    }
}
