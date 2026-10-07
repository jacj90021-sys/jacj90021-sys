package com.cmaster.cloner;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p7 extends j9 {

    public p7(android.content.Context context, com.cmaster.cloner.zl1 zl1Var) {
        super(context, zl1Var);
    }
    public static final String OooO = ep0.OooO("BatteryChrgTracker");

    @Override // com.cmaster.cloner.gi
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            ep0.OooO0oO().OooO0o(OooO, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // com.cmaster.cloner.j9
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // com.cmaster.cloner.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oO(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L7
            goto L50
        L7:
            com.cmaster.cloner.ep0 r0 = com.cmaster.cloner.ep0.OooO0oO()
            java.lang.String r1 = "Received "
            java.lang.String r1 = r1.concat(r6)
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            java.lang.String r4 = com.cmaster.cloner.p7.OooO
            r0.OooO0Oo(r4, r1, r3)
            int r0 = r6.hashCode()
            r1 = -1
            switch(r0) {
                case -1886648615: goto L44;
                case -54942926: goto L39;
                case 948344062: goto L2e;
                case 1019184907: goto L23;
                default: goto L21;
            }
        L21:
            r2 = r1
            goto L4d
        L23:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2c
            goto L21
        L2c:
            r2 = 3
            goto L4d
        L2e:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L37
            goto L21
        L37:
            r2 = 2
            goto L4d
        L39:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L42
            goto L21
        L42:
            r2 = 1
            goto L4d
        L44:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4d
            goto L21
        L4d:
            switch(r2) {
                case 0: goto L63;
                case 1: goto L5d;
                case 2: goto L57;
                case 3: goto L51;
                default: goto L50;
            }
        L50:
            return
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.OooO0OO(r6)
            return
        L57:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.OooO0OO(r6)
            return
        L5d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.OooO0OO(r6)
            return
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.OooO0OO(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p7.OooO0oO(android.content.Intent):void");
    }
}
