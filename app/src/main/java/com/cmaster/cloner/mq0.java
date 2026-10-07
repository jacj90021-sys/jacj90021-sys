package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mq0 extends View.BaseSavedState {
    public static final Parcelable.Creator<mq0> CREATOR = new o0O0000O(23);
    public int OooO0Oo;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.OooO0Oo;
        return rj.OooO0oO(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.OooO0Oo));
    }
}
