package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pd1 {
    public static final pd1 OooO0Oo;
    public static final pd1 OooO0o;
    public static final pd1 OooO0o0;
    public static final /* synthetic */ pd1[] OooO0oO;

    static {
        pd1 pd1Var = new pd1("NETWORK_UNMETERED", 0);
        OooO0Oo = pd1Var;
        pd1 pd1Var2 = new pd1("DEVICE_IDLE", 1);
        OooO0o0 = pd1Var2;
        pd1 pd1Var3 = new pd1("DEVICE_CHARGING", 2);
        OooO0o = pd1Var3;
        OooO0oO = new pd1[]{pd1Var, pd1Var2, pd1Var3};
    }

    public static pd1 valueOf(String str) {
        return (pd1) Enum.valueOf(pd1.class, str);
    }

    public static pd1[] values() {
        return (pd1[]) OooO0oO.clone();
    }
}
