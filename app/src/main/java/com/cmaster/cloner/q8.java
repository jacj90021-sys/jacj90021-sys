package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q8 implements ServiceConnection {
    public boolean OooO0Oo = false;
    public final LinkedBlockingQueue OooO0o0 = new LinkedBlockingQueue();

    public final IBinder OooO00o() throws TimeoutException {
        by2.OooO0oO("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.OooO0Oo) {
            qa.OooO0o("Cannot call get on this connection more than once");
            return null;
        }
        this.OooO0Oo = true;
        IBinder iBinder = (IBinder) this.OooO0o0.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.OooO0o0.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
