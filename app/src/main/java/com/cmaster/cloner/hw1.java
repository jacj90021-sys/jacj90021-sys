package com.cmaster.cloner;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class hw1 extends IAccountAuthenticatorResponse.Stub implements IBinder.DeathRecipient, ServiceConnection {
    public final String OooO;
    public final int OooO0Oo;
    public final w90 OooO0o;
    public IAccountManagerResponse OooO0o0;
    public final ew1 OooO0oO;
    public final boolean OooO0oo;
    public final boolean OooOO0;
    public final boolean OooOO0O;
    public final boolean OooOOO;
    public final /* synthetic */ jw1 OooOOOO;
    public final gw1 OooOO0o = new gw1(this);
    public IAccountAuthenticator OooOOO0 = null;

    static {
        DexUtils.classesInit0(73);
    }

    public hw1(jw1 jw1Var, w90 w90Var, IAccountManagerResponse iAccountManagerResponse, int i, ew1 ew1Var, boolean z, boolean z2, String str, boolean z3, boolean z4) throws RemoteException {
        this.OooOOOO = jw1Var;
        if (ew1Var == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{58, 88, -4, 7, -38, -71, -23, 93, 30, 73, -23, 1, -52, -78, -67, 103, 8, 27, -15, 29, -61, -69}, new byte[]{123, 59, -97, 104, -81, -41, -99, 14}));
            throw null;
        }
        this.OooO0o = w90Var;
        this.OooO0Oo = i;
        this.OooOOO = z2;
        this.OooO0o0 = iAccountManagerResponse;
        this.OooO0oO = ew1Var;
        this.OooO0oo = z;
        SystemClock.elapsedRealtime();
        this.OooO = str;
        this.OooOO0 = z3;
        this.OooOO0O = z4;
        synchronized (jw1Var.OooOO0O) {
            jw1Var.OooOO0O.put(toString(), this);
        }
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.asBinder().linkToDeath(this, 0);
            } catch (RemoteException unused) {
                this.OooO0o0 = null;
                binderDied();
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final native void binderDied();

    public final native void close();

    public abstract void o00();

    public final native void o0000o0O();

    public final native IAccountManagerResponse o000oooo();

    public final native void onError(int i, String str);

    public final native void onRequestContinued();

    public native void onResult(Bundle bundle);

    @Override // android.content.ServiceConnection
    public final native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public final native void onServiceDisconnected(ComponentName componentName);
}
