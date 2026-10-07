package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ow implements ky {
    public static final im2 OooOoO0 = new im2();
    public final kw OooO;
    public final kw OooO0o;
    public final r31 OooO0oO;
    public final q50 OooOO0;
    public final q50 OooOO0O;
    public final q50 OooOO0o;
    public pw OooOOO;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public int OooOOo;
    public fa1 OooOOo0;
    public boolean OooOOoo;
    public volatile boolean OooOo;
    public boolean OooOo0;
    public n50 OooOo00;
    public qw OooOo0O;
    public vn OooOo0o;
    public final nw OooO0Oo = new nw(new ArrayList(2));
    public final vi1 OooO0o0 = new vi1();
    public final AtomicInteger OooOOO0 = new AtomicInteger();
    public final im2 OooO0oo = OooOoO0;

    public ow(q50 q50Var, q50 q50Var2, q50 q50Var3, q50 q50Var4, kw kwVar, kw kwVar2, hx2 hx2Var) {
        this.OooOO0 = q50Var;
        this.OooOO0O = q50Var2;
        this.OooOO0o = q50Var4;
        this.OooO = kwVar;
        this.OooO0o = kwVar2;
        this.OooO0oO = hx2Var;
    }

    public final synchronized void OooO00o(kh1 kh1Var, Executor executor) {
        try {
            this.OooO0o0.OooO00o();
            this.OooO0Oo.OooO0Oo.add(new mw(kh1Var, executor));
            int i = 1;
            if (this.OooOOoo) {
                OooO0Oo(1);
                executor.execute(new lw(this, kh1Var, i));
            } else if (this.OooOo0) {
                OooO0Oo(1);
                executor.execute(new lw(this, kh1Var, 0));
            } else {
                zx2.OooO00o("Cannot add callbacks to a cancelled EngineJob", !this.OooOo);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0O0() {
        qw qwVar;
        synchronized (this) {
            try {
                this.OooO0o0.OooO00o();
                zx2.OooO00o("Not yet complete!", OooO0o0());
                int iDecrementAndGet = this.OooOOO0.decrementAndGet();
                zx2.OooO00o("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    qwVar = this.OooOo0O;
                    OooO0o();
                } else {
                    qwVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qwVar != null) {
            qwVar.OooO0OO();
        }
    }

    @Override // com.cmaster.cloner.ky
    public final vi1 OooO0OO() {
        return this.OooO0o0;
    }

    public final synchronized void OooO0Oo(int i) {
        qw qwVar;
        zx2.OooO00o("Not yet complete!", OooO0o0());
        if (this.OooOOO0.getAndAdd(i) == 0 && (qwVar = this.OooOo0O) != null) {
            qwVar.OooO00o();
        }
    }

    public final synchronized void OooO0o() {
        boolean zOooO00o;
        if (this.OooOOO == null) {
            throw new IllegalArgumentException();
        }
        this.OooO0Oo.OooO0Oo.clear();
        this.OooOOO = null;
        this.OooOo0O = null;
        this.OooOOo0 = null;
        this.OooOo0 = false;
        this.OooOo = false;
        this.OooOOoo = false;
        vn vnVar = this.OooOo0o;
        un unVar = vnVar.OooOO0;
        synchronized (unVar) {
            unVar.OooO00o = true;
            zOooO00o = unVar.OooO00o();
        }
        if (zOooO00o) {
            vnVar.OooOO0O();
        }
        this.OooOo0o = null;
        this.OooOo00 = null;
        this.OooOOo = 0;
        this.OooO0oO.OooO0O0(this);
    }

    public final boolean OooO0o0() {
        return this.OooOo0 || this.OooOOoo || this.OooOo;
    }

    public final synchronized void OooO0oO(kh1 kh1Var) {
        try {
            this.OooO0o0.OooO00o();
            this.OooO0Oo.OooO0Oo.remove(new mw(kh1Var, y52.OooO0O0));
            if (this.OooO0Oo.OooO0Oo.isEmpty()) {
                if (!OooO0o0()) {
                    this.OooOo = true;
                    vn vnVar = this.OooOo0o;
                    vnVar.OooOooO = true;
                    kn knVar = vnVar.OooOoo0;
                    if (knVar != null) {
                        knVar.cancel();
                    }
                    kw kwVar = this.OooO;
                    pw pwVar = this.OooOOO;
                    synchronized (kwVar) {
                        f91 f91Var = kwVar.OooO00o;
                        f91Var.getClass();
                        HashMap map = f91Var.OooO00o;
                        if (this == map.get(pwVar)) {
                            map.remove(pwVar);
                        }
                    }
                }
                if (this.OooOOoo || this.OooOo0) {
                    if (this.OooOOO0.get() == 0) {
                        OooO0o();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
