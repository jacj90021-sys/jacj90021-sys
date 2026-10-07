package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vn0 extends wn0 implements cm0 {
    public final /* synthetic */ gv0 OooO;
    public final hm0 OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn0(gv0 gv0Var, hm0 hm0Var, iy0 iy0Var) {
        super(gv0Var, iy0Var);
        this.OooO = gv0Var;
        this.OooO0oo = hm0Var;
    }

    @Override // com.cmaster.cloner.wn0
    public final void OooO0O0() {
        this.OooO0oo.OooO0o().OooOOOO(this);
    }

    @Override // com.cmaster.cloner.wn0
    public final boolean OooO0OO(hm0 hm0Var) {
        return this.OooO0oo == hm0Var;
    }

    @Override // com.cmaster.cloner.wn0
    public final boolean OooO0Oo() {
        return this.OooO0oo.OooO0o().OooO0o.compareTo(xl0.OooO0oO) >= 0;
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        hm0 hm0Var2 = this.OooO0oo;
        xl0 xl0Var = hm0Var2.OooO0o().OooO0o;
        if (xl0Var == xl0.OooO0Oo) {
            this.OooO.OooOO0O(this.OooO0Oo);
            return;
        }
        xl0 xl0Var2 = null;
        while (xl0Var2 != xl0Var) {
            OooO00o(OooO0Oo());
            xl0Var2 = xl0Var;
            xl0Var = hm0Var2.OooO0o().OooO0o;
        }
    }
}
