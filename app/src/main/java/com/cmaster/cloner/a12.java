package com.cmaster.cloner;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a12 {
    public static final String OooO0o0 = ep0.OooO("WorkTimer");
    public final ScheduledExecutorService OooO00o;
    public final HashMap OooO0O0;
    public final HashMap OooO0OO;
    public final Object OooO0Oo;

    public a12() {
        y02 y02Var = new y02();
        y02Var.OooO00o = 0;
        this.OooO0O0 = new HashMap();
        this.OooO0OO = new HashMap();
        this.OooO0Oo = new Object();
        this.OooO00o = Executors.newSingleThreadScheduledExecutor(y02Var);
    }

    public final void OooO00o(String str, jp jpVar) {
        synchronized (this.OooO0Oo) {
            ep0.OooO0oO().OooO0Oo(OooO0o0, "Starting timer for " + str, new Throwable[0]);
            OooO0O0(str);
            z02 z02Var = new z02(this, str);
            this.OooO0O0.put(str, z02Var);
            this.OooO0OO.put(str, jpVar);
            this.OooO00o.schedule(z02Var, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void OooO0O0(String str) {
        synchronized (this.OooO0Oo) {
            try {
                if (((z02) this.OooO0O0.remove(str)) != null) {
                    ep0.OooO0oO().OooO0Oo(OooO0o0, "Stopping timer for " + str, new Throwable[0]);
                    this.OooO0OO.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
