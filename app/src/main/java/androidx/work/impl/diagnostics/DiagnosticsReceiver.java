package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.q02;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String OooO00o = ep0.OooO("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = OooO00o;
        ep0.OooO0oO().OooO0Oo(str, "Requesting diagnostics", new Throwable[0]);
        try {
            q02.OooO0O0(context).OooO00o(new a02(DiagnosticsWorker.class).OooO0OO());
        } catch (IllegalStateException e) {
            ep0.OooO0oO().OooO0o(str, "WorkManager is not initialized", e);
        }
    }
}
