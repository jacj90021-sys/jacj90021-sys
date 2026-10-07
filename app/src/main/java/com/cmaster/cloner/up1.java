package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class up1 extends c41 {
    public static final Parcelable.Creator<up1> CREATOR = new b41(9);
    public boolean OooO0Oo;

    public up1(Parcel parcel) {
        super(parcel);
        this.OooO0Oo = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
    }

    public up1() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
