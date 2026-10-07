package com.cmaster.cloner;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oq2 {
    public static final long OooO00o(long j) {
        long j2 = (j << 1) + 1;
        int i = vt.OooO0o;
        int i2 = wt.OooO00o;
        return j2;
    }

    public static final long OooO0O0(long j, xt xtVar) {
        TimeUnit timeUnit = xtVar.OooO0Oo;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) > j || j > jConvert) {
            return OooO00o(hy2.OooO00o(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long jConvert2 = timeUnit2.convert(j, timeUnit) << 1;
        int i = vt.OooO0o;
        int i2 = wt.OooO00o;
        return jConvert2;
    }
}
