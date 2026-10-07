package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qh {
    public wh1 OooO;
    public int OooO0O0;
    public boolean OooO0OO;
    public final hi OooO0Oo;
    public qh OooO0o;
    public final int OooO0o0;
    public HashSet OooO00o = null;
    public int OooO0oO = 0;
    public int OooO0oo = Integer.MIN_VALUE;

    public qh(hi hiVar, int i) {
        this.OooO0Oo = hiVar;
        this.OooO0o0 = i;
    }

    public final void OooO(int i) {
        this.OooO0O0 = i;
        this.OooO0OO = true;
    }

    public final void OooO00o(qh qhVar, int i, int i2) {
        if (qhVar == null) {
            OooO0oO();
            return;
        }
        this.OooO0o = qhVar;
        if (qhVar.OooO00o == null) {
            qhVar.OooO00o = new HashSet();
        }
        HashSet hashSet = this.OooO0o.OooO00o;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.OooO0oO = i;
        this.OooO0oo = i2;
    }

    public final void OooO0O0(int i, ky1 ky1Var, ArrayList arrayList) {
        HashSet hashSet = this.OooO00o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                fs2.OooO00o(((qh) it.next()).OooO0Oo, i, arrayList, ky1Var);
            }
        }
    }

    public final int OooO0OO() {
        if (this.OooO0OO) {
            return this.OooO0O0;
        }
        return 0;
    }

    public final int OooO0Oo() {
        qh qhVar;
        if (this.OooO0Oo.OooooOO == 8) {
            return 0;
        }
        int i = this.OooO0oo;
        return (i == Integer.MIN_VALUE || (qhVar = this.OooO0o) == null || qhVar.OooO0Oo.OooooOO != 8) ? this.OooO0oO : i;
    }

    public final boolean OooO0o() {
        return this.OooO0o != null;
    }

    public final boolean OooO0o0() {
        qh qhVar;
        HashSet hashSet = this.OooO00o;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            qh qhVar2 = (qh) it.next();
            hi hiVar = qhVar2.OooO0Oo;
            int i = qhVar2.OooO0o0;
            switch (rj.OooOOoo(i)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    qhVar = null;
                    break;
                case 1:
                    qhVar = hiVar.Oooo0;
                    break;
                case 2:
                    qhVar = hiVar.Oooo0O0;
                    break;
                case 3:
                    qhVar = hiVar.Oooo00O;
                    break;
                case 4:
                    qhVar = hiVar.Oooo00o;
                    break;
                default:
                    throw new AssertionError(rj.OooOOo(i));
            }
            if (qhVar.OooO0o()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0oO() {
        HashSet hashSet;
        qh qhVar = this.OooO0o;
        if (qhVar != null && (hashSet = qhVar.OooO00o) != null) {
            hashSet.remove(this);
            if (this.OooO0o.OooO00o.size() == 0) {
                this.OooO0o.OooO00o = null;
            }
        }
        this.OooO00o = null;
        this.OooO0o = null;
        this.OooO0oO = 0;
        this.OooO0oo = Integer.MIN_VALUE;
        this.OooO0OO = false;
        this.OooO0O0 = 0;
    }

    public final void OooO0oo() {
        wh1 wh1Var = this.OooO;
        if (wh1Var == null) {
            this.OooO = new wh1(1);
        } else {
            wh1Var.OooO0OO();
        }
    }

    public final String toString() {
        return this.OooO0Oo.OooooOo + ":" + rj.OooOOo(this.OooO0o0);
    }
}
