package com.cmaster.cloner;

import android.os.PowerManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xu1 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ yu1 OooO0o0;

    public /* synthetic */ xu1(yu1 yu1Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = yu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        yu1 yu1Var = this.OooO0o0;
        switch (i) {
            case 0:
                gv0 gv0Var = yu1Var.OooO0o;
                Object objOooO0Oo = gv0Var.OooO0Oo();
                Boolean bool = Boolean.TRUE;
                if (objOooO0Oo == bool) {
                    h01.OooO0OO.OooO00o.add(yu1.OooOOO0);
                    yu1.OooO0Oo(yu1Var);
                }
                if (gv0Var.OooO0Oo() == bool) {
                    gv0Var.OooOO0(Boolean.FALSE);
                    gv0 gv0Var2 = yu1Var.OooOO0O;
                    PowerManager powerManager = (PowerManager) e2.OooO.OooO00o.getSystemService(PowerManager.class);
                    if (powerManager != null && !powerManager.isIgnoringBatteryOptimizations(e2.OooO.OooO00o.getPackageName())) {
                        gv0Var2.OooOO0(new n7());
                        break;
                    } else {
                        gv0Var2.OooOO0(null);
                        break;
                    }
                }
                break;
            default:
                yu1.OooO0Oo(yu1Var);
                break;
        }
    }
}
