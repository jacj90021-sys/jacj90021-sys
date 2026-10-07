package com.cmaster.cloner;

import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ik1 implements zg {
    public final na1 OooO0Oo;

    public ik1(na1 na1Var) {
        this.OooO0Oo = na1Var;
    }

    @Override // com.cmaster.cloner.zg
    public final Object OooOOO0(boolean z, e40 e40Var, ij ijVar) {
        kk1 kk1Var = (kk1) this.OooO0Oo.OooO0o0;
        kk1Var.getClass();
        return e40Var.OooO0oO(new mk1(new hk1(kk1Var.OooOO0O())), ijVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((kk1) this.OooO0Oo.OooO0o0).close();
    }
}
