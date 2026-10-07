package com.cmaster.cloner;

import android.text.TextUtils;
import android.util.Log;
import java.util.TimeZone;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO0o0o {
    public final /* synthetic */ a02 OooO00o;

    public oO0o0o(a02 a02Var) {
        this.OooO00o = a02Var;
    }

    public final void OooO00o(i10 i10Var) {
        StringBuilder sb = new StringBuilder("onConsentInfoUpdateFailure: ");
        sb.append(i10Var);
        a02 a02Var = this.OooO00o;
        ws2 ws2Var = (ws2) a02Var.OooO0o;
        sb.append(ws2Var.OooO00o());
        Log.e("AdViewLoader", sb.toString());
        if (ws2Var.OooO00o() || TextUtils.equals(TimeZone.getDefault().getID(), "Asia/Shanghai")) {
            o0OOOO0o.OooO0OO.OooO00o();
        }
        ((gv0) a02Var.OooO0oO).OooOO0o(wa1.OooO0o0(new o0O0O0Oo(i10Var, 1)));
    }
}
