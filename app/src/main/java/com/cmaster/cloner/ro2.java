package com.cmaster.cloner;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ro2 extends du0 implements z5 {
    public static final a6 OooOOO = new a6(null);
    public final boolean OooO;
    public final a6 OooOO0;
    public final wc3 OooOO0O;
    public int OooOO0o;
    public boolean OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro2(a6 a6Var, ex2 ex2Var, Executor executor, ic3 ic3Var, au0 au0Var) {
        super(ex2Var, executor);
        k12 k12Var = a6Var.OooO00o;
        int i = 1;
        wc3 wc3Var = null;
        if (k12Var != null) {
            wc3 wc3Var2 = new wc3(au0Var.OooO0O0(), sc3.OooOO0o, au0Var.OooO0O0().getPackageName());
            nz0 nz0Var = new nz0(k12Var, 21);
            hi2 hi2Var = hi2.OooO0Oo;
            wc3Var2.OooOOo = nz0Var;
            wc3Var2.OooO = hi2Var;
            synchronized (wc3Var2.OooO0OO) {
                try {
                    int i2 = wc3Var2.OooOOo0;
                    if (i2 != 2 && i2 != 4) {
                        wc3Var2.OooO0o0(true);
                        wc3Var2.OooOOO = wc3Var2.OooO0o0.scheduleWithFixedDelay(new l83(wc3Var2, i), 500L, 500L, TimeUnit.MILLISECONDS);
                        if (wc3Var2.OooOOo0 == 1) {
                            wc3Var2.OooOOOO = UUID.randomUUID().toString();
                            wc3Var2.OooOOO0 = wc3Var2.OooO0o.OooO00o();
                            wc3Var2.OooOOOo = false;
                            f63 f63Var = f63.SCANNER_AUTO_ZOOM_START;
                            float f = wc3Var2.OooOO0;
                            wc3Var2.OooO0Oo(f63Var, f, f, null);
                        } else {
                            f63 f63Var2 = f63.SCANNER_AUTO_ZOOM_RESUME;
                            float f2 = wc3Var2.OooOO0;
                            wc3Var2.OooO0Oo(f63Var2, f2, f2, null);
                        }
                        wc3Var2.OooOOo0 = 2;
                    }
                } finally {
                }
            }
            wc3Var = wc3Var2;
        }
        this.OooOO0 = a6Var;
        boolean zOooO0OO = z62.OooO0OO();
        this.OooO = zOooO0OO;
        yo yoVar = new yo();
        yoVar.OooO0o0 = z62.OooO00o(a6Var);
        s63 s63Var = new s63(yoVar);
        yn1 yn1Var = new yn1();
        yn1Var.OooO0Oo = zOooO0OO ? d63.TYPE_THICK : d63.TYPE_THIN;
        yn1Var.OooO0oO = s63Var;
        qo2.OooO0Oo.execute(new sb(ic3Var, new o00Oo00(yn1Var, 1), f63.ON_DEVICE_BARCODE_CREATE, ic3Var.OooO0OO(), 11, false));
        this.OooOO0O = wc3Var;
    }

    @Override // com.cmaster.cloner.uz0
    public final iz[] OooO0OO() {
        return this.OooO ? vz0.OooO00o : new iz[]{vz0.OooO0O0};
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        throw r0;
     */
    @Override // com.cmaster.cloner.du0, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void close() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.cmaster.cloner.wc3 r0 = r4.OooOO0O     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            boolean r1 = r4.OooOOO0     // Catch: java.lang.Throwable -> L27
            r0.OooO0OO(r1)     // Catch: java.lang.Throwable -> L27
            com.cmaster.cloner.wc3 r0 = r4.OooOO0O     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r0.OooO0OO     // Catch: java.lang.Throwable -> L27
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L27
            int r2 = r0.OooOOo0     // Catch: java.lang.Throwable -> L16
            r3 = 4
            if (r2 != r3) goto L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L29
        L16:
            r0 = move-exception
            goto L25
        L18:
            r2 = 0
            r0.OooO0OO(r2)     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.ScheduledExecutorService r2 = r0.OooO0o0     // Catch: java.lang.Throwable -> L16
            r2.shutdown()     // Catch: java.lang.Throwable -> L16
            r0.OooOOo0 = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L29
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            goto L2e
        L29:
            super.close()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r4)
            return
        L2e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ro2.close():void");
    }
}
