package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r22 extends o00000OO {
    public static final Parcelable.Creator<r22> CREATOR = new b41(24);
    public final int OooO0Oo;
    public final x22 OooO0o;
    public final gh OooO0o0;

    public r22(int i, gh ghVar, x22 x22Var) {
        this.OooO0Oo = i;
        this.OooO0o0 = ghVar;
        this.OooO0o = x22Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0Oo(parcel, 2, this.OooO0o0, i);
        m33.OooO0Oo(parcel, 3, this.OooO0o, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
