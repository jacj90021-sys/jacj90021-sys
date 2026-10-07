package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bm2 extends o00000OO {
    public static final Parcelable.Creator<bm2> CREATOR = new n32(22);
    public final int OooO0Oo;
    public final int OooO0o0;

    public bm2(int i, int i2) {
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
