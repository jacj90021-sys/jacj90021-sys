package com.cmaster.cloner;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fm1 {
    public static final String OooO00o;
    public static final long OooO0O0;
    public static final int OooO0OO;
    public static final int OooO0Oo;
    public static final vu0 OooO0o;
    public static final long OooO0o0;
    public static final ep0 OooO0oO;
    public static final ep0 OooO0oo;

    static {
        String property;
        int i = kl1.OooO00o;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        OooO00o = property;
        OooO0O0 = g43.OooO00o("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = kl1.OooO00o;
        if (i2 < 2) {
            i2 = 2;
        }
        OooO0OO = g43.OooO0O0(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        OooO0Oo = g43.OooO0O0(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        OooO0o0 = TimeUnit.SECONDS.toNanos(g43.OooO00o("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        OooO0o = vu0.OooO0o0;
        OooO0oO = new ep0(0);
        OooO0oo = new ep0(1);
    }
}
