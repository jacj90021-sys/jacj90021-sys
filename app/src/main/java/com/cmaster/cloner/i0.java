package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i0 extends View.BaseSavedState {
    public static final Parcelable.Creator<i0> CREATOR = new o0O0000O(2);
    public boolean OooO0Oo;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.OooO0Oo ? (byte) 1 : (byte) 0);
    }
}
