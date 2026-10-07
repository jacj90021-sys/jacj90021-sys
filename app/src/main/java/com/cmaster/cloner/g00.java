package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class g00 extends zm {
    @Override // com.cmaster.cloner.zm
    public final int OooO0O0() {
        return this.OooO0O0.OooO0Oo.OooO0Oo();
    }

    @Override // com.cmaster.cloner.zm
    public final String OooO0oO() {
        os osVar = this.OooO0O0;
        au2 au2Var = osVar.OooO0Oo;
        au2Var.getClass();
        String strOooO00o = osVar.OooO00o();
        String strOooO0oO = au2Var.OooO0oO(this);
        String strOooO0oo = au2Var.OooO0oo(this);
        StringBuilder sb = new StringBuilder(100);
        sb.append(strOooO00o);
        if (strOooO0oO.length() != 0) {
            sb.append(' ');
            sb.append(strOooO0oO);
        }
        if (strOooO0oo.length() != 0) {
            rj.OooOOo0(new byte[]{-8, 50, -14, -35}, new byte[]{-40, 29, -35, -3, -30, 37, 29, 111}, sb, strOooO0oo);
        }
        return sb.toString();
    }

    @Override // com.cmaster.cloner.zm
    public final zm OooOO0(int i) {
        return OooOO0O(this.OooO0Oo.OooOO0o(i));
    }

    @Override // com.cmaster.cloner.zm
    public final void OooOO0o(q9 q9Var) {
        this.OooO0O0.OooO0Oo.OooOOoo(q9Var, this);
    }
}
