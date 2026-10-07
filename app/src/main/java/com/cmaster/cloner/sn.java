package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sn {
    public static final sn OooO0Oo;
    public static final sn OooO0o;
    public static final sn OooO0o0;
    public static final /* synthetic */ sn[] OooO0oO;

    static {
        sn snVar = new sn("PREFER_ARGB_8888", 0);
        OooO0Oo = snVar;
        sn snVar2 = new sn("PREFER_RGB_565", 1);
        OooO0o0 = snVar2;
        OooO0oO = new sn[]{snVar, snVar2};
        OooO0o = snVar;
    }

    public static sn valueOf(String str) {
        return (sn) Enum.valueOf(sn.class, str);
    }

    public static sn[] values() {
        return (sn[]) OooO0oO.clone();
    }
}
