package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k41 extends c41 {
    public static final Parcelable.Creator<k41> CREATOR = new b41(1);
    public final int OooO0Oo;

    public k41(Parcel parcel) {
        super(parcel);
        this.OooO0Oo = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0Oo);
    }

    public k41(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.OooO0Oo = i;
    }
}
