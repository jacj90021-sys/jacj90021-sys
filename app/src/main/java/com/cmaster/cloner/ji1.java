package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ji1 implements Parcelable {
    public static final Parcelable.Creator<ji1> CREATOR = new b41(6);
    public int OooO0Oo;
    public int[] OooO0o;
    public int OooO0o0;
    public boolean OooO0oO;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.OooO0Oo + ", mGapDir=" + this.OooO0o0 + ", mHasUnwantedGapAfter=" + this.OooO0oO + ", mGapPerSpan=" + Arrays.toString(this.OooO0o) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0Oo);
        parcel.writeInt(this.OooO0o0);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
        int[] iArr = this.OooO0o;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.OooO0o);
        }
    }
}
