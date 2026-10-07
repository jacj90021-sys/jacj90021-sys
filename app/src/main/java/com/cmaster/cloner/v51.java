package com.cmaster.cloner;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v51 extends o00000OO {
    public static final Parcelable.Creator<v51> CREATOR = new n32(26);
    public final boolean OooO0Oo;
    public final IBinder OooO0o;
    public final ad2 OooO0o0;

    public v51(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.OooO0Oo = z;
        this.OooO0o0 = iBinder != null ? wc2.zzd(iBinder) : null;
        this.OooO0o = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
        ad2 ad2Var = this.OooO0o0;
        m33.OooO0OO(parcel, 2, ad2Var == null ? null : ad2Var.asBinder());
        m33.OooO0OO(parcel, 3, this.OooO0o);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
