package com.cmaster.cloner;

import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b73 extends v50 {
    public final long OooO;
    public final HashMap OooO0Oo = new HashMap();
    public volatile xi1 OooO0o;
    public final Context OooO0o0;
    public final xb1 OooO0oO;
    public final long OooO0oo;

    public b73(Context context, Looper looper) {
        c50 c50Var = new c50(this, 3);
        this.OooO0o0 = context.getApplicationContext();
        xi1 xi1Var = new xi1(looper, c50Var, 5);
        Looper.getMainLooper();
        this.OooO0o = xi1Var;
        this.OooO0oO = xb1.OooOooo();
        this.OooO0oo = 5000L;
        this.OooO = 300000L;
    }

    @Override // com.cmaster.cloner.v50
    public final boolean OooO0OO(l23 l23Var, oh2 oh2Var, String str, Executor executor) {
        boolean z;
        synchronized (this.OooO0Oo) {
            try {
                r33 r33Var = (r33) this.OooO0Oo.get(l23Var);
                if (executor == null) {
                    executor = null;
                }
                if (r33Var == null) {
                    r33Var = new r33(this, l23Var);
                    r33Var.OooO0Oo.put(oh2Var, oh2Var);
                    r33Var.OooO00o(str, executor);
                    this.OooO0Oo.put(l23Var, r33Var);
                } else {
                    this.OooO0o.removeMessages(0, l23Var);
                    if (r33Var.OooO0Oo.containsKey(oh2Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(l23Var.toString()));
                    }
                    r33Var.OooO0Oo.put(oh2Var, oh2Var);
                    int i = r33Var.OooO0o0;
                    if (i == 1) {
                        oh2Var.onServiceConnected(r33Var.OooO, r33Var.OooO0oO);
                    } else if (i == 2) {
                        r33Var.OooO00o(str, executor);
                    }
                }
                z = r33Var.OooO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
