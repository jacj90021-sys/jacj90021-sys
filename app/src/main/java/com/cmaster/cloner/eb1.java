package com.cmaster.cloner;

import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class eb1 extends gv0 {
    public final HashMap OooOOOO = new HashMap();
    public volatile boolean OooOOOo = true;

    public static void OooOOOo(hm0 hm0Var, iy0 iy0Var, wa1 wa1Var) {
        if (hm0Var.OooO0o().OooO0o.compareTo(xl0.OooO0oO) >= 0) {
            iy0Var.OooO00o(wa1Var);
            return;
        }
        eb1 eb1Var = new eb1();
        eb1Var.OooOOO(hm0Var, iy0Var);
        if (h1.OooO0O0()) {
            eb1Var.OooOO0o(wa1Var);
        } else {
            eb1Var.OooOO0(wa1Var);
        }
    }

    @Override // com.cmaster.cloner.gv0
    public void OooO0o0(hm0 hm0Var, iy0 iy0Var) {
        HashMap map = this.OooOOOO;
        db1 db1Var = (db1) map.get(iy0Var);
        if (db1Var == null) {
            db1Var = new db1(this, iy0Var);
            map.put(iy0Var, db1Var);
        }
        super.OooO0o0(hm0Var, db1Var);
    }

    @Override // com.cmaster.cloner.gv0
    public void OooO0oO(iy0 iy0Var) {
        HashMap map = this.OooOOOO;
        db1 db1Var = (db1) map.get(iy0Var);
        if (db1Var == null) {
            db1Var = new db1(this, iy0Var);
            map.put(iy0Var, db1Var);
        }
        super.OooO0oO(db1Var);
    }

    @Override // com.cmaster.cloner.gv0
    public final void OooOO0O(iy0 iy0Var) {
        if (iy0Var.getClass() == db1.class) {
            iy0Var = ((db1) iy0Var).OooO0Oo;
        }
        iy0 iy0Var2 = (iy0) this.OooOOOO.remove(iy0Var);
        if (iy0Var2 == null) {
            return;
        }
        super.OooOO0O(iy0Var2);
    }

    @Override // com.cmaster.cloner.gv0
    public void OooOO0o(Object obj) {
        if (!h1.OooO0O0()) {
            OooOO0(obj);
            return;
        }
        if (this.OooOOOo) {
            this.OooOOOo = false;
        }
        super.OooOO0o(obj);
    }

    public final void OooOOO(hm0 hm0Var, iy0 iy0Var) {
        HashMap map = this.OooOOOO;
        db1 db1Var = (db1) map.get(iy0Var);
        if (db1Var == null) {
            db1Var = new db1(this, iy0Var, 0);
            map.put(iy0Var, db1Var);
        }
        super.OooO0o0(hm0Var, db1Var);
    }

    public final boolean OooOOO0() {
        return (this.OooO0oo == gv0.OooOOO || this.OooOOOo) ? false : true;
    }

    public void OooOOOO() {
        this.OooOOOo = true;
        super.OooOO0o(null);
    }
}
