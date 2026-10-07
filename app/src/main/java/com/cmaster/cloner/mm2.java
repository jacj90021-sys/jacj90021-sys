package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mm2 extends q82 {
    public final o0OOo000 OooO0Oo;

    public mm2(o0OOo000 o0ooo000) {
        this.OooO0Oo = o0ooo000;
    }

    @Override // com.cmaster.cloner.u82
    public final void zzc() {
        o0OOo000 o0ooo000 = this.OooO0Oo;
        if (o0ooo000 != null) {
            o0ooo000.onAdClicked();
        }
    }

    @Override // com.cmaster.cloner.u82
    public final void zzd() {
        o0OOo000 o0ooo000 = this.OooO0Oo;
        if (o0ooo000 != null) {
            o0ooo000.onAdClosed();
        }
    }

    @Override // com.cmaster.cloner.u82
    public final void zze(int i) {
    }

    @Override // com.cmaster.cloner.u82
    public final void zzf(th2 th2Var) {
        o0OOo000 o0ooo000 = this.OooO0Oo;
        if (o0ooo000 != null) {
            o0ooo000.onAdFailedToLoad(th2Var.OooO0O0());
        }
    }

    @Override // com.cmaster.cloner.u82
    public final void zzg() {
        o0OOo000 o0ooo000 = this.OooO0Oo;
        if (o0ooo000 != null) {
            o0ooo000.onAdImpression();
        }
    }

    @Override // com.cmaster.cloner.u82
    public final void zzh() {
    }

    @Override // com.cmaster.cloner.u82
    public final void zzi() {
        o0OOo000 o0ooo000 = this.OooO0Oo;
        if (o0ooo000 != null) {
            o0ooo000.onAdLoaded();
        }
    }

    @Override // com.cmaster.cloner.u82
    public final void zzj() {
        o0OOo000 o0ooo000 = this.OooO0Oo;
        if (o0ooo000 != null) {
            o0ooo000.onAdOpened();
        }
    }

    @Override // com.cmaster.cloner.u82
    public final void zzk() {
        o0OOo000 o0ooo000 = this.OooO0Oo;
        if (o0ooo000 != null) {
            o0ooo000.onAdSwipeGestureClicked();
        }
    }
}
