package com.cmaster.cloner;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ey extends OooO {
    public static final Parcelable.Creator<ey> CREATOR = new OooO0o(4);
    public final gh1 OooO0o;

    public ey(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.OooO0o = new gh1(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.OooO0o.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.OooO0o + "}";
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        gh1 gh1Var = this.OooO0o;
        int i2 = gh1Var.OooO0o;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) gh1Var.OooO0o(i3);
            bundleArr[i3] = (Bundle) gh1Var.OooOO0(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ey(Parcelable parcelable) {
        super(parcelable);
        this.OooO0o = new gh1(0);
    }
}
