package com.cmaster.cloner;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class l83 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ l83(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                a02 a02Var = (a02) obj;
                oOOO00 oooo00 = (oOOO00) a02Var.OooO0o0;
                oO0o0o oo0o0o = new oO0o0o(a02Var);
                if (((ws2) ((zf2) k42.OooO00o(oooo00).OooOO0).zza()).OooO00o()) {
                    oo0o0o.OooO00o(null);
                    return;
                }
                h92 h92Var = (h92) ((zf2) k42.OooO00o(oooo00).OooO0oo).zza();
                kd2.OooO00o();
                er1 er1Var = new er1(oooo00, oo0o0o, 7);
                na1 na1Var = new na1(oo0o0o, 13);
                h92Var.getClass();
                kd2.OooO00o();
                o92 o92Var = (o92) h92Var.OooO0OO.get();
                if (o92Var == null) {
                    na1Var.OooO0O0(new hm2(3, "No available form can be built.").OooO00o());
                    return;
                }
                k42 k42Var = (k42) ((na1) h92Var.OooO00o.zza()).OooO0o0;
                zf2 zf2VarOooO00o = zf2.OooO00o(new na1((uf) k42Var.OooO0o0, 14));
                uf ufVar = new uf(o92Var);
                na1 na1Var2 = new na1(15);
                uf ufVar2 = (uf) k42Var.OooO0o0;
                zf2 zf2Var = (zf2) k42Var.OooO;
                n52 n52Var = (n52) k42Var.OooOO0O;
                zf2 zf2Var2 = (zf2) k42Var.OooO0o;
                zf2 zf2VarOooO00o2 = zf2.OooO00o(new oO0Ooooo(ufVar2, (zf2) k42Var.OooO0oO, zf2VarOooO00o, zf2Var2, ufVar, new vr1(zf2VarOooO00o, new oO0Ooooo(ufVar2, zf2VarOooO00o, zf2Var, n52Var, na1Var2, zf2Var2, 8), 7), 7));
                if (((zf2) na1Var2.OooO0o0) != null) {
                    ra.OooO0O0();
                    return;
                } else {
                    na1Var2.OooO0o0 = zf2VarOooO00o2;
                    ((q72) na1Var2.zza()).OooO00o(er1Var, na1Var);
                    return;
                }
            default:
                wc3 wc3Var = (wc3) obj;
                synchronized (wc3Var.OooO0OO) {
                    try {
                        if (wc3Var.OooOOo0 == 2 && !wc3Var.OooO0O0.get() && (scheduledFuture = wc3Var.OooOOO) != null && !scheduledFuture.isCancelled()) {
                            if (wc3Var.OooOO0 > 1.0f && wc3Var.OooO00o() >= wc3Var.OooO00o.OooO0oo) {
                                wc3.OooOOoo.Oooo0OO("Reset zoom = 1");
                                wc3Var.OooO0O0(1.0f, f63.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
