package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a0 extends k10 {
    public final /* synthetic */ k0 OooOOO;
    public final /* synthetic */ h0 OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k0 k0Var, k0 k0Var2, h0 h0Var) {
        super(k0Var2);
        this.OooOOO = k0Var;
        this.OooOOO0 = h0Var;
    }

    @Override // com.cmaster.cloner.k10
    public final wg1 OooO0O0() {
        return this.OooOOO0;
    }

    @Override // com.cmaster.cloner.k10
    public final boolean OooO0OO() {
        k0 k0Var = this.OooOOO;
        if (k0Var.getInternalPopup().OooO00o()) {
            return true;
        }
        k0Var.OooO.OooOOO0(k0Var.getTextDirection(), k0Var.getTextAlignment());
        return true;
    }
}
