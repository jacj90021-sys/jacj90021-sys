package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mv0 implements fb, wx1 {
    public final gb OooO0Oo;
    public final /* synthetic */ ov0 OooO0o0;

    public mv0(ov0 ov0Var, gb gbVar) {
        this.OooO0o0 = ov0Var;
        this.OooO0Oo = gbVar;
    }

    @Override // com.cmaster.cloner.wx1
    public final void OooO00o(re1 re1Var, int i) {
        this.OooO0Oo.OooO00o(re1Var, i);
    }

    @Override // com.cmaster.cloner.gj
    public final void OooO0Oo(Object obj) {
        this.OooO0Oo.OooO0Oo(obj);
    }

    @Override // com.cmaster.cloner.fb
    public final void OooO0o0(a40 a40Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ov0.OooOO0O;
        ov0 ov0Var = this.OooO0o0;
        atomicReferenceFieldUpdater.set(ov0Var, null);
        this.OooO0Oo.OooO0o0(new lv0(ov0Var, this, 0));
    }

    @Override // com.cmaster.cloner.fb
    public final uk1 OooOO0(a40 a40Var) {
        ov0 ov0Var = this.OooO0o0;
        uk1 uk1VarOooOO0 = this.OooO0Oo.OooOO0(new lv0(ov0Var, this, 1));
        if (uk1VarOooOO0 != null) {
            ov0.OooOO0O.set(ov0Var, null);
        }
        return uk1VarOooOO0;
    }

    @Override // com.cmaster.cloner.fb
    public final void OooOO0O(Object obj) {
        this.OooO0Oo.OooOO0O(obj);
    }

    @Override // com.cmaster.cloner.gj
    public final vj getContext() {
        return this.OooO0Oo.OooO0oo;
    }
}
