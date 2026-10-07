package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ly1 implements qp {
    public int OooO00o;
    public hi OooO0O0;
    public kc1 OooO0OO;
    public int OooO0Oo;
    public final mr OooO0o0 = new mr(this);
    public int OooO0o = 0;
    public boolean OooO0oO = false;
    public final up OooO0oo = new up(this);
    public final up OooO = new up(this);
    public int OooOO0 = 1;

    public ly1(hi hiVar) {
        this.OooO0O0 = hiVar;
    }

    public static up OooO(qh qhVar, int i) {
        qh qhVar2 = qhVar.OooO0o;
        if (qhVar2 == null) {
            return null;
        }
        hi hiVar = qhVar2.OooO0Oo;
        ly1 ly1Var = i == 0 ? hiVar.OooO0Oo : hiVar.OooO0o0;
        int iOooOOoo = rj.OooOOoo(qhVar2.OooO0o0);
        if (iOooOOoo == 1 || iOooOOoo == 2) {
            return ly1Var.OooO0oo;
        }
        if (iOooOOoo == 3 || iOooOOoo == 4) {
            return ly1Var.OooO;
        }
        return null;
    }

    public static void OooO0O0(up upVar, up upVar2, int i) {
        upVar.OooOO0o.add(upVar2);
        upVar.OooO0o = i;
        upVar2.OooOO0O.add(upVar);
    }

    public static up OooO0oo(qh qhVar) {
        qh qhVar2 = qhVar.OooO0o;
        if (qhVar2 == null) {
            return null;
        }
        hi hiVar = qhVar2.OooO0Oo;
        int iOooOOoo = rj.OooOOoo(qhVar2.OooO0o0);
        if (iOooOOoo == 1) {
            return hiVar.OooO0Oo.OooO0oo;
        }
        if (iOooOOoo == 2) {
            return hiVar.OooO0o0.OooO0oo;
        }
        if (iOooOOoo == 3) {
            return hiVar.OooO0Oo.OooO;
        }
        if (iOooOOoo == 4) {
            return hiVar.OooO0o0.OooO;
        }
        if (iOooOOoo != 5) {
            return null;
        }
        return hiVar.OooO0o0.OooOO0O;
    }

    public final void OooO0OO(up upVar, up upVar2, int i, mr mrVar) {
        upVar.OooOO0o.add(upVar2);
        upVar.OooOO0o.add(this.OooO0o0);
        upVar.OooO0oo = i;
        upVar.OooO = mrVar;
        upVar2.OooOO0O.add(upVar);
        mrVar.OooOO0O.add(upVar);
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public final int OooO0oO(int i, int i2) {
        hi hiVar = this.OooO0O0;
        if (i2 == 0) {
            int i3 = hiVar.OooOo0;
            int iMax = Math.max(hiVar.OooOo00, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = hiVar.OooOo;
            int iMax2 = Math.max(hiVar.OooOo0o, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long OooOO0() {
        if (this.OooO0o0.OooOO0) {
            return r2.OooO0oO;
        }
        return 0L;
    }

    public abstract boolean OooOO0O();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0o(com.cmaster.cloner.qh r12, com.cmaster.cloner.qh r13, int r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ly1.OooOO0o(com.cmaster.cloner.qh, com.cmaster.cloner.qh, int):void");
    }
}
