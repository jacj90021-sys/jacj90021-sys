package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ek0 extends nk0 {
    public final boolean OooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(nk0 nk0Var) {
        super(true);
        boolean z = true;
        OooOooo(nk0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nk0.OooO0o0;
        qc qcVar = (qc) atomicReferenceFieldUpdater.get(this);
        rc rcVar = qcVar instanceof rc ? (rc) qcVar : null;
        if (rcVar == null) {
            z = false;
            break;
        }
        nk0 nk0VarOooOO0O = rcVar.OooOO0O();
        while (!nk0VarOooOO0O.OooOoO0()) {
            qc qcVar2 = (qc) atomicReferenceFieldUpdater.get(nk0VarOooOO0O);
            rc rcVar2 = qcVar2 instanceof rc ? (rc) qcVar2 : null;
            if (rcVar2 == null) {
                z = false;
                break;
            }
            nk0VarOooOO0O = rcVar2.OooOO0O();
        }
        this.OooO0o = z;
    }

    @Override // com.cmaster.cloner.nk0
    public final boolean OooOoO() {
        return true;
    }

    @Override // com.cmaster.cloner.nk0
    public final boolean OooOoO0() {
        return this.OooO0o;
    }
}
