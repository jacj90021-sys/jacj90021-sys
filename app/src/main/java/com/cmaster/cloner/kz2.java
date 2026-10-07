package com.cmaster.cloner;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kz2 extends o00000OO {
    public static final Parcelable.Creator<kz2> CREATOR = new e13(1);
    public final boolean OooO;
    public final int OooO0Oo;
    public final Bundle OooO0o;
    public final long OooO0o0;
    public final int OooO0oO;
    public final List OooO0oo;
    public final int OooOO0;
    public final boolean OooOO0O;
    public final String OooOO0o;
    public final Location OooOOO;
    public final fm2 OooOOO0;
    public final String OooOOOO;
    public final Bundle OooOOOo;
    public final List OooOOo;
    public final Bundle OooOOo0;
    public final String OooOOoo;
    public final String OooOo;
    public final boolean OooOo0;
    public final String OooOo00;
    public final hb2 OooOo0O;
    public final int OooOo0o;
    public final int OooOoO;
    public final List OooOoO0;
    public final String OooOoOO;
    public final long OooOoo;
    public final int OooOoo0;
    public final long OooOooO;

    public kz2(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, fm2 fm2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, hb2 hb2Var, int i4, String str5, List list3, int i5, String str6, int i6, long j2, long j3) {
        this.OooO0Oo = i;
        this.OooO0o0 = j;
        this.OooO0o = bundle == null ? new Bundle() : bundle;
        this.OooO0oO = i2;
        this.OooO0oo = list;
        this.OooO = z;
        this.OooOO0 = i3;
        this.OooOO0O = z2;
        this.OooOO0o = str;
        this.OooOOO0 = fm2Var;
        this.OooOOO = location;
        this.OooOOOO = str2;
        this.OooOOOo = bundle2 == null ? new Bundle() : bundle2;
        this.OooOOo0 = bundle3;
        this.OooOOo = list2;
        this.OooOOoo = str3;
        this.OooOo00 = str4;
        this.OooOo0 = z3;
        this.OooOo0O = hb2Var;
        this.OooOo0o = i4;
        this.OooOo = str5;
        this.OooOoO0 = list3 == null ? new ArrayList() : list3;
        this.OooOoO = i5;
        this.OooOoOO = str6;
        this.OooOoo0 = i6;
        this.OooOoo = j2;
        this.OooOooO = j3;
    }

    public final boolean OooO00o(kz2 kz2Var) {
        return kz2Var != null && this.OooO0Oo == kz2Var.OooO0Oo && this.OooO0o0 == kz2Var.OooO0o0 && a83.OooO00o(this.OooO0o, kz2Var.OooO0o) && this.OooO0oO == kz2Var.OooO0oO && uw2.OooO00o(this.OooO0oo, kz2Var.OooO0oo) && this.OooO == kz2Var.OooO && this.OooOO0 == kz2Var.OooOO0 && this.OooOO0O == kz2Var.OooOO0O && uw2.OooO00o(this.OooOO0o, kz2Var.OooOO0o) && uw2.OooO00o(this.OooOOO0, kz2Var.OooOOO0) && uw2.OooO00o(this.OooOOO, kz2Var.OooOOO) && uw2.OooO00o(this.OooOOOO, kz2Var.OooOOOO) && a83.OooO00o(this.OooOOOo, kz2Var.OooOOOo) && a83.OooO00o(this.OooOOo0, kz2Var.OooOOo0) && uw2.OooO00o(this.OooOOo, kz2Var.OooOOo) && uw2.OooO00o(this.OooOOoo, kz2Var.OooOOoo) && uw2.OooO00o(this.OooOo00, kz2Var.OooOo00) && this.OooOo0 == kz2Var.OooOo0 && this.OooOo0o == kz2Var.OooOo0o && uw2.OooO00o(this.OooOo, kz2Var.OooOo) && uw2.OooO00o(this.OooOoO0, kz2Var.OooOoO0) && this.OooOoO == kz2Var.OooOoO && uw2.OooO00o(this.OooOoOO, kz2Var.OooOoOO) && this.OooOoo0 == kz2Var.OooOoo0;
    }

    public final boolean OooO0O0() {
        Bundle bundle = this.OooO0o;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kz2)) {
            return false;
        }
        kz2 kz2Var = (kz2) obj;
        return OooO00o(kz2Var) && this.OooOoo == kz2Var.OooOoo;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.OooO0Oo), Long.valueOf(this.OooO0o0), this.OooO0o, Integer.valueOf(this.OooO0oO), this.OooO0oo, Boolean.valueOf(this.OooO), Integer.valueOf(this.OooOO0), Boolean.valueOf(this.OooOO0O), this.OooOO0o, this.OooOOO0, this.OooOOO, this.OooOOOO, this.OooOOOo, this.OooOOo0, this.OooOOo, this.OooOOoo, this.OooOo00, Boolean.valueOf(this.OooOo0), Integer.valueOf(this.OooOo0o), this.OooOo, this.OooOoO0, Integer.valueOf(this.OooOoO), this.OooOoOO, Integer.valueOf(this.OooOoo0), Long.valueOf(this.OooOoo), Long.valueOf(this.OooOooO)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 8);
        parcel.writeLong(this.OooO0o0);
        m33.OooO00o(parcel, 3, this.OooO0o);
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(this.OooO0oO);
        m33.OooO0oO(parcel, this.OooO0oo, 5);
        m33.OooOO0o(parcel, 6, 4);
        parcel.writeInt(this.OooO ? 1 : 0);
        m33.OooOO0o(parcel, 7, 4);
        parcel.writeInt(this.OooOO0);
        m33.OooOO0o(parcel, 8, 4);
        parcel.writeInt(this.OooOO0O ? 1 : 0);
        m33.OooO0o0(parcel, 9, this.OooOO0o);
        m33.OooO0Oo(parcel, 10, this.OooOOO0, i);
        m33.OooO0Oo(parcel, 11, this.OooOOO, i);
        m33.OooO0o0(parcel, 12, this.OooOOOO);
        m33.OooO00o(parcel, 13, this.OooOOOo);
        m33.OooO00o(parcel, 14, this.OooOOo0);
        m33.OooO0oO(parcel, this.OooOOo, 15);
        m33.OooO0o0(parcel, 16, this.OooOOoo);
        m33.OooO0o0(parcel, 17, this.OooOo00);
        m33.OooOO0o(parcel, 18, 4);
        parcel.writeInt(this.OooOo0 ? 1 : 0);
        m33.OooO0Oo(parcel, 19, this.OooOo0O, i);
        m33.OooOO0o(parcel, 20, 4);
        parcel.writeInt(this.OooOo0o);
        m33.OooO0o0(parcel, 21, this.OooOo);
        m33.OooO0oO(parcel, this.OooOoO0, 22);
        m33.OooOO0o(parcel, 23, 4);
        parcel.writeInt(this.OooOoO);
        m33.OooO0o0(parcel, 24, this.OooOoOO);
        m33.OooOO0o(parcel, 25, 4);
        parcel.writeInt(this.OooOoo0);
        m33.OooOO0o(parcel, 26, 8);
        parcel.writeLong(this.OooOoo);
        m33.OooOO0o(parcel, 27, 8);
        parcel.writeLong(this.OooOooO);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
