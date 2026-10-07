package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m5 implements Parcelable {
    public static final Parcelable.Creator<m5> CREATOR = new o0O0000O(6);
    public final ArrayList OooO0Oo;
    public final ArrayList OooO0o0;

    public m5(Parcel parcel) {
        this.OooO0Oo = parcel.createStringArrayList();
        this.OooO0o0 = parcel.createTypedArrayList(l5.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.OooO0Oo);
        parcel.writeTypedList(this.OooO0o0);
    }
}
