package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gk0 extends vo0 implements fj0, ks, bg0 {
    public nk0 OooO0oO;

    @Override // com.cmaster.cloner.bg0
    public final bx0 OooO0O0() {
        return null;
    }

    @Override // com.cmaster.cloner.ks
    public final void OooO0OO() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        nk0 nk0VarOooOO0O = OooOO0O();
        while (true) {
            Object objOooOoo0 = nk0VarOooOO0O.OooOoo0();
            if (objOooOoo0 instanceof gk0) {
                if (objOooOoo0 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nk0.OooO0Oo;
                while (!atomicReferenceFieldUpdater2.compareAndSet(nk0VarOooOO0O, objOooOoo0, j62.OooO0oO)) {
                    if (atomicReferenceFieldUpdater2.get(nk0VarOooOO0O) != objOooOoo0) {
                        break;
                    }
                }
                return;
            }
            if (!(objOooOoo0 instanceof bg0) || ((bg0) objOooOoo0).OooO0O0() == null) {
                return;
            }
            while (true) {
                Object objOooO0oo = OooO0oo();
                if (objOooO0oo instanceof h91) {
                    return;
                }
                if (objOooO0oo == this) {
                    return;
                }
                objOooO0oo.getClass();
                vo0 vo0Var = (vo0) objOooO0oo;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = vo0.OooO0o;
                h91 h91Var = (h91) atomicReferenceFieldUpdater3.get(vo0Var);
                if (h91Var == null) {
                    h91Var = new h91(vo0Var);
                    atomicReferenceFieldUpdater3.set(vo0Var, h91Var);
                }
                do {
                    atomicReferenceFieldUpdater = vo0.OooO0Oo;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objOooO0oo, h91Var)) {
                        vo0Var.OooO0o();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objOooO0oo);
            }
        }
    }

    @Override // com.cmaster.cloner.bg0
    public final boolean OooO0Oo() {
        return true;
    }

    public final nk0 OooOO0O() {
        nk0 nk0Var = this.OooO0oO;
        if (nk0Var != null) {
            return nk0Var;
        }
        ij0.OooO("job");
        throw null;
    }

    @Override // com.cmaster.cloner.vo0
    public final String toString() {
        return getClass().getSimpleName() + '@' + rn.OooO00o(this) + "[job@" + rn.OooO00o(OooOO0O()) + ']';
    }
}
