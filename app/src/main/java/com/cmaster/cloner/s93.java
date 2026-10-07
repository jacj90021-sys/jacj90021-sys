package com.cmaster.cloner;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s93 extends o00000OO {
    public static final Parcelable.Creator<s93> CREATOR = new e13(5);
    public a13 OooO;
    public int OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public int OooO0oO;
    public Point[] OooO0oo;
    public b53 OooOO0;
    public b63 OooOO0O;
    public m83 OooOO0o;
    public n23 OooOOO;
    public c73 OooOOO0;
    public yu2 OooOOOO;
    public jx2 OooOOOo;
    public byte[] OooOOo;
    public iz2 OooOOo0;
    public boolean OooOOoo;
    public double OooOo00;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        int i2 = this.OooO0Oo;
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(i2);
        m33.OooO0o0(parcel, 3, this.OooO0o0);
        m33.OooO0o0(parcel, 4, this.OooO0o);
        int i3 = this.OooO0oO;
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(i3);
        m33.OooO0oo(parcel, 6, this.OooO0oo, i);
        m33.OooO0Oo(parcel, 7, this.OooO, i);
        m33.OooO0Oo(parcel, 8, this.OooOO0, i);
        m33.OooO0Oo(parcel, 9, this.OooOO0O, i);
        m33.OooO0Oo(parcel, 10, this.OooOO0o, i);
        m33.OooO0Oo(parcel, 11, this.OooOOO0, i);
        m33.OooO0Oo(parcel, 12, this.OooOOO, i);
        m33.OooO0Oo(parcel, 13, this.OooOOOO, i);
        m33.OooO0Oo(parcel, 14, this.OooOOOo, i);
        m33.OooO0Oo(parcel, 15, this.OooOOo0, i);
        m33.OooO0O0(parcel, 16, this.OooOOo);
        boolean z = this.OooOOoo;
        m33.OooOO0o(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.OooOo00;
        m33.OooOO0o(parcel, 18, 8);
        parcel.writeDouble(d);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
