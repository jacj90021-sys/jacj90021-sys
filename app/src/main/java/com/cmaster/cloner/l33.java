package com.cmaster.cloner;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class l33 {
    public static void OooO(int i, Parcel parcel) {
        if (parcel.dataPosition() != i) {
            throw new tf(px0.OooOOO(i, "Overread allowed size end="), parcel);
        }
    }

    public static Bundle OooO00o(int i, Parcel parcel) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return bundle;
    }

    public static byte[] OooO0O0(int i, Parcel parcel) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return bArrCreateByteArray;
    }

    public static Parcelable OooO0OO(Parcel parcel, int i, Parcelable.Creator creator) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return parcelable;
    }

    public static String OooO0Oo(int i, Parcel parcel) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return string;
    }

    public static ArrayList OooO0o(int i, Parcel parcel) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return arrayListCreateStringArrayList;
    }

    public static String[] OooO0o0(int i, Parcel parcel) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return strArrCreateStringArray;
    }

    public static Object[] OooO0oO(Parcel parcel, int i, Parcelable.Creator creator) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return objArrCreateTypedArray;
    }

    public static ArrayList OooO0oo(Parcel parcel, int i, Parcelable.Creator creator) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return arrayListCreateTypedArrayList;
    }

    public static boolean OooOO0(int i, Parcel parcel) {
        OooOOo0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder OooOO0O(int i, Parcel parcel) {
        int iOooOOO = OooOOO(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iOooOOO == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iOooOOO);
        return strongBinder;
    }

    public static int OooOO0o(int i, Parcel parcel) {
        OooOOo0(parcel, i, 4);
        return parcel.readInt();
    }

    public static int OooOOO(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static long OooOOO0(int i, Parcel parcel) {
        OooOOo0(parcel, i, 8);
        return parcel.readLong();
    }

    public static void OooOOOO(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + OooOOO(i, parcel));
    }

    public static int OooOOOo(Parcel parcel) {
        int i = parcel.readInt();
        int iOooOOO = OooOOO(i, parcel);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new tf("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iOooOOO + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new tf(px0.OooOOO0(iDataPosition, i2, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static void OooOOo0(Parcel parcel, int i, int i2) {
        int iOooOOO = OooOOO(i, parcel);
        if (iOooOOO == i2) {
            return;
        }
        throw new tf(rj.OooO0oO(rj.OooO(i2, iOooOOO, "Expected size ", " got ", " (0x"), Integer.toHexString(iOooOOO), ")"), parcel);
    }
}
