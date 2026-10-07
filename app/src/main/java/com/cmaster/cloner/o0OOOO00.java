package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public enum o0OOOO00 {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    public final int OooO0Oo;

    o0OOOO00(int i) {
        this.OooO0Oo = i;
    }

    public static o0OOOO00 OooO00o(int i) {
        for (o0OOOO00 o0oooo00 : values()) {
            if (o0oooo00.OooO0Oo == i) {
                return o0oooo00;
            }
        }
        return null;
    }
}
