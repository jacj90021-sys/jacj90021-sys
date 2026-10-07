package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class le1 extends c41 {
    public static final Parcelable.Creator<le1> CREATOR = new b41(3);
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;

    public le1(Parcel parcel) {
        super(parcel);
        this.OooO0Oo = parcel.readInt();
        this.OooO0o0 = parcel.readInt();
        this.OooO0o = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0Oo);
        parcel.writeInt(this.OooO0o0);
        parcel.writeInt(this.OooO0o);
    }

    public le1() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
