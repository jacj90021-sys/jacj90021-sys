package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r71 extends OooO {

    public r71(Parcelable parcelable) {
        super(parcelable);
    }
    public static final Parcelable.Creator<r71> CREATOR = new OooO0o(6);
    public Parcelable OooO0o;

    public r71(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0o = parcel.readParcelable(classLoader == null ? i71.class.getClassLoader() : classLoader);
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.OooO0o, 0);
    }
}
