package com.cmaster.cloner;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xe0 implements ze0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.ze0
    public final void Oooo0OO(Uri uri, IBinder iBinder, boolean z, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{73, 22, -67, -24, 23, -17, -78, 87, 94, 28, -94, -24, 23, -18, -68, 74, 79, 11, -2, -111, 51, -42, -117, 96, 99, 35, -125, -97, 36, -52, -117, 125, 104, 51, -122}, new byte[]{42, 121, -48, -58, 116, -126, -45, 36}));
            kt2.OooO0OO(parcelObtain, uri, 0);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(22);
            this.OooO0Oo.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.ze0
    public final void o000OOo0(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{7, -30, -115, 59, -81, -82, -86, 99, 16, -24, -110, 59, -81, -81, -92, 126, 1, -1, -50, 66, -117, -105, -109, 84, 45, -41, -77, 76, -100, -115, -109, 73, 38, -57, -74}, new byte[]{100, -115, -32, 21, -52, -61, -53, 16}));
            parcelObtain.writeStrongBinder(iBinder);
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.ze0
    public final void o000ooOO(Uri uri, boolean z, IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-37, -45, 69, -14, 98, 72, 72, 61, -52, -39, 90, -14, 98, 73, 70, 32, -35, -50, 6, -117, 70, 113, 113, 10, -15, -26, 123, -123, 81, 107, 113, 23, -6, -10, 126}, new byte[]{-72, -68, 40, -36, 1, 37, 41, 78}));
            kt2.OooO0OO(parcelObtain, uri, 0);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(22);
            this.OooO0Oo.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
