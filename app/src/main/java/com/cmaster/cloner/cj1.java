package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cj1 implements Parcelable {
    public static final Parcelable.Creator<cj1> CREATOR = new b41(8);
    public Parcelable OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.OooO0Oo, i);
        parcel.writeInt(this.OooO0o0);
        parcel.writeInt(this.OooO0o);
    }
}
