package com.cmaster.cloner;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cr0 {
    public static final /* synthetic */ int OooOO0 = 0;
    public boolean OooO;
    public final eb1 OooO00o = new eb1();
    public final eb1 OooO0O0 = new eb1();
    public final eb1 OooO0OO = new eb1();
    public final ArrayList OooO0Oo = new ArrayList();
    public int OooO0o;
    public final er0 OooO0o0;
    public long OooO0oO;
    public long OooO0oo;

    public cr0(er0 er0Var) {
        this.OooO0o0 = er0Var;
    }

    public final void OooO00o(o0O0O0Oo o0o0o0oo) {
        ArrayList arrayList = this.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o30) obj).getClass();
        }
        Objects.toString(o0o0o0oo.OooO0O0);
        this.OooO0o = 0;
        this.OooO0OO.OooOOOO();
        this.OooO = false;
        this.OooO00o.OooOOOO();
        this.OooO0O0.OooOO0o(wa1.OooO00o(-1, o0o0o0oo, null));
    }

    public final void OooO0O0(wa1 wa1Var) {
        h1.OooO00o();
        wa1Var.toString();
        this.OooO0oO = new Date().getTime();
        if (wa1Var.OooO0Oo()) {
            this.OooO0o = 2;
        } else {
            this.OooO0o = 0;
        }
        this.OooO00o.OooOO0o(wa1Var);
    }

    public boolean OooO0OO() {
        return this.OooO0o >= 2;
    }

    public abstract void OooO0Oo();

    public final void OooO0o() {
        int i = this.OooO0o;
        eb1 eb1Var = this.OooO00o;
        if (i == 2 && !OooO0OO()) {
            this.OooO0o = 0;
            this.OooO0OO.OooOOOO();
            this.OooO = false;
            eb1Var.OooOOOO();
        }
        if (this.OooO0o == 0 && !OooO0OO()) {
            this.OooO0o = 1;
            eb1Var.OooOOOO();
            gv0 gv0Var = o0OOOO0o.OooO0OO.OooO0O0;
            gv0Var.OooO0oO(new q5(this, gv0Var, 5));
        }
    }

    public abstract void OooO0o0(View view, Object obj);

    public final void OooO0oO(View view) {
        int i = this.OooO0o;
        if (i == 3) {
            return;
        }
        if (i != 2) {
            OooO00o(new o0O0O0Oo("moon illegal state", 1));
            return;
        }
        this.OooO0o = 3;
        this.OooO0O0.OooOOOO();
        this.OooO0oo = System.currentTimeMillis();
        Log.e("cr0", "requestShowInternal");
        wa1 wa1Var = (wa1) this.OooO00o.OooO0Oo();
        Object obj = (wa1Var == null || !wa1Var.OooO0Oo()) ? null : wa1Var.OooO0O0;
        if (obj == null) {
            OooO00o(new o0O0O0Oo("moon internal error", 1));
        } else {
            OooO0o0(view, obj);
        }
    }

    public final void OooO0oo(View view, long j, hm0 hm0Var, iy0 iy0Var) {
        h1.OooO00o();
        int i = this.OooO0o;
        eb1 eb1Var = this.OooO0O0;
        if (i == 3) {
            eb1Var.OooOOO(hm0Var, iy0Var);
            return;
        }
        if (!OooO0OO()) {
            OooO0o();
            this.OooO00o.OooOOO(hm0Var, new br0(this, j, view, j, hm0Var, iy0Var));
            return;
        }
        this.OooO0o0.getClass();
        if (!OooO0OO() || System.currentTimeMillis() - this.OooO0oo < 0) {
            eb1.OooOOOo(hm0Var, iy0Var, wa1.OooO00o(-8000, new o0O0O0Oo("ad can not show", 1), null));
        } else {
            OooO0oO(view);
            eb1Var.OooOOO(hm0Var, iy0Var);
        }
    }
}
