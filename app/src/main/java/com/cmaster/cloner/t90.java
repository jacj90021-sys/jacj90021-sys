package com.cmaster.cloner;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t90 implements w90 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.w90
    public final void OooOOO0(Intent intent, ActivityInfo activityInfo) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-101, 79, -96, 55, -85, 29, -2, -13, -116, 69, -65, 55, -85, 28, -16, -18, -99, 82, -29, 77, -102, 36, -36, -41, -66, 104, -119, 93, -110, 32, -53, -52, -70, 117, -108, 72, -102}, new byte[]{-8, 32, -51, 25, -56, 112, -97, -128}));
            at2.OooO0O0(parcelObtain, intent);
            at2.OooO0O0(parcelObtain, activityInfo);
            this.OooO0Oo.transact(13, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void OooOoOO(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-104, 77, -104, -25, -44, -123, 107, -16, -113, 71, -121, -25, -44, -124, 101, -19, -98, 80, -37, -99, -27, -68, 73, -44, -67, 106, -79, -115, -19, -72, 94, -49, -71, 119, -84, -104, -27}, new byte[]{-5, 34, -11, -55, -73, -24, 10, -125}));
            parcelObtain.writeStrongBinder(iBinder);
            this.OooO0Oo.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void OoooooO(IBinder iBinder, IBinder iBinder2, Intent intent, boolean z, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{27, -22, 58, 21, -16, 47, 107, 109, 12, -32, 37, 21, -16, 46, 101, 112, 29, -9, 121, 111, -63, 22, 73, 73, 62, -51, 19, 127, -55, 18, 94, 82, 58, -48, 14, 106, -63}, new byte[]{120, -123, 87, 59, -109, 66, 10, 30}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            at2.OooO0O0(parcelObtain, intent);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(11);
            this.OooO0Oo.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.w90
    public final void o0000o(IBinder iBinder, ArrayList arrayList) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-113, 87, -15, 99, 43, 5, 107, -78, -104, 93, -18, 99, 43, 4, 101, -81, -119, 74, -78, 25, 26, 60, 73, -106, -86, 112, -40, 9, 18, 56, 94, -115, -82, 109, -59, 28, 26}, new byte[]{-20, 56, -100, 77, 72, 104, 10, -63}));
            parcelObtain.writeStrongBinder(iBinder);
            int size = arrayList.size();
            parcelObtain.writeInt(size);
            for (int i = 0; i < size; i++) {
                at2.OooO0O0(parcelObtain, (Parcelable) arrayList.get(i));
            }
            parcelObtain.writeInt(0);
            this.OooO0Oo.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final boolean o000O000(Intent intent, sf1 sf1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-115, -97, 28, -84, 127, -23, -115, -10, -102, -107, 3, -84, 127, -24, -125, -21, -117, -126, 95, -42, 78, -48, -81, -46, -88, -72, 53, -58, 70, -44, -72, -55, -84, -91, 40, -45, 78}, new byte[]{-18, -16, 113, -126, 28, -124, -20, -123}));
            at2.OooO0O0(parcelObtain, intent);
            parcelObtain.writeStrongInterface(sf1Var);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void o000O0o(IBinder iBinder, ServiceInfo serviceInfo, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{112, -66, 16, 78, -47, 37, 50, -65, 103, -76, 15, 78, -47, 36, 60, -94, 118, -93, 83, 52, -32, 28, 16, -101, 85, -103, 57, 36, -24, 24, 7, -128, 81, -124, 36, 49, -32}, new byte[]{19, -47, 125, 96, -78, 72, 83, -52}));
            parcelObtain.writeStrongBinder(iBinder);
            at2.OooO0O0(parcelObtain, serviceInfo);
            parcelObtain.writeInt(11);
            this.OooO0Oo.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final boolean o000OO0O(sf1 sf1Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{22, -74, -124, -77, 84, 95, -102, -33, 1, -68, -101, -77, 84, 94, -108, -62, 16, -85, -57, -55, 101, 102, -72, -5, 51, -111, -83, -39, 109, 98, -81, -32, 55, -116, -80, -52, 101}, new byte[]{117, -39, -23, -99, 55, 50, -5, -84}));
            parcelObtain.writeStrongInterface(sf1Var);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void o000Oo0O(ce ceVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-69, 94, 57, 9, -108, -120, 89, -79, -84, 84, 38, 9, -108, -119, 87, -84, -67, 67, 122, 115, -91, -79, 123, -107, -98, 121, 16, 99, -83, -75, 108, -114, -102, 100, 13, 118, -91}, new byte[]{-40, 49, 84, 39, -9, -27, 56, -62}));
            at2.OooO0O0(parcelObtain, ceVar);
            this.OooO0Oo.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void o000o0O0(p2 p2Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{59, 30, -4, -65, 35, 68, 65, 83, 44, 20, -29, -65, 35, 69, 79, 78, 61, 3, -65, -59, 18, 125, 99, 119, 30, 57, -43, -43, 26, 121, 116, 108, 26, 36, -56, -64, 18}, new byte[]{88, 113, -111, -111, 64, 41, 32, 32}));
            at2.OooO0O0(parcelObtain, p2Var);
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void o000oOoo(IBinder iBinder, IBinder iBinder2, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{3, -64, 98, -67, 45, -96, 95, -90, 20, -54, 125, -67, 45, -95, 81, -69, 5, -35, 33, -57, 28, -103, 125, -126, 38, -25, 75, -41, 20, -99, 106, -103, 34, -6, 86, -62, 28}, new byte[]{96, -81, 15, -109, 78, -51, 62, -43}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            at2.OooO0O0(parcelObtain, intent);
            this.OooO0Oo.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final IBinder o00Oo0(String str, ProviderInfo providerInfo) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-125, -65, -106, -59, -59, 121, -35, -104, -108, -75, -119, -59, -59, 120, -45, -123, -123, -94, -43, -65, -12, 64, -1, -68, -90, -104, -65, -81, -4, 68, -24, -89, -94, -123, -94, -70, -12}, new byte[]{-32, -48, -5, -21, -90, 20, -68, -21}));
            parcelObtain.writeString(str);
            at2.OooO0O0(parcelObtain, providerInfo);
            this.OooO0Oo.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void o0Oo0oo(IBinder iBinder, ArrayList arrayList) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-73, 2, 63, -54, 36, -48, 114, -5, -96, 8, 32, -54, 36, -47, 124, -26, -79, 31, 124, -80, 21, -23, 80, -33, -110, 37, 22, -96, 29, -19, 71, -60, -106, 56, 11, -75, 21}, new byte[]{-44, 109, 82, -28, 71, -67, 19, -120}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeList(arrayList);
            this.OooO0Oo.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
