package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.l1;
import com.cmaster.cloner.q02;
import com.cmaster.cloner.rj;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String OooO00o = ep0.OooO("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            q02.OooO0O0(context).OooO0Oo.OooOOOo(new l1(intent, context, goAsync(), 1, false));
        } else {
            ep0.OooO0oO().OooO0Oo(OooO00o, rj.OooO0OO("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
