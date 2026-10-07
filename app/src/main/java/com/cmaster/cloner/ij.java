package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ij extends h6 {
    public transient gj OooO0o;
    public final vj OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(gj gjVar) {
        super(gjVar);
        vj context = gjVar != null ? gjVar.getContext() : null;
        this.OooO0o0 = context;
    }

    @Override // com.cmaster.cloner.h6
    public final void OooOO0o() {
        gj gjVar = this.OooO0o;
        if (gjVar != null && gjVar != this) {
            vj vjVar = this.OooO0o0;
            vjVar.getClass();
            tj tjVarOooO0oo = vjVar.OooO0oo(oOO0OO.OooO0o0);
            tjVarOooO0oo.getClass();
            cs csVar = (cs) gjVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cs.OooOO0O;
            while (atomicReferenceFieldUpdater.get(csVar) == uu0.OooO0O0) {
            }
            Object obj = atomicReferenceFieldUpdater.get(csVar);
            gb gbVar = obj instanceof gb ? (gb) obj : null;
            if (gbVar != null) {
                gbVar.OooOOo0();
            }
        }
        this.OooO0o = qf.OooO0Oo;
    }

    @Override // com.cmaster.cloner.gj
    public final vj getContext() {
        vj vjVar = this.OooO0o0;
        vjVar.getClass();
        return vjVar;
    }
}
