package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lw implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ ow OooO0o;
    public final kh1 OooO0o0;

    public /* synthetic */ lw(ow owVar, kh1 kh1Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o = owVar;
        this.OooO0o0 = kh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ja jaVar;
        switch (this.OooO0Oo) {
            case 0:
                kh1 kh1Var = this.OooO0o0;
                kh1Var.OooO0O0.OooO00o();
                synchronized (kh1Var.OooO0OO) {
                    synchronized (this.OooO0o) {
                        try {
                            if (this.OooO0o.OooO0Oo.OooO0Oo.contains(new mw(this.OooO0o0, y52.OooO0O0))) {
                                ow owVar = this.OooO0o;
                                kh1 kh1Var2 = this.OooO0o0;
                                owVar.getClass();
                                try {
                                    kh1Var2.OooO0oO(owVar.OooOo00, 5);
                                } finally {
                                }
                            }
                            this.OooO0o.OooO0O0();
                        } finally {
                        }
                    }
                }
                return;
            default:
                kh1 kh1Var3 = this.OooO0o0;
                kh1Var3.OooO0O0.OooO00o();
                synchronized (kh1Var3.OooO0OO) {
                    synchronized (this.OooO0o) {
                        try {
                            if (this.OooO0o.OooO0Oo.OooO0Oo.contains(new mw(this.OooO0o0, y52.OooO0O0))) {
                                this.OooO0o.OooOo0O.OooO00o();
                                ow owVar2 = this.OooO0o;
                                kh1 kh1Var4 = this.OooO0o0;
                                owVar2.getClass();
                                try {
                                    kh1Var4.OooO(owVar2.OooOo0O, owVar2.OooOOo);
                                    this.OooO0o.OooO0oO(this.OooO0o0);
                                } finally {
                                }
                            }
                            this.OooO0o.OooO0O0();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
