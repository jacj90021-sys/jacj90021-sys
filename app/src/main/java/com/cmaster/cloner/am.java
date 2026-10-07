package com.cmaster.cloner;

import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class am implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ fm OooO0o;
    public final /* synthetic */ Bundle OooO0o0;

    public /* synthetic */ am(fm fmVar, Bundle bundle, int i) {
        this.OooO0Oo = i;
        this.OooO0o = fmVar;
        this.OooO0o0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        Bundle bundle = this.OooO0o0;
        fm fmVar = this.OooO0o;
        switch (i) {
            case 0:
                fmVar.OooO0o0.onUnminimized(bundle);
                break;
            case 1:
                fmVar.OooO0o0.onMessageChannelReady(bundle);
                break;
            case 2:
                fmVar.OooO0o0.onWarmupCompleted(bundle);
                break;
            default:
                fmVar.OooO0o0.onMinimized(bundle);
                break;
        }
    }
}
