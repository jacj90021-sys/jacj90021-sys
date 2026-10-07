package com.cmaster.cloner;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wc3 {
    public static final o0O000O OooOOoo = new o0O000O("AutoZoom", (String) null);
    public hi2 OooO;
    public final sc3 OooO00o;
    public final AtomicBoolean OooO0O0;
    public final Object OooO0OO;
    public final ma2 OooO0Oo;
    public final p52 OooO0o;
    public final ScheduledExecutorService OooO0o0;
    public final ic3 OooO0oO;
    public final String OooO0oo;
    public float OooOO0;
    public final float OooOO0O;
    public long OooOO0o;
    public ScheduledFuture OooOOO;
    public long OooOOO0;
    public String OooOOOO;
    public boolean OooOOOo;
    public nz0 OooOOo;
    public int OooOOo0;

    public wc3(Context context, sc3 sc3Var, String str) {
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        p52 p52Var = x52.OooO00o;
        pg1 pg1Var = new pg1(context);
        byte b = (byte) (((byte) (0 | 1)) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" enableFirelog");
            }
            if ((b & 2) == 0) {
                sb.append(" firelogEventType");
            }
            qa.OooO0o("Missing required properties:".concat(sb.toString()));
            throw null;
        }
        ic3 ic3Var = new ic3(context, pg1Var, new ec3(context, new cc3("scanner-auto-zoom", 1)), "scanner-auto-zoom");
        this.OooO0OO = new Object();
        this.OooO00o = sc3Var;
        this.OooO0O0 = new AtomicBoolean(false);
        this.OooO0Oo = new ma2();
        this.OooO0o0 = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.OooO0o = p52Var;
        this.OooO0oO = ic3Var;
        this.OooO0oo = str;
        this.OooOOo0 = 1;
        this.OooOO0 = 1.0f;
        this.OooOO0O = -1.0f;
        this.OooOO0o = p52Var.OooO00o();
    }

    public final long OooO00o() {
        long jOooO00o;
        synchronized (this.OooO0OO) {
            jOooO00o = (this.OooO0o.OooO00o() - this.OooOO0o) / 1000000;
        }
        return jOooO00o;
    }

    public final void OooO0O0(float f, f63 f63Var, tc3 tc3Var) {
        eh2 eh2Var;
        synchronized (this.OooO0OO) {
            try {
                if (this.OooO != null && this.OooOOo != null && this.OooOOo0 == 2) {
                    int i = 0;
                    if (this.OooO0O0.compareAndSet(false, true)) {
                        float f2 = this.OooOO0;
                        uc3 uc3Var = new uc3(this, f);
                        nj2 nj2Var = new nj2();
                        nj2Var.OooOO0O = new mj2(nj2Var, uc3Var);
                        nj2Var.run();
                        pi2 pi2Var = new pi2(nj2Var, new vc3(this, f63Var, f2, tc3Var, f), i);
                        hi2 hi2Var = hi2.OooO0Oo;
                        eh2 eh2Var2 = eh2.OooO0Oo;
                        if (nj2Var.isDone() || (eh2Var = nj2Var.OooO0o0) == eh2Var2) {
                            lh2.OooO0o0(pi2Var, hi2Var);
                        } else {
                            eh2 eh2Var3 = new eh2(pi2Var);
                            do {
                                eh2Var3.OooO0OO = eh2Var;
                                if (!lh2.OooO.OooO0o0(nj2Var, eh2Var, eh2Var3)) {
                                    eh2Var = nj2Var.OooO0o0;
                                }
                            } while (eh2Var != eh2Var2);
                            lh2.OooO0o0(pi2Var, hi2Var);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void OooO0OO(boolean z) {
        synchronized (this.OooO0OO) {
            try {
                int i = this.OooOOo0;
                if (i != 1 && i != 4) {
                    OooO0o0(true);
                    if (z) {
                        if (!this.OooOOOo) {
                            f63 f63Var = f63.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.OooOO0;
                            OooO0Oo(f63Var, f, f, null);
                        }
                        f63 f63Var2 = f63.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f2 = this.OooOO0;
                        OooO0Oo(f63Var2, f2, f2, null);
                    } else {
                        f63 f63Var3 = f63.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f3 = this.OooOO0;
                        OooO0Oo(f63Var3, f3, f3, null);
                    }
                    this.OooOOOo = false;
                    this.OooOOo0 = 1;
                    this.OooOOOO = null;
                }
            } finally {
            }
        }
    }

    public final void OooO0Oo(f63 f63Var, float f, float f2, tc3 tc3Var) {
        long jOooO00o;
        String str = this.OooOOOO;
        if (str != null) {
            oO0Ooooo oo0ooooo = new oO0Ooooo(11);
            oo0ooooo.OooO0o0 = this.OooO0oo;
            oo0ooooo.OooO0o = str;
            oo0ooooo.OooO0oO = Float.valueOf(f);
            oo0ooooo.OooO0oo = Float.valueOf(f2);
            synchronized (this.OooO0OO) {
                jOooO00o = (this.OooO0o.OooO00o() - this.OooOOO0) / 1000000;
            }
            oo0ooooo.OooO = Long.valueOf(jOooO00o);
            if (tc3Var != null) {
                yo yoVar = new yo();
                yoVar.OooO0Oo = Float.valueOf(tc3Var.OooO00o);
                yoVar.OooO0o0 = Float.valueOf(tc3Var.OooO0O0);
                yoVar.OooO0o = Float.valueOf(tc3Var.OooO0OO);
                yoVar.OooO0oO = Float.valueOf(tc3Var.OooO0Oo);
                yoVar.OooO0oo = Float.valueOf(0.0f);
                oo0ooooo.OooOO0 = new ja3(yoVar);
            }
            ic3 ic3Var = this.OooO0oO;
            yn1 yn1Var = new yn1();
            yn1Var.OooOO0 = new ka3(oo0ooooo);
            qo2.OooO0Oo.execute(new sb(ic3Var, new o00Oo00(yn1Var, 0), f63Var, ic3Var.OooO0OO(), 11, false));
        }
    }

    public final void OooO0o0(boolean z) {
        ScheduledFuture scheduledFuture;
        synchronized (this.OooO0OO) {
            try {
                this.OooO0Oo.OooO0OO();
                this.OooOO0o = this.OooO0o.OooO00o();
                if (z && (scheduledFuture = this.OooOOO) != null) {
                    scheduledFuture.cancel(false);
                    this.OooOOO = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
