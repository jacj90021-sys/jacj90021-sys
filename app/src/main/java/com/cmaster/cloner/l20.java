package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l20 implements Parcelable {
    public static final Parcelable.Creator<l20> CREATOR = new o0O0000O(15);
    public ArrayList OooO;
    public ArrayList OooO0Oo;
    public l5[] OooO0o;
    public ArrayList OooO0o0;
    public int OooO0oO;
    public String OooO0oo;
    public ArrayList OooOO0;
    public ArrayList OooOO0O;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.OooO0Oo);
        parcel.writeStringList(this.OooO0o0);
        parcel.writeTypedArray(this.OooO0o, i);
        parcel.writeInt(this.OooO0oO);
        parcel.writeString(this.OooO0oo);
        parcel.writeStringList(this.OooO);
        parcel.writeTypedList(this.OooOO0);
        parcel.writeTypedList(this.OooOO0O);
    }
}
