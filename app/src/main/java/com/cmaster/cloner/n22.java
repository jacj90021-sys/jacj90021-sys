package com.cmaster.cloner;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n22 extends z12 {
    public final z8 OooO0O0;
    public final yl1 OooO0OO;
    public final s60 OooO0Oo;

    public n22(int i, z8 z8Var, yl1 yl1Var, s60 s60Var) {
        super(i);
        this.OooO0OO = yl1Var;
        this.OooO0O0 = z8Var;
        this.OooO0Oo = s60Var;
        if (i == 2 && z8Var.OooO0OO) {
            ra.OooOOO("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // com.cmaster.cloner.z12
    public final boolean OooO00o(s12 s12Var) {
        return this.OooO0O0.OooO0OO;
    }

    @Override // com.cmaster.cloner.z12
    public final iz[] OooO0O0(s12 s12Var) {
        return (iz[]) this.OooO0O0.OooO0Oo;
    }

    @Override // com.cmaster.cloner.z12
    public final void OooO0OO(Status status) {
        this.OooO0Oo.getClass();
        this.OooO0OO.OooO0OO(status.OooO0o != null ? new ca1(status) : new oOO00(status));
    }

    @Override // com.cmaster.cloner.z12
    public final void OooO0Oo(Exception exc) {
        this.OooO0OO.OooO0OO(exc);
    }

    @Override // com.cmaster.cloner.z12
    public final void OooO0o(vr1 vr1Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) vr1Var.OooO0o;
        yl1 yl1Var = this.OooO0OO;
        map.put(yl1Var, boolValueOf);
        ac3 ac3Var = yl1Var.OooO00o;
        er1 er1Var = new er1(vr1Var, yl1Var);
        ac3Var.getClass();
        ac3Var.OooO0O0.OooO0o0(new he2(am1.OooO00o, er1Var));
        ac3Var.OooOO0o();
    }

    @Override // com.cmaster.cloner.z12
    public final void OooO0o0(s12 s12Var) throws DeadObjectException {
        yl1 yl1Var = this.OooO0OO;
        try {
            z8 z8Var = this.OooO0O0;
            ((b91) ((z8) z8Var.OooO0o0).OooO0Oo).accept(s12Var.OooO0o0, yl1Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            OooO0OO(z12.OooO0oO(e2));
        } catch (RuntimeException e3) {
            yl1Var.OooO0OO(e3);
        }
    }
}
