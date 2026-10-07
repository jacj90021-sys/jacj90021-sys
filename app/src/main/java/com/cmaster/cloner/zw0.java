package com.cmaster.cloner;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zw0 extends gi {
    public static final String OooO = ep0.OooO("NetworkStateTracker");
    public final ConnectivityManager OooO0oO;
    public final yw0 OooO0oo;

    public zw0(Context context, zl1 zl1Var) {
        super(context, zl1Var);
        this.OooO0oO = (ConnectivityManager) this.OooO0O0.getSystemService("connectivity");
        this.OooO0oo = new yw0(this, 0);
    }

    @Override // com.cmaster.cloner.gi
    public final Object OooO00o() {
        return OooO0o();
    }

    @Override // com.cmaster.cloner.gi
    public final void OooO0Oo() {
        String str = OooO;
        try {
            ep0.OooO0oO().OooO0Oo(str, "Registering network callback", new Throwable[0]);
            this.OooO0oO.registerDefaultNetworkCallback(this.OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            ep0.OooO0oO().OooO0o(str, "Received exception while registering network callback", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.xw0 OooO0o() {
        /*
            r8 = this;
            android.net.ConnectivityManager r8 = r8.OooO0oO
            android.net.NetworkInfo r0 = r8.getActiveNetworkInfo()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            boolean r3 = r0.isConnected()
            if (r3 == 0) goto L12
            r3 = r2
            goto L13
        L12:
            r3 = r1
        L13:
            android.net.Network r4 = r8.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r4 = r8.getNetworkCapabilities(r4)     // Catch: java.lang.SecurityException -> L27
            if (r4 == 0) goto L29
            r5 = 16
            boolean r4 = r4.hasCapability(r5)     // Catch: java.lang.SecurityException -> L27
            if (r4 == 0) goto L29
            r4 = r2
            goto L3b
        L27:
            r4 = move-exception
            goto L2b
        L29:
            r4 = r1
            goto L3b
        L2b:
            com.cmaster.cloner.ep0 r5 = com.cmaster.cloner.ep0.OooO0oO()
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]
            r6[r1] = r4
            java.lang.String r4 = com.cmaster.cloner.zw0.OooO
            java.lang.String r7 = "Unable to validate active network"
            r5.OooO0o(r4, r7, r6)
            goto L29
        L3b:
            boolean r8 = r8.isActiveNetworkMetered()
            if (r0 == 0) goto L48
            boolean r0 = r0.isRoaming()
            if (r0 != 0) goto L48
            r1 = r2
        L48:
            com.cmaster.cloner.xw0 r0 = new com.cmaster.cloner.xw0
            r0.<init>()
            r0.OooO00o = r3
            r0.OooO0O0 = r4
            r0.OooO0OO = r8
            r0.OooO0Oo = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zw0.OooO0o():com.cmaster.cloner.xw0");
    }

    @Override // com.cmaster.cloner.gi
    public final void OooO0o0() {
        String str = OooO;
        try {
            ep0.OooO0oO().OooO0Oo(str, "Unregistering network callback", new Throwable[0]);
            this.OooO0oO.unregisterNetworkCallback(this.OooO0oo);
        } catch (IllegalArgumentException | SecurityException e) {
            ep0.OooO0oO().OooO0o(str, "Received exception while unregistering network callback", e);
        }
    }
}
