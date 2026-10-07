package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xs2 extends o00000OO {
    public static final Parcelable.Creator<xs2> CREATOR = new e13(6);
    public int OooO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public String OooOO0O;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        int i2 = this.OooO0Oo;
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.OooO0o0;
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.OooO0o;
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.OooO0oO;
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.OooO0oo;
        m33.OooOO0o(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.OooO;
        m33.OooOO0o(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.OooOO0;
        m33.OooOO0o(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        m33.OooO0o0(parcel, 9, this.OooOO0O);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
