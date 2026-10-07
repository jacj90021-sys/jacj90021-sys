package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sc1 extends vc1 implements Iterator {
    public tc1 OooO0Oo;
    public final /* synthetic */ int OooO0o;
    public tc1 OooO0o0;

    public sc1(tc1 tc1Var, tc1 tc1Var2, int i) {
        this.OooO0o = i;
        this.OooO0Oo = tc1Var2;
        this.OooO0o0 = tc1Var;
    }

    @Override // com.cmaster.cloner.vc1
    public final void OooO00o(tc1 tc1Var) {
        tc1 tc1Var2;
        tc1 tc1VarOooO0O0 = null;
        if (this.OooO0Oo == tc1Var && tc1Var == this.OooO0o0) {
            this.OooO0o0 = null;
            this.OooO0Oo = null;
        }
        tc1 tc1Var3 = this.OooO0Oo;
        if (tc1Var3 == tc1Var) {
            switch (this.OooO0o) {
                case 0:
                    tc1Var2 = tc1Var3.OooO0oO;
                    break;
                default:
                    tc1Var2 = tc1Var3.OooO0o;
                    break;
            }
            this.OooO0Oo = tc1Var2;
        }
        tc1 tc1Var4 = this.OooO0o0;
        if (tc1Var4 == tc1Var) {
            tc1 tc1Var5 = this.OooO0Oo;
            if (tc1Var4 != tc1Var5 && tc1Var5 != null) {
                tc1VarOooO0O0 = OooO0O0(tc1Var4);
            }
            this.OooO0o0 = tc1VarOooO0O0;
        }
    }

    public final tc1 OooO0O0(tc1 tc1Var) {
        switch (this.OooO0o) {
            case 0:
                return tc1Var.OooO0o;
            default:
                return tc1Var.OooO0oO;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0o0 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        tc1 tc1Var = this.OooO0o0;
        tc1 tc1Var2 = this.OooO0Oo;
        this.OooO0o0 = (tc1Var == tc1Var2 || tc1Var2 == null) ? null : OooO0O0(tc1Var);
        return tc1Var;
    }
}
