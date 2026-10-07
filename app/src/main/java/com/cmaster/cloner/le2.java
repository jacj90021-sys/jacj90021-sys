package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class le2 extends Thread {
    public final /* synthetic */ Context OooO0Oo;
    public final /* synthetic */ String OooO0o0;

    public le2(zj2 zj2Var, Context context, String str) {
        this.OooO0Oo = context;
        this.OooO0o0 = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new q93(this.OooO0Oo, null).zza(this.OooO0o0);
    }
}
