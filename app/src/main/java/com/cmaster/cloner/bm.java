package com.cmaster.cloner;

import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bm implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Bundle OooO0o;
    public final /* synthetic */ String OooO0o0;
    public final /* synthetic */ fm OooO0oO;

    public /* synthetic */ bm(fm fmVar, String str, Bundle bundle, int i) {
        this.OooO0Oo = i;
        this.OooO0oO = fmVar;
        this.OooO0o0 = str;
        this.OooO0o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        Bundle bundle = this.OooO0o;
        String str = this.OooO0o0;
        fm fmVar = this.OooO0oO;
        switch (i) {
            case 0:
                fmVar.OooO0o0.extraCallback(str, bundle);
                break;
            default:
                fmVar.OooO0o0.onPostMessage(str, bundle);
                break;
        }
    }
}
