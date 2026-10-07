package com.cmaster.cloner;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gt1 {
    public static qz1 OooO00o(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        qz1 qz1VarOooO0oO = qz1.OooO0oO(rootWindowInsets, null);
        mz1 mz1Var = qz1VarOooO0oO.OooO00o;
        mz1Var.OooOOOo(qz1VarOooO0oO);
        mz1Var.OooO0Oo(view.getRootView());
        return qz1VarOooO0oO;
    }

    public static void OooO0O0(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
