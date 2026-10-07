package com.cmaster.cloner;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jf0 implements kf0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.kf0
    public final IBinder Oooo00O(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-67, 115, -128, -62, 83, 86, -18, -27, -86, 121, -97, -62, 83, 87, -32, -8, -69, 110, -61, -72, 125, 98, -61, -33, -124, 76, -91, -75, 124, 116, -38, -37, -97, 68, -89}, new byte[]{-34, 28, -19, -20, 48, 59, -113, -106}));
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.kf0
    public final ff1 OoooOOo() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{123, 82, -71, -47, 45, -109, 73, 55, 108, 88, -90, -47, 45, -110, 71, 42, 125, 79, -6, -85, 3, -89, 100, 13, 66, 109, -100, -90, 2, -79, 125, 9, 89, 101, -98}, new byte[]{24, 61, -44, -1, 78, -2, 40, 68}));
            this.OooO0Oo.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? ff1.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.kf0
    public final int o0000OO0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-70, 104, -4, 16, 42, 48, 48, 114, -83, 98, -29, 16, 42, 49, 62, 111, -68, 117, -65, 106, 4, 4, 29, 72, -125, 87, -39, 103, 5, 18, 4, 76, -104, 95, -37}, new byte[]{-39, 7, -111, 62, 73, 93, 81, 1}));
            this.OooO0Oo.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.kf0
    public final IBinder oo000o(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{47, -35, -49, -14, -53, 71, -22, -102, 56, -41, -48, -14, -53, 70, -28, -121, 41, -64, -116, -120, -27, 115, -57, -96, 22, -30, -22, -123, -28, 101, -34, -92, 13, -22, -24}, new byte[]{76, -78, -94, -36, -88, 42, -117, -23}));
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
