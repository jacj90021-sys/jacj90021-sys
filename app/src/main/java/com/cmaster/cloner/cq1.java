package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cq1 extends ky0 {
    public final aq1 OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public cq1(aq1 aq1Var) {
        super(4, (((h00) aq1Var).OooO0o0.length * 2) + 4);
        this.OooO0oo = aq1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        o51 o51Var = nqVar.OooO0o;
        aq1 aq1Var = this.OooO0oo;
        int length = ((h00) aq1Var).OooO0o0.length;
        for (int i = 0; i < length; i++) {
            o51Var.OooOOoo(aq1Var.getType(i));
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOOo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.ky0
    public final int OooO0o0(ky0 ky0Var) {
        aq1 aq1Var = ((cq1) ky0Var).OooO0oo;
        bj1 bj1Var = bj1.OooO0o;
        aq1 aq1Var2 = this.OooO0oo;
        int length = ((h00) aq1Var2).OooO0o0.length;
        int length2 = ((h00) aq1Var).OooO0o0.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = aq1Var2.getType(i).OooO0Oo.compareTo(aq1Var.getType(i).OooO0Oo);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length == length2) {
            return 0;
        }
        return length < length2 ? -1 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.ky0
    public final void OooOO0O(nq nqVar, q9 q9Var) {
        o51 o51Var = nqVar.OooO0o;
        aq1 aq1Var = this.OooO0oo;
        int length = ((h00) aq1Var).OooO0o0.length;
        if (q9Var.OooO0Oo()) {
            q9Var.OooO0O0(0, OooO0oO().concat(u7.OooO00o(new byte[]{-58, -63, 3, -106, 19, -98, 63, -29, -107, -63}, new byte[]{-26, -75, 122, -26, 118, -63, 83, -118})));
            rj.OooOO0O(length, u7.OooO00o(new byte[]{-126, -30, 85, 105, -97, 33, -30, 6}, new byte[]{-94, -62, 38, 0, -27, 68, -40, 38}), q9Var, 4);
            for (int i = 0; i < length; i++) {
                vp1 type = aq1Var.getType(i);
                q9Var.OooO0O0(2, "  " + js2.OooO0O0(o51Var.OooOOOo(type)) + u7.OooO00o(new byte[]{-79, 57, -122, -73}, new byte[]{-111, 22, -87, -105, -81, -108, -66, 65}) + type.OooO00o());
            }
        }
        q9Var.OooOO0O(length);
        for (int i2 = 0; i2 < length; i2++) {
            q9Var.OooOO0o(o51Var.OooOOOo(aq1Var.getType(i2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        bj1 bj1Var = bj1.OooO0o;
        aq1 aq1Var = this.OooO0oo;
        int length = ((h00) aq1Var).OooO0o0.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            iHashCode = (iHashCode * 31) + aq1Var.getType(i).OooO0Oo.hashCode();
        }
        return iHashCode;
    }
}
