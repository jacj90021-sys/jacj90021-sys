package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r41 {
    public static final r41 OooO0Oo;
    public static final /* synthetic */ r41[] OooO0o0;

    /* JADX INFO: Fake field, exist only in values array */
    r41 EF0;

    static {
        r41 r41Var = new r41("SRGB", 0);
        r41 r41Var2 = new r41("DISPLAY_P3", 1);
        OooO0Oo = r41Var2;
        OooO0o0 = new r41[]{r41Var, r41Var2};
    }

    public static r41 valueOf(String str) {
        return (r41) Enum.valueOf(r41.class, str);
    }

    public static r41[] values() {
        return (r41[]) OooO0o0.clone();
    }
}
