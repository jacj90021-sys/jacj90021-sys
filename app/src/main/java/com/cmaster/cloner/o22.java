package com.cmaster.cloner;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o22 extends z12 {
    public final yl1 OooO0O0;

    public o22(sn0 sn0Var, yl1 yl1Var) {
        super(4);
        this.OooO0O0 = yl1Var;
    }

    @Override // com.cmaster.cloner.z12
    public final boolean OooO00o(s12 s12Var) {
        return false;
    }

    @Override // com.cmaster.cloner.z12
    public final iz[] OooO0O0(s12 s12Var) {
        return null;
    }

    @Override // com.cmaster.cloner.z12
    public final void OooO0OO(Status status) {
        this.OooO0O0.OooO0OO(new oOO00(status));
    }

    @Override // com.cmaster.cloner.z12
    public final void OooO0Oo(Exception exc) {
        this.OooO0O0.OooO0OO(exc);
    }

    @Override // com.cmaster.cloner.z12
    public final /* bridge */ /* synthetic */ void OooO0o(vr1 vr1Var, boolean z) {
    }

    @Override // com.cmaster.cloner.z12
    public final void OooO0o0(s12 s12Var) throws DeadObjectException {
        try {
            OooO0oo(s12Var);
        } catch (DeadObjectException e) {
            OooO0OO(z12.OooO0oO(e));
            throw e;
        } catch (RemoteException e2) {
            OooO0OO(z12.OooO0oO(e2));
        } catch (RuntimeException e3) {
            this.OooO0O0.OooO0OO(e3);
        }
    }

    public final void OooO0oo(s12 s12Var) {
        this.OooO0O0.OooO00o.OooOO0(Boolean.FALSE);
    }
}
