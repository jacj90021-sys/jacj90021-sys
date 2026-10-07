package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uc1 extends vc1 implements Iterator {
    public tc1 OooO0Oo;
    public final /* synthetic */ wc1 OooO0o;
    public boolean OooO0o0 = true;

    public uc1(wc1 wc1Var) {
        this.OooO0o = wc1Var;
    }

    @Override // com.cmaster.cloner.vc1
    public final void OooO00o(tc1 tc1Var) {
        tc1 tc1Var2 = this.OooO0Oo;
        if (tc1Var == tc1Var2) {
            tc1 tc1Var3 = tc1Var2.OooO0oO;
            this.OooO0Oo = tc1Var3;
            this.OooO0o0 = tc1Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.OooO0o0) {
            return this.OooO0o.OooO0Oo != null;
        }
        tc1 tc1Var = this.OooO0Oo;
        return (tc1Var == null || tc1Var.OooO0o == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.OooO0o0) {
            this.OooO0o0 = false;
            this.OooO0Oo = this.OooO0o.OooO0Oo;
        } else {
            tc1 tc1Var = this.OooO0Oo;
            this.OooO0Oo = tc1Var != null ? tc1Var.OooO0o : null;
        }
        return this.OooO0Oo;
    }
}
