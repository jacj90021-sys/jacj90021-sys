package com.cmaster.cloner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w12 extends BroadcastReceiver {
    public Context OooO00o;
    public final vr1 OooO0O0;

    public w12(vr1 vr1Var) {
        this.OooO0O0 = vr1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.OooO0O0.OooO0o;
            throw null;
        }
    }
}
