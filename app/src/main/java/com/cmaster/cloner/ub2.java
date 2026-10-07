package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ub2 {
    public static final ub2 OooO0Oo;
    public static final /* synthetic */ ub2[] OooO0o0;

    /* JADX INFO: Fake field, exist only in values array */
    ub2 EF0;

    static {
        ub2 ub2Var = new ub2("DEBUG_PARAM_UNKNOWN", 0);
        ub2 ub2Var2 = new ub2("ALWAYS_SHOW", 1);
        ub2 ub2Var3 = new ub2("GEO_OVERRIDE_EEA", 2);
        ub2 ub2Var4 = new ub2("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        ub2 ub2Var5 = new ub2("GEO_OVERRIDE_OTHER", 4);
        ub2 ub2Var6 = new ub2("GEO_OVERRIDE_NON_EEA", 5);
        ub2 ub2Var7 = new ub2("PREVIEWING_DEBUG_MESSAGES", 6);
        OooO0Oo = ub2Var7;
        OooO0o0 = new ub2[]{ub2Var, ub2Var2, ub2Var3, ub2Var4, ub2Var5, ub2Var6, ub2Var7};
    }

    public static ub2[] values() {
        return (ub2[]) OooO0o0.clone();
    }
}
