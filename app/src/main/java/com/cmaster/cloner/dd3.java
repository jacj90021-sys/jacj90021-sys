package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dd3 extends o00000OO {
    public static final Parcelable.Creator<dd3> CREATOR = new e13(19);
    public final double OooO0Oo;
    public final double OooO0o0;

    public dd3(double d, double d2) {
        this.OooO0Oo = d;
        this.OooO0o0 = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 8);
        parcel.writeDouble(this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 8);
        parcel.writeDouble(this.OooO0o0);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
