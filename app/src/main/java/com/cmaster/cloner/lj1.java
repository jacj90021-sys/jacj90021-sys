package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lj1 extends ky0 {
    public final ml OooO0oo;

    public lj1(ml mlVar) {
        super(1, fv2.OooO00o(mlVar.OooO0Oo.length()) + mlVar.OooO0o0.OooO0Oo + 1);
        this.OooO0oo = mlVar;
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOo0O;
    }

    @Override // com.cmaster.cloner.ky0
    public final int OooO0o0(ky0 ky0Var) {
        return this.OooO0oo.compareTo(((lj1) ky0Var).OooO0oo);
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooOO0O(nq nqVar, q9 q9Var) {
        ml mlVar = this.OooO0oo;
        oOo000Oo ooo000oo = mlVar.OooO0o0;
        int length = mlVar.OooO0Oo.length();
        if (q9Var.OooO0Oo()) {
            rj.OooOO0O(length, u7.OooO00o(new byte[]{77, -49, 7, -80, -80, -93, 106, -88, 66, -34, 91, -95}, new byte[]{56, -69, 97, -127, -122, -4, 25, -63}), q9Var, fv2.OooO00o(length));
            q9Var.OooO0O0(ooo000oo.OooO0Oo + 1, mlVar.OooO0o());
        }
        q9Var.OooOOO(length);
        int i = ooo000oo.OooO0Oo;
        int i2 = q9Var.OooO0OO;
        int i3 = i + i2;
        if (q9Var.OooO00o) {
            q9Var.OooO0oO(i3);
        } else if (i3 > q9Var.OooO0O0.length) {
            q9.OooO0oo();
            throw null;
        }
        byte[] bArr = q9Var.OooO0O0;
        int length2 = bArr.length - i2;
        int i4 = ooo000oo.OooO0Oo;
        if (length2 < i4) {
            ra.OooO0oO(u7.OooO00o(new byte[]{-113, 76, -1, -19, -67, -127, -23, -47, -64, 87, -30, -71, -66, -51, -29, -39, -63, 80, -17, -19, -70, -51, -80, -97, -44, 74, -16, -4, -69, -60}, new byte[]{-89, 35, -118, -103, -109, -19, -116, -65}));
            return;
        }
        System.arraycopy((byte[]) ooo000oo.OooO0o0, 0, bArr, i2, i4);
        q9Var.OooO0OO = i3;
        q9Var.OooOO0(0);
    }
}
