package com.cmaster.cloner;

import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xi2 extends o0OOo000 {
    public final Object OooO0Oo = new Object();
    public final /* synthetic */ zi2 OooO0o;
    public o0OOo000 OooO0o0;

    public xi2(zi2 zi2Var) {
        this.OooO0o = zi2Var;
    }

    @Override // com.cmaster.cloner.o0OOo000, com.cmaster.cloner.e32
    public final void onAdClicked() {
        synchronized (this.OooO0Oo) {
            try {
                o0OOo000 o0ooo000 = this.OooO0o0;
                if (o0ooo000 != null) {
                    o0ooo000.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.o0OOo000
    public final void onAdClosed() {
        synchronized (this.OooO0Oo) {
            try {
                o0OOo000 o0ooo000 = this.OooO0o0;
                if (o0ooo000 != null) {
                    o0ooo000.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.o0OOo000
    public final void onAdFailedToLoad(xn0 xn0Var) {
        zi2 zi2Var = this.OooO0o;
        ss1 ss1Var = zi2Var.OooO0OO;
        sa2 sa2Var = zi2Var.OooO;
        gi2 gi2VarZzm = null;
        if (sa2Var != null) {
            try {
                gi2VarZzm = sa2Var.zzm();
            } catch (RemoteException e) {
                uh2.OooOO0o("#007 Could not call remote method.", e);
            }
        }
        ss1Var.OooO00o(gi2VarZzm);
        synchronized (this.OooO0Oo) {
            try {
                o0OOo000 o0ooo000 = this.OooO0o0;
                if (o0ooo000 != null) {
                    o0ooo000.onAdFailedToLoad(xn0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.o0OOo000
    public final void onAdImpression() {
        synchronized (this.OooO0Oo) {
            try {
                o0OOo000 o0ooo000 = this.OooO0o0;
                if (o0ooo000 != null) {
                    o0ooo000.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.o0OOo000
    public final void onAdLoaded() {
        zi2 zi2Var = this.OooO0o;
        ss1 ss1Var = zi2Var.OooO0OO;
        sa2 sa2Var = zi2Var.OooO;
        gi2 gi2VarZzm = null;
        if (sa2Var != null) {
            try {
                gi2VarZzm = sa2Var.zzm();
            } catch (RemoteException e) {
                uh2.OooOO0o("#007 Could not call remote method.", e);
            }
        }
        ss1Var.OooO00o(gi2VarZzm);
        synchronized (this.OooO0Oo) {
            try {
                o0OOo000 o0ooo000 = this.OooO0o0;
                if (o0ooo000 != null) {
                    o0ooo000.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.o0OOo000
    public final void onAdOpened() {
        synchronized (this.OooO0Oo) {
            try {
                o0OOo000 o0ooo000 = this.OooO0o0;
                if (o0ooo000 != null) {
                    o0ooo000.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
