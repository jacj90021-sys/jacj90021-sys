package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pc extends dk0 {
    public final gb OooO0oo;

    public pc(gb gbVar) {
        this.OooO0oo = gbVar;
    }

    @Override // com.cmaster.cloner.fj0
    public final void OooO0o0(Throwable th) {
        nk0 nk0VarOooOO0O = OooOO0O();
        gb gbVar = this.OooO0oo;
        Throwable thOooOOoo = gbVar.OooOOoo(nk0VarOooOO0O);
        if (gbVar.OooOo()) {
            gj gjVar = gbVar.OooO0oO;
            gjVar.getClass();
            cs csVar = (cs) gjVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cs.OooOO0O;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(csVar);
                uk1 uk1Var = uu0.OooO0O0;
                if (!ij0.OooO00o(obj, uk1Var)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(csVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(csVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(csVar, uk1Var, thOooOOoo)) {
                    if (atomicReferenceFieldUpdater.get(csVar) != uk1Var) {
                        break;
                    }
                }
                return;
            }
        }
        gbVar.OooOOOo(thOooOOoo);
        if (gbVar.OooOo()) {
            return;
        }
        gbVar.OooOOo0();
    }
}
