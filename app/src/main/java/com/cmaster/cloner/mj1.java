package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mj1 extends gg0 implements Comparable {
    public lj1 OooO0o;
    public final ml OooO0o0;

    public mj1(ml mlVar) {
        if (mlVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{60, -83, -54, 59, 44, -115, -89, -26, 106, -94, -45, 34, 37}, new byte[]{74, -52, -90, 78, 73, -83, -102, -37}));
            throw null;
        }
        this.OooO0o0 = mlVar;
        this.OooO0o = null;
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        if (this.OooO0o == null) {
            zt0 zt0Var = nqVar.OooO0Oo;
            lj1 lj1Var = new lj1(this.OooO0o0);
            this.OooO0o = lj1Var;
            zt0Var.OooOOO0(lj1Var);
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooO0oo;
    }

    @Override // com.cmaster.cloner.pj0
    public final int OooO0OO() {
        return 4;
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO0Oo(nq nqVar, q9 q9Var) {
        String strOooO00o;
        int iOooO0o = this.OooO0o.OooO0o();
        if (q9Var.OooO0Oo()) {
            StringBuilder sb = new StringBuilder();
            sb.append(OooO0o());
            sb.append(' ');
            String strOooO00o2 = this.OooO0o0.OooO00o();
            if (strOooO00o2.length() <= 98) {
                strOooO00o = "";
            } else {
                strOooO00o2 = strOooO00o2.substring(0, 95);
                strOooO00o = u7.OooO00o(new byte[]{-121, -123, 107}, new byte[]{-87, -85, 69, 23, 18, 47, 23, 89});
            }
            sb.append("\"" + strOooO00o2 + strOooO00o + '\"');
            q9Var.OooO0O0(0, sb.toString());
            rj.OooOO0O(iOooO0o, u7.OooO00o(new byte[]{14, 114, 51, -126, 67, -109, -121, -22, 113, 54, 33, -126, 80, -91, -122, -21, 72, 104, 96}, new byte[]{46, 82, 64, -10, 49, -6, -23, -115}), q9Var, 4);
        }
        q9Var.OooOO0O(iOooO0o);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OooO0o0.compareTo(((mj1) obj).OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mj1) {
            return this.OooO0o0.equals(((mj1) obj).OooO0o0);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0o0.OooO0Oo.hashCode();
    }
}
