package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f30 {
    public static final /* synthetic */ f30[] OooO;
    public static final f30 OooO0Oo;
    public static final f30 OooO0o;
    public static final f30 OooO0o0;
    public static final f30 OooO0oO;
    public static final f30 OooO0oo;

    static {
        f30 f30Var = new f30("ON_CONFIGURE", 0);
        OooO0Oo = f30Var;
        f30 f30Var2 = new f30("ON_CREATE", 1);
        OooO0o0 = f30Var2;
        f30 f30Var3 = new f30("ON_UPGRADE", 2);
        OooO0o = f30Var3;
        f30 f30Var4 = new f30("ON_DOWNGRADE", 3);
        OooO0oO = f30Var4;
        f30 f30Var5 = new f30("ON_OPEN", 4);
        OooO0oo = f30Var5;
        OooO = new f30[]{f30Var, f30Var2, f30Var3, f30Var4, f30Var5};
    }

    public static f30 valueOf(String str) {
        return (f30) Enum.valueOf(f30.class, str);
    }

    public static f30[] values() {
        return (f30[]) OooO.clone();
    }
}
