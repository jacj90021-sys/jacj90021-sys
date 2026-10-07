package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yu2 extends o00000OO {
    public static final Parcelable.Creator<yu2> CREATOR = new e13(8);
    public xs2 OooO;
    public String OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public String OooO0oO;
    public String OooO0oo;
    public xs2 OooOO0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 2, this.OooO0Oo);
        m33.OooO0o0(parcel, 3, this.OooO0o0);
        m33.OooO0o0(parcel, 4, this.OooO0o);
        m33.OooO0o0(parcel, 5, this.OooO0oO);
        m33.OooO0o0(parcel, 6, this.OooO0oo);
        m33.OooO0Oo(parcel, 7, this.OooO, i);
        m33.OooO0Oo(parcel, 8, this.OooOO0, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
