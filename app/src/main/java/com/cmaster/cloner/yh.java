package com.cmaster.cloner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yh extends BroadcastReceiver {
    public static final String OooO00o = ep0.OooO("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ep0.OooO0oO().OooO0Oo(OooO00o, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = cf.OooO0oO;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
