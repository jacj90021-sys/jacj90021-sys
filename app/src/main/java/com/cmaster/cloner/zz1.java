package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.FileDescriptor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zz1 implements IBinder {
    public IBinder OooO0Oo;
    public final /* synthetic */ a02 OooO0o0;

    public zz1(a02 a02Var) {
        this.OooO0o0 = a02Var;
    }

    @Override // android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.OooO0Oo.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.OooO0Oo.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final String getInterfaceDescriptor() {
        return this.OooO0Oo.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public final boolean isBinderAlive() {
        return this.OooO0Oo.isBinderAlive();
    }

    @Override // android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) throws RemoteException {
        this.OooO0Oo.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public final boolean pingBinder() {
        try {
            IBinder iBinder = this.OooO0Oo;
            if (iBinder == null || !iBinder.isBinderAlive()) {
                this.OooO0Oo = a02.OooO00o(this.OooO0o0);
            }
            return this.OooO0Oo.pingBinder();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return this.OooO0Oo.queryLocalInterface(str);
    }

    @Override // android.os.IBinder
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        a02 a02Var = this.OooO0o0;
        try {
            if (this.OooO0Oo == null) {
                this.OooO0Oo = a02.OooO00o(a02Var);
            }
            return this.OooO0Oo.transact(i, parcel, parcel2, i2);
        } catch (RemoteException unused) {
            IBinder iBinderOooO00o = a02.OooO00o(a02Var);
            this.OooO0Oo = iBinderOooO00o;
            return iBinderOooO00o.transact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.OooO0Oo.unlinkToDeath(deathRecipient, i);
    }
}
