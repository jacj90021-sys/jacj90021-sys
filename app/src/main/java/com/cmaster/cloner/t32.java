package com.cmaster.cloner;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t32 implements gb0 {
    public final IBinder OooO0Oo;

    public t32(IBinder iBinder) {
        this.OooO0Oo = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    public final void o0000o0O(ne2 ne2Var, t40 t40Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(ne2Var);
            parcelObtain.writeInt(1);
            e13.OooO00o(t40Var, parcelObtain, 0);
            this.OooO0Oo.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
