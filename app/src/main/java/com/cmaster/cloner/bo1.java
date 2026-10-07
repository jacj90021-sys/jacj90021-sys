package com.cmaster.cloner;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bo1 {
    public final do1 OooO00o;

    public bo1(do1 do1Var) {
        this.OooO00o = do1Var;
    }

    public static final bo1 OooO00o(Context context) {
        ao1 ao1Var;
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        oO000O0 oo000o0 = oO000O0.OooO00o;
        if ((i >= 30 ? oo000o0.OooO00o() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) n6.OooOoOO());
            systemService.getClass();
            ao1Var = new ao1(n6.OooOOO0(systemService), 1);
        } else {
            if ((i >= 30 ? oo000o0.OooO00o() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) n6.OooOoOO());
                systemService2.getClass();
                ao1Var = new ao1(n6.OooOOO0(systemService2), i2);
            } else {
                ao1Var = null;
            }
        }
        if (ao1Var != null) {
            return new bo1(ao1Var);
        }
        return null;
    }

    public nn0 OooO0O0(v40 v40Var) {
        v40Var.getClass();
        wo woVar = gs.OooO00o;
        return ip2.OooO00o(ao2.OooO00o(sp2.OooO00o(pp0.OooO00o), new dh(this, v40Var, null, 3)));
    }
}
