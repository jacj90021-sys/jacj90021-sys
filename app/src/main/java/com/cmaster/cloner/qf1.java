package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qf1 implements sf1 {
    public IBinder OooO0Oo;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.sf1
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{115, 43, 57, 29, -103, -94, -9, -118, 100, 33, 38, 29, -103, -93, -7, -105, 117, 54, 122, 117, -94, -118, -50, -74, 68, 3, 16, 120, -75, -100, -47, -95, 64}, new byte[]{16, 68, 84, 51, -6, -49, -106, -7}));
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeStrongBinder(iBinder);
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.sf1
    public final void onServiceDisconnected(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{45, 51, 127, 111, 57, -22, 14, 63, 58, 57, 96, 111, 57, -21, 0, 34, 43, 46, 60, 7, 2, -62, 55, 3, 26, 27, 86, 10, 21, -44, 40, 20, 30}, new byte[]{78, 92, 18, 65, 90, -121, 111, 76}));
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.OooO0Oo.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
