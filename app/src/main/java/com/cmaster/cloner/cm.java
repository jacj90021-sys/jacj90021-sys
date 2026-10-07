package com.cmaster.cloner;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cm implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ boolean OooO0o;
    public final /* synthetic */ Uri OooO0o0;
    public final /* synthetic */ Bundle OooO0oO;
    public final /* synthetic */ fm OooO0oo;

    public cm(fm fmVar, int i, Uri uri, boolean z, Bundle bundle) {
        this.OooO0oo = fmVar;
        this.OooO0Oo = i;
        this.OooO0o0 = uri;
        this.OooO0o = z;
        this.OooO0oO = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.OooO0oo.OooO0o0.onRelationshipValidationResult(this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO);
    }
}
