package com.cmaster.cloner;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w22 extends o00000OO {
    public static final Parcelable.Creator<w22> CREATOR = new b41(26);
    public final int OooO0Oo;
    public final int OooO0o;
    public final Account OooO0o0;
    public final GoogleSignInAccount OooO0oO;

    public w22(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.OooO0Oo = i;
        this.OooO0o0 = account;
        this.OooO0o = i2;
        this.OooO0oO = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0Oo(parcel, 2, this.OooO0o0, i);
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(this.OooO0o);
        m33.OooO0Oo(parcel, 4, this.OooO0oO, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
