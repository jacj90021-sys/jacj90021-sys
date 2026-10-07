package com.cmaster.cloner;

import android.app.job.JobInfo;
import android.app.job.JobWorkItem;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cf0 implements ef0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.ef0
    public final HashMap OooO00o(String str, int i, String str2, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-72, 27, 102, -27, -70, 5, 42, 118, -81, 17, 121, -27, -70, 4, 36, 107, -66, 6, 37, -123, -108, 36, 2, 86, -109, 38, 93, -119, -108, 35, 10, 73, -109}, new byte[]{-37, 116, 11, -53, -39, 104, 75, 5}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.OooO0Oo.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readHashMap(cf0.class.getClassLoader());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.ef0
    public final int OooOOo0(String str, JobInfo jobInfo, String str2, int i, JobWorkItem jobWorkItem) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-93, 47, -96, 69, -68, -117, 47, 77, -76, 37, -65, 69, -68, -118, 33, 80, -91, 50, -29, 37, -110, -86, 7, 109, -120, 18, -101, 41, -110, -83, 15, 114, -120}, new byte[]{-64, 64, -51, 107, -33, -26, 78, 62}));
            parcelObtain.writeString(str);
            mt2.OooO00o(parcelObtain, jobInfo, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            mt2.OooO00o(parcelObtain, jobWorkItem, 0);
            this.OooO0Oo.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.ef0
    public final int Oooo0o(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-2, 42, 35, 108, 26, 23, 39, 109, -23, 32, 60, 108, 26, 22, 41, 112, -8, 55, 96, 12, 52, 54, 15, 77, -43, 23, 24, 0, 52, 49, 7, 82, -43}, new byte[]{-99, 69, 78, 66, 121, 122, 70, 30}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.ef0
    public final int OoooOo0(String str, JobInfo jobInfo, String str2, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-78, 42, 70, 84, 62, 13, -28, 37, -91, 32, 89, 84, 62, 12, -22, 56, -76, 55, 5, 52, 16, 44, -52, 5, -103, 23, 125, 56, 16, 43, -60, 26, -103}, new byte[]{-47, 69, 43, 122, 93, 96, -123, 86}));
            parcelObtain.writeString(str);
            mt2.OooO00o(parcelObtain, jobInfo, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.ef0
    public final void o0000O0(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{95, 127, 10, -8, 43, 23, 46, -57, 72, 117, 21, -8, 43, 22, 32, -38, 89, 98, 73, -104, 5, 54, 6, -25, 116, 66, 49, -108, 5, 49, 14, -8, 116}, new byte[]{60, 16, 103, -42, 72, 122, 79, -76}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.ef0
    public final JobInfo o0000oo(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{53, -27, -82, -50, 26, 70, -39, 121, 34, -17, -79, -50, 26, 71, -41, 100, 51, -8, -19, -82, 52, 103, -15, 89, 30, -40, -107, -94, 52, 96, -7, 70, 30}, new byte[]{86, -118, -61, -32, 121, 43, -72, 10}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (JobInfo) (parcelObtain2.readInt() != 0 ? JobInfo.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.ef0
    public final int o0O0O00(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{6, -117, 93, -69, 125, -33, 67, 81, 17, -127, 66, -69, 125, -34, 77, 76, 0, -106, 30, -37, 83, -2, 107, 113, 45, -74, 102, -41, 83, -7, 99, 110, 45}, new byte[]{101, -28, 48, -107, 30, -78, 34, 34}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
