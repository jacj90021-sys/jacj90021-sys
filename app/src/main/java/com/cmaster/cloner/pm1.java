package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pm1 extends OooO {
    public static final Parcelable.Creator<pm1> CREATOR = new OooO0o(9);
    public CharSequence OooO0o;
    public boolean OooO0oO;

    public pm1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.OooO0oO = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.OooO0o) + "}";
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.OooO0o, parcel, i);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
    }
}
