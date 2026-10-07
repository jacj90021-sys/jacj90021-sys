package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ms1 extends o00000OO {
    public static final Parcelable.Creator<ms1> CREATOR = new e13(10);
    public final String OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final boolean OooO0oO;
    public final boolean OooO0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public ms1(int i, int i2, int i3, boolean z, boolean z2) {
        String str = z ? "0" : "1";
        StringBuilder sbOooO = rj.OooO(i, i2, "afma-sdk-a-v", ".", ".");
        sbOooO.append(str);
        this(sbOooO.toString(), i, i2, z, z2);
    }

    public static ms1 OooO00o() {
        return new ms1(12451000, 12451000, true);
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
        parcel.writeInt(this.OooO0oo ? 1 : 0);
        m33.OooOO0O(iOooOO0, parcel);
    }

    public ms1(int i, int i2, boolean z) {
        this(i, i2, 0, z, false);
    }

    public ms1(String str, int i, int i2, boolean z, boolean z2) {
        this.OooO0Oo = str;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO0oO = z;
        this.OooO0oo = z2;
    }
}
