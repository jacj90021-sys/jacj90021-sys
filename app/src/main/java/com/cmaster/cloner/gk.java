package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gk {
    public static final gk OooO0Oo;
    public static final /* synthetic */ gk[] OooO0o0;

    static {
        gk gkVar = new gk("COROUTINE_SUSPENDED", 0);
        OooO0Oo = gkVar;
        OooO0o0 = new gk[]{gkVar, new gk("UNDECIDED", 1), new gk("RESUMED", 2)};
    }

    public static gk valueOf(String str) {
        return (gk) Enum.valueOf(gk.class, str);
    }

    public static gk[] values() {
        return (gk[]) OooO0o0.clone();
    }
}
