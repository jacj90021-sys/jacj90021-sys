package com.cmaster.cloner;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class y12 {
    public static final /* synthetic */ int OooO00o = 0;

    static {
        y12.class.getClassLoader();
    }

    public static Parcelable OooO00o(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void OooO0O0(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(px0.OooOOO(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void OooO0OO(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
