package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wt0 extends o00000OO {
    public static final Parcelable.Creator<wt0> CREATOR = new b41(25);
    public final String OooO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final long OooO0oO;
    public final long OooO0oo;
    public final String OooOO0;
    public final int OooOO0O;
    public final int OooOO0o;

    public wt0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = i3;
        this.OooO0oO = j;
        this.OooO0oo = j2;
        this.OooO = str;
        this.OooOO0 = str2;
        this.OooOO0O = i4;
        this.OooOO0o = i5;
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
        m33.OooOO0o(parcel, 4, 8);
        parcel.writeLong(this.OooO0oO);
        m33.OooOO0o(parcel, 5, 8);
        parcel.writeLong(this.OooO0oo);
        m33.OooO0o0(parcel, 6, this.OooO);
        m33.OooO0o0(parcel, 7, this.OooOO0);
        m33.OooOO0o(parcel, 8, 4);
        parcel.writeInt(this.OooOO0O);
        m33.OooOO0o(parcel, 9, 4);
        parcel.writeInt(this.OooOO0o);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
