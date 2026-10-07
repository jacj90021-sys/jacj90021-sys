package com.cmaster.cloner;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ei1 {
    public int OooO00o;
    public int OooO0O0;
    public final o10 OooO0OO;
    public final ArrayList OooO0Oo;
    public boolean OooO0o;
    public final HashSet OooO0o0;
    public boolean OooO0oO;
    public final r20 OooO0oo;

    public ei1(int i, int i2, r20 r20Var, ib ibVar) {
        o10 o10Var = r20Var.OooO0OO;
        this.OooO0Oo = new ArrayList();
        this.OooO0o0 = new HashSet();
        this.OooO0o = false;
        this.OooO0oO = false;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = o10Var;
        ibVar.OooO00o(new o00OO000(this, 28));
        this.OooO0oo = r20Var;
    }

    public final void OooO00o() {
        if (this.OooO0o) {
            return;
        }
        this.OooO0o = true;
        if (this.OooO0o0.isEmpty()) {
            OooO0O0();
            return;
        }
        ArrayList arrayList = new ArrayList(this.OooO0o0);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ib ibVar = (ib) obj;
            synchronized (ibVar) {
                try {
                    if (!ibVar.OooO00o) {
                        ibVar.OooO00o = true;
                        ibVar.OooO0OO = true;
                        hb hbVar = ibVar.OooO0O0;
                        if (hbVar != null) {
                            try {
                                hbVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (ibVar) {
                                    ibVar.OooO0OO = false;
                                    ibVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (ibVar) {
                            ibVar.OooO0OO = false;
                            ibVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void OooO0O0() {
        if (!this.OooO0oO) {
            if (k20.Oooo000(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.OooO0oO = true;
            ArrayList arrayList = this.OooO0Oo;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.OooO0oo.OooOO0O();
    }

    public final void OooO0OO(int i, int i2) {
        int iOooOOoo = rj.OooOOoo(i2);
        o10 o10Var = this.OooO0OO;
        if (iOooOOoo == 0) {
            if (this.OooO00o != 1) {
                if (k20.Oooo000(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + o10Var + " mFinalState = " + px0.OooOoo0(this.OooO00o) + " -> " + px0.OooOoo0(i) + ". ");
                }
                this.OooO00o = i;
                return;
            }
            return;
        }
        if (iOooOOoo == 1) {
            if (this.OooO00o == 1) {
                if (k20.Oooo000(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + o10Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + px0.OooOoOO(this.OooO0O0) + " to ADDING.");
                }
                this.OooO00o = 2;
                this.OooO0O0 = 2;
                return;
            }
            return;
        }
        if (iOooOOoo != 2) {
            return;
        }
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + o10Var + " mFinalState = " + px0.OooOoo0(this.OooO00o) + " -> REMOVED. mLifecycleImpact  = " + px0.OooOoOO(this.OooO0O0) + " to REMOVING.");
        }
        this.OooO00o = 1;
        this.OooO0O0 = 3;
    }

    public final void OooO0Oo() {
        int i = this.OooO0O0;
        r20 r20Var = this.OooO0oo;
        if (i != 2) {
            if (i == 3) {
                o10 o10Var = r20Var.OooO0OO;
                View viewOoooO00 = o10Var.OoooO00();
                if (k20.Oooo000(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewOoooO00.findFocus() + " on view " + viewOoooO00 + " for Fragment " + o10Var);
                }
                viewOoooO00.clearFocus();
                return;
            }
            return;
        }
        o10 o10Var2 = r20Var.OooO0OO;
        View viewFindFocus = o10Var2.Oooo0.findFocus();
        if (viewFindFocus != null) {
            o10Var2.OooO0oO().OooOO0O = viewFindFocus;
            if (k20.Oooo000(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + o10Var2);
            }
        }
        View viewOoooO002 = this.OooO0OO.OoooO00();
        if (viewOoooO002.getParent() == null) {
            r20Var.OooO0O0();
            viewOoooO002.setAlpha(0.0f);
        }
        if (viewOoooO002.getAlpha() == 0.0f && viewOoooO002.getVisibility() == 0) {
            viewOoooO002.setVisibility(4);
        }
        n10 n10Var = o10Var2.Oooo0o0;
        viewOoooO002.setAlpha(n10Var == null ? 1.0f : n10Var.OooOO0);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + px0.OooOoo0(this.OooO00o) + "} {mLifecycleImpact = " + px0.OooOoOO(this.OooO0O0) + "} {mFragment = " + this.OooO0OO + "}";
    }
}
