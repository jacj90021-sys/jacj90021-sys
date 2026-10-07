package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qt2 {
    public static void OooO00o(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            Parcelable parcelable = (Parcelable) list.get(i);
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, 1);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
