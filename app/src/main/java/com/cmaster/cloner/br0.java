package com.cmaster.cloner;

import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class br0 implements iy0, Runnable {
    public final /* synthetic */ iy0 OooO;
    public final g1 OooO0Oo;
    public final /* synthetic */ View OooO0o;
    public boolean OooO0o0;
    public final /* synthetic */ long OooO0oO;
    public final /* synthetic */ hm0 OooO0oo;
    public final /* synthetic */ cr0 OooOO0;

    public br0(cr0 cr0Var, long j, View view, long j2, hm0 hm0Var, iy0 iy0Var) {
        this.OooOO0 = cr0Var;
        this.OooO0o = view;
        this.OooO0oO = j2;
        this.OooO0oo = hm0Var;
        this.OooO = iy0Var;
        g1 g1Var = h1.OooO0O0;
        this.OooO0Oo = g1Var;
        g1Var.postDelayed(this, j);
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        if (this.OooO0o0) {
            return;
        }
        this.OooO0Oo.removeCallbacks(this);
        OooO0O0(obj, false);
        this.OooO0o0 = true;
    }

    public final void OooO0O0(Object obj, boolean z) {
        wa1 wa1VarOooO00o = (wa1) obj;
        cr0 cr0Var = this.OooOO0;
        cr0Var.OooO00o.OooOO0O(this);
        iy0 iy0Var = this.OooO;
        if (z) {
            wa1VarOooO00o = wa1.OooO00o(-8000, new o0O0O0Oo("ad load timeout", 1), null);
        } else if (cr0Var.OooO0OO()) {
            this.OooOO0.OooO0oo(this.OooO0o, this.OooO0oO, this.OooO0oo, iy0Var);
            wa1VarOooO00o = null;
        } else {
            Objects.toString(wa1VarOooO00o);
        }
        if (wa1VarOooO00o != null) {
            eb1.OooOOOo(this.OooO0oo, iy0Var, wa1VarOooO00o);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.OooO0o0) {
            return;
        }
        this.OooO0Oo.removeCallbacks(this);
        OooO0O0(null, true);
        this.OooO0o0 = true;
    }
}
