package com.cmaster.cloner;

import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vi implements Parcelable {
    public static final Parcelable.Creator<vi> CREATOR = new o0O0000O(9);
    public final int OooO;
    public final ProviderInfo OooO0Oo;
    public final boolean OooO0o;
    public final String OooO0o0;
    public final w90 OooO0oO;
    public final IBinder OooO0oo;

    public vi(Parcel parcel) {
        this.OooO0Oo = (ProviderInfo) parcel.readParcelable(ProviderInfo.class.getClassLoader());
        this.OooO0o0 = parcel.readString();
        this.OooO0oo = parcel.readStrongBinder();
        this.OooO0oO = o0O0oo00.o0000o0O(parcel.readStrongBinder());
        this.OooO = parcel.readInt();
        this.OooO0o = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.OooO0Oo, i);
        parcel.writeString(this.OooO0o0);
        parcel.writeStrongBinder(this.OooO0oo);
        w90 w90Var = this.OooO0oO;
        parcel.writeStrongBinder(w90Var == null ? null : w90Var.asBinder());
        parcel.writeInt(this.OooO);
        parcel.writeInt(this.OooO0o ? 1 : 0);
    }

    public vi(ProviderInfo providerInfo, String str, b51 b51Var, w90 w90Var, int i, boolean z) {
        this.OooO0Oo = providerInfo;
        this.OooO0o0 = str;
        this.OooO0oo = b51Var;
        this.OooO0oO = w90Var;
        this.OooO = i;
        this.OooO0o = z;
    }
}
