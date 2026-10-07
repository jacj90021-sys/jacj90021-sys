package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ad3 extends o00000OO {
    public static final Parcelable.Creator<ad3> CREATOR = new e13(16);
    public final String[] OooO;
    public final ed3 OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final fd3[] OooO0oO;
    public final cd3[] OooO0oo;
    public final xc3[] OooOO0;

    public ad3(ed3 ed3Var, String str, String str2, fd3[] fd3VarArr, cd3[] cd3VarArr, String[] strArr, xc3[] xc3VarArr) {
        this.OooO0Oo = ed3Var;
        this.OooO0o0 = str;
        this.OooO0o = str2;
        this.OooO0oO = fd3VarArr;
        this.OooO0oo = cd3VarArr;
        this.OooO = strArr;
        this.OooOO0 = xc3VarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0Oo(parcel, 1, this.OooO0Oo, i);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooO0o0(parcel, 3, this.OooO0o);
        m33.OooO0oo(parcel, 4, this.OooO0oO, i);
        m33.OooO0oo(parcel, 5, this.OooO0oo, i);
        m33.OooO0o(parcel, 6, this.OooO);
        m33.OooO0oo(parcel, 7, this.OooOO0, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
