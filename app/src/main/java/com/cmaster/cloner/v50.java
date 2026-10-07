package com.cmaster.cloner;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v50 {
    public static final Object OooO00o = new Object();
    public static b73 OooO0O0;
    public static HandlerThread OooO0OO;

    public static b73 OooO00o(Context context) {
        synchronized (OooO00o) {
            try {
                if (OooO0O0 == null) {
                    OooO0O0 = new b73(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return OooO0O0;
    }

    public final void OooO0O0(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        l23 l23Var = new l23(z, str, str2);
        b73 b73Var = (b73) this;
        by2.OooO(serviceConnection, "ServiceConnection must not be null");
        synchronized (b73Var.OooO0Oo) {
            try {
                r33 r33Var = (r33) b73Var.OooO0Oo.get(l23Var);
                if (r33Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(l23Var.toString()));
                }
                if (!r33Var.OooO0Oo.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(l23Var.toString()));
                }
                r33Var.OooO0Oo.remove(serviceConnection);
                if (r33Var.OooO0Oo.isEmpty()) {
                    b73Var.OooO0o.sendMessageDelayed(b73Var.OooO0o.obtainMessage(0, l23Var), b73Var.OooO0oo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean OooO0OO(l23 l23Var, oh2 oh2Var, String str, Executor executor);
}
