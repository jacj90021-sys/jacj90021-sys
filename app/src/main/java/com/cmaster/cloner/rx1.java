package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rx1 implements IBinder.DeathRecipient {
    public static final oO00OOOo OooO0o = new oO00OOOo(22);
    public final kf0 OooO0Oo;
    public final mf0 OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.cmaster.cloner.kf0] */
    public rx1(IBinder iBinder) throws RemoteException {
        jf0 jf0Var;
        iBinder.linkToDeath(this, 0);
        int i = hf1.OooO0oo;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(u7.OooO00o(new byte[]{-90, 90, 14, 122, -93, -103, 2, -8, -79, 80, 17, 122, -93, -104, 12, -27, -96, 71, 77, 0, -115, -83, 47, -62, -97, 101, 43, 13, -116, -69, 54, -58, -124, 109, 41}, new byte[]{-59, 53, 99, 84, -64, -12, 99, -117}));
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kf0)) {
            jf0 jf0Var2 = new jf0();
            jf0Var2.OooO0Oo = iBinder;
            jf0Var = jf0Var2;
        } else {
            jf0Var = (kf0) iInterfaceQueryLocalInterface;
        }
        this.OooO0Oo = jf0Var;
        ff1 ff1VarOoooOOo = jf0Var.OoooOOo();
        this.OooO0o0 = tg1.o0000o0O(jf0Var.oo000o(qx1.OooO0Oo()));
        ff1VarOoooOOo.OooO0O0(e92.OooO00o);
    }

    public static kf0 OooO00o() {
        return ((rx1) OooO0o.OooO0O0()).OooO0Oo;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        System.exit(0);
    }
}
