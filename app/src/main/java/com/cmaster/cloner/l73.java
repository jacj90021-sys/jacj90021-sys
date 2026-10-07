package com.cmaster.cloner;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l73 {
    public static final t52 OooO0O0 = t52.OooO00o(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String OooO00o;

    public l73(Context context, pg1 pg1Var) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        df.OooO00o(context);
        synchronized (d83.class) {
            int i = 0;
            if (d83.OooO0o0 == null) {
                d83.OooO0o0 = new d83(i);
            }
        }
        this.OooO00o = "common";
        ay1 ay1VarOooOOO0 = ay1.OooOOO0();
        xr xrVar = new xr(this, 6);
        ay1VarOooOOO0.getClass();
        ay1.OooOo0(xrVar);
        ay1 ay1VarOooOOO02 = ay1.OooOOO0();
        Objects.requireNonNull(pg1Var);
        zz2 zz2Var = new zz2(pg1Var, 1);
        ay1VarOooOOO02.getClass();
        ay1.OooOo0(zz2Var);
        t52 t52Var = OooO0O0;
        if (t52Var.containsKey("common")) {
            fu.OooO0Oo(context, (String) t52Var.get("common"), false);
        }
    }
}
