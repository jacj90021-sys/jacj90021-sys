package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.cmaster.cloner.d10;
import com.cmaster.cloner.ep0;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String OooO00o = ep0.OooO("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (ep0.OooO0oO().OooO0Oo <= 2) {
            Log.v(OooO00o, "Rescheduling alarm that keeps track of force-stops.");
        }
        d10.OooO0OO(context);
    }
}
