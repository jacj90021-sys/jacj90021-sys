package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kx2 extends o00000OO {
    public static final Parcelable.Creator<kx2> CREATOR = new n32(29);
    public final int OooO;
    public final boolean OooO0Oo;
    public final String OooO0o;
    public final boolean OooO0o0;
    public final boolean OooO0oO;
    public final float OooO0oo;
    public final boolean OooOO0;
    public final boolean OooOO0O;
    public final boolean OooOO0o;

    public kx2(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.OooO0Oo = z;
        this.OooO0o0 = z2;
        this.OooO0o = str;
        this.OooO0oO = z3;
        this.OooO0oo = f;
        this.OooO = i;
        this.OooOO0 = z4;
        this.OooOO0O = z5;
        this.OooOO0o = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
        m33.OooO0o0(parcel, 4, this.OooO0o);
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
        m33.OooOO0o(parcel, 6, 4);
        parcel.writeFloat(this.OooO0oo);
        m33.OooOO0o(parcel, 7, 4);
        parcel.writeInt(this.OooO);
        m33.OooOO0o(parcel, 8, 4);
        parcel.writeInt(this.OooOO0 ? 1 : 0);
        m33.OooOO0o(parcel, 9, 4);
        parcel.writeInt(this.OooOO0O ? 1 : 0);
        m33.OooOO0o(parcel, 10, 4);
        parcel.writeInt(this.OooOO0o ? 1 : 0);
        m33.OooOO0O(iOooOO0, parcel);
    }

    public kx2(boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
