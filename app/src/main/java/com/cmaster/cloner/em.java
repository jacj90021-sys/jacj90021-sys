package com.cmaster.cloner;

import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class em implements Runnable {
    public final /* synthetic */ Bundle OooO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ int OooO0o;
    public final /* synthetic */ int OooO0o0;
    public final /* synthetic */ int OooO0oO;
    public final /* synthetic */ int OooO0oo;
    public final /* synthetic */ fm OooOO0;

    public em(fm fmVar, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.OooOO0 = fmVar;
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = i3;
        this.OooO0oO = i4;
        this.OooO0oo = i5;
        this.OooO = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.OooOO0.OooO0o0.onActivityLayout(this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO, this.OooO0oo, this.OooO);
    }
}
