package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wu1 extends g7 {
    public final String OooO;
    public final String OooO0o0;
    public final fy0 OooO0oo;
    public final int OooOO0;
    public final gy0 OooOO0O;
    public PackageInfo OooOO0o;
    public final int OooOOO;
    public final qj0 OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public int OooOOo0;
    public final gy0 OooO0o = new gy0();
    public final gy0 OooO0oO = new gy0();

    public wu1(qj0 qj0Var, int i) {
        gy0 gy0Var = new gy0();
        this.OooOO0O = gy0Var;
        this.OooOOO0 = qj0Var;
        this.OooOO0o = null;
        this.OooOOO = i;
        this.OooOOOO = true;
        this.OooO0o0 = qj0Var.OooO0O0;
        this.OooO = qj0Var.OooO00o(qj0.OooO);
        this.OooO0oo = new fy0(false);
        this.OooOOo0 = qj0Var.OooO0O0();
        this.OooOO0 = qj0Var.OooO0o0;
        gy0Var.OooO0Oo(qj0Var.OooO00o(sn2.OooO00o("zFcnFmYO3M/aWzwJKU7Qzsw=\n", "qS9TZAcgv7o=\n")));
    }

    public final Object OooO0Oo() {
        PackageInfo packageInfo;
        String strOooO00o = this.OooOOO0.OooO00o(sn2.OooO00o("g9/E5d1vpvmV09/6kiim44g=\n", "5qewl7xBxYw=\n"));
        return (strOooO00o != null || (packageInfo = this.OooOO0o) == null) ? strOooO00o : packageInfo.applicationInfo;
    }

    public final void OooO0o0() {
        String str;
        String str2;
        this.OooO0oo.OooO0Oo((!this.OooOOOo && this.OooOOo0 == 0 && this.OooOOOO) ? false : true);
        boolean z = this.OooOOOo;
        gy0 gy0Var = this.OooO0oO;
        if (z) {
            gy0Var.OooO0Oo(sn2.OooO00o("VcLixiGS\n", "E7CNvET8o3I=\n"));
            return;
        }
        if (this.OooOOo0 != 0) {
            gy0Var.OooO0Oo(sn2.OooO00o("PgQFlg==\n", "dm1h8x1e+nA=\n"));
            return;
        }
        if (this.OooOOOO) {
            str = "IwR2gWQ=\n";
            str2 = "YGgZ7wF51Qw=\n";
        } else {
            str = "18jNkio=\n";
            str2 = "lqSi/E/thDk=\n";
        }
        gy0Var.OooO0Oo(sn2.OooO00o(str, str2));
    }

    public final void OooO0oO() {
        String strOooO00o = sn2.OooO00o("/WDSm7egL4jrbMmE+OItn/10\n", "mBim6daOTP0=\n");
        qj0 qj0Var = this.OooOOO0;
        String strOooO00o2 = qj0Var.OooO00o(strOooO00o);
        gy0 gy0Var = this.OooO0o;
        if (strOooO00o2 != null) {
            gy0Var.OooO0Oo(strOooO00o2);
            return;
        }
        String str = qj0.OooOO0;
        if (qj0Var.OooO00o(str) == null) {
            gy0Var.OooO0Oo(this.OooO0o0);
        }
        gy0Var.OooO0Oo(qj0Var.OooO00o(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wu1.class != obj.getClass()) {
            return false;
        }
        wu1 wu1Var = (wu1) obj;
        return this.OooOO0 == wu1Var.OooOO0 && this.OooOOO == wu1Var.OooOOO && this.OooOOO0.equals(wu1Var.OooOOO0) && Objects.equals(this.OooO0o0, wu1Var.OooO0o0) && Boolean.valueOf(this.OooOOOo).equals(Boolean.valueOf(wu1Var.OooOOOo)) && Integer.valueOf(this.OooOOo0).equals(Integer.valueOf(wu1Var.OooOOo0)) && Objects.equals(this.OooO, wu1Var.OooO);
    }

    public final int hashCode() {
        return Objects.hash(this.OooOOO0, Integer.valueOf(this.OooOOO), this.OooO0o0, Boolean.valueOf(this.OooOOOo), Integer.valueOf(this.OooOOo0), this.OooO);
    }
}
