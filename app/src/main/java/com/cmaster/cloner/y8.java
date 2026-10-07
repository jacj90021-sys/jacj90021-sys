package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y8 extends OooO {
    public static final Parcelable.Creator<y8> CREATOR = new OooO0o(1);
    public final boolean OooO;
    public final int OooO0o;
    public final int OooO0oO;
    public final boolean OooO0oo;
    public final boolean OooOO0;

    public y8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0o = parcel.readInt();
        this.OooO0oO = parcel.readInt();
        this.OooO0oo = parcel.readInt() == 1;
        this.OooO = parcel.readInt() == 1;
        this.OooOO0 = parcel.readInt() == 1;
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0o);
        parcel.writeInt(this.OooO0oO);
        parcel.writeInt(this.OooO0oo ? 1 : 0);
        parcel.writeInt(this.OooO ? 1 : 0);
        parcel.writeInt(this.OooOO0 ? 1 : 0);
    }

    public y8(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.OooO0o = bottomSheetBehavior.Oooo0oO;
        this.OooO0oO = bottomSheetBehavior.OooO0o0;
        this.OooO0oo = bottomSheetBehavior.OooO0O0;
        this.OooO = bottomSheetBehavior.Oooo0;
        this.OooOO0 = bottomSheetBehavior.Oooo0O0;
    }
}
