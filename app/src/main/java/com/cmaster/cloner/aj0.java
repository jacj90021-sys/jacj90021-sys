package com.cmaster.cloner;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class aj0 implements Parcelable {
    public static final Parcelable.Creator<aj0> CREATOR = new o0O0000O(19);
    public Bundle OooO;
    public IBinder OooO0Oo;
    public IBinder OooO0o;
    public Intent OooO0o0;
    public String OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public w90 OooOO0o;

    public aj0(IBinder iBinder, Intent intent, IBinder iBinder2, String str, int i, Bundle bundle, int i2, int i3, o0O0oo00 o0o0oo00) {
        this.OooO0Oo = iBinder;
        this.OooO0o0 = intent;
        this.OooO0o = iBinder2;
        this.OooO0oO = str;
        this.OooO0oo = i;
        this.OooO = bundle;
        this.OooOO0 = i2;
        this.OooOO0O = i3;
        this.OooOO0o = o0o0oo00;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{-94, -104, -34, -72, 106, 94, -18, 6, -123, -110, -49, -81, 65, 82, -55, 39, -118, -126, -53, -3, 127, 76, -44, 15, -121, -65, -60, -32}, new byte[]{-21, -10, -86, -35, 4, 42, -67, 99}));
        sb.append(this.OooO0o0);
        sb.append(u7.OooO00o(new byte[]{-49, -11, 8, 35, -97, -60, -13, -51, -34}, new byte[]{-29, -43, 123, 70, -15, -96, -106, -65}));
        sb.append(this.OooO0Oo);
        sb.append(u7.OooO00o(new byte[]{89, -109, -71, 101, -58, 96, -116, -91, 33, -36, -10}, new byte[]{117, -77, -53, 0, -75, 21, -32, -47}));
        sb.append(this.OooO0o);
        sb.append(u7.OooO00o(new byte[]{-87, -100, 13, -26, 97, -103, 95, 64, -46, -44, 16, -66}, new byte[]{-123, -68, 127, -125, 18, -20, 51, 52}));
        sb.append(this.OooO0oO);
        sb.append(u7.OooO00o(new byte[]{-123, -111, -125, -117, -51, 92, 125, 61, -35, -14, -98, -118, -39, 20}, new byte[]{-87, -79, -15, -18, -68, 41, 24, 78}));
        sb.append(this.OooO0oo);
        sb.append(u7.OooO00o(new byte[]{-120, -60, 53, 75, -56, 60, 34, 43, -41}, new byte[]{-92, -28, 90, 59, -68, 85, 77, 69}));
        sb.append(this.OooO);
        sb.append(u7.OooO00o(new byte[]{90, 110, -4, 75, 23, -26, -48, 88, 23, 61, -15, 26}, new byte[]{118, 78, -102, 39, 118, -127, -93, 21}));
        sb.append(this.OooOO0);
        sb.append(u7.OooO00o(new byte[]{-48, 31, -97, -102, 33, 36, 11, 39, -99, 83, -116, -109, 51, 126}, new byte[]{-4, 63, -7, -10, 64, 67, 120, 113}));
        sb.append(this.OooOO0O);
        sb.append(u7.OooO00o(new byte[]{84, 36, 123, 51, -124, -111, -106, -29, 69}, new byte[]{120, 4, 15, 91, -10, -12, -9, -121}));
        sb.append(this.OooOO0o);
        return rj.OooO0oo(new byte[]{74}, new byte[]{55, 9, -66, 41, -91, 117, -12, -89}, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.OooO0Oo);
        parcel.writeParcelable(this.OooO0o0, i);
        parcel.writeStrongBinder(this.OooO0o);
        parcel.writeString(this.OooO0oO);
        parcel.writeInt(this.OooO0oo);
        parcel.writeBundle(this.OooO);
        parcel.writeInt(this.OooOO0);
        parcel.writeInt(this.OooOO0O);
        w90 w90Var = this.OooOO0o;
        parcel.writeStrongBinder(w90Var != null ? w90Var.asBinder() : null);
    }
}
