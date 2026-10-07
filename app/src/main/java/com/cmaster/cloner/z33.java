package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class z33 {
    public static int OooO00o(u71 u71Var, pu puVar, View view, View view2, i71 i71Var, boolean z) {
        if (i71Var.OooOo0O() == 0 || u71Var.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(i71.Oooo00o(view) - i71.Oooo00o(view2)) + 1;
        }
        return Math.min(puVar.OooOOO(), puVar.OooO0Oo(view2) - puVar.OooO0oO(view));
    }

    public static int OooO0O0(u71 u71Var, pu puVar, View view, View view2, i71 i71Var, boolean z, boolean z2) {
        if (i71Var.OooOo0O() == 0 || u71Var.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (u71Var.OooO0O0() - Math.max(i71.Oooo00o(view), i71.Oooo00o(view2))) - 1) : Math.max(0, Math.min(i71.Oooo00o(view), i71.Oooo00o(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(puVar.OooO0Oo(view2) - puVar.OooO0oO(view)) / (Math.abs(i71.Oooo00o(view) - i71.Oooo00o(view2)) + 1))) + (puVar.OooOOO0() - puVar.OooO0oO(view)));
        }
        return iMax;
    }

    public static int OooO0OO(u71 u71Var, pu puVar, View view, View view2, i71 i71Var, boolean z) {
        if (i71Var.OooOo0O() == 0 || u71Var.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return u71Var.OooO0O0();
        }
        return (int) (((puVar.OooO0Oo(view2) - puVar.OooO0oO(view)) / (Math.abs(i71.Oooo00o(view) - i71.Oooo00o(view2)) + 1)) * u71Var.OooO0O0());
    }
}
