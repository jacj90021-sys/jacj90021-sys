package com.cmaster.cloner;

import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vw0 extends sh {
    public static final String OooO0o0 = ep0.OooO("NetworkMeteredCtrlr");

    @Override // com.cmaster.cloner.sh
    public final boolean OooO00o(w02 w02Var) {
        return w02Var.OooOO0.OooO00o == 5;
    }

    @Override // com.cmaster.cloner.sh
    public final boolean OooO0O0(Object obj) {
        xw0 xw0Var = (xw0) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (xw0Var.OooO00o && xw0Var.OooO0OO) ? false : true;
        }
        ep0.OooO0oO().OooO0Oo(OooO0o0, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !xw0Var.OooO00o;
    }
}
