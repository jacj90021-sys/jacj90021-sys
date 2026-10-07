package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO000Oo {
    public static final oO000Oo OooO0Oo;
    public static final /* synthetic */ oO000Oo[] OooO0o;
    public static final oO000Oo OooO0o0;

    static {
        oO000Oo oo000oo = new oO000Oo("NOT_READY", 0);
        OooO0Oo = oo000oo;
        oO000Oo oo000oo2 = new oO000Oo("READY", 1);
        OooO0o0 = oo000oo2;
        OooO0o = new oO000Oo[]{oo000oo, oo000oo2};
    }

    public static oO000Oo valueOf(String str) {
        return (oO000Oo) Enum.valueOf(oO000Oo.class, str);
    }

    public static oO000Oo[] values() {
        return (oO000Oo[]) OooO0o.clone();
    }
}
