package com.cmaster.cloner;

import android.app.ActivityManager;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lf0 implements mf0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.mf0
    public final byte[] Oooo00o() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{83, 86, -30, -72, -122, 46, -99, -122, 68, 92, -3, -72, -122, 47, -109, -101, 85, 75, -95, -62, -95, 13, -84, -76, 106, 116, -60, -61, -81, 15, -75, -77}, new byte[]{48, 57, -113, -106, -27, 67, -4, -11}));
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createByteArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.mf0
    public final List Oooo0oo() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{40, -34, -18, 23, 29, -36, 51, -45, 63, -44, -15, 23, 29, -35, 61, -50, 46, -61, -83, 109, 58, -1, 2, -31, 17, -4, -56, 108, 52, -3, 27, -26}, new byte[]{75, -79, -125, 57, 126, -79, 82, -96}));
            this.OooO0Oo.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.mf0
    public final void o0000oOo(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-83, 85, 17, -31, -128, 56, 121, 6, -70, 95, 14, -31, -128, 57, 119, 27, -85, 72, 82, -101, -89, 27, 72, 52, -108, 119, 55, -102, -87, 25, 81, 51}, new byte[]{-50, 58, 124, -49, -29, 85, 24, 117}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(9);
            this.OooO0Oo.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.mf0
    public final ArrayList o0000oo0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{53, -96, -119, -47, 103, 115, -97, -90, 34, -86, -106, -47, 103, 114, -111, -69, 51, -67, -54, -85, 64, 80, -82, -108, 12, -126, -81, -86, 78, 82, -73, -109}, new byte[]{86, -49, -28, -1, 4, 30, -2, -43}));
            this.OooO0Oo.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createBinderArrayList();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.mf0
    public final String o000oOoO() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{8, -69, 22, -83, -106, -14, 39, 85, 31, -79, 9, -83, -106, -13, 41, 72, 14, -90, 85, -41, -79, -47, 22, 103, 49, -103, 48, -42, -65, -45, 15, 96}, new byte[]{107, -44, 123, -125, -11, -97, 70, 38}));
            this.OooO0Oo.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
