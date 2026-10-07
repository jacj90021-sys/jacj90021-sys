package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h20 implements Parcelable {
    public static final Parcelable.Creator<h20> CREATOR = new o0O0000O(14);
    public String OooO0Oo;
    public int OooO0o0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.OooO0Oo);
        parcel.writeInt(this.OooO0o0);
    }
}
