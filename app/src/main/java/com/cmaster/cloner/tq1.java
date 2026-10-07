package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class tq1 extends he1 {
    @Override // com.cmaster.cloner.he1
    public final int OooO00o(pj0 pj0Var) {
        gg0 gg0Var = (gg0) pj0Var;
        return OooO0O0(gg0Var.OooO0OO() * gg0Var.OooO0o0());
    }

    @Override // com.cmaster.cloner.he1
    public final void OooO0o() {
        OooOOO0();
        Iterator it = OooO0Oo().iterator();
        while (it.hasNext()) {
            ((pj0) it.next()).OooO00o(this.OooO0O0);
        }
    }

    @Override // com.cmaster.cloner.he1
    public final int OooOO0() {
        Collection collectionOooO0Oo = OooO0Oo();
        int size = collectionOooO0Oo.size();
        if (size == 0) {
            return 0;
        }
        return ((pj0) collectionOooO0Oo.iterator().next()).OooO0OO() * size;
    }

    @Override // com.cmaster.cloner.he1
    public final void OooOO0o(q9 q9Var) {
        Iterator it = OooO0Oo().iterator();
        while (it.hasNext()) {
            ((pj0) it.next()).OooO0Oo(this.OooO0O0, q9Var);
            q9Var.OooO00o(this.OooO0OO);
        }
    }

    public abstract void OooOOO0();
}
