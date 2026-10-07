package com.cmaster.cloner;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class px1 implements Parcelable {
    public static final Parcelable.Creator<px1> CREATOR = new b41(13);
    public final Account OooO0Oo;
    public final Bundle OooO0o;
    public final String OooO0o0;
    public final long OooO0oO;
    public final long OooO0oo;

    public px1(Parcel parcel) {
        this.OooO0Oo = (Account) parcel.readParcelable(null);
        this.OooO0o0 = parcel.readString();
        this.OooO0o = parcel.readBundle();
        this.OooO0oO = parcel.readLong();
        this.OooO0oo = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof px1)) {
            return false;
        }
        px1 px1Var = (px1) obj;
        if (this.OooO0Oo.equals(px1Var.OooO0Oo) && this.OooO0o0.equals(px1Var.OooO0o0) && this.OooO0oO == px1Var.OooO0oO) {
            Bundle bundle = px1Var.OooO0o;
            Bundle bundle2 = this.OooO0o;
            if (bundle2.size() == bundle.size()) {
                if (!bundle2.isEmpty()) {
                    for (String str : bundle2.keySet()) {
                        if (bundle.containsKey(str) && Objects.equals(bundle2.get(str), bundle.get(str))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return u7.OooO00o(new byte[]{-108, -128, -64, 63, 109, 6, 3, 3, -43}, new byte[]{-11, -29, -93, 80, 24, 104, 119, 57}) + this.OooO0Oo + u7.OooO00o(new byte[]{-82, -70, -14, -120, 98, -52, 18, -60, -21, -18, -22, -57, 54}, new byte[]{-126, -102, -109, -3, 22, -92, 125, -74}) + this.OooO0o0 + u7.OooO00o(new byte[]{-60, -74, -48, 98, 9, -1, 86, 80, -48, -74}, new byte[]{-22, -106, -96, 7, 123, -106, 57, 52}) + this.OooO0oO + u7.OooO00o(new byte[]{82, 11, -100, -39, 103, 63, -59, 63, 27, 11}, new byte[]{33, 43, -80, -7, 1, 83, -96, 71}) + this.OooO0oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.OooO0Oo, i);
        parcel.writeString(this.OooO0o0);
        parcel.writeBundle(this.OooO0o);
        parcel.writeLong(this.OooO0oO);
        parcel.writeLong(this.OooO0oo);
    }

    public px1(Account account, String str, Bundle bundle, long j, long j2) {
        this.OooO0Oo = account;
        this.OooO0o0 = str;
        this.OooO0o = new Bundle(bundle);
        this.OooO0oO = j;
        this.OooO0oo = j2;
    }
}
