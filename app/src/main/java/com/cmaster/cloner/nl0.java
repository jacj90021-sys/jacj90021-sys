package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nl0 {
    public static final /* synthetic */ nl0[] OooO0Oo = {new nl0("SYNCHRONIZED", 0), new nl0("PUBLICATION", 1), new nl0("NONE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    nl0 EF5;

    public static nl0 valueOf(String str) {
        return (nl0) Enum.valueOf(nl0.class, str);
    }

    public static nl0[] values() {
        return (nl0[]) OooO0Oo.clone();
    }
}
