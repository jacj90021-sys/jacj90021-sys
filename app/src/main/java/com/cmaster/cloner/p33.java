package com.cmaster.cloner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p33 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (fx2.OooO0O0) {
            fx2.OooO0OO = false;
            fx2.OooO0Oo = false;
            uh2.OooOO0("Ad debug logging enablement is out of date.");
        }
        r73.OooO00o(context);
    }
}
