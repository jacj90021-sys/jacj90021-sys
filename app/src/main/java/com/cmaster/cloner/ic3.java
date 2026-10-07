package com.cmaster.cloner;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ic3 {
    public static qf2 OooOO0O;
    public static final hg2 OooOO0o;
    public final String OooO00o;
    public final String OooO0O0;
    public final ec3 OooO0OO;
    public final pg1 OooO0Oo;
    public final ac3 OooO0o;
    public final ac3 OooO0o0;
    public final String OooO0oO;
    public final int OooO0oo;
    public final HashMap OooO = new HashMap();
    public final HashMap OooOO0 = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        OooOO0o = new hg2(objArr, 0);
    }

    public ic3(Context context, pg1 pg1Var, ec3 ec3Var, String str) {
        this.OooO00o = context.getPackageName();
        this.OooO0O0 = df.OooO00o(context);
        this.OooO0Oo = pg1Var;
        this.OooO0OO = ec3Var;
        qc3.OooO00o();
        this.OooO0oO = str;
        ay1 ay1VarOooOOO0 = ay1.OooOOO0();
        xr xrVar = new xr(this, 7);
        ay1VarOooOOO0.getClass();
        this.OooO0o0 = ay1.OooOo0(xrVar);
        ay1 ay1VarOooOOO02 = ay1.OooOOO0();
        Objects.requireNonNull(pg1Var);
        zz2 zz2Var = new zz2(pg1Var, 2);
        ay1VarOooOOO02.getClass();
        this.OooO0o = ay1.OooOo0(zz2Var);
        hg2 hg2Var = OooOO0o;
        this.OooO0oo = hg2Var.containsKey(str) ? fu.OooO0Oo(context, (String) hg2Var.get(str), false) : -1;
    }

    public static long OooO00o(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void OooO0O0(hc3 hc3Var, f63 f63Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (OooO0Oo(f63Var, jElapsedRealtime)) {
            this.OooO.put(f63Var, Long.valueOf(jElapsedRealtime));
            qo2.OooO0Oo.execute(new sb(this, hc3Var.zza(), f63Var, OooO0OO(), 11, false));
        }
    }

    public final String OooO0OO() {
        ac3 ac3Var = this.OooO0o0;
        if (ac3Var.OooO0o()) {
            return (String) ac3Var.OooO0Oo();
        }
        return sl0.OooO0OO.OooO00o(this.OooO0oO);
    }

    public final boolean OooO0Oo(f63 f63Var, long j) {
        HashMap map = this.OooO;
        return map.get(f63Var) == null || j - ((Long) map.get(f63Var)).longValue() > 30000;
    }
}
