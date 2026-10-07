package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uv extends vv implements Comparable {
    public final yk OooO0o0;

    public uv(yk ykVar, int i) {
        super(i);
        if (ykVar != null) {
            this.OooO0o0 = ykVar;
        } else {
            qa.OooOOO0(u7.OooO00o(new byte[]{-4, -54, -83, 37, 103, -88, -118, -104, -70, -51, -67, 37, 111}, new byte[]{-102, -93, -56, 73, 3, -120, -73, -91}));
            throw null;
        }
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        return this.OooO0o0.OooO00o();
    }

    @Override // com.cmaster.cloner.vv
    public final int OooO0OO(nq nqVar, q9 q9Var, int i, int i2) {
        mz mzVar = nqVar.OooO0oo;
        yk ykVar = this.OooO0o0;
        int iOooOOO = mzVar.OooOOO(ykVar);
        int i3 = iOooOOO - i;
        boolean zOooO0Oo = q9Var.OooO0Oo();
        int i4 = this.OooO0Oo;
        if (zOooO0Oo) {
            q9Var.OooO0O0(0, String.format(u7.OooO00o(new byte[]{-34, 97, -62, -7, 90, 4, 116, 88, -115}, new byte[]{-2, 65, -103, -36, 34, 89, 84, 125}), Integer.valueOf(i2), ykVar.OooO00o()));
            q9Var.OooO0O0(fv2.OooO00o(i3), u7.OooO00o(new byte[]{-55, -59, 75, 104, -96, 15, 22, 38, -115, -70, 2, 44, -66, 92, 83, 106, -55, -59}, new byte[]{-23, -27, 107, 72, -58, 102, 115, 74}).concat(js2.OooO0OO(iOooOOO)));
            q9Var.OooO0O0(fv2.OooO00o(i4), u7.OooO00o(new byte[]{-41, 34, 27, 31, -95, -53, 10, 61, -124, 113, 100, 89, -84, -55, 14, 43, -51, 34}, new byte[]{-9, 2, 59, 63, -64, -88, 105, 88}) + xl2.OooO00o(i4, 20703, 2));
        }
        q9Var.OooOOO(i3);
        q9Var.OooOOO(i4);
        return iOooOOO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OooO0o0.compareTo(((uv) obj).OooO0o0);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uv) && this.OooO0o0.compareTo(((uv) obj).OooO0o0) == 0;
    }

    public final int hashCode() {
        return this.OooO0o0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(uv.class.getName());
        sb.append('{');
        sb.append(js2.OooO0O0(this.OooO0Oo));
        sb.append(' ');
        sb.append(this.OooO0o0);
        sb.append('}');
        return sb.toString();
    }
}
