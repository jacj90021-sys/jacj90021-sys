package com.cmaster.cloner;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ck2 extends a32 {
    public final IBinder OooO0oO;
    public final /* synthetic */ m6 OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck2(m6 m6Var, int i, IBinder iBinder, Bundle bundle) {
        super(m6Var, i, bundle);
        this.OooO0oo = m6Var;
        this.OooO0oO = iBinder;
    }

    @Override // com.cmaster.cloner.a32
    public final void OooO00o(gh ghVar) {
        m6 m6Var = this.OooO0oo;
        if (m6Var.zzx != null) {
            m6Var.zzx.onConnectionFailed(ghVar);
        }
        m6Var.onConnectionFailed(ghVar);
    }

    @Override // com.cmaster.cloner.a32
    public final boolean OooO0O0() throws RemoteException {
        IBinder iBinder = this.OooO0oO;
        try {
            by2.OooO0oo(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            m6 m6Var = this.OooO0oo;
            if (!m6Var.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + m6Var.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = m6Var.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(m6.zzn(m6Var, 2, 4, iInterfaceCreateServiceInterface) || m6.zzn(m6Var, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            m6Var.zzB = null;
            Bundle connectionHint = m6Var.getConnectionHint();
            if (m6Var.zzw == null) {
                return true;
            }
            m6Var.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
