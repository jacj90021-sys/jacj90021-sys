package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ki1 implements Parcelable {
    public static final Parcelable.Creator<ki1> CREATOR = new b41(7);
    public int[] OooO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int[] OooO0oO;
    public int OooO0oo;
    public ArrayList OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0Oo);
        parcel.writeInt(this.OooO0o0);
        parcel.writeInt(this.OooO0o);
        if (this.OooO0o > 0) {
            parcel.writeIntArray(this.OooO0oO);
        }
        parcel.writeInt(this.OooO0oo);
        if (this.OooO0oo > 0) {
            parcel.writeIntArray(this.OooO);
        }
        parcel.writeInt(this.OooOO0O ? 1 : 0);
        parcel.writeInt(this.OooOO0o ? 1 : 0);
        parcel.writeInt(this.OooOOO0 ? 1 : 0);
        parcel.writeList(this.OooOO0);
    }
}
