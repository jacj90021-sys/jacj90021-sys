package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rn1 extends OooO {
    public static final Parcelable.Creator<rn1> CREATOR = new OooO0o(10);
    public int OooO0o;
    public boolean OooO0oO;

    public rn1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0o = parcel.readInt();
        this.OooO0oO = parcel.readInt() != 0;
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0o);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
    }
}
