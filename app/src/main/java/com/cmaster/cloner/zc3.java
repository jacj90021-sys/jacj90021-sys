package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zc3 extends o00000OO {
    public static final Parcelable.Creator<zc3> CREATOR = new e13(15);
    public final yc3 OooO;
    public final String OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final String OooO0oO;
    public final String OooO0oo;
    public final yc3 OooOO0;

    public zc3(String str, String str2, String str3, String str4, String str5, yc3 yc3Var, yc3 yc3Var2) {
        this.OooO0Oo = str;
        this.OooO0o0 = str2;
        this.OooO0o = str3;
        this.OooO0oO = str4;
        this.OooO0oo = str5;
        this.OooO = yc3Var;
        this.OooOO0 = yc3Var2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 1, this.OooO0Oo);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooO0o0(parcel, 3, this.OooO0o);
        m33.OooO0o0(parcel, 4, this.OooO0oO);
        m33.OooO0o0(parcel, 5, this.OooO0oo);
        m33.OooO0Oo(parcel, 6, this.OooO, i);
        m33.OooO0Oo(parcel, 7, this.OooOO0, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
