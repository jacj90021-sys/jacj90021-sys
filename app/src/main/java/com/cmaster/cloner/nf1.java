package com.cmaster.cloner;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nf1 implements Parcelable {
    public static final Parcelable.Creator<nf1> CREATOR = new b41(5);
    public final boolean OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final Intent OooO0oO;

    public nf1(Parcel parcel) {
        this.OooO0Oo = parcel.readInt() != 0;
        this.OooO0o0 = parcel.readInt();
        this.OooO0o = parcel.readInt();
        if (parcel.readInt() != 0) {
            this.OooO0oO = (Intent) Intent.CREATOR.createFromParcel(parcel);
        } else {
            this.OooO0oO = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{84, -93, 84, -115, -83, -90, 108, -124, 115, -89, 84, -113, -123, -73, 110, -92, 124, -78, 71, -120, -81, -105, 108, -70, 104, -80, 67, -97, -7}, new byte[]{7, -58, 38, -5, -60, -59, 9, -41}));
        sb.append(this.OooO0Oo);
        sb.append(u7.OooO00o(new byte[]{24, 64, 31, -87, -77, 105, -105, 55, 80, 93}, new byte[]{52, 96, 108, -35, -46, 27, -29, 126}));
        sb.append(this.OooO0o0);
        sb.append(u7.OooO00o(new byte[]{-40, 38, -20, 25, 58, -74, -24, -72, -60, 126}, new byte[]{-12, 6, -118, 117, 91, -47, -101, -123}));
        sb.append(Integer.toHexString(this.OooO0o));
        sb.append(u7.OooO00o(new byte[]{97, -91, 48, -12, 90, 96, 12}, new byte[]{77, -123, 81, -122, 61, 19, 49, 3}));
        sb.append(this.OooO0oO);
        return rj.OooO0oo(new byte[]{34}, new byte[]{95, 111, 65, -21, 68, -121, 44, 74}, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
        parcel.writeInt(this.OooO0o0);
        parcel.writeInt(i);
        Intent intent = this.OooO0oO;
        if (intent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, 0);
        }
    }

    public nf1(int i, int i2, Intent intent) {
        this.OooO0Oo = false;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO0oO = intent;
    }
}
