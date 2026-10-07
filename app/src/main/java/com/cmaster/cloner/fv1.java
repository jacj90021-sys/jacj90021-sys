package com.cmaster.cloner;

import android.util.Log;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fv1 extends nx implements cm0 {
    public final int OooOo;
    public final gv1 OooOo0O;
    public final String OooOo0o;
    public final hm0 OooOoO0;

    public fv1(hm0 hm0Var, gv1 gv1Var, String str, int i) {
        this.OooOo0o = str;
        this.OooOo = i;
        this.OooOo0O = gv1Var;
        this.OooOoO0 = hm0Var;
        hm0Var.OooO0o().OooO0OO(this);
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        if (wl0Var == wl0.ON_DESTROY) {
            gv1 gv1Var = this.OooOo0O;
            if (gv1Var != null) {
                try {
                    if (gv1Var.isShowing()) {
                        gv1Var.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
            OooOO0o(wa1.OooO00o(-1, "unknown", null));
        }
    }

    @Override // com.cmaster.cloner.nx, com.cmaster.cloner.eb1, com.cmaster.cloner.gv0
    /* renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
    public final void OooOO0o(wa1 wa1Var) {
        if (OooOOO0()) {
            return;
        }
        hv1.OooO0OO.OooO00o.remove(this);
        this.OooOoO0.OooO0o().OooOOOO(this);
        if (this.OooOo0O.isShowing()) {
            h1.OooO0O0.postDelayed(new o00OOOOo(this, 16), 200L);
        }
        super.OooOO0o(wa1Var);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LinkedHashSet linkedHashSet = hz.OooO0OO;
        String str = this.OooOo0o;
        int iOooo00o = -1;
        if (linkedHashSet.contains(str)) {
            return wa1.OooO0o0(-1);
        }
        try {
            iOooo00o = a02.OooO0oo.Oooo00o(this.OooOo, str);
        } catch (Exception unused) {
        }
        Log.e(sn2.OooO00o("2z7D\n", "j3+ESJsoDZ0=\n"), sn2.OooO00o("qvCIsAXfOaWj4oiyEo05\n", "xpH93ma3Gdc=\n") + iOooo00o);
        return wa1.OooO0o0(Integer.valueOf(iOooo00o));
    }
}
