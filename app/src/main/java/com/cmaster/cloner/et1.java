package com.cmaster.cloner;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class et1 implements View.OnApplyWindowInsetsListener {
    public qz1 OooO00o = null;
    public final /* synthetic */ View OooO0O0;
    public final /* synthetic */ oy0 OooO0OO;

    public et1(View view, oy0 oy0Var) {
        this.OooO0O0 = view;
        this.OooO0OO = oy0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        qz1 qz1VarOooO0oO = qz1.OooO0oO(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        oy0 oy0Var = this.OooO0OO;
        if (i < 30) {
            ft1.OooO00o(windowInsets, this.OooO0O0);
            if (qz1VarOooO0oO.equals(this.OooO00o)) {
                return oy0Var.OooOOO(view, qz1VarOooO0oO).OooO0o();
            }
        }
        this.OooO00o = qz1VarOooO0oO;
        qz1 qz1VarOooOOO = oy0Var.OooOOO(view, qz1VarOooO0oO);
        if (i >= 30) {
            return qz1VarOooOOO.OooO0o();
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        dt1.OooO0OO(view);
        return qz1VarOooOOO.OooO0o();
    }
}
