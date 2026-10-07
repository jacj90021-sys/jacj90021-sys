package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tv extends ky0 {
    public byte[] OooO;
    public final tk OooO0oo;

    public tv(tk tkVar) {
        super(1, -1);
        this.OooO0oo = tkVar;
        this.OooO = null;
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooO(zt0 zt0Var, int i) {
        q9 q9Var = new q9();
        new vr1(zt0Var.OooO0O0, q9Var).OooO0oo(this.OooO0oo, false);
        int i2 = q9Var.OooO0OO;
        byte[] bArr = new byte[i2];
        System.arraycopy(q9Var.OooO0O0, 0, bArr, 0, i2);
        this.OooO = bArr;
        OooOO0(i2);
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        vr1.OooO00o(nqVar, this.OooO0oo);
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOoO0;
    }

    @Override // com.cmaster.cloner.ky0
    public final int OooO0o0(ky0 ky0Var) {
        return this.OooO0oo.compareTo(((tv) ky0Var).OooO0oo);
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooOO0O(nq nqVar, q9 q9Var) {
        if (!q9Var.OooO0Oo()) {
            q9Var.OooO(this.OooO);
        } else {
            q9Var.OooO0O0(0, OooO0oO().concat(u7.OooO00o(new byte[]{-76, -126, -29, 66, 47, 6, -37, 12, -76, -122, -1, 83, 33, 27}, new byte[]{-108, -25, -115, 33, 64, 98, -66, 104})));
            new vr1(nqVar, q9Var).OooO0oo(this.OooO0oo, true);
        }
    }

    public final int hashCode() {
        return this.OooO0oo.hashCode();
    }
}
