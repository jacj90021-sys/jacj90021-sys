package com.cmaster.cloner;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h22 extends xi1 {
    public final Context OooO0O0;
    public final /* synthetic */ d60 OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h22(d60 d60Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.OooO0OO = d60Var;
        this.OooO0O0 = context.getApplicationContext();
    }

    @Override // com.cmaster.cloner.xi1, android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = e60.OooO00o;
        d60 d60Var = this.OooO0OO;
        Context context = this.OooO0O0;
        int iOooO0OO = d60Var.OooO0OO(context, i2);
        AtomicBoolean atomicBoolean = n60.OooO00o;
        if (iOooO0OO == 1 || iOooO0OO == 2 || iOooO0OO == 3 || iOooO0OO == 9) {
            Intent intentOooO0O0 = d60Var.OooO0O0(context, "n", iOooO0OO);
            d60Var.OooO0oO(context, iOooO0OO, intentOooO0O0 == null ? null : PendingIntent.getActivity(context, 0, intentOooO0O0, 201326592));
        }
    }
}
