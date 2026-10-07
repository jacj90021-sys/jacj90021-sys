package com.cmaster.cloner;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v62 extends xi1 {
    public final /* synthetic */ m6 OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v62(m6 m6Var, Looper looper) {
        super(looper, 5);
        this.OooO0O0 = m6Var;
    }

    @Override // com.cmaster.cloner.xi1, android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.OooO0O0.zzd.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                a32 a32Var = (a32) message.obj;
                a32Var.getClass();
                a32Var.OooO0OO();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || ((i3 == 4 && !this.OooO0O0.enableLocalFallback()) || message.what == 5)) && !this.OooO0O0.isConnecting()) {
            a32 a32Var2 = (a32) message.obj;
            a32Var2.getClass();
            a32Var2.OooO0OO();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            this.OooO0O0.zzB = new gh(message.arg2);
            if (m6.zzo(this.OooO0O0)) {
                m6 m6Var = this.OooO0O0;
                if (!m6Var.zzC) {
                    m6Var.OooO0O0(3, null);
                    return;
                }
            }
            m6 m6Var2 = this.OooO0O0;
            gh ghVar = m6Var2.zzB != null ? m6Var2.zzB : new gh(8);
            this.OooO0O0.zzc.OooOOo(ghVar);
            this.OooO0O0.onConnectionFailed(ghVar);
            return;
        }
        if (i4 == 5) {
            m6 m6Var3 = this.OooO0O0;
            gh ghVar2 = m6Var3.zzB != null ? m6Var3.zzB : new gh(8);
            this.OooO0O0.zzc.OooOOo(ghVar2);
            this.OooO0O0.onConnectionFailed(ghVar2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            gh ghVar3 = new gh(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.OooO0O0.zzc.OooOOo(ghVar3);
            this.OooO0O0.onConnectionFailed(ghVar3);
            return;
        }
        if (i4 == 6) {
            this.OooO0O0.OooO0O0(5, null);
            m6 m6Var4 = this.OooO0O0;
            if (m6Var4.zzw != null) {
                m6Var4.zzw.onConnectionSuspended(message.arg2);
            }
            this.OooO0O0.onConnectionSuspended(message.arg2);
            m6.zzn(this.OooO0O0, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.OooO0O0.isConnected()) {
            a32 a32Var3 = (a32) message.obj;
            a32Var3.getClass();
            a32Var3.OooO0OO();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", px0.OooOOO(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        a32 a32Var4 = (a32) message.obj;
        synchronized (a32Var4) {
            try {
                bool = a32Var4.OooO00o;
                if (a32Var4.OooO0O0) {
                    Log.w("GmsClient", "Callback proxy " + a32Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            m6 m6Var5 = a32Var4.OooO0o;
            int i6 = a32Var4.OooO0Oo;
            if (i6 != 0) {
                m6Var5.OooO0O0(1, null);
                Bundle bundle = a32Var4.OooO0o0;
                a32Var4.OooO00o(new gh(i6, bundle != null ? (PendingIntent) bundle.getParcelable(m6.KEY_PENDING_INTENT) : null));
            } else if (!a32Var4.OooO0O0()) {
                m6Var5.OooO0O0(1, null);
                a32Var4.OooO00o(new gh(8, null));
            }
        }
        synchronized (a32Var4) {
            a32Var4.OooO0O0 = true;
        }
        a32Var4.OooO0OO();
    }
}
