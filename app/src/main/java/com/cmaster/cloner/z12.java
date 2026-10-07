package com.cmaster.cloner;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class z12 {
    public final int OooO00o;

    public z12(int i) {
        this.OooO00o = i;
    }

    public static Status OooO0oO(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean OooO00o(s12 s12Var);

    public abstract iz[] OooO0O0(s12 s12Var);

    public abstract void OooO0OO(Status status);

    public abstract void OooO0Oo(Exception exc);

    public abstract void OooO0o(vr1 vr1Var, boolean z);

    public abstract void OooO0o0(s12 s12Var);
}
