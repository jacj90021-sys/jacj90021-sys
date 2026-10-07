package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dk {
    public static final /* synthetic */ dk[] OooO;
    public static final dk OooO0Oo;
    public static final dk OooO0o;
    public static final dk OooO0o0;
    public static final dk OooO0oO;
    public static final dk OooO0oo;

    static {
        dk dkVar = new dk("CPU_ACQUIRED", 0);
        OooO0Oo = dkVar;
        dk dkVar2 = new dk("BLOCKING", 1);
        OooO0o0 = dkVar2;
        dk dkVar3 = new dk("PARKING", 2);
        OooO0o = dkVar3;
        dk dkVar4 = new dk("DORMANT", 3);
        OooO0oO = dkVar4;
        dk dkVar5 = new dk("TERMINATED", 4);
        OooO0oo = dkVar5;
        OooO = new dk[]{dkVar, dkVar2, dkVar3, dkVar4, dkVar5};
    }

    public static dk valueOf(String str) {
        return (dk) Enum.valueOf(dk.class, str);
    }

    public static dk[] values() {
        return (dk[]) OooO.clone();
    }
}
