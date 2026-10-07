package com.cmaster.cloner;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cv2 extends o00000OO {
    public static final Parcelable.Creator<cv2> CREATOR = new n32(27);
    public Bundle OooO0Oo;
    public int OooO0o;
    public iz[] OooO0o0;
    public hh OooO0oO;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO00o(parcel, 1, this.OooO0Oo);
        m33.OooO0oo(parcel, 2, this.OooO0o0, i);
        int i2 = this.OooO0o;
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(i2);
        m33.OooO0Oo(parcel, 4, this.OooO0oO, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
