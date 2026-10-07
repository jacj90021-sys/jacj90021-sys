package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yc3 extends o00000OO {
    public static final Parcelable.Creator<yc3> CREATOR = new e13(14);
    public final int OooO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;
    public final boolean OooOO0;
    public final String OooOO0O;

    public yc3(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = i3;
        this.OooO0oO = i4;
        this.OooO0oo = i5;
        this.OooO = i6;
        this.OooOO0 = z;
        this.OooOO0O = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0);
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(this.OooO0o);
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(this.OooO0oO);
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(this.OooO0oo);
        m33.OooOO0o(parcel, 6, 4);
        parcel.writeInt(this.OooO);
        m33.OooOO0o(parcel, 7, 4);
        parcel.writeInt(this.OooOO0 ? 1 : 0);
        m33.OooO0o0(parcel, 8, this.OooOO0O);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
