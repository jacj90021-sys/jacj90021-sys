package com.cmaster.cloner;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ta3 extends o00000OO {
    public static final Parcelable.Creator<ta3> CREATOR = new e13(7);
    public final String OooO;
    public final String OooO0Oo;
    public th2 OooO0o;
    public long OooO0o0;
    public final Bundle OooO0oO;
    public final String OooO0oo;
    public final String OooOO0;
    public final String OooOO0O;

    public ta3(String str, long j, th2 th2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.OooO0Oo = str;
        this.OooO0o0 = j;
        this.OooO0o = th2Var;
        this.OooO0oO = bundle;
        this.OooO0oo = str2;
        this.OooO = str3;
        this.OooOO0 = str4;
        this.OooOO0O = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 1, this.OooO0Oo);
        long j = this.OooO0o0;
        m33.OooOO0o(parcel, 2, 8);
        parcel.writeLong(j);
        m33.OooO0Oo(parcel, 3, this.OooO0o, i);
        m33.OooO00o(parcel, 4, this.OooO0oO);
        m33.OooO0o0(parcel, 5, this.OooO0oo);
        m33.OooO0o0(parcel, 6, this.OooO);
        m33.OooO0o0(parcel, 7, this.OooOO0);
        m33.OooO0o0(parcel, 8, this.OooOO0O);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
