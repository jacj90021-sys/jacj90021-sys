package com.cmaster.cloner;

import android.os.ConditionVariable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class nx extends eb1 implements Runnable, Callable {
    public static final Object OooOo0 = new Object();
    public volatile Object OooOOo;
    public final ConditionVariable OooOOo0;
    public final Executor OooOOoo;
    public boolean OooOo00;

    public nx() {
        oo00 oo00Var = h1.OooO0Oo;
        this.OooOOo0 = new ConditionVariable();
        this.OooOOo = OooOo0;
    }

    @Override // com.cmaster.cloner.gv0
    public final void OooO() {
    }

    @Override // com.cmaster.cloner.gv0
    public final void OooO0oo() {
    }

    @Override // com.cmaster.cloner.gv0
    public final void OooOO0(Object obj) {
        if (this.OooOOo == OooOo0) {
            this.OooOOo = obj;
            this.OooOOo0.open();
        } else {
            this.OooOOo = obj;
        }
        super.OooOO0(obj);
    }

    @Override // com.cmaster.cloner.eb1, com.cmaster.cloner.gv0
    public void OooOO0o(Object obj) {
        if (this.OooOOo == OooOo0) {
            this.OooOOo = obj;
            this.OooOOo0.open();
        } else {
            this.OooOOo = obj;
        }
        super.OooOO0o(obj);
    }

    public final void OooOOo0(Executor executor) {
        if (this.OooOo00) {
            return;
        }
        this.OooOo00 = true;
        executor.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa1 wa1VarOooO0OO;
        try {
            wa1VarOooO0OO = (wa1) call();
        } catch (Throwable th) {
            wa1VarOooO0OO = wa1.OooO0OO(th);
        }
        if (h1.OooO0O0()) {
            OooOO0o(wa1VarOooO0OO);
        } else {
            OooOO0(wa1VarOooO0OO);
        }
    }
}
