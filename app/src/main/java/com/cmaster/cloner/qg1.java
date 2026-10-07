package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qg1 {
    public final tb1 OooO00o;
    public final AtomicBoolean OooO0O0;
    public final cl1 OooO0OO;

    public qg1(tb1 tb1Var) {
        tb1Var.getClass();
        this.OooO00o = tb1Var;
        this.OooO0O0 = new AtomicBoolean(false);
        this.OooO0OO = new cl1(new wf(this, 6));
    }

    public final j30 OooO00o() {
        tb1 tb1Var = this.OooO00o;
        tb1Var.OooO00o();
        if (this.OooO0O0.compareAndSet(false, true)) {
            return (j30) this.OooO0OO.getValue();
        }
        String strOooO0O0 = OooO0O0();
        tb1Var.getClass();
        tb1Var.OooO00o();
        tb1Var.OooO0O0();
        return tb1Var.OooO().OooOO0O().OooO0oo(strOooO0O0);
    }

    public abstract String OooO0O0();

    public final void OooO0OO(j30 j30Var) {
        j30Var.getClass();
        if (j30Var == ((j30) this.OooO0OO.getValue())) {
            this.OooO0O0.set(false);
        }
    }
}
