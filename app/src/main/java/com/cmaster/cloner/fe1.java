package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fe1 extends OooO {
    public static final Parcelable.Creator<fe1> CREATOR = new OooO0o(7);
    public boolean OooO0o;

    public fe1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0o = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.OooO0o + "}";
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.OooO0o));
    }
}
