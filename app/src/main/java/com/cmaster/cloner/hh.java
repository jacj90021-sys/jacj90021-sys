package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hh extends o00000OO {
    public static final Parcelable.Creator<hh> CREATOR = new n32(28);
    public final int[] OooO;
    public final yb1 OooO0Oo;
    public final boolean OooO0o;
    public final boolean OooO0o0;
    public final int[] OooO0oO;
    public final int OooO0oo;

    public hh(yb1 yb1Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.OooO0Oo = yb1Var;
        this.OooO0o0 = z;
        this.OooO0o = z2;
        this.OooO0oO = iArr;
        this.OooO0oo = i;
        this.OooO = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0Oo(parcel, 1, this.OooO0Oo, i);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(this.OooO0o ? 1 : 0);
        int[] iArr = this.OooO0oO;
        if (iArr != null) {
            int iOooOO02 = m33.OooOO0(4, parcel);
            parcel.writeIntArray(iArr);
            m33.OooOO0O(iOooOO02, parcel);
        }
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(this.OooO0oo);
        int[] iArr2 = this.OooO;
        if (iArr2 != null) {
            int iOooOO03 = m33.OooOO0(6, parcel);
            parcel.writeIntArray(iArr2);
            m33.OooOO0O(iOooOO03, parcel);
        }
        m33.OooOO0O(iOooOO0, parcel);
    }
}
