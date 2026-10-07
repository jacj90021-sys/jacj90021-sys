package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oh2 implements ServiceConnection {
    public final int OooO0Oo;
    public final /* synthetic */ m6 OooO0o0;

    public oh2(m6 m6Var, int i) {
        this.OooO0o0 = m6Var;
        this.OooO0Oo = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m6 m6Var = this.OooO0o0;
        if (iBinder == null) {
            m6.zzk(m6Var, 16);
            return;
        }
        synchronized (m6Var.zzq) {
            try {
                m6 m6Var2 = this.OooO0o0;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                m6Var2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gb0)) ? new t32(iBinder) : (gb0) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.OooO0o0.zzl(0, null, this.OooO0Oo);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.OooO0o0.zzq) {
            this.OooO0o0.zzr = null;
        }
        m6 m6Var = this.OooO0o0;
        int i = this.OooO0Oo;
        Handler handler = m6Var.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
