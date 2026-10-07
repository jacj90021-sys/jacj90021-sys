package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ce extends ee {
    public static final Parcelable.Creator<ce> CREATOR = new o0O0000O(8);
    public ArrayList OooO0Oo;

    @Override // com.cmaster.cloner.ee
    public final void OooO00o() {
        ArrayList arrayList = this.OooO0Oo;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ee) this.OooO0Oo.get(i)).OooO00o();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.OooO0Oo;
        if (arrayList == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) arrayList.get(i2), i);
        }
    }
}
