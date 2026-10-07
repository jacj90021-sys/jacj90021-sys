package com.cmaster.cloner;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zi0 implements Parcelable {
    public static final Parcelable.Creator<zi0> CREATOR = new o0O0000O(18);
    public int OooO;
    public String OooO0Oo;
    public Intent OooO0o;
    public IBinder OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public String OooOO0O;
    public String OooOO0o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{0, 92, 3, -52, 6, 3, 4, -68, 39, 86, 18, -37, 44, 22, 35, -72, 105, 73, 2, -38, 13, 5, 30, -67, 116}, new byte[]{73, 50, 119, -87, 104, 119, 87, -39}));
        sb.append(this.OooO);
        sb.append(u7.OooO00o(new byte[]{-89, -110, -84, -41, -7, 103, 38, 20, -7, -113}, new byte[]{-117, -78, -49, -91, -100, 6, 82, 123}));
        sb.append(this.OooO0Oo);
        sb.append(u7.OooO00o(new byte[]{86, -48, 2, -122, 96, 30, 15, 94}, new byte[]{122, -16, 118, -23, 11, 123, 97, 99}));
        sb.append(this.OooO0o0);
        sb.append(u7.OooO00o(new byte[]{-123, -121, 40, -55, -94, 7, 31, 125, -108}, new byte[]{-87, -89, 65, -89, -42, 98, 113, 9}));
        sb.append(this.OooO0o);
        sb.append(u7.OooO00o(new byte[]{-21, 113, 104, 88, 83, -49, 41, 52}, new byte[]{-57, 81, 14, 52, 50, -88, 90, 9}));
        sb.append(this.OooO0oO);
        sb.append(u7.OooO00o(new byte[]{48, -71, -59, 119, -106, 54, 4}, new byte[]{28, -103, -79, 14, -26, 83, 57, 22}));
        sb.append(this.OooO0oo);
        sb.append(u7.OooO00o(new byte[]{-27, 108, -67, 26, 25, -23, 1}, new byte[]{-55, 76, -53, 111, 112, -115, 60, 104}));
        sb.append(this.OooOO0);
        return rj.OooO0oo(new byte[]{17}, new byte[]{108, 74, 89, 71, -85, 4, 100, -2}, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.OooO0Oo);
        parcel.writeStrongBinder(this.OooO0o0);
        parcel.writeParcelable(this.OooO0o, i);
        parcel.writeInt(this.OooO0oO);
        parcel.writeInt(this.OooO0oo);
        parcel.writeInt(this.OooO);
        parcel.writeInt(this.OooOO0);
    }
}
