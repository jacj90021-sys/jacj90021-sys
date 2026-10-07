package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mk0 extends x3 {
    public final gk0 OooO0O0;
    public bx0 OooO0OO;
    public final /* synthetic */ nk0 OooO0Oo;
    public final /* synthetic */ bg0 OooO0o0;

    public mk0(gk0 gk0Var, nk0 nk0Var, bg0 bg0Var) {
        this.OooO0Oo = nk0Var;
        this.OooO0o0 = bg0Var;
        this.OooO0O0 = gk0Var;
    }

    @Override // com.cmaster.cloner.x3
    public final void OooO00o(Object obj, Object obj2) {
        vo0 vo0Var = (vo0) obj;
        boolean z = obj2 == null;
        vo0 vo0Var2 = this.OooO0O0;
        vo0 vo0Var3 = z ? vo0Var2 : this.OooO0OO;
        if (vo0Var3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vo0.OooO0Oo;
            while (!atomicReferenceFieldUpdater.compareAndSet(vo0Var, this, vo0Var3)) {
                if (atomicReferenceFieldUpdater.get(vo0Var) != this) {
                    return;
                }
            }
            if (z) {
                vo0 vo0Var4 = this.OooO0OO;
                vo0Var4.getClass();
                vo0Var2.OooO0oO(vo0Var4);
            }
        }
    }

    @Override // com.cmaster.cloner.x3
    public final uk1 OooO0OO(Object obj) {
        if (this.OooO0Oo.OooOoo0() == this.OooO0o0) {
            return null;
        }
        return l62.OooO00o;
    }
}
