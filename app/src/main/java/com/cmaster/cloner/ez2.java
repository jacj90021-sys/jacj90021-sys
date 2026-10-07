package com.cmaster.cloner;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ez2 implements Closeable {
    public static final HashMap OooO = new HashMap();
    public int OooO0Oo;
    public long OooO0o;
    public long OooO0o0;
    public long OooO0oO = 2147483647L;
    public long OooO0oo = -2147483648L;

    public ez2(String str) {
    }

    public void OooO0OO() {
        this.OooO0o0 = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void OooO0o(long j) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.OooO0o;
        if (j2 != 0 && jElapsedRealtimeNanos - j2 >= 1000000) {
            this.OooO0Oo = 0;
            this.OooO0o0 = 0L;
            this.OooO0oO = 2147483647L;
            this.OooO0oo = -2147483648L;
        }
        this.OooO0o = jElapsedRealtimeNanos;
        this.OooO0Oo++;
        this.OooO0oO = Math.min(this.OooO0oO, j);
        this.OooO0oo = Math.max(this.OooO0oo, j);
        if (this.OooO0Oo % 50 == 0) {
            Locale locale = Locale.US;
            v03.OooOOo0();
        }
        if (this.OooO0Oo % 500 == 0) {
            this.OooO0Oo = 0;
            this.OooO0o0 = 0L;
            this.OooO0oO = 2147483647L;
            this.OooO0oo = -2147483648L;
        }
    }

    public void OooO0oo(long j) {
        OooO0o((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.OooO0o0;
        if (j != 0) {
            OooO0oo(j);
        } else {
            qa.OooO0o("Did you forget to call start()?");
        }
    }
}
