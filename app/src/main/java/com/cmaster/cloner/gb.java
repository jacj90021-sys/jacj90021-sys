package com.cmaster.cloner;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class gb extends es implements fb, hk, wx1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO = AtomicIntegerFieldUpdater.newUpdater(gb.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooOO0 = AtomicReferenceFieldUpdater.newUpdater(gb.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooOO0O = AtomicReferenceFieldUpdater.newUpdater(gb.class, Object.class, "_parentHandle$volatile");
    public final gj OooO0oO;
    public final vj OooO0oo;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public gb(gj gjVar, int i) {
        super(i);
        this.OooO0oO = gjVar;
        this.OooO0oo = gjVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = o00OO0OO.OooO00o;
    }

    public static void OooOoO0(ex0 ex0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + ex0Var + ", already has " + obj).toString());
    }

    public static Object OooOoo(ex0 ex0Var, Object obj, int i, a40 a40Var) {
        if (obj instanceof rf) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (a40Var != null || (ex0Var instanceof ls)) {
            return new pf(obj, ex0Var instanceof ls ? (ls) ex0Var : null, a40Var, (CancellationException) null, 16);
        }
        return obj;
    }

    @Override // com.cmaster.cloner.wx1
    public final void OooO00o(re1 re1Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = OooO;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                qa.OooO0o("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        OooOo0o(re1Var);
    }

    @Override // com.cmaster.cloner.es
    public final void OooO0O0(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ex0) {
                qa.OooO0o("Not completed");
                return;
            }
            if (obj2 instanceof rf) {
                return;
            }
            if (!(obj2 instanceof pf)) {
                cancellationException2 = cancellationException;
                pf pfVar = new pf(obj2, (ls) null, (a40) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, pfVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            pf pfVar2 = (pf) obj2;
            if (pfVar2.OooO0o0 != null) {
                qa.OooO0o("Must be called at most once");
                return;
            }
            pf pfVarOooO00o = pf.OooO00o(pfVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, pfVarOooO00o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            ls lsVar = pfVar2.OooO0O0;
            if (lsVar != null) {
                OooOOO0(lsVar, cancellationException);
            }
            a40 a40Var = pfVar2.OooO0OO;
            if (a40Var != null) {
                OooOOO(a40Var, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // com.cmaster.cloner.hk
    public final hk OooO0OO() {
        gj gjVar = this.OooO0oO;
        if (gjVar instanceof hk) {
            return (hk) gjVar;
        }
        return null;
    }

    @Override // com.cmaster.cloner.gj
    public final void OooO0Oo(Object obj) {
        Throwable thOooO00o = cb1.OooO00o(obj);
        if (thOooO00o != null) {
            obj = new rf(false, thOooO00o);
        }
        OooOoo0(obj, this.OooO0o, null);
    }

    @Override // com.cmaster.cloner.es
    public final gj OooO0o() {
        return this.OooO0oO;
    }

    @Override // com.cmaster.cloner.fb
    public final void OooO0o0(a40 a40Var) {
        OooOoo0(vq1.OooO00o, this.OooO0o, a40Var);
    }

    @Override // com.cmaster.cloner.es
    public final Throwable OooO0oO(Object obj) {
        Throwable thOooO0oO = super.OooO0oO(obj);
        if (thOooO0oO != null) {
            return thOooO0oO;
        }
        return null;
    }

    @Override // com.cmaster.cloner.es
    public final Object OooO0oo(Object obj) {
        return obj instanceof pf ? ((pf) obj).OooO00o : obj;
    }

    @Override // com.cmaster.cloner.fb
    public final uk1 OooOO0(a40 a40Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ex0)) {
                return null;
            }
            Object objOooOoo = OooOoo((ex0) obj, vq1.OooO00o, this.OooO0o, a40Var);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, objOooOoo)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            boolean zOooOo = OooOo();
            uk1 uk1Var = h50.OooO00o;
            if (!zOooOo) {
                OooOOo0();
            }
            return uk1Var;
        }
    }

    @Override // com.cmaster.cloner.fb
    public final void OooOO0O(Object obj) {
        OooOOo(this.OooO0o);
    }

    @Override // com.cmaster.cloner.es
    public final Object OooOO0o() {
        return OooOO0.get(this);
    }

    public final void OooOOO(a40 a40Var, Throwable th) {
        try {
            a40Var.OooO0o(th);
        } catch (Throwable th2) {
            qp2.OooO00o(this.OooO0oo, new tf("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void OooOOO0(ls lsVar, Throwable th) {
        try {
            lsVar.OooO00o.OooO0OO();
        } catch (Throwable th2) {
            qp2.OooO00o(this.OooO0oo, new tf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void OooOOOO(me1 me1Var, Throwable th) {
        int i = OooO.get(this) & 536870911;
        if (i == 536870911) {
            qa.OooO0o("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            me1Var.OooO0o0(i);
        } catch (Throwable th2) {
            qp2.OooO00o(this.OooO0oo, new tf("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void OooOOOo(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof ex0) {
                kb kbVar = new kb(this, th, (obj instanceof ls) || (obj instanceof me1));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kbVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                ex0 ex0Var = (ex0) obj;
                if (ex0Var instanceof ls) {
                    OooOOO0((ls) obj, th);
                } else if (ex0Var instanceof me1) {
                    OooOOOO((me1) obj, th);
                }
                if (!OooOo()) {
                    OooOOo0();
                }
                OooOOo(this.OooO0o);
                return;
            }
            return;
        }
    }

    public final void OooOOo(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = OooO;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    qa.OooO0o("Already resumed");
                    return;
                }
                boolean z = i == 4;
                gj gjVar = this.OooO0oO;
                if (!z && (gjVar instanceof cs)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.OooO0o;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        cs csVar = (cs) gjVar;
                        zj zjVar = csVar.OooO0oO;
                        vj vjVar = csVar.OooO0oo.OooO0o0;
                        vjVar.getClass();
                        if (zjVar.OooOOo()) {
                            zjVar.OooOOOO(vjVar, this);
                            return;
                        }
                        xw xwVarOooO00o = vm1.OooO00o();
                        if (xwVarOooO00o.OooO0o >= 4294967296L) {
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
                            gq2.OooO00o(this, gjVar, true);
                            do {
                            } while (xwVarOooO00o.OooOo0O());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                gq2.OooO00o(this, gjVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final void OooOOo0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0O;
        ks ksVar = (ks) atomicReferenceFieldUpdater.get(this);
        if (ksVar == null) {
            return;
        }
        ksVar.OooO0OO();
        atomicReferenceFieldUpdater.set(this, cx0.OooO0Oo);
    }

    public Throwable OooOOoo(nk0 nk0Var) {
        return nk0Var.OooOo0O();
    }

    public final boolean OooOo() {
        if (this.OooO0o != 2) {
            return false;
        }
        gj gjVar = this.OooO0oO;
        gjVar.getClass();
        return cs.OooOO0O.get((cs) gjVar) != null;
    }

    public final void OooOo0() {
        ks ksVarOooOo0O = OooOo0O();
        if (ksVarOooOo0O == null || (OooOO0.get(this) instanceof ex0)) {
            return;
        }
        ksVarOooOo0O.OooO0OO();
        OooOO0O.set(this, cx0.OooO0Oo);
    }

    public final Object OooOo00() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        nk0 nk0Var;
        boolean zOooOo = OooOo();
        do {
            atomicIntegerFieldUpdater = OooO;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    qa.OooO0o("Already suspended");
                    return null;
                }
                if (zOooOo) {
                    OooOoOO();
                }
                Object obj = OooOO0.get(this);
                if (obj instanceof rf) {
                    throw ((rf) obj).OooO00o;
                }
                int i3 = this.OooO0o;
                if ((i3 != 1 && i3 != 2) || (nk0Var = (nk0) this.OooO0oo.OooO0oo(gu0.OooO0o0)) == null || nk0Var.Oooo00O()) {
                    return OooO0oo(obj);
                }
                CancellationException cancellationExceptionOooOo0O = nk0Var.OooOo0O();
                OooO0O0(obj, cancellationExceptionOooOo0O);
                throw cancellationExceptionOooOo0O;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((ks) OooOO0O.get(this)) == null) {
            OooOo0O();
        }
        if (zOooOo) {
            OooOoOO();
        }
        return gk.OooO0Oo;
    }

    public final ks OooOo0O() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        nk0 nk0Var = (nk0) this.OooO0oo.OooO0oo(gu0.OooO0o0);
        if (nk0Var == null) {
            return null;
        }
        ks ksVarOooO0O0 = ou2.OooO0O0(nk0Var, true, new pc(this), 2);
        do {
            atomicReferenceFieldUpdater = OooOO0O;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, ksVarOooO0O0)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return ksVarOooO0O0;
    }

    public final void OooOo0o(ex0 ex0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o00OO0OO) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ex0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z = true;
            if (obj instanceof ls ? true : obj instanceof me1) {
                OooOoO0(ex0Var, obj);
                throw null;
            }
            if (obj instanceof rf) {
                rf rfVar = (rf) obj;
                if (!rf.OooO0O0.compareAndSet(rfVar, 0, 1)) {
                    OooOoO0(ex0Var, obj);
                    throw null;
                }
                if (obj instanceof kb) {
                    Throwable th = rfVar.OooO00o;
                    if (ex0Var instanceof ls) {
                        OooOOO0((ls) ex0Var, th);
                        return;
                    } else {
                        OooOOOO((me1) ex0Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof pf) {
                pf pfVar = (pf) obj;
                if (pfVar.OooO0O0 != null) {
                    OooOoO0(ex0Var, obj);
                    throw null;
                }
                if (ex0Var instanceof me1) {
                    return;
                }
                ls lsVar = (ls) ex0Var;
                Throwable th2 = pfVar.OooO0o0;
                if (th2 != null) {
                    OooOOO0(lsVar, th2);
                    return;
                }
                pf pfVarOooO00o = pf.OooO00o(pfVar, lsVar, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, pfVarOooO00o)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (ex0Var instanceof me1) {
                    return;
                }
                pf pfVar2 = new pf(obj, (ls) ex0Var, (a40) null, (CancellationException) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, pfVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public String OooOoO() {
        return "CancellableContinuation";
    }

    public final void OooOoOO() {
        gj gjVar = this.OooO0oO;
        Throwable th = null;
        cs csVar = gjVar instanceof cs ? (cs) gjVar : null;
        if (csVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cs.OooOO0O;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(csVar);
                uk1 uk1Var = uu0.OooO0O0;
                if (obj == uk1Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(csVar, uk1Var, this)) {
                        if (atomicReferenceFieldUpdater.get(csVar) != uk1Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        qa.OooO0Oo(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(csVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(csVar) != obj) {
                            ra.OooOOO("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            OooOOo0();
            OooOOOo(th);
        }
    }

    public final void OooOoo0(Object obj, int i, a40 a40Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ex0) {
                Object objOooOoo = OooOoo((ex0) obj2, obj, i, a40Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objOooOoo)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!OooOo()) {
                    OooOOo0();
                }
                OooOOo(i);
                return;
            }
            if (obj2 instanceof kb) {
                kb kbVar = (kb) obj2;
                if (kb.OooO0OO.compareAndSet(kbVar, 0, 1)) {
                    if (a40Var != null) {
                        OooOOO(a40Var, kbVar.OooO00o);
                        return;
                    }
                    return;
                }
            }
            qa.OooO0Oo(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    @Override // com.cmaster.cloner.gj
    public final vj getContext() {
        return this.OooO0oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OooOoO());
        sb.append('(');
        sb.append(rn.OooO0Oo(this.OooO0oO));
        sb.append("){");
        Object obj = OooOO0.get(this);
        sb.append(obj instanceof ex0 ? "Active" : obj instanceof kb ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(rn.OooO00o(this));
        return sb.toString();
    }
}
