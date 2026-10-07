package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class j9 extends gi {
    public static final String OooO0oo = ep0.OooO("BrdcstRcvrCnstrntTrckr");
    public final g OooO0oO;

    public j9(Context context, zl1 zl1Var) {
        super(context, zl1Var);
        this.OooO0oO = new g(this, 1);
    }

    @Override // com.cmaster.cloner.gi
    public final void OooO0Oo() {
        ep0.OooO0oO().OooO0Oo(OooO0oo, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.OooO0O0.registerReceiver(this.OooO0oO, OooO0o());
    }

    public abstract IntentFilter OooO0o();

    @Override // com.cmaster.cloner.gi
    public final void OooO0o0() {
        ep0.OooO0oO().OooO0Oo(OooO0oo, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.OooO0O0.unregisterReceiver(this.OooO0oO);
    }

    public abstract void OooO0oO(Intent intent);
}
