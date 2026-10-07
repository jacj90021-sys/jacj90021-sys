package com.cmaster.cloner;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ld3 extends o00000OO {
    public static final Parcelable.Creator<ld3> CREATOR = new e13(13);
    public final int OooO;
    public final int OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final byte[] OooO0oO;
    public final Point[] OooO0oo;
    public final cd3 OooOO0;
    public final fd3 OooOO0O;
    public final gd3 OooOO0o;
    public final hd3 OooOOO;
    public final kd3 OooOOO0;
    public final dd3 OooOOOO;
    public final zc3 OooOOOo;
    public final bd3 OooOOo;
    public final ad3 OooOOo0;

    public ld3(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, cd3 cd3Var, fd3 fd3Var, gd3 gd3Var, kd3 kd3Var, hd3 hd3Var, dd3 dd3Var, zc3 zc3Var, ad3 ad3Var, bd3 bd3Var) {
        this.OooO0Oo = i;
        this.OooO0o0 = str;
        this.OooO0o = str2;
        this.OooO0oO = bArr;
        this.OooO0oo = pointArr;
        this.OooO = i2;
        this.OooOO0 = cd3Var;
        this.OooOO0O = fd3Var;
        this.OooOO0o = gd3Var;
        this.OooOOO0 = kd3Var;
        this.OooOOO = hd3Var;
        this.OooOOOO = dd3Var;
        this.OooOOOo = zc3Var;
        this.OooOOo0 = ad3Var;
        this.OooOOo = bd3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooO0o0(parcel, 3, this.OooO0o);
        m33.OooO0O0(parcel, 4, this.OooO0oO);
        m33.OooO0oo(parcel, 5, this.OooO0oo, i);
        m33.OooOO0o(parcel, 6, 4);
        parcel.writeInt(this.OooO);
        m33.OooO0Oo(parcel, 7, this.OooOO0, i);
        m33.OooO0Oo(parcel, 8, this.OooOO0O, i);
        m33.OooO0Oo(parcel, 9, this.OooOO0o, i);
        m33.OooO0Oo(parcel, 10, this.OooOOO0, i);
        m33.OooO0Oo(parcel, 11, this.OooOOO, i);
        m33.OooO0Oo(parcel, 12, this.OooOOOO, i);
        m33.OooO0Oo(parcel, 13, this.OooOOOo, i);
        m33.OooO0Oo(parcel, 14, this.OooOOo0, i);
        m33.OooO0Oo(parcel, 15, this.OooOOo, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
