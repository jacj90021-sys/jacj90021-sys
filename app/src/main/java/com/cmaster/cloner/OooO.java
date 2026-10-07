package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class OooO implements Parcelable {
    public final Parcelable OooO0Oo;
    public static final OooO0OO OooO0o0 = new OooO0OO();
    public static final Parcelable.Creator<OooO> CREATOR = new OooO0o(0);

    public OooO(Parcelable parcelable) {
        if (parcelable != null) {
            this.OooO0Oo = parcelable == OooO0o0 ? null : parcelable;
        } else {
            ra.OooOOO("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.OooO0Oo, i);
    }

    public OooO() {
        this.OooO0Oo = null;
    }

    public OooO(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.OooO0Oo = parcelable == null ? OooO0o0 : parcelable;
    }
}
