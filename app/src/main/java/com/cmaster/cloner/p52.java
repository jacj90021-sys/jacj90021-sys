package com.cmaster.cloner;

import android.os.SystemClock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p52 {
    public final /* synthetic */ int OooO00o;

    public final long OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
