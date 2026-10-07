package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class re0 implements te0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.te0
    public final Account[] OooO0O0(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{4, -16, 24, -115, 22, 100, 19, -38, 19, -6, 7, -115, 22, 101, 29, -57, 2, -19, 91, -11, 45, 68, 43, -3, 35, -59, 44, -27, 47, 81, 63, -1, 34, -46, 37}, new byte[]{103, -97, 117, -93, 117, 9, 114, -87}));
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(26, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final Map OooO0o(int i, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-90, -34, -124, 83, -108, 89, -72, -20, -79, -44, -101, 83, -108, 88, -74, -15, -96, -61, -57, 43, -81, 121, -128, -53, -127, -21, -80, 59, -83, 108, -108, -55, -128, -4, -71}, new byte[]{-59, -79, -23, 125, -9, 52, -39, -97}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            this.OooO0Oo.transact(27, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readHashMap(re0.class.getClassLoader());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void OooOO0o(int i, IBinder iBinder, Account account, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-116, 14, 59, -28, -15, 106, -103, -32, -101, 4, 36, -28, -15, 107, -105, -3, -118, 19, 120, -100, -54, 74, -95, -57, -85, 59, 15, -116, -56, 95, -75, -59, -86, 44, 6}, new byte[]{-17, 97, 86, -54, -110, 7, -8, -109}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeInt(z ? 1 : 0);
            this.OooO0Oo.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final String OooOOOo(int i, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-60, -120, -115, 46, 100, -3, 4, 110, -45, -126, -110, 46, 100, -4, 10, 115, -62, -107, -50, 86, 95, -35, 60, 73, -29, -67, -71, 70, 93, -56, 40, 75, -30, -86, -80}, new byte[]{-89, -25, -32, 0, 7, -112, 101, 29}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void OooOoo0(int i, IBinder iBinder, Account account, String str, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{5, -122, 23, -62, -111, 29, -64, -119, 18, -116, 8, -62, -111, 28, -50, -108, 3, -101, 84, -70, -86, 61, -8, -82, 34, -77, 35, -86, -88, 40, -20, -84, 35, -92, 42}, new byte[]{102, -23, 122, -20, -14, 112, -95, -6}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            gt2.OooO0O0(parcelObtain, bundle);
            this.OooO0Oo.transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void OoooO(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-99, -49, 58, -93, -128, -23, 120, -2, -118, -59, 37, -93, -128, -24, 118, -29, -101, -46, 121, -37, -69, -55, 64, -39, -70, -6, 14, -53, -71, -36, 84, -37, -69, -19, 7}, new byte[]{-2, -96, 87, -115, -29, -124, 25, -115}));
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.OooO0Oo.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void OoooO0O(int i, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{97, -105, -45, -7, -61, 62, 4, 85, 118, -99, -52, -7, -61, 63, 10, 72, 103, -118, -112, -127, -8, 30, 60, 114, 70, -94, -25, -111, -6, 11, 40, 112, 71, -75, -18}, new byte[]{2, -8, -66, -41, -96, 83, 101, 38}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            this.OooO0Oo.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final boolean Ooooo00(int i, int i2, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{64, 26, 6, -13, 62, -120, -71, -98, 87, 16, 25, -13, 62, -119, -73, -125, 70, 7, 69, -117, 5, -88, -127, -71, 103, 47, 50, -101, 7, -67, -107, -69, 102, 56, 59}, new byte[]{35, 117, 107, -35, 93, -27, -40, -19}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(29, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void Ooooo0o(int i, IBinder iBinder, String str, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{32, 42, 18, 70, 106, -95, 84, -122, 55, 32, 13, 70, 106, -96, 90, -101, 38, 55, 81, 62, 81, -127, 108, -95, 7, 31, 38, 46, 83, -108, 120, -93, 6, 8, 47}, new byte[]{67, 69, 127, 104, 9, -52, 53, -11}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeStringArray(strArr);
            this.OooO0Oo.transact(24, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void OooooO0(int i, IBinder iBinder, Account account, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{91, 125, -38, -50, 20, -117, 8, -31, 76, 119, -59, -50, 20, -118, 6, -4, 93, 96, -103, -74, 47, -85, 48, -58, 124, 72, -18, -90, 45, -66, 36, -60, 125, 95, -25}, new byte[]{56, 18, -73, -32, 119, -26, 105, -110}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            gt2.OooO0O0(parcelObtain, account);
            gt2.OooO0O0(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.OooO0Oo.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final boolean Oooooo0(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-44, 31, 98, -53, 127, -39, -95, 125, -61, 21, 125, -53, 127, -40, -81, 96, -46, 2, 33, -77, 68, -7, -103, 90, -13, 42, 86, -93, 70, -20, -115, 88, -14, 61, 95}, new byte[]{-73, 112, 15, -27, 28, -76, -64, 14}));
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(2, parcelObtain, parcelObtain2, 0);
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

    @Override // com.cmaster.cloner.te0
    public final boolean o000000(int i, Account account, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{29, 16, -66, 45, -77, -5, 64, -47, 10, 26, -95, 45, -77, -6, 78, -52, 27, 13, -3, 85, -120, -37, 120, -10, 58, 37, -118, 69, -118, -50, 108, -12, 59, 50, -125}, new byte[]{126, 127, -45, 3, -48, -106, 33, -94}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            gt2.OooO0O0(parcelObtain, bundle);
            this.OooO0Oo.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o0000OO(int i, Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-83, 20, 70, 32, -46, 3, -12, 5, -70, 30, 89, 32, -46, 2, -6, 24, -85, 9, 5, 88, -23, 35, -52, 34, -118, 33, 114, 72, -21, 54, -40, 32, -117, 54, 123}, new byte[]{-50, 123, 43, 14, -79, 110, -107, 118}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.OooO0Oo.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final Account[] o0000Ooo(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{38, -116, -26, -113, 55, 35, 101, -17, 49, -122, -7, -113, 55, 34, 107, -14, 32, -111, -91, -9, 12, 3, 93, -56, 1, -71, -46, -25, 14, 22, 73, -54, 0, -82, -37}, new byte[]{69, -29, -117, -95, 84, 78, 4, -100}));
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final String o000O00O(int i, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{61, -95, -15, 116, 106, -101, 4, 58, 42, -85, -18, 116, 106, -102, 10, 39, 59, -68, -78, 12, 81, -69, 60, 29, 26, -108, -59, 28, 83, -82, 40, 31, 27, -125, -52}, new byte[]{94, -50, -100, 90, 9, -10, 101, 73}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            this.OooO0Oo.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o000OoO(int i, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-56, -95, 55, -119, -15, 55, 91, -9, -33, -85, 40, -119, -15, 54, 85, -22, -50, -68, 116, -15, -54, 23, 99, -48, -17, -108, 3, -31, -56, 2, 119, -46, -18, -125, 10}, new byte[]{-85, -50, 90, -89, -110, 90, 58, -124}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final boolean o000Ooo(int i, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{100, 23, -99, 97, -103, -5, 54, -115, 115, 29, -126, 97, -103, -6, 56, -112, 98, 10, -34, 25, -94, -37, 14, -86, 67, 34, -87, 9, -96, -50, 26, -88, 66, 53, -96}, new byte[]{7, 120, -16, 79, -6, -106, 87, -2}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            this.OooO0Oo.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final String o000o000(int i, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-89, 43, -60, -122, 55, -88, 44, 65, -80, 33, -37, -122, 55, -87, 34, 92, -95, 54, -121, -2, 12, -120, 20, 102, -128, 30, -16, -18, 14, -99, 0, 100, -127, 9, -7}, new byte[]{-60, 68, -87, -88, 84, -59, 77, 50}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final int o000o00o(int i, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{113, 54, 8, -106, -54, 63, -75, 117, 102, 60, 23, -106, -54, 62, -69, 104, 119, 43, 75, -18, -15, 31, -115, 82, 86, 3, 60, -2, -13, 10, -103, 80, 87, 20, 53}, new byte[]{18, 89, 101, -72, -87, 82, -44, 6}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(30, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o000oo00(int i, IBinder iBinder, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{116, 74, 4, 79, -118, -54, 17, -53, 99, 64, 27, 79, -118, -53, 31, -42, 114, 87, 71, 55, -79, -22, 41, -20, 83, 127, 48, 39, -77, -1, 61, -18, 82, 104, 57}, new byte[]{23, 37, 105, 97, -23, -89, 112, -72}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.OooO0Oo.transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o000oo0o(int i, Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-94, -88, -81, 23, -42, -99, 123, -70, -75, -94, -80, 23, -42, -100, 117, -89, -92, -75, -20, 111, -19, -67, 67, -99, -123, -99, -101, 127, -17, -88, 87, -97, -124, -118, -110}, new byte[]{-63, -57, -62, 57, -75, -16, 26, -55}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.OooO0Oo.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final boolean o000ooO(int i, Account account, String str, Bundle bundle, Map map) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-57, -101, -46, -64, 15, -94, 86, -35, -48, -111, -51, -64, 15, -93, 88, -64, -63, -122, -111, -72, 52, -126, 110, -6, -32, -82, -26, -88, 54, -105, 122, -8, -31, -71, -17}, new byte[]{-92, -12, -65, -18, 108, -49, 55, -82}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            gt2.OooO0O0(parcelObtain, bundle);
            parcelObtain.writeMap(map);
            this.OooO0Oo.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o000oooO(int i, IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-33, 27, -85, -85, 75, -38, -43, 99, -56, 17, -76, -85, 75, -37, -37, 126, -39, 6, -24, -45, 112, -6, -19, 68, -8, 46, -97, -61, 114, -17, -7, 70, -7, 57, -106}, new byte[]{-68, 116, -58, -123, 40, -73, -76, 16}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeStringArray(strArr);
            parcelObtain.writeInt(z ? 1 : 0);
            gt2.OooO0O0(parcelObtain, bundle);
            this.OooO0Oo.transact(22, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o00oO0o(int i, IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{86, 65, -78, -116, -40, -52, -115, -97, 65, 75, -83, -116, -40, -51, -125, -126, 80, 92, -15, -12, -29, -20, -75, -72, 113, 116, -122, -28, -31, -7, -95, -70, 112, 99, -113}, new byte[]{53, 46, -33, -94, -69, -95, -20, -20}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            gt2.OooO0O0(parcelObtain, bundle);
            this.OooO0Oo.transact(20, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o00ooo(int i, IBinder iBinder, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-102, -80, -15, -105, -6, -62, 18, 60, -115, -70, -18, -105, -6, -61, 28, 33, -100, -83, -78, -17, -63, -30, 42, 27, -67, -123, -59, -1, -61, -9, 62, 25, -68, -110, -52}, new byte[]{-7, -33, -100, -71, -103, -81, 115, 79}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            this.OooO0Oo.transact(23, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final AuthenticatorDescription[] o0OO00O(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-88, -122, 120, 17, 60, -38, 56, 47, -65, -116, 103, 17, 60, -37, 54, 50, -82, -101, 59, 105, 7, -6, 0, 8, -113, -77, 76, 121, 5, -17, 20, 10, -114, -92, 69}, new byte[]{-53, -23, 21, 63, 95, -73, 89, 92}));
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(25, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (AuthenticatorDescription[]) parcelObtain2.createTypedArray(AuthenticatorDescription.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o0OOO0o(int i, IBinder iBinder, Account account, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{114, -101, -56, 79, 69, -77, 110, 90, 101, -111, -41, 79, 69, -78, 96, 71, 116, -122, -117, 55, 126, -109, 86, 125, 85, -82, -4, 39, 124, -122, 66, 127, 84, -71, -11}, new byte[]{17, -12, -91, 97, 38, -34, 15, 41}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeStringArray(strArr);
            this.OooO0Oo.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final Map o0OoOo0(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{103, -21, -66, -2, 114, -62, -4, 79, 112, -31, -95, -2, 114, -61, -14, 82, 97, -10, -3, -122, 73, -30, -60, 104, 64, -34, -118, -106, 75, -9, -48, 106, 65, -55, -125}, new byte[]{4, -124, -45, -48, 17, -81, -99, 60}));
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.OooO0Oo.transact(31, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readHashMap(re0.class.getClassLoader());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final String o0ooOO0(int i, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{37, -78, 25, -114, 94, 4, -63, 72, 50, -72, 6, -114, 94, 5, -49, 85, 35, -81, 90, -10, 101, 36, -7, 111, 2, -121, 45, -26, 103, 49, -19, 109, 3, -112, 36}, new byte[]{70, -35, 116, -96, 61, 105, -96, 59}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            this.OooO0Oo.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final void o0ooOOo(int i, IBinder iBinder, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{30, -87, -41, -16, 99, 126, -87, 50, 9, -93, -56, -16, 99, 127, -89, 47, 24, -76, -108, -120, 88, 94, -111, 21, 57, -100, -29, -104, 90, 75, -123, 23, 56, -117, -22}, new byte[]{125, -58, -70, -34, 0, 19, -56, 65}));
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            gt2.OooO0O0(parcelObtain, account);
            parcelObtain.writeString(str);
            this.OooO0Oo.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.te0
    public final boolean ooOO(int i, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{112, 1, 39, -91, 67, -123, -6, 9, 103, 11, 56, -91, 67, -124, -12, 20, 118, 28, 100, -35, 120, -91, -62, 46, 87, 52, 19, -51, 122, -80, -42, 44, 86, 35, 26}, new byte[]{19, 110, 74, -117, 32, -24, -101, 122}));
            parcelObtain.writeInt(i);
            gt2.OooO0O0(parcelObtain, account);
            this.OooO0Oo.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
