package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gm1 extends o00000OO {
    public static final Parcelable.Creator<gm1> CREATOR = new b41(16);
    public final int OooO0Oo;
    public List OooO0o0;

    public gm1(int i, List list) {
        this.OooO0Oo = i;
        this.OooO0o0 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO(parcel, this.OooO0o0, 2);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
