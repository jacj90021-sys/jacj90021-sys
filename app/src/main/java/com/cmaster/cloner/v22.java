package com.cmaster.cloner;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v22 extends q12 implements IInterface {
    public final /* synthetic */ yl1 OooO0o;
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v22(yl1 yl1Var, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.OooO0o0 = i;
        this.OooO0o = yl1Var;
    }

    @Override // com.cmaster.cloner.q12
    public final boolean o000oooo(int i, Parcel parcel, Parcel parcel2) {
        yl1 yl1Var = this.OooO0o;
        int i2 = this.OooO0o0;
        if (i == 1) {
            Status status = (Status) y12.OooO00o(parcel, Status.CREATOR);
            mu0 mu0Var = (mu0) y12.OooO00o(parcel, mu0.CREATOR);
            y12.OooO0O0(parcel);
            switch (i2) {
                case 0:
                    l43.OooO00o(status, mu0Var, yl1Var);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 2) {
            Status status2 = (Status) y12.OooO00o(parcel, Status.CREATOR);
            ou0 ou0Var = (ou0) y12.OooO00o(parcel, ou0.CREATOR);
            y12.OooO0O0(parcel);
            switch (i2) {
                case 1:
                    l43.OooO00o(status2, ou0Var, yl1Var);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 3) {
            y12.OooO0O0(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 4) {
            return false;
        }
        y12.OooO0O0(parcel);
        throw new UnsupportedOperationException();
    }
}
