package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ko1 {
    public static final ko1 OooO0Oo;
    public static final /* synthetic */ ko1[] OooO0o;
    public static final ko1 OooO0o0;

    static {
        ko1 ko1Var = new ko1("DEFERRED", 0);
        OooO0Oo = ko1Var;
        ko1 ko1Var2 = new ko1("IMMEDIATE", 1);
        OooO0o0 = ko1Var2;
        OooO0o = new ko1[]{ko1Var, ko1Var2, new ko1("EXCLUSIVE", 2)};
    }

    public static ko1 valueOf(String str) {
        return (ko1) Enum.valueOf(ko1.class, str);
    }

    public static ko1[] values() {
        return (ko1[]) OooO0o.clone();
    }
}
