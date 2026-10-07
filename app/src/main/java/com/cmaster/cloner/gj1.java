package com.cmaster.cloner;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gj1 extends j9 {

    public gj1(android.content.Context context, com.cmaster.cloner.zl1 zl1Var) {
        super(context, zl1Var);
    }
    public static final String OooO = ep0.OooO("StorageNotLowTracker");

    @Override // com.cmaster.cloner.gi
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.OooO0O0.registerReceiver(null, OooO0o());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // com.cmaster.cloner.j9
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            OooO0OO(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            OooO0OO(Boolean.TRUE);
        }
    }
}
