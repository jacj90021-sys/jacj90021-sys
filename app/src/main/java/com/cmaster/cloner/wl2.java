package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wl2 extends o00000OO {
    public static final Parcelable.Creator<wl2> CREATOR = new n32(21);
    public final String OooO0Oo;
    public final kz2 OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;

    public wl2(String str, int i, kz2 kz2Var, int i2) {
        this.OooO0Oo = str;
        this.OooO0o0 = i;
        this.OooO0o = kz2Var;
        this.OooO0oO = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl2)) {
            return false;
        }
        wl2 wl2Var = (wl2) obj;
        return this.OooO0Oo.equals(wl2Var.OooO0Oo) && this.OooO0o0 == wl2Var.OooO0o0 && this.OooO0o.OooO00o(wl2Var.OooO0o);
    }

    public final int hashCode() {
        return Objects.hash(this.OooO0Oo, Integer.valueOf(this.OooO0o0), this.OooO0o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 1, this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0);
        m33.OooO0Oo(parcel, 3, this.OooO0o, i);
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(this.OooO0oO);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
