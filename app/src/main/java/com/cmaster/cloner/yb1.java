package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yb1 extends o00000OO {
    public static final Parcelable.Creator<yb1> CREATOR = new n32(7);
    public final int OooO0Oo;
    public final boolean OooO0o;
    public final boolean OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;

    public yb1(int i, int i2, int i3, boolean z, boolean z2) {
        this.OooO0Oo = i;
        this.OooO0o0 = z;
        this.OooO0o = z2;
        this.OooO0oO = i2;
        this.OooO0oo = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(this.OooO0o ? 1 : 0);
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(this.OooO0oO);
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(this.OooO0oo);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
