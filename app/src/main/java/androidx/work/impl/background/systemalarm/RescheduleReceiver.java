package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.q02;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String OooO00o = ep0.OooO("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ep0.OooO0oO().OooO0Oo(OooO00o, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            q02 q02VarOooO0O0 = q02.OooO0O0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (q02.OooOO0o) {
                try {
                    q02VarOooO0O0.OooO = pendingResultGoAsync;
                    if (q02VarOooO0O0.OooO0oo) {
                        pendingResultGoAsync.finish();
                        q02VarOooO0O0.OooO = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            ep0.OooO0oO().OooO0o(OooO00o, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
