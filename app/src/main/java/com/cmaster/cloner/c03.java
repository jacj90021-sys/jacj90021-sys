package com.cmaster.cloner;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c03 {
    public static t93 OooOO0;
    public static final hg2 OooOO0O;
    public final HashMap OooO = new HashMap();
    public final String OooO00o;
    public final String OooO0O0;
    public final wz2 OooO0OO;
    public final pg1 OooO0Oo;
    public final ac3 OooO0o;
    public final ac3 OooO0o0;
    public final String OooO0oO;
    public final int OooO0oo;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        OooOO0O = new hg2(objArr, 1);
    }

    public c03(Context context, pg1 pg1Var, wz2 wz2Var) {
        new HashMap();
        this.OooO00o = context.getPackageName();
        this.OooO0O0 = df.OooO00o(context);
        this.OooO0Oo = pg1Var;
        this.OooO0OO = wz2Var;
        v03.OooOOo0();
        this.OooO0oO = "vision-common";
        ay1 ay1VarOooOOO0 = ay1.OooOOO0();
        xr xrVar = new xr(this, 3);
        ay1VarOooOOO0.getClass();
        this.OooO0o0 = ay1.OooOo0(xrVar);
        ay1 ay1VarOooOOO02 = ay1.OooOOO0();
        pg1Var.getClass();
        zz2 zz2Var = new zz2(pg1Var, 0);
        ay1VarOooOOO02.getClass();
        this.OooO0o = ay1.OooOo0(zz2Var);
        hg2 hg2Var = OooOO0O;
        this.OooO0oo = hg2Var.containsKey("vision-common") ? fu.OooO0Oo(context, (String) hg2Var.get("vision-common"), false) : -1;
    }
}
