package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x41 {
    public static final u5 OooO0O0 = new u5(3);
    public final eb1 OooO00o;

    public x41(App app) {
        eb1 eb1Var = new eb1();
        this.OooO00o = eb1Var;
        int i = app.getSharedPreferences(sn2.OooO00o("NTD57HyA\n", "Vl+XihXn684=\n"), 0).getInt(sn2.OooO00o("V2vOQ64=\n", "IQ68HN43w6g=\n"), 0);
        PackageInfo packageInfoOooO00o = e2.OooO00o();
        eb1Var.OooOO0o(Integer.valueOf((packageInfoOooO00o != null && packageInfoOooO00o.versionCode == 20080) ? TextUtils.equals(sn2.OooO00o("QrLILC0V9zA=\n", "cJzwAh07xgA=\n"), packageInfoOooO00o.versionName) : false ? i : 0));
    }
}
