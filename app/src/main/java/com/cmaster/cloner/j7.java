package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j7 extends h00 {
    public final ti0 OooO0o;
    public int OooO0oO;

    public j7(int i) {
        super(i);
        this.OooO0o = new ti0(i);
        this.OooO0oO = -1;
    }

    public final int OooO() {
        ti0 ti0Var = this.OooO0o;
        int i = ti0Var.OooO0o - 1;
        while (i >= 0 && ti0Var.OooO0o(i) < 0) {
            i--;
        }
        int i2 = i + 1;
        if (i2 < 0) {
            ti0Var.getClass();
            ra.OooOOO(u7.OooO00o(new byte[]{-100, 60, 17, -79, 40, -62, -121, 53, -50, 121, 86}, new byte[]{-14, 89, 102, -30, 65, -72, -30, 21}));
            return 0;
        }
        if (i2 > ti0Var.OooO0o) {
            ra.OooOOO(u7.OooO00o(new byte[]{71, 22, -35, -81, 106, -12, -15, -115, 23, 83, -39, -107, 121, -21}, new byte[]{41, 115, -86, -4, 3, -114, -108, -83}));
            return 0;
        }
        ti0Var.OooO0OO();
        ti0Var.OooO0o = i2;
        return i2;
    }

    public final i7 OooOO0(int i) {
        ti0 ti0Var = this.OooO0o;
        int iOooO0o = i >= ti0Var.OooO0o ? -1 : ti0Var.OooO0o(i);
        if (iOooO0o >= 0) {
            return (i7) OooO0o0(iOooO0o);
        }
        ra.OooOOO(u7.OooO00o(new byte[]{13, -46, 60, -99, -4, -115, 79, 45, 15, -36, 126, -117, -27, -44, 7}, new byte[]{99, -67, 28, -18, -119, -18, 39, 13}).concat(js2.OooO0O0(i)));
        return null;
    }
}
