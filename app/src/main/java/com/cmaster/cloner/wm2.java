package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wm2 extends o00000OO {
    public static final Parcelable.Creator<wm2> CREATOR = new n32(24);
    public final boolean OooO0Oo;
    public final boolean OooO0o;
    public final boolean OooO0o0;

    public wm2(ws1 ws1Var) {
        this(ws1Var.OooO00o, ws1Var.OooO0O0, ws1Var.OooO0OO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(this.OooO0o ? 1 : 0);
        m33.OooOO0O(iOooOO0, parcel);
    }

    public wm2(boolean z, boolean z2, boolean z3) {
        this.OooO0Oo = z;
        this.OooO0o0 = z2;
        this.OooO0o = z3;
    }
}
