package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class wo0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO00o = AtomicReferenceFieldUpdater.newUpdater(wo0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new yo0(8, false);

    public final boolean OooO00o(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o;
            yo0 yo0Var = (yo0) atomicReferenceFieldUpdater.get(this);
            int iOooO00o = yo0Var.OooO00o(runnable);
            if (iOooO00o == 0) {
                return true;
            }
            if (iOooO00o == 1) {
                yo0 yo0VarOooO0OO = yo0Var.OooO0OO();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, yo0Var, yo0VarOooO0OO) && atomicReferenceFieldUpdater.get(this) == yo0Var) {
                }
            } else if (iOooO00o == 2) {
                return false;
            }
        }
    }

    public final void OooO0O0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o;
            yo0 yo0Var = (yo0) atomicReferenceFieldUpdater.get(this);
            if (yo0Var.OooO0O0()) {
                return;
            }
            yo0 yo0VarOooO0OO = yo0Var.OooO0OO();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yo0Var, yo0VarOooO0OO) && atomicReferenceFieldUpdater.get(this) == yo0Var) {
            }
        }
    }

    public final int OooO0OO() {
        yo0 yo0Var = (yo0) OooO00o.get(this);
        yo0Var.getClass();
        long j = yo0.OooO0o.get(yo0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object OooO0Oo() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o;
            yo0 yo0Var = (yo0) atomicReferenceFieldUpdater.get(this);
            Object objOooO0Oo = yo0Var.OooO0Oo();
            if (objOooO0Oo != yo0.OooO0oO) {
                return objOooO0Oo;
            }
            yo0 yo0VarOooO0OO = yo0Var.OooO0OO();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yo0Var, yo0VarOooO0OO) && atomicReferenceFieldUpdater.get(this) == yo0Var) {
            }
        }
    }
}
