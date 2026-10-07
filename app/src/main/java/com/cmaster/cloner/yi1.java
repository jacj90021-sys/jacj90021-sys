package com.cmaster.cloner;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yi1 extends BroadcastReceiver {
    public b51 OooO00o;
    public final ActivityInfo OooO0O0;
    public final /* synthetic */ ho1 OooO0OO;

    public yi1(ho1 ho1Var, b51 b51Var, ActivityInfo activityInfo) {
        this.OooO0OO = ho1Var;
        this.OooO00o = b51Var;
        this.OooO0O0 = activityInfo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            cx1.OooO0o.execute(new l1(this, context, intent, 9));
            return;
        }
        try {
            b51 b51VarOooO0o = ho1.OooO0o(this.OooO0OO, this.OooO00o, this.OooO0O0);
            this.OooO00o = b51VarOooO0o;
            if (b51VarOooO0o != null && !b51VarOooO0o.OooOOO && b51VarOooO0o.OooOOoo.OooOO0O != null) {
                this.OooO00o.getClass();
                String strOooO0OO = u61.OooO0OO(intent.getAction());
                if (strOooO0OO != null) {
                    intent.setAction(strOooO0OO);
                }
                intent.setPackage(this.OooO0O0.packageName);
                ActivityInfo activityInfo = this.OooO0O0;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                this.OooO00o.OooOOoo.OooOO0O.OooOOO0(intent, this.OooO0O0);
            }
        } catch (RemoteException unused) {
        }
    }
}
