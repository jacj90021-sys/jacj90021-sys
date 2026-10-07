package com.cmaster.cloner;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ib2 extends o00000OO {
    public static final Parcelable.Creator<ib2> CREATOR = new n32(12);
    public final String OooO;
    public final String OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final String OooO0oO;
    public final String OooO0oo;
    public final String OooOO0;
    public final Intent OooOO0O;
    public final h32 OooOO0o;
    public final boolean OooOOO0;

    public ib2(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.OooO0Oo = str;
        this.OooO0o0 = str2;
        this.OooO0o = str3;
        this.OooO0oO = str4;
        this.OooO0oo = str5;
        this.OooO = str6;
        this.OooOO0 = str7;
        this.OooOO0O = intent;
        this.OooOO0o = (h32) ey0.o0O0ooO(ey0.o00O0000(iBinder));
        this.OooOOO0 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 2, this.OooO0Oo);
        m33.OooO0o0(parcel, 3, this.OooO0o0);
        m33.OooO0o0(parcel, 4, this.OooO0o);
        m33.OooO0o0(parcel, 5, this.OooO0oO);
        m33.OooO0o0(parcel, 6, this.OooO0oo);
        m33.OooO0o0(parcel, 7, this.OooO);
        m33.OooO0o0(parcel, 8, this.OooOO0);
        m33.OooO0Oo(parcel, 9, this.OooOO0O, i);
        m33.OooO0OO(parcel, 10, new ey0(this.OooOO0o));
        m33.OooOO0o(parcel, 11, 4);
        parcel.writeInt(this.OooOOO0 ? 1 : 0);
        m33.OooOO0O(iOooOO0, parcel);
    }

    public ib2(Intent intent, h32 h32Var) {
        this(null, null, null, null, null, null, null, intent, new ey0(h32Var), false);
    }

    public ib2(String str, String str2, String str3, String str4, String str5, String str6, String str7, h32 h32Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, new ey0(h32Var), false);
    }
}
