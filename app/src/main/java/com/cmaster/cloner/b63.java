package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b63 extends o00000OO {
    public static final Parcelable.Creator<b63> CREATOR = new n32(3);
    public String OooO0Oo;
    public String OooO0o0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 2, this.OooO0Oo);
        m33.OooO0o0(parcel, 3, this.OooO0o0);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
