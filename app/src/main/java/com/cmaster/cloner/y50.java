package com.cmaster.cloner;

import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y50 extends gr0 implements cm0 {
    public final er0 OooO;
    public final oOOO00 OooOO0;
    public final hm0 OooOO0O;
    public oO0Oo0oo OooOO0o;
    public final oO000O0O OooOOO0;

    public y50(oOOO00 oooo00, hm0 hm0Var, o00OO000 o00oo000, er0 er0Var) {
        this.OooO = er0Var;
        this.OooOOO0 = (oO000O0O) o00oo000.OooO0o0;
        this.OooOO0 = oooo00;
        this.OooOO0O = hm0Var;
    }

    public final void OooO(ViewGroup viewGroup) {
        ViewParent parent;
        oO0Oo0oo oo0oo0oo = this.OooOO0o;
        if (oo0oo0oo == null || this.OooO0oO < 2 || (parent = oo0oo0oo.getParent()) == viewGroup) {
            return;
        }
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(oo0oo0oo);
        }
        viewGroup.removeView(oo0oo0oo);
        viewGroup.addView(oo0oo0oo);
    }

    @Override // com.cmaster.cloner.gr0
    public final void OooO0Oo() {
        this.OooOO0O.OooO0o().OooOOOO(this);
        this.OooO0oO = -1;
        this.OooO0o0.OooOOOO();
        oO0Oo0oo oo0oo0oo = this.OooOO0o;
        if (oo0oo0oo != null) {
            oo0oo0oo.OooO00o();
            ViewParent parent = this.OooOO0o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.OooOO0o);
            }
            this.OooOO0o = null;
        }
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) {
        oO0Oo0oo oo0oo0oo = this.OooOO0o;
        if (oo0oo0oo != null) {
            if (wl0Var == wl0.ON_RESUME) {
                oo0oo0oo.OooO0Oo();
            } else if (wl0Var == wl0.ON_PAUSE) {
                oo0oo0oo.OooO0OO();
            } else if (wl0Var == wl0.ON_DESTROY) {
                oo0oo0oo.OooO00o();
                this.OooO0oO = 0;
                this.OooO0o0.OooOOOO();
            }
        }
        if (wl0Var != wl0.ON_START || this.OooO0oO == -1) {
            return;
        }
        OooO0o0();
    }

    @Override // com.cmaster.cloner.gr0
    public final void OooO0oO() {
        if (this.OooO0oO == -1) {
            this.OooO0oO = 0;
            this.OooO0o0.OooOOOO();
        }
    }

    @Override // com.cmaster.cloner.gr0
    public final void OooO0oo(ViewGroup viewGroup) {
        Log.e(this.OooO0o, "request");
        if (this.OooO0oO >= 2) {
            OooO(viewGroup);
            return;
        }
        OooO0o0();
        this.OooO0o0.OooOOO(this.OooOO0O, new q5((gr0) this, viewGroup, 3));
    }
}
