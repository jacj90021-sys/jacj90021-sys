package com.cmaster.cloner;

import android.database.IContentObserver;
import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vw1 implements IBinder.DeathRecipient {
    public final IContentObserver OooO0Oo;
    public final int OooO0o;
    public final boolean OooO0o0;
    public final Object OooO0oO;
    public final /* synthetic */ ww1 OooO0oo;

    public vw1(ww1 ww1Var, IContentObserver iContentObserver, boolean z, Object obj, int i) throws RemoteException {
        this.OooO0oo = ww1Var;
        this.OooO0oO = obj;
        this.OooO0Oo = iContentObserver;
        this.OooO0o = i;
        this.OooO0o0 = z;
        try {
            iContentObserver.asBinder().linkToDeath(this, 0);
        } catch (RemoteException unused) {
            binderDied();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        synchronized (this.OooO0oO) {
            this.OooO0oo.OooO0Oo(this.OooO0Oo);
        }
    }
}
