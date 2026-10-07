package com.cmaster.cloner;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cj0 implements Parcelable {
    public static final Parcelable.Creator<cj0> CREATOR = new o0O0000O(20);
    public final IntentSender OooO0Oo;
    public final int OooO0o;
    public final Intent OooO0o0;
    public final int OooO0oO;

    public cj0(IntentSender intentSender, Intent intent, int i, int i2) {
        this.OooO0Oo = intentSender;
        this.OooO0o0 = intent;
        this.OooO0o = i;
        this.OooO0oO = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.OooO0Oo, i);
        parcel.writeParcelable(this.OooO0o0, i);
        parcel.writeInt(this.OooO0o);
        parcel.writeInt(this.OooO0oO);
    }
}
