package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class q1 extends yt1 implements hm0 {
    public final p1 OooO0o0;

    public q1() {
        p1 p1Var = new p1(this);
        p1Var.OooO(wl0.ON_CREATE);
        p1Var.OooO(wl0.ON_START);
        p1Var.OooO(wl0.ON_RESUME);
        this.OooO0o0 = p1Var;
        zt1 zt1Var = this.OooO0Oo;
        if (zt1Var != null) {
            if (zt1Var.OooO0Oo) {
                zt1.OooO00o(p1Var);
                return;
            }
            synchronized (zt1Var.OooO00o) {
                zt1Var.OooO0OO.add(p1Var);
            }
        }
    }

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        return this.OooO0o0;
    }
}
