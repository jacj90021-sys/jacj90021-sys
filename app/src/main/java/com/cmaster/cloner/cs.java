package com.cmaster.cloner;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cs extends es implements hk, gj {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooOO0O = AtomicReferenceFieldUpdater.newUpdater(cs.class, Object.class, "_reusableCancellableContinuation$volatile");
    public Object OooO;
    public final zj OooO0oO;
    public final ij OooO0oo;
    public final Object OooOO0;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public cs(zj zjVar, ij ijVar) {
        super(-1);
        this.OooO0oO = zjVar;
        this.OooO0oo = ijVar;
        this.OooO = uu0.OooO00o;
        vj vjVar = ijVar.OooO0o0;
        vjVar.getClass();
        Object objOooO0o = vjVar.OooO0o(0, wj.OooO0oo);
        objOooO0o.getClass();
        this.OooOO0 = objOooO0o;
    }

    @Override // com.cmaster.cloner.es
    public final void OooO0O0(Object obj, CancellationException cancellationException) {
        if (obj instanceof sf) {
            throw null;
        }
    }

    @Override // com.cmaster.cloner.hk
    public final hk OooO0OO() {
        ij ijVar = this.OooO0oo;
        if (ijVar != null) {
            return ijVar;
        }
        return null;
    }

    @Override // com.cmaster.cloner.gj
    public final void OooO0Oo(Object obj) {
        ij ijVar = this.OooO0oo;
        vj vjVar = ijVar.OooO0o0;
        vjVar.getClass();
        Throwable thOooO00o = cb1.OooO00o(obj);
        Object rfVar = thOooO00o == null ? obj : new rf(false, thOooO00o);
        zj zjVar = this.OooO0oO;
        if (zjVar.OooOOo()) {
            this.OooO = rfVar;
            this.OooO0o = 0;
            zjVar.OooOOOO(vjVar, this);
            return;
        }
        xw xwVarOooO00o = vm1.OooO00o();
        if (xwVarOooO00o.OooO0o >= 4294967296L) {
            this.OooO = rfVar;
            this.OooO0o = 0;
            e3 e3Var = xwVarOooO00o.OooO0oo;
            if (e3Var == null) {
                e3Var = new e3();
                xwVarOooO00o.OooO0oo = e3Var;
            }
            e3Var.addLast(this);
            return;
        }
        xwVarOooO00o.OooOo00(true);
        try {
            vj vjVar2 = ijVar.OooO0o0;
            vjVar2.getClass();
            Object objOooO0O0 = w82.OooO0O0(vjVar2, this.OooOO0);
            try {
                ijVar.OooO0Oo(obj);
                while (xwVarOooO00o.OooOo0O()) {
                }
            } finally {
                w82.OooO00o(vjVar2, objOooO0O0);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // com.cmaster.cloner.es
    public final gj OooO0o() {
        return this;
    }

    @Override // com.cmaster.cloner.es
    public final Object OooOO0o() {
        Object obj = this.OooO;
        this.OooO = uu0.OooO00o;
        return obj;
    }

    @Override // com.cmaster.cloner.gj
    public final vj getContext() {
        vj vjVar = this.OooO0oo.OooO0o0;
        vjVar.getClass();
        return vjVar;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.OooO0oO + ", " + rn.OooO0Oo(this.OooO0oo) + ']';
    }
}
