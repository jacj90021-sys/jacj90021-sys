package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oo0ooO implements ServiceConnection {
    public Intent OooO0Oo;
    public sf1 OooO0o0;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        sf1 sf1Var = this.OooO0o0;
        if (sf1Var != null) {
            try {
                sf1Var.onServiceConnected(componentName, iBinder);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        sf1 sf1Var = this.OooO0o0;
        if (sf1Var != null) {
            try {
                sf1Var.onServiceDisconnected(componentName);
            } catch (RemoteException unused) {
            }
        }
    }
}
