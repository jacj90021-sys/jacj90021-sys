package com.cmaster.cloner;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m23 extends Binder implements IInterface {
    public final /* synthetic */ yl1 OooO0Oo;

    public m23(yl1 yl1Var) {
        this.OooO0Oo = yl1Var;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = db2.OooO00o;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        ab2 ab2VarCreateFromParcel = parcel.readInt() == 0 ? null : ab2.CREATOR.createFromParcel(parcel);
        h2 h2Var = ab2VarCreateFromParcel != null ? new h2(ab2VarCreateFromParcel.OooO0Oo, ab2VarCreateFromParcel.OooO0o0) : null;
        int i4 = statusCreateFromParcel.OooO0Oo;
        yl1 yl1Var = this.OooO0Oo;
        if (i4 <= 0) {
            yl1Var.OooO0O0(h2Var);
            return true;
        }
        yl1Var.OooO00o(statusCreateFromParcel.OooO0o != null ? new ca1(statusCreateFromParcel) : new oOO00(statusCreateFromParcel));
        return true;
    }
}
