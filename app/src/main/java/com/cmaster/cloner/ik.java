package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ik {
    public static final ik OooO0Oo;
    public static final /* synthetic */ ik[] OooO0o;
    public static final ik OooO0o0;

    static {
        ik ikVar = new ik("DEFAULT", 0);
        OooO0Oo = ikVar;
        ik ikVar2 = new ik("LAZY", 1);
        ik ikVar3 = new ik("ATOMIC", 2);
        ik ikVar4 = new ik("UNDISPATCHED", 3);
        OooO0o0 = ikVar4;
        OooO0o = new ik[]{ikVar, ikVar2, ikVar3, ikVar4};
    }

    public static ik valueOf(String str) {
        return (ik) Enum.valueOf(ik.class, str);
    }

    public static ik[] values() {
        return (ik[]) OooO0o.clone();
    }
}
