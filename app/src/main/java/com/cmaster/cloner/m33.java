package com.cmaster.cloner;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m33 {
    public static void OooO(Parcel parcel, List list, int i) {
        if (list == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO00o(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcel.writeBundle(bundle);
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO0O0(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcel.writeByteArray(bArr);
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO0OO(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcel.writeStrongBinder(iBinder);
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO0Oo(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcelable.writeToParcel(parcel, i2);
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO0o(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcel.writeStringArray(strArr);
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO0o0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcel.writeString(str);
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO0oO(Parcel parcel, List list, int i) {
        if (list == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcel.writeStringList(list);
        OooOO0O(iOooOO0, parcel);
    }

    public static void OooO0oo(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iOooOO0 = OooOO0(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        OooOO0O(iOooOO0, parcel);
    }

    public static int OooOO0(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void OooOO0O(int i, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void OooOO0o(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
