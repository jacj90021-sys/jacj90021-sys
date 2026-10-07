package com.cmaster.cloner;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ue0 implements we0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.we0
    public final int OooO(String str, Intent intent, String str2, IBinder iBinder, String str3, int i, Bundle bundle, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{4, -44, -70, 26, -122, -114, -19, -64, 19, -34, -91, 26, -122, -113, -29, -35, 2, -55, -7, 118, -77, -81, -49, -2, 43, -31, -102, 120, -78, -86, -43, -7, 41, -16, -97, 102}, new byte[]{103, -69, -41, 52, -27, -29, -116, -77}));
            parcelObtain.writeString(str);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str3);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(0);
            it2.OooO0OO(parcelObtain, bundle, 0);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(23, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final vi OooO0OO(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-62, 118, 16, 80, -37, 64, 39, -8, -43, 124, 15, 80, -37, 65, 41, -27, -60, 107, 83, 60, -18, 97, 5, -58, -19, 67, 48, 50, -17, 100, 31, -63, -17, 82, 53, 44}, new byte[]{-95, 25, 125, 126, -72, 45, 70, -117}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (vi) it2.OooO00o(parcelObtain2, vi.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooO0oO(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{68, -91, -17, -62, 96, 2, -77, 3, 83, -81, -16, -62, 96, 3, -67, 30, 66, -72, -84, -82, 85, 35, -111, 61, 107, -112, -49, -96, 84, 38, -117, 58, 105, -127, -54, -66}, new byte[]{39, -54, -126, -20, 3, 111, -46, 112}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(31, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooOo(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{31, -46, -100, -122, -61, -87, -60, 29, 8, -40, -125, -122, -61, -88, -54, 0, 25, -49, -33, -22, -10, -120, -26, 35, 48, -25, -68, -28, -9, -115, -4, 36, 50, -10, -71, -6}, new byte[]{124, -67, -15, -88, -96, -60, -91, 110}));
            parcelObtain.writeStrongBinder(iBinder);
            this.OooO0Oo.transact(29, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int OooOo0o(w90 w90Var, Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{70, 97, -54, -35, 101, 57, 12, 45, 81, 107, -43, -35, 101, 56, 2, 48, 64, 124, -119, -79, 80, 24, 46, 19, 105, 84, -22, -65, 81, 29, 52, 20, 107, 69, -17, -95}, new byte[]{37, 14, -89, -13, 6, 84, 109, 94}));
            parcelObtain.writeStrongInterface(w90Var);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooOoO0(IBinder iBinder, IBinder iBinder2, Intent intent, IBinder iBinder3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-19, 43, 97, 81, -17, 82, -54, -105, -6, 33, 126, 81, -17, 83, -60, -118, -21, 54, 34, 61, -38, 115, -24, -87, -62, 30, 65, 51, -37, 118, -14, -82, -64, 15, 68, 45}, new byte[]{-114, 68, 12, 127, -116, 63, -85, -28}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeStrongBinder(iBinder3);
            this.OooO0Oo.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final IBinder Oooo(int i, IBinder iBinder, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-27, 43, -72, -34, 107, 67, 110, 48, -14, 33, -89, -34, 107, 66, 96, 45, -29, 54, -5, -78, 94, 98, 76, 14, -54, 30, -104, -68, 95, 103, 86, 9, -56, 15, -99, -94}, new byte[]{-122, 68, -43, -16, 8, 46, 15, 67}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            this.OooO0Oo.transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void Oooo000(IBinder iBinder, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{71, 25, -48, -15, 81, -3, 16, 60, 80, 19, -49, -15, 81, -4, 30, 33, 65, 4, -109, -99, 100, -36, 50, 2, 104, 44, -16, -109, 101, -39, 40, 5, 106, 61, -11, -115}, new byte[]{36, 118, -67, -33, 50, -112, 113, 79}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int OoooO0(String str, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-52, 14, 42, -46, -12, -87, 12, 121, -37, 4, 53, -46, -12, -88, 2, 100, -54, 19, 105, -66, -63, -120, 46, 71, -29, 59, 10, -80, -64, -115, 52, 64, -31, 42, 15, -82}, new byte[]{-81, 97, 71, -4, -105, -60, 109, 10}));
            parcelObtain.writeString(str);
            parcelObtain.writeTypedArray(intentArr, 0);
            parcelObtain.writeStringArray(strArr);
            parcelObtain.writeStrongBinder(iBinder);
            it2.OooO0OO(parcelObtain, bundle, 0);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(22, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int OoooOOO(String str, int i, int i2, String str2, String str3, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-49, -88, 112, -108, -95, 113, 34, 122, -40, -94, 111, -108, -95, 112, 44, 103, -55, -75, 51, -8, -108, 80, 0, 68, -32, -99, 80, -10, -107, 85, 26, 67, -30, -116, 85, -24}, new byte[]{-84, -57, 29, -70, -62, 28, 67, 9}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(57, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void OoooOoo(String str, String str2, long j, String str3, int i, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-67, -11, -49, 77, -24, 56, -102, -78, -86, -1, -48, 77, -24, 57, -108, -81, -69, -24, -116, 33, -35, 25, -72, -116, -110, -64, -17, 47, -36, 28, -94, -117, -112, -47, -22, 49}, new byte[]{-34, -102, -94, 99, -117, 85, -5, -63}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeLong(j);
            parcelObtain.writeString(str3);
            parcelObtain.writeInt(i);
            parcelObtain.writeByteArray(bArr);
            this.OooO0Oo.transact(63, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooooOO(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-59, 123, -24, 88, -18, 19, -47, 109, -46, 113, -9, 88, -18, 18, -33, 112, -61, 102, -85, 52, -37, 50, -13, 83, -22, 78, -56, 58, -38, 55, -23, 84, -24, 95, -51, 36}, new byte[]{-90, 20, -123, 118, -115, 126, -80, 30}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(30, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.we0
    public final String o0000(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-119, 6, -46, -116, -123, 88, -128, -33, -98, 12, -51, -116, -123, 89, -114, -62, -113, 27, -111, -32, -80, 121, -94, -31, -90, 51, -14, -18, -79, 124, -72, -26, -92, 34, -9, -16}, new byte[]{-22, 105, -65, -94, -26, 53, -31, -84}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(38, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o00000(int i, Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{56, 113, 84, -21, 98, -56, 76, 69, 47, 123, 75, -21, 98, -55, 66, 88, 62, 108, 23, -121, 87, -23, 110, 123, 23, 68, 116, -119, 86, -20, 116, 124, 21, 85, 113, -105}, new byte[]{91, 30, 57, -59, 1, -91, 45, 54}));
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(54, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000000O(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{104, 113, -116, 8, -59, -128, 69, -32, 127, 123, -109, 8, -59, -127, 75, -3, 110, 108, -49, 100, -16, -95, 103, -34, 71, 68, -84, 106, -15, -92, 125, -39, 69, 85, -87, 116}, new byte[]{11, 30, -31, 38, -90, -19, 36, -109}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(32, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int o00000O(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{79, -65, 82, -69, 93, -33, -41, 66, 88, -75, 77, -69, 93, -34, -39, 95, 73, -94, 17, -41, 104, -2, -11, 124, 96, -118, 114, -39, 105, -5, -17, 123, 98, -101, 119, -57}, new byte[]{44, -48, 63, -107, 62, -78, -74, 49}));
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(50, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o00000O0(ComponentName componentName, IBinder iBinder, int i, Notification notification, int i2, int i3, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{20, 36, 45, 40, -27, 1, 74, 89, 3, 46, 50, 40, -27, 0, 68, 68, 18, 57, 110, 68, -48, 32, 104, 103, 59, 17, 13, 74, -47, 37, 114, 96, 57, 0, 8, 84}, new byte[]{119, 75, 64, 6, -122, 108, 43, 42}));
            it2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            it2.OooO0OO(parcelObtain, notification, 0);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            this.OooO0Oo.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final IBinder o00000OO(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{125, -3, -111, -65, -7, -68, -106, -36, 106, -9, -114, -65, -7, -67, -104, -63, 123, -32, -46, -45, -52, -99, -76, -30, 82, -56, -79, -35, -51, -104, -82, -27, 80, -39, -76, -61}, new byte[]{30, -110, -4, -111, -102, -47, -9, -81}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(60, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final NetworkRequest o00000Oo(String str, IBinder iBinder, Messenger messenger, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{81, 78, 103, -18, -35, -20, -69, 90, 70, 68, 120, -18, -35, -19, -75, 71, 87, 83, 36, -126, -24, -51, -103, 100, 126, 123, 71, -116, -23, -56, -125, 99, 124, 106, 66, -110}, new byte[]{50, 33, 10, -64, -66, -127, -38, 41}));
            parcelObtain.writeString(str);
            parcelObtain.writeStrongBinder(iBinder);
            it2.OooO0OO(parcelObtain, messenger, 0);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(61, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (NetworkRequest) it2.OooO00o(parcelObtain2, NetworkRequest.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o00000oO(IBinder iBinder, IBinder iBinder2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{6, 123, 107, -102, 62, -56, -71, 78, 17, 113, 116, -102, 62, -55, -73, 83, 0, 102, 40, -10, 11, -23, -101, 112, 41, 78, 75, -8, 10, -20, -127, 119, 43, 95, 78, -26}, new byte[]{101, 20, 6, -76, 93, -91, -40, 61}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            this.OooO0Oo.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o00000oo(IBinder iBinder, IBinder iBinder2, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-24, -35, 99, 102, -127, 103, 119, 110, -1, -41, 124, 102, -127, 102, 121, 115, -18, -64, 32, 10, -76, 70, 85, 80, -57, -24, 67, 4, -75, 67, 79, 87, -59, -7, 70, 26}, new byte[]{-117, -78, 14, 72, -30, 10, 22, 29}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o0000O0O(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{63, -58, 51, 42, 113, 4, 0, 122, 40, -52, 44, 42, 113, 5, 14, 103, 57, -37, 112, 70, 68, 37, 34, 68, 16, -13, 19, 72, 69, 32, 56, 67, 18, -30, 22, 86}, new byte[]{92, -87, 94, 4, 18, 105, 97, 9}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(34, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int o0000OOo(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-17, -105, -78, -114, 6, -28, -13, -81, -8, -99, -83, -114, 6, -27, -3, -78, -23, -118, -15, -30, 51, -59, -47, -111, -64, -94, -110, -20, 50, -64, -53, -106, -62, -77, -105, -14}, new byte[]{-116, -8, -33, -96, 101, -119, -110, -36}));
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(51, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int o0000OoO(IBinder iBinder, boolean z, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-29, -26, -22, 123, 120, -51, 114, -25, -12, -20, -11, 123, 120, -52, 124, -6, -27, -5, -87, 23, 77, -20, 80, -39, -52, -45, -54, 25, 76, -23, 74, -34, -50, -62, -49, 7}, new byte[]{-128, -119, -121, 85, 27, -96, 19, -108}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(26, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int o0000oOO(String str, int i, Intent intent, String str2, Bundle bundle, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{13, 69, 46, -100, -68, -74, -31, 103, 26, 79, 49, -100, -68, -73, -17, 122, 11, 88, 109, -16, -119, -105, -61, 89, 34, 112, 14, -2, -120, -110, -39, 94, 32, 97, 11, -32}, new byte[]{110, 42, 67, -78, -33, -37, -128, 20}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            it2.OooO0OO(parcelObtain, bundle, 0);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(24, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o0000ooO(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{127, 77, 75, -67, -33, -50, -13, 26, 104, 71, 84, -67, -33, -49, -3, 7, 121, 80, 8, -47, -22, -17, -47, 36, 80, 120, 107, -33, -21, -22, -53, 35, 82, 105, 110, -63}, new byte[]{28, 34, 38, -109, -68, -93, -110, 105}));
            parcelObtain.writeStrongBinder(iBinder);
            this.OooO0Oo.transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000O0O(NetworkRequest networkRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-30, 31, 59, 56, 87, 67, -71, -73, -11, 21, 36, 56, 87, 66, -73, -86, -28, 2, 120, 84, 98, 98, -101, -119, -51, 42, 27, 90, 99, 103, -127, -114, -49, 59, 30, 68}, new byte[]{-127, 112, 86, 22, 52, 46, -40, -60}));
            it2.OooO0OO(parcelObtain, networkRequest, 0);
            this.OooO0Oo.transact(62, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final ArrayList o000O0o0(String str, int i, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{76, -48, -26, 61, -93, 90, -4, 47, 91, -38, -7, 61, -93, 91, -14, 50, 74, -51, -91, 81, -106, 123, -34, 17, 99, -27, -58, 95, -105, 126, -60, 22, 97, -12, -61, 65}, new byte[]{47, -65, -117, 19, -64, 55, -99, 92}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            it2.OooO0O0(parcelObtain, list, 0);
            this.OooO0Oo.transact(56, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final m2 o000O0oo(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-36, 62, 45, -39, 110, -58, -57, 88, -53, 52, 50, -39, 110, -57, -55, 69, -38, 35, 110, -75, 91, -25, -27, 102, -13, 11, 13, -69, 90, -30, -1, 97, -15, 26, 8, -91}, new byte[]{-65, 81, 64, -9, 13, -85, -90, 43}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(41, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (m2) it2.OooO00o(parcelObtain2, m2.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final String o000OO00(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{37, 33, -57, -24, -107, 117, -16, -68, 50, 43, -40, -24, -107, 116, -2, -95, 35, 60, -124, -124, -96, 84, -46, -126, 10, 20, -25, -118, -95, 81, -56, -123, 8, 5, -30, -108}, new byte[]{70, 78, -86, -58, -10, 24, -111, -49}));
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(55, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000Oo00(IBinder iBinder, int i, Intent intent, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{69, 101, 50, -126, -102, -45, 67, -53, 82, 111, 45, -126, -102, -46, 77, -42, 67, 120, 113, -18, -81, -14, 97, -11, 106, 80, 18, -32, -82, -9, 123, -14, 104, 65, 23, -2}, new byte[]{38, 10, 95, -84, -7, -66, 34, -72}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(35, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o000Oo0o(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{73, 7, 90, 78, 27, -108, -70, -48, 94, 13, 69, 78, 27, -107, -76, -51, 79, 26, 25, 34, 46, -75, -104, -18, 102, 50, 122, 44, 47, -80, -126, -23, 100, 35, 127, 50}, new byte[]{42, 104, 55, 96, 120, -7, -37, -93}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(-1);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str2);
            this.OooO0Oo.transact(52, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000OoOO(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-46, -79, 115, 7, -8, 30, -123, 19, -59, -69, 108, 7, -8, 31, -117, 14, -44, -84, 48, 107, -51, 63, -89, 45, -3, -124, 83, 101, -52, 58, -67, 42, -1, -107, 86, 123}, new byte[]{-79, -34, 30, 41, -101, 115, -28, 96}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final String o000Ooo0(IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{56, 95, -27, -114, -128, -34, -104, -7, 47, 85, -6, -114, -128, -33, -106, -28, 62, 66, -90, -30, -75, -1, -70, -57, 23, 106, -59, -20, -76, -6, -96, -64, 21, 123, -64, -14}, new byte[]{91, 48, -120, -96, -29, -77, -7, -118}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(47, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o000Oooo(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{56, -103, -94, -46, 32, -57, 24, -117, 47, -109, -67, -46, 32, -58, 22, -106, 62, -124, -31, -66, 21, -26, 58, -75, 23, -84, -126, -80, 20, -29, 32, -78, 21, -67, -121, -82}, new byte[]{91, -10, -49, -4, 67, -86, 121, -8}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(102);
            parcelObtain.writeInt(0);
            this.OooO0Oo.transact(27, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int o000o00O(w90 w90Var, IBinder iBinder, Intent intent, String str, IBinder iBinder2, int i, String str2, String str3, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-7, 98, -119, 122, 19, -2, 99, 95, -18, 104, -106, 122, 19, -1, 109, 66, -1, 127, -54, 22, 38, -33, 65, 97, -42, 87, -87, 24, 39, -38, 91, 102, -44, 70, -84, 6}, new byte[]{-102, 13, -28, 84, 112, -109, 2, 44}));
            parcelObtain.writeStrongInterface(w90Var);
            parcelObtain.writeStrongBinder(iBinder);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongBinder(iBinder2);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000o0OO(ComponentName componentName, IBinder iBinder, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-117, -44, 112, -63, 90, -15, -106, 50, -100, -34, 111, -63, 90, -16, -104, 47, -115, -55, 51, -83, 111, -48, -76, 12, -92, -31, 80, -93, 110, -43, -82, 11, -90, -16, 85, -67}, new byte[]{-24, -69, 29, -17, 57, -100, -9, 65}));
            it2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000o0o0(String str, zi0 zi0Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{78, -44, -93, 12, 7, -97, -44, -67, 89, -34, -68, 12, 7, -98, -38, -96, 72, -55, -32, 96, 50, -66, -10, -125, 97, -31, -125, 110, 51, -69, -20, -124, 99, -16, -122, 112}, new byte[]{45, -69, -50, 34, 100, -14, -75, -50}));
            parcelObtain.writeString(str);
            it2.OooO0OO(parcelObtain, zi0Var, 0);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(44, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000o0oO(int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-35, 47, -109, 1, 37, -27, 39, -85, -54, 37, -116, 1, 37, -28, 41, -74, -37, 50, -48, 109, 16, -60, 5, -107, -14, 26, -77, 99, 17, -63, 31, -110, -16, 11, -74, 125}, new byte[]{-66, 64, -2, 47, 70, -120, 70, -40}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(1);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(36, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final ComponentName o000oo0(IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{6, -111, 67, 61, -32, -101, 51, 106, 17, -101, 92, 61, -32, -102, 61, 119, 0, -116, 0, 81, -43, -70, 17, 84, 41, -92, 99, 95, -44, -65, 11, 83, 43, -75, 102, 65}, new byte[]{101, -2, 46, 19, -125, -10, 82, 25}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(37, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ComponentName) it2.OooO00o(parcelObtain2, ComponentName.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final String o000oo0O(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{11, 21, -112, -93, 14, 102, -81, -73, 28, 31, -113, -93, 14, 103, -95, -86, 13, 8, -45, -49, 59, 71, -115, -119, 36, 32, -80, -63, 58, 66, -105, -114, 38, 49, -75, -33}, new byte[]{104, 122, -3, -115, 109, 11, -50, -60}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(59, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o000ooO0(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-43, 15, 27, 91, -1, 15, 89, 15, -62, 5, 4, 91, -1, 14, 87, 18, -45, 18, 88, 55, -54, 46, 123, 49, -6, 58, 59, 57, -53, 43, 97, 54, -8, 43, 62, 39}, new byte[]{-74, 96, 118, 117, -100, 98, 56, 124}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.OooO0Oo.transact(58, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final ArrayList o000ooo(int i, int i2, String str, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-85, 74, 26, 35, 40, 36, -76, -13, -68, 64, 5, 35, 40, 37, -70, -18, -83, 87, 89, 79, 29, 5, -106, -51, -124, 127, 58, 65, 28, 0, -116, -54, -122, 110, 63, 95}, new byte[]{-56, 37, 119, 13, 75, 73, -43, -128}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readArrayList(ue0.class.getClassLoader());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final zi0 o00Ooo(int i, IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{111, 25, -42, 19, 72, -46, 56, 58, 120, 19, -55, 19, 72, -45, 54, 39, 105, 4, -107, 127, 125, -13, 26, 4, 64, 44, -10, 113, 124, -10, 0, 3, 66, 61, -13, 111}, new byte[]{12, 118, -69, 61, 43, -65, 89, 73}));
            parcelObtain.writeString(str);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (zi0) it2.OooO00o(parcelObtain2, zi0.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final IBinder o00o0O(Intent intent, String str, String str2, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{8, -59, 121, -97, 109, 74, -59, 107, 31, -49, 102, -97, 109, 75, -53, 118, 14, -40, 58, -13, 88, 107, -25, 85, 39, -16, 89, -3, 89, 110, -3, 82, 37, -31, 92, -29}, new byte[]{107, -86, 20, -79, 14, 39, -92, 24}));
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o00oO0O(IBinder iBinder, IBinder iBinder2, Intent intent, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-65, -44, -14, -121, 69, 35, 63, -43, -88, -34, -19, -121, 69, 34, 49, -56, -71, -55, -79, -21, 112, 2, 29, -21, -112, -31, -46, -27, 113, 7, 7, -20, -110, -16, -41, -5}, new byte[]{-36, -69, -97, -87, 38, 78, 94, -90}));
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeStrongBinder(iBinder2);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeInt(0);
            this.OooO0Oo.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.we0
    public final ComponentName o0ooOoO(w90 w90Var, Intent intent, String str, boolean z, String str2, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-89, -60, -91, -14, 62, -47, 69, 77, -80, -50, -70, -14, 62, -48, 75, 80, -95, -39, -26, -98, 11, -16, 103, 115, -120, -15, -123, -112, 10, -11, 125, 116, -118, -32, -128, -114}, new byte[]{-60, -85, -56, -36, 93, -68, 36, 62}));
            parcelObtain.writeStrongInterface(w90Var);
            it2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ComponentName) it2.OooO00o(parcelObtain2, ComponentName.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
