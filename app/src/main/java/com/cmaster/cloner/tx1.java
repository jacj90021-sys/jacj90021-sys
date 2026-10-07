package com.cmaster.cloner;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tx1 implements Parcelable {
    public final int OooO0Oo;
    public final String OooO0o;
    public final Account OooO0o0;
    public final long OooO0oO;
    public static final Account OooO0oo = new Account(u7.OooO00o(new byte[]{-68, 80, 70, 2, 120}, new byte[]{-106, 122, 108, 40, 82, -50, 9, -56}), u7.OooO00o(new byte[]{-4, 2, -48, -117, -47}, new byte[]{-42, 40, -6, -95, -5, -28, -30, -70}));
    public static final Parcelable.Creator<tx1> CREATOR = new b41(14);

    public tx1(Parcel parcel) {
        this.OooO0Oo = parcel.readInt();
        this.OooO0o0 = (Account) parcel.readParcelable(Account.class.getClassLoader());
        this.OooO0o = parcel.readString();
        this.OooO0oO = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0Oo);
        parcel.writeParcelable(this.OooO0o0, i);
        parcel.writeString(this.OooO0o);
        parcel.writeLong(this.OooO0oO);
    }

    public tx1(tx1 tx1Var) {
        this.OooO0Oo = tx1Var.OooO0Oo;
        Account account = tx1Var.OooO0o0;
        this.OooO0o0 = new Account(account.name, account.type);
        this.OooO0o = tx1Var.OooO0o;
        this.OooO0oO = tx1Var.OooO0oO;
    }

    public tx1(int i, Account account, String str, long j) {
        this.OooO0Oo = i;
        this.OooO0o0 = account;
        this.OooO0o = str;
        this.OooO0oO = j;
    }
}
