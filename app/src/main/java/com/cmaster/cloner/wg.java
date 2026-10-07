package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wg {
    public static final wg OooO0Oo;
    public static final /* synthetic */ wg[] OooO0o0;

    /* JADX INFO: Fake field, exist only in values array */
    wg EF0;

    static {
        wg wgVar = new wg("ALWAYS_OVERRIDE", 0);
        wg wgVar2 = new wg("HIGH_PRIORITY_REQUIRED", 1);
        wg wgVar3 = new wg("REQUIRED", 2);
        wg wgVar4 = new wg("OPTIONAL", 3);
        OooO0Oo = wgVar4;
        OooO0o0 = new wg[]{wgVar, wgVar2, wgVar3, wgVar4};
    }

    public static wg valueOf(String str) {
        return (wg) Enum.valueOf(wg.class, str);
    }

    public static wg[] values() {
        return (wg[]) OooO0o0.clone();
    }
}
