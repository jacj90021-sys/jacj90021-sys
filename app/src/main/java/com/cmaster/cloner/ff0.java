package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ff0 implements hf0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.hf0
    public final boolean OooOO0(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-85, 93, -27, 104, 4, 61, 25, 38, -68, 87, -6, 104, 4, 60, 23, 59, -83, 64, -90, 12, 62, 29, 63, 17, -103, 123, -53, 7, 36, 23, 40, 17, -126, 96, -59}, new byte[]{-56, 50, -120, 70, 103, 80, 120, 85}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final List OooOO0O(int i, int i2, int i3, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-70, 92, -91, -59, 84, 41, -114, -48, -83, 86, -70, -59, 84, 40, -128, -51, -68, 65, -26, -95, 110, 9, -88, -25, -120, 122, -117, -86, 116, 3, -65, -25, -109, 97, -123}, new byte[]{-39, 51, -56, -21, 55, 68, -17, -93}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(36, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ProviderInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final IBinder OooOOO() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-13, -43, -98, -69, -78, -88, -121, 58, -28, -33, -127, -69, -78, -87, -119, 39, -11, -56, -35, -33, -120, -120, -95, 13, -63, -13, -80, -44, -110, -126, -74, 13, -38, -24, -66}, new byte[]{-112, -70, -13, -107, -47, -59, -26, 73}));
            this.OooO0Oo.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final List OooOOoo(String str, Intent intent, String str2, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{54, -92, -107, -17, 0, 117, -100, -11, 33, -82, -118, -17, 0, 116, -110, -24, 48, -71, -42, -117, 58, 85, -70, -62, 4, -126, -69, -128, 32, 95, -83, -62, 31, -103, -75}, new byte[]{85, -53, -8, -63, 99, 24, -3, -122}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(29, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ActivityInfo OooOo0(String str, ComponentName componentName, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-123, -75, 18, 43, -55, 89, 49, 96, -110, -65, 13, 43, -55, 88, 63, 125, -125, -88, 81, 79, -13, 121, 23, 87, -73, -109, 60, 68, -23, 115, 0, 87, -84, -120, 50}, new byte[]{-26, -38, 127, 5, -86, 52, 80, 19}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(26, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ActivityInfo) ot2.OooO0O0(parcelObtain2, ActivityInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ArrayList OooOoO(String str, Intent intent, String str2, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-48, -107, 116, -106, -8, -77, 124, 99, -57, -97, 107, -106, -8, -78, 114, 126, -42, -120, 55, -14, -62, -109, 90, 84, -30, -77, 90, -7, -40, -103, 77, 84, -7, -88, 84}, new byte[]{-77, -6, 25, -72, -101, -34, 29, 16}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(31, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ArrayList OooOooo(int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{61, 27, 13, 34, -13, -98, 33, -13, 42, 17, 18, 34, -13, -97, 47, -18, 59, 6, 78, 70, -55, -66, 7, -60, 15, 61, 35, 77, -45, -76, 16, -60, 20, 38, 45}, new byte[]{94, 116, 96, 12, -112, -13, 64, -128}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(PackageInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final List Oooo0(String str, Intent intent, String str2, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{108, 85, 58, -1, 34, -82, 49, -26, 123, 95, 37, -1, 34, -81, 63, -5, 106, 72, 121, -101, 24, -114, 23, -47, 94, 115, 20, -112, 2, -124, 0, -47, 69, 104, 26}, new byte[]{15, 58, 87, -47, 65, -61, 80, -107}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(25, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ArrayList Oooo0o0(int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-63, -45, 86, -28, -53, -6, 116, -108, -42, -39, 73, -28, -53, -5, 122, -119, -57, -50, 21, -128, -15, -38, 82, -93, -13, -11, 120, -117, -21, -48, 69, -93, -24, -18, 118}, new byte[]{-94, -68, 59, -54, -88, -105, 21, -25}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ApplicationInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ir1 Oooo0oO(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{68, 111, 59, -1, -54, 120, 117, 68, 83, 101, 36, -1, -54, 121, 123, 89, 66, 114, 120, -101, -16, 88, 83, 115, 118, 73, 21, -112, -22, 82, 68, 115, 109, 82, 27}, new byte[]{39, 0, 86, -47, -87, 21, 20, 55}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(49, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ir1) ot2.OooO0O0(parcelObtain2, ir1.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final void OoooOO0(int i, int i2, String str, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-1, 43, -28, -114, 36, 32, 18, -93, -24, 33, -5, -114, 36, 33, 28, -66, -7, 54, -89, -22, 30, 0, 52, -108, -51, 13, -54, -31, 4, 10, 35, -108, -42, 22, -60}, new byte[]{-100, 68, -119, -96, 71, 77, 115, -48}));
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(40, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final int OooooOo(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{105, 78, -105, 47, -7, 72, 42, 127, 126, 68, -120, 47, -7, 73, 36, 98, 111, 83, -44, 75, -61, 104, 12, 72, 91, 104, -71, 64, -39, 98, 27, 72, 64, 115, -73}, new byte[]{10, 33, -6, 1, -102, 37, 75, 12}));
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            this.OooO0Oo.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final int Oooooo(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{48, 51, 7, -102, -62, 53, 17, 125, 39, 57, 24, -102, -62, 52, 31, 96, 54, 46, 68, -2, -8, 21, 55, 74, 2, 21, 41, -11, -30, 31, 32, 74, 25, 14, 39}, new byte[]{83, 92, 106, -76, -95, 88, 112, 14}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(18, parcelObtain, parcelObtain2, 0);
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

    @Override // com.cmaster.cloner.hf0
    public final ActivityInfo o000000o(String str, ComponentName componentName, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{97, 64, -7, -77, -44, 59, -92, 62, 118, 74, -26, -77, -44, 58, -86, 35, 103, 93, -70, -41, -18, 27, -126, 9, 83, 102, -41, -36, -12, 17, -107, 9, 72, 125, -39}, new byte[]{2, 47, -108, -99, -73, 86, -59, 77}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ActivityInfo) ot2.OooO0O0(parcelObtain2, ActivityInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final int o0000Oo(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{42, -8, -13, -106, 20, -122, -116, 65, 61, -14, -20, -106, 20, -121, -126, 92, 44, -27, -80, -14, 46, -90, -86, 118, 24, -34, -35, -7, 52, -84, -67, 118, 3, -59, -45}, new byte[]{73, -105, -98, -72, 119, -21, -19, 50}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final int o0000Oo0(String str, String str2, int i, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{81, 22, 20, 55, -108, -102, -121, 84, 70, 28, 11, 55, -108, -101, -119, 73, 87, 11, 87, 83, -82, -70, -95, 99, 99, 48, 58, 88, -76, -80, -74, 99, 120, 43, 52}, new byte[]{50, 121, 121, 25, -9, -9, -26, 39}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str3);
            this.OooO0Oo.transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final List o0000o0(String str, Intent intent, String str2, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-55, -74, -87, 93, 106, 123, -37, 16, -34, -68, -74, 93, 106, 122, -43, 13, -49, -85, -22, 57, 80, 91, -3, 39, -5, -112, -121, 50, 74, 81, -22, 39, -32, -117, -119}, new byte[]{-86, -39, -60, 115, 9, 22, -70, 99}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(35, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final boolean o0000o0o(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{104, 97, -104, -40, 46, 116, 51, -35, 127, 107, -121, -40, 46, 117, 61, -64, 110, 124, -37, -68, 20, 84, 21, -22, 90, 71, -74, -73, 14, 94, 2, -22, 65, 92, -72}, new byte[]{11, 14, -11, -10, 77, 25, 82, -82}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(37, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ApplicationInfo o0000oO0(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{35, 82, 43, 49, -34, -25, 31, 10, 52, 88, 52, 49, -34, -26, 17, 23, 37, 79, 104, 85, -28, -57, 57, 61, 17, 116, 5, 94, -2, -51, 46, 61, 10, 111, 11}, new byte[]{64, 61, 70, 31, -67, -118, 126, 121}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ApplicationInfo) ot2.OooO0O0(parcelObtain2, ApplicationInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ResolveInfo o000O0(String str, Intent intent, String str2, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-99, 83, -15, 116, -6, -35, 79, -94, -118, 89, -18, 116, -6, -36, 65, -65, -101, 78, -78, 16, -64, -3, 105, -107, -81, 117, -33, 27, -38, -9, 126, -107, -76, 110, -47}, new byte[]{-2, 60, -100, 90, -103, -80, 46, -47}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(24, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ResolveInfo) ot2.OooO0O0(parcelObtain2, ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ArrayList o000O00(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-106, -84, 27, 122, 47, -68, -30, 47, -127, -90, 4, 122, 47, -67, -20, 50, -112, -79, 88, 30, 21, -100, -60, 24, -92, -118, 53, 21, 15, -106, -45, 24, -65, -111, 59}, new byte[]{-11, -61, 118, 84, 76, -47, -125, 92}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(SharedLibraryInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ProviderInfo o000O0oO(String str, ComponentName componentName, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-82, -96, -79, 68, 35, 110, 108, -30, -71, -86, -82, 68, 35, 111, 98, -1, -88, -67, -14, 32, 25, 78, 74, -43, -100, -122, -97, 43, 3, 68, 93, -43, -121, -99, -111}, new byte[]{-51, -49, -36, 106, 64, 3, 13, -111}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(34, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ProviderInfo) ot2.OooO0O0(parcelObtain2, ProviderInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final String o000OO0o(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{95, 62, 106, 64, -49, 95, -51, -74, 72, 52, 117, 64, -49, 94, -61, -85, 89, 35, 41, 36, -11, 127, -21, -127, 109, 24, 68, 47, -17, 117, -4, -127, 118, 3, 74}, new byte[]{60, 81, 7, 110, -84, 50, -84, -59}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(0);
            this.OooO0Oo.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ResolveInfo o000OOO(int i, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{87, -115, -117, -30, 19, -111, 64, -92, 64, -121, -108, -30, 19, -112, 78, -71, 81, -112, -56, -122, 41, -79, 102, -109, 101, -85, -91, -115, 51, -69, 113, -109, 126, -80, -85}, new byte[]{52, -30, -26, -52, 112, -4, 33, -41}));
            ot2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(44, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ResolveInfo) ot2.OooO0O0(parcelObtain2, ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final i01 o000Oo(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-74, -112, 57, 85, 4, 32, -110, -7, -95, -102, 38, 85, 4, 33, -100, -28, -80, -115, 122, 49, 62, 0, -76, -50, -124, -74, 23, 58, 36, 10, -93, -50, -97, -83, 25}, new byte[]{-43, -1, 84, 123, 103, 77, -13, -118}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(0);
            this.OooO0Oo.transact(41, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (i01) ot2.OooO0O0(parcelObtain2, i01.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final String[] o000Oo0(int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{83, 72, 69, 41, -45, -82, -68, 14, 68, 66, 90, 41, -45, -81, -78, 19, 85, 85, 6, 77, -23, -114, -102, 57, 97, 110, 107, 70, -13, -124, -115, 57, 122, 117, 101}, new byte[]{48, 39, 40, 7, -80, -61, -35, 125}));
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createStringArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ResolveInfo o000OoOo(String str, Intent intent, String str2, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{27, 47, 89, 116, -40, -75, -69, -55, 12, 37, 70, 116, -40, -76, -75, -44, 29, 50, 26, 16, -30, -107, -99, -2, 41, 9, 119, 27, -8, -97, -118, -2, 50, 18, 121}, new byte[]{120, 64, 52, 90, -69, -40, -38, -70}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, intent, 0);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(30, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ResolveInfo) ot2.OooO0O0(parcelObtain2, ResolveInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final boolean o000OooO(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-68, 46, 25, 61, -105, 99, -47, -97, -85, 36, 6, 61, -105, 98, -33, -126, -70, 51, 90, 89, -83, 67, -9, -88, -114, 8, 55, 82, -73, 73, -32, -88, -107, 19, 57}, new byte[]{-33, 65, 116, 19, -12, 14, -80, -20}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ProviderInfo o000o0Oo(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{34, 1, 98, 72, -50, 35, -49, -69, 53, 11, 125, 72, -50, 34, -63, -90, 36, 28, 33, 44, -12, 3, -23, -116, 16, 39, 76, 39, -18, 9, -2, -116, 11, 60, 66}, new byte[]{65, 110, 15, 102, -83, 78, -82, -56}));
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(33, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ProviderInfo) ot2.OooO0O0(parcelObtain2, ProviderInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final PackageInfo o000o0oo(int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-45, 7, 20, -125, -35, -5, -58, -8, -60, 13, 11, -125, -35, -6, -56, -27, -43, 26, 87, -25, -25, -37, -32, -49, -31, 33, 58, -20, -3, -47, -9, -49, -6, 58, 52}, new byte[]{-80, 104, 121, -83, -66, -106, -89, -117}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (PackageInfo) ot2.OooO0O0(parcelObtain2, PackageInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final int o000ooo0(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-72, 52, -11, -118, -119, -108, -60, -95, -81, 62, -22, -118, -119, -107, -54, -68, -66, 41, -74, -18, -77, -76, -30, -106, -118, 18, -37, -27, -87, -66, -11, -106, -111, 9, -43}, new byte[]{-37, 91, -104, -92, -22, -7, -91, -46}));
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            this.OooO0Oo.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final ServiceInfo o00O0O(String str, ComponentName componentName, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-45, -105, 51, -90, -50, -15, 37, 102, -60, -99, 44, -90, -50, -16, 43, 123, -43, -118, 112, -62, -12, -47, 3, 81, -31, -79, 29, -55, -18, -37, 20, 81, -6, -86, 19}, new byte[]{-80, -8, 94, -120, -83, -100, 68, 21}));
            parcelObtain.writeString(str);
            ot2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(32, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (ServiceInfo) ot2.OooO0O0(parcelObtain2, ServiceInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final int o0OoO0o(ComponentName componentName, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-29, -25, 35, -86, 41, -125, -118, 107, -12, -19, 60, -86, 41, -126, -124, 118, -27, -6, 96, -50, 19, -93, -84, 92, -47, -63, 13, -59, 9, -87, -69, 92, -54, -38, 3}, new byte[]{-128, -120, 78, -124, 74, -18, -21, 24}));
            ot2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(39, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final void oo0o0Oo(ComponentName componentName, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{46, -100, 38, 64, -33, -36, -25, -120, 57, -106, 57, 64, -33, -35, -23, -107, 40, -127, 101, 36, -27, -4, -63, -65, 28, -70, 8, 47, -1, -10, -42, -65, 7, -95, 6}, new byte[]{77, -13, 75, 110, -68, -79, -122, -5}));
            ot2.OooO0OO(parcelObtain, componentName, 0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.OooO0Oo.transact(38, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.hf0
    public final PermissionInfo oooo00o(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{-94, -83, 34, 55, 24, 103, -105, 69, -75, -89, 61, 55, 24, 102, -103, 88, -92, -80, 97, 83, 34, 71, -79, 114, -112, -117, 12, 88, 56, 77, -90, 114, -117, -112, 2}, new byte[]{-63, -62, 79, 25, 123, 10, -10, 54}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.OooO0Oo.transact(23, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (PermissionInfo) ot2.OooO0O0(parcelObtain2, PermissionInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
