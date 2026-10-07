package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pj extends OooO {
    public static final Parcelable.Creator<pj> CREATOR = new OooO0o(3);
    public SparseArray OooO0o;

    public pj(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.OooO0o = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.OooO0o.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.OooO0o;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.OooO0o.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.OooO0o.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
