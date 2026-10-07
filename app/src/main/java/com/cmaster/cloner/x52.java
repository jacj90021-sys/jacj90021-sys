package com.cmaster.cloner;

import android.os.SystemClock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class x52 {
    public static final p52 OooO00o;

    static {
        p52 p52Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            p52Var = new p52(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            p52Var = new p52(1);
        }
        OooO00o = p52Var;
    }
}
