package com.cmaster.cloner;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q7 extends j9 {

    public q7(android.content.Context context, com.cmaster.cloner.zl1 zl1Var) {
        super(context, zl1Var);
    }
    public static final String OooO = ep0.OooO("BatteryNotLowTracker");

    @Override // com.cmaster.cloner.gi
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        ep0.OooO0oO().OooO0o(OooO, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // com.cmaster.cloner.j9
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // com.cmaster.cloner.j9
    public final void OooO0oO(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        ep0.OooO0oO().OooO0Oo(OooO, rj.OooO0OO("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            OooO0OO(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            OooO0OO(Boolean.FALSE);
        }
    }
}
