package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zg1 extends OooO {
    public static final Parcelable.Creator<zg1> CREATOR = new OooO0o(8);
    public final int OooO0o;

    public zg1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0o = parcel.readInt();
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0o);
    }

    public zg1(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.OooO0o = sideSheetBehavior.OooO0oo;
    }
}
