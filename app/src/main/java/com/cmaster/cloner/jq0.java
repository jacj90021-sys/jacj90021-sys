package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jq0 extends OooO {
    public static final Parcelable.Creator<jq0> CREATOR = new OooO0o(5);
    public boolean OooO0o;

    public jq0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            jq0.class.getClassLoader();
        }
        this.OooO0o = parcel.readInt() == 1;
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0o ? 1 : 0);
    }
}
