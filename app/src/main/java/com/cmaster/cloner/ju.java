package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ju extends c41 {
    public static final Parcelable.Creator<ju> CREATOR = new o0O0000O(11);
    public String OooO0Oo;

    public ju(Parcel parcel) {
        super(parcel);
        this.OooO0Oo = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.OooO0Oo);
    }

    public ju() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
