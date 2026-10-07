package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lw0 extends View.BaseSavedState {
    public static final Parcelable.Creator<lw0> CREATOR = new o0O0000O(25);
    public int OooO0Oo;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return rj.OooO0o(sb, this.OooO0Oo, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0Oo);
    }
}
