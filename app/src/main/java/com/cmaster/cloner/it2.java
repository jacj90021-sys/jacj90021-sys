package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class it2 {
    public static Object OooO00o(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void OooO0O0(Parcel parcel, List list, int i) {
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0OO(parcel, (Parcelable) list.get(i2), i);
        }
    }

    public static void OooO0OO(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }
}
