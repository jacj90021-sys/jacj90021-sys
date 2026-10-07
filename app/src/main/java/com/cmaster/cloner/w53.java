package com.cmaster.cloner;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w53 extends o00000OO {
    public static final Parcelable.Creator<w53> CREATOR = new e13(3);
    public final int OooO;
    public final String OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final boolean OooO0oO;
    public final int OooO0oo;
    public final w53[] OooOO0;
    public final boolean OooOO0O;
    public final boolean OooOO0o;
    public final boolean OooOOO;
    public boolean OooOOO0;
    public final boolean OooOOOO;
    public final boolean OooOOOo;
    public final boolean OooOOo;
    public final boolean OooOOo0;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w53(android.content.Context r17, com.cmaster.cloner.oO000O0O[] r18) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.w53.<init>(android.content.Context, com.cmaster.cloner.oO000O0O[]):void");
    }

    public static w53 OooO00o() {
        return new w53("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static w53 OooO0O0() {
        return new w53("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 2, this.OooO0Oo);
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(this.OooO0o0);
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(this.OooO0o);
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
        m33.OooOO0o(parcel, 6, 4);
        parcel.writeInt(this.OooO0oo);
        m33.OooOO0o(parcel, 7, 4);
        parcel.writeInt(this.OooO);
        m33.OooO0oo(parcel, 8, this.OooOO0, i);
        m33.OooOO0o(parcel, 9, 4);
        parcel.writeInt(this.OooOO0O ? 1 : 0);
        m33.OooOO0o(parcel, 10, 4);
        parcel.writeInt(this.OooOO0o ? 1 : 0);
        boolean z = this.OooOOO0;
        m33.OooOO0o(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        m33.OooOO0o(parcel, 12, 4);
        parcel.writeInt(this.OooOOO ? 1 : 0);
        m33.OooOO0o(parcel, 13, 4);
        parcel.writeInt(this.OooOOOO ? 1 : 0);
        m33.OooOO0o(parcel, 14, 4);
        parcel.writeInt(this.OooOOOo ? 1 : 0);
        m33.OooOO0o(parcel, 15, 4);
        parcel.writeInt(this.OooOOo0 ? 1 : 0);
        m33.OooOO0o(parcel, 16, 4);
        parcel.writeInt(this.OooOOo ? 1 : 0);
        m33.OooOO0O(iOooOO0, parcel);
    }

    public w53(String str, int i, int i2, boolean z, int i3, int i4, w53[] w53VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.OooO0Oo = str;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO0oO = z;
        this.OooO0oo = i3;
        this.OooO = i4;
        this.OooOO0 = w53VarArr;
        this.OooOO0O = z2;
        this.OooOO0o = z3;
        this.OooOOO0 = z4;
        this.OooOOO = z5;
        this.OooOOOO = z6;
        this.OooOOOo = z7;
        this.OooOOo0 = z8;
        this.OooOOo = z9;
    }

    public w53() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public w53(Context context, oO000O0O oo000o0o) {
        this(context, new oO000O0O[]{oo000o0o});
    }
}
