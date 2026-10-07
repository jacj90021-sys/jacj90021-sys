package com.cmaster.cloner;

import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class t20 {
    public static final s20 OooO00o = s20.OooO00o;

    public static s20 OooO00o(o10 o10Var) {
        while (o10Var != null) {
            if (o10Var.OooOOoo()) {
                o10Var.OooOOO0();
            }
            o10Var = o10Var.OooOo;
        }
        return OooO00o;
    }

    public static void OooO0O0(vu1 vu1Var) {
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(vu1Var.OooO0Oo.getClass().getName()), vu1Var);
        }
    }

    public static final void OooO0OO(o10 o10Var, String str) {
        str.getClass();
        OooO0O0(new p20(o10Var, "Attempting to reuse fragment " + o10Var + " with previous ID " + str));
        OooO00o(o10Var).getClass();
    }
}
