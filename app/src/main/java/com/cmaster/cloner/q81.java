package com.cmaster.cloner;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q81 implements Parcelable {
    public static final Parcelable.Creator<q81> CREATOR = new b41(2);
    public final String OooO0Oo;
    public final Intent OooO0o0;

    public q81(Parcel parcel) {
        this.OooO0o0 = (Intent) Intent.CREATOR.createFromParcel(parcel);
        this.OooO0Oo = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q81)) {
            q81 q81Var = (q81) obj;
            if (this.OooO0o0.filterEquals(q81Var.OooO0o0) && Objects.equals(this.OooO0Oo, q81Var.OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.OooO0o0.writeToParcel(parcel, i);
        parcel.writeString(this.OooO0Oo);
    }

    public q81(Intent intent, String str) {
        this.OooO0o0 = intent;
        this.OooO0Oo = str;
    }
}
