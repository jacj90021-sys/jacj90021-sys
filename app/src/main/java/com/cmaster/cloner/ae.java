package com.cmaster.cloner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ae {
    public static final ae OooO0Oo;
    public static final /* synthetic */ ae[] OooO0o0;

    /* JADX INFO: Fake field, exist only in values array */
    ae EF0;

    static {
        ae aeVar = new ae("UNKNOWN", 0);
        ae aeVar2 = new ae("ANDROID_FIREBASE", 1);
        OooO0Oo = aeVar2;
        OooO0o0 = new ae[]{aeVar, aeVar2};
    }

    public static ae valueOf(String str) {
        return (ae) Enum.valueOf(ae.class, str);
    }

    public static ae[] values() {
        return (ae[]) OooO0o0.clone();
    }
}
